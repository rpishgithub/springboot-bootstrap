package tech.rpish.springbootbootstrap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.rpish.springbootbootstrap.entity.User;
import tech.rpish.springbootbootstrap.mapper.UserMapper;

import java.util.List;

@SpringBootTest
public class SpringbootBootstrapApplicationTests {
        @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList() {

        System.out.println("Select All Test");
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
