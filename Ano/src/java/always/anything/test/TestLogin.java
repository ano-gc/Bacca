package always.anything.test;

import always.anything.dao.LoginDao;
import always.anything.entity.AlwaysuserEntity;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-05 16:56
 **/
public class TestLogin {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginDao loginDao = (LoginDao) applicationContext.getBean("loginDao");
        AlwaysuserEntity alwaysUser = loginDao.getUser("18505601540");
        if (StringUtils.isEmpty(alwaysUser)) {
            System.out.println("账号不存在！");
        } else {
            System.out.println(alwaysUser.toString());
            System.out.println(alwaysUser.getAccount());
        }
    }

}
