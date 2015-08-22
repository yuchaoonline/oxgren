package sample.Controller;

import mybatis.domain.User;
import mybatis.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by YuChao on 2015/8/20.
 */

@Controller
public class MybatisController {

    @RequestMapping("/fff/{id}")
    public @ResponseBody
    String  fff(@PathVariable int id)
    {
        UserService userService=new UserService();
        User user = new User();
        user.setId(id);
        user.setName("jack");
        user.setEmail("jack@126.vom");
        user.setLastlogintime(new Date());
        userService.userMapper.addUser(user);
        return "";
    }
}
