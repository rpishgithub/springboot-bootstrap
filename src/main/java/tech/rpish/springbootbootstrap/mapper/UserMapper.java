package tech.rpish.springbootbootstrap.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import tech.rpish.springbootbootstrap.entity.User;
@Repository
public interface UserMapper extends BaseMapper<User> {
}
