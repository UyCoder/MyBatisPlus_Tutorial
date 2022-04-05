# What is this?
This is a project that I coded when I learn MyBatis-plus.

<img src="https://raw.githubusercontent.com/baomidou/logo/master/mybatis-plus-logo-new-mini.png" alt="drawing" width="100"/>


# Link of the tutorial
https://www.bilibili.com/video/BV1V5411K7rT

# Content of the tutorial
In this tutorial I learned the techniques of MayBatis-Plus below:
- Insert object data to the table - insert()
- Update table - updateById()
- Optimistic Locker - @Version annotation
- Automatic insert @TableField - createTime and updateTime
- Multiple select
- Paging - PaginationInterceptor
- Delete
	- Single delete
	- Delete multiple row
- Logical Delete
- Query Wrapper 
	- ge, gt, le, lt
	- eq, ne
	- like, not like
	- in, not in
	- between, not between
	- order by
	- group by
	
| Query method | Description |
|---|---|
| setSqlSelect | Set SELECT query fields |
| where | WHERE statement, concatenation + WHERE condition |
| and | AND statement, concatenation + AND field=value |
| andNew | AND statement, concatenation + AND (field=value) |
| or | OR statement, concatenation + OR field=value |
| orNew | OR statement, concatenation + OR (field=value) |
|eq | is equal to = |
| allEq | based on map content equals = |
| ne | is not equal to <> |
| gt | greater than > |
| ge | greater than or equal to >= |
| lt | is less than < |
| le | Less than or equal to <= |
| like | Fuzzy query LIKE |
| notLike | Fuzzy query NOT LIKE |
| in | IN query |
| notIn | NOT IN query |
| isNull | NULL value query |
| isNotNull | IS NOT NULL |
| groupBy | Group by GROUP BY |
| having | HAVING Keywords |
| orderBy | sort ORDER BY |
| orderAsc | ASC sort ORDER BY |
| orderDesc | DESC sort ORDER BY |
| exists | EXISTS conditional statement |
| notExists | NOT EXISTS conditional statement |
| between | BETWEEN conditional statement |
| notBetween | NOT BETWEEN conditional statement |
| addFilter | Free splicing SQL |
| last | Splice at the end, for example: last("LIMIT 1") |


