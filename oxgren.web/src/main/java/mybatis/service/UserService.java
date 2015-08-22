package mybatis.service;

import mybatis.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.Controller.MybatisController;

/**
 * Created by YuChao on 2015/8/21.
 */
public class UserService {


    Logger logger = LoggerFactory.getLogger(MybatisController.class);

    public UserMapper userMapper ;


    public UserService()
    {
        String conf = "mybatis/applicationContext-mybatis.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        userMapper = (UserMapper) ac.getBean("userMapper");
    }


}
