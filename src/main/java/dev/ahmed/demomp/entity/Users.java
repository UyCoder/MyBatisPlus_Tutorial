package dev.ahmed.demomp.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Created: 4/5/2022 13:59
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Entity
@Table(name = "users")
@Data
public class Users {

    @Id
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;


    @Column(name = "age")
    private Integer age;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;
}


