package service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mapper.UserMapper;
import org.springframework.stereotype.Service;
import po.User;
import service.IUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author muci
 * @since 2024-11-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    // 自定义方法，根据用户名查询用户
    public User getUserByName(String name) {
//        return baseMapper.selectOne(new QueryWrapper<User>().eq("name", name));
        // 调用自定义的 selectByName 方法
        return baseMapper.selectByName(name);
    }



}
