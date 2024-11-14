package controller;

import service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import po.User;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author muci
 * @since 2024-11-14
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    // 根据用户姓名查询用户
    @GetMapping("/users/by-name")
    public User getUsersByName(@RequestParam String name) {
        return userService.getUserByName(name);
    }
}
