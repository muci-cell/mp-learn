package mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import po.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author muci
 * @since 2024-11-14
 */
public interface UserMapper extends BaseMapper<User> {
    // 自定义查询方法
//    @Select("SELECT * FROM user WHERE name = #{name}")
//    List<User> selectByName(@Param("name") String name);
    // 使用 XML 映射定义的查询方法
    User selectByName(@Param("name") String name);
    // 使用 default 方法在接口中实现自定义查询
//    default User selectByName(@Param("name") String name) {
//        return selectOne(new QueryWrapper<User>().eq("name", name));
//    }

}
