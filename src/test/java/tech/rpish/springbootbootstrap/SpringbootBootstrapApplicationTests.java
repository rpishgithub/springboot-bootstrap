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

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("Helen");
        user.setAge(18);
        user.setEmail("helen@qq.com");
        int result = userMapper.insert(user);
        System.out.println(result);
    }

    @Test
    public void updateTest() {
        User user = new User();
        user.setId(8l);
        user.setName("Jobs");
        int result = userMapper.updateById(user);
        System.out.println(result);
    }

    @Test
    public void OptimisticLockTest() {
        User user = userMapper.selectById(1456632686844272646l);
        user.setName("OptimisticLocker");
        userMapper.updateById(user);
    }

}
