package com.fingerdance.minitiktok.mapper;

import com.fingerdance.minitiktok.pojo.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRepository {
    //查询
    public List<User> queryAll();

    //添加数据
    public int add(@Param("user") User user);

    //根据用户名查询数据
    public User queryByName(String username);

}
