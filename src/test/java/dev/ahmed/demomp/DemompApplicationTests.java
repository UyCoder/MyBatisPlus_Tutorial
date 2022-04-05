package dev.ahmed.demomp;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dev.ahmed.demomp.entity.Users;
import dev.ahmed.demomp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest

class DemompApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAll() {
        List<Users> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void testAdd() {
        Users user = new Users();
        user.setName("LogicDelete");
        user.setAge(20);
        user.setEmail("123@gmail.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    public void testUpdate() {
        Users user = new Users();
        user.setId(1511368880012029953L);
        user.setName("Musep");
        int count = userMapper.updateById(user);
        System.out.println(count);
    }


    @Test
    public void testOptimisticLocker() {
        Users user = userMapper.selectById(1511353550288068609L);
        user.setName("Bugra");
        userMapper.updateById(user);
    }


    @Test
    void contextLoads() {
    }


    // select multiple id
    @Test
    public void testSelect1() {
        List<Users> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        System.out.println(users);
    }

    // select with 2 conditions name=Bugra and age=20
    @Test
    public void testSelect2() {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("name","Bugra");
        columnMap.put("age",20);
        List<Users> users = userMapper.selectByMap(columnMap);
        System.out.println(users);
    }

    // select with page
    @Test
    public void testSelectPage() {
        Page<Users> page = new Page(1,3);
        Page<Users> userPage = userMapper.selectPage(page, null);

        long pages = userPage.getPages(); // get total pages
        long current = userPage.getCurrent(); // current page
        List<Users> records = userPage.getRecords(); // page size
        long total = userPage.getTotal(); // total records
        boolean hasNext = userPage.hasNext();  //  next page
        boolean hasPrevious = userPage.hasPrevious(); //  previous page

        System.out.println(pages);
        System.out.println(current);
        System.out.println(records);
        System.out.println(total);
        System.out.println(hasNext);
        System.out.println(hasPrevious);
    }


    // delete with id
    @Test
    public void testDelete() {
        int count = userMapper.deleteById(1511382352980516865L);
        System.out.println(count);
    }

    // delete with map
    @Test
    public void testDelete2() {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("name","Bugra");
        columnMap.put("age",20);
        int count = userMapper.deleteByMap(columnMap);
        System.out.println(count);
    }

    // delete logic
    @Test
    public void testDeleteLogic() {
        int count = userMapper.deleteById(1511353550288068609L);
        System.out.println(count);
    }


    // abstract select
    @Test
    public void testSelectAbsctact() {
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
        // ge, gt, le, lt,
        queryWrapper.ge("age", 20);
//        queryWrapper.gt("age", 20);
//        queryWrapper.le("age", 20);
//        queryWrapper.lt("age", 20);

        // eq, ne
        queryWrapper.eq("name", "Bugra");
//        queryWrapper.ne("name", "Bugra");

        // like, not like
        queryWrapper.like("name", "Bugra");
//        queryWrapper.notLike("name", "Bugra");

        // in, not in
        queryWrapper.in("name", Arrays.asList("Bugra", "Musep"));
//        queryWrapper.notIn("name", Arrays.asList("Bugra", "Musep"));

        // is null, is not null
        queryWrapper.isNull("name");
//        queryWrapper.isNotNull("name");

        // between, not between
        queryWrapper.between("age", 20, 30);
//        queryWrapper.notBetween("age", 20, 30);

        // order by
        queryWrapper.orderByAsc("age");
//        queryWrapper.orderByDesc("age");

        // group by
        queryWrapper.groupBy("name");

        List<Users> users = userMapper.selectList(queryWrapper);
        System.out.println(users);


    }


}
