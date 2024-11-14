package service;

import com.baomidou.mybatisplus.extension.service.IService;
import po.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author muci
 * @since 2024-11-14
 */
public interface IUserService extends IService<User> {
    /**
     * 根据姓名查询
     * @param name
     * @return
     */
    User getUserByName(String name);
}
