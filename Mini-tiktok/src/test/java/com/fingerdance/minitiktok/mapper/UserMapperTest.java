package com.fingerdance.minitiktok.mapper;

import com.fingerdance.minitiktok.pojo.User;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    UserRepository userMapper;

    @Test
    public void testAdd() {
        User user1 = new User(0, "test1", "test1");
        User user2 = new User(0,"test2", "test2");
        userMapper.add(user1);
        userMapper.add(user2);

        List<User> expect = new ArrayList<>();
        expect.add(user1);
        expect.add(user2);

        User realUser1 = userMapper.queryByName("test1");
        User realUser2 = userMapper.queryByName("test2");

        assertEquals(user1.getUserName(), realUser1.getUserName());
        assertEquals(user1.getPassWord(), realUser1.getPassWord());

        assertEquals(user2.getUserName(), realUser2.getUserName());
        assertEquals(user2.getPassWord(), realUser2.getPassWord());



    }


}