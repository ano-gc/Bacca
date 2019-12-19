package always.anything.service.impl;

import always.anything.dao.LoginDao;
import always.anything.entity.AlwaysuserEntity;
import always.anything.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @program: springboot
 * @description:
 * @author: Ano
 * @create: 2019-10-25 09:19
 **/
@Service("loginService")
@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = true)
public class LoginServiceImpl implements LoginService {

    @Resource(name = "loginDao")
    private LoginDao loginDao;

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    @Override
    public AlwaysuserEntity getUserByNamePassword(String account, String password) {
        AlwaysuserEntity existUser = loginDao.getUser(account);
        if (existUser==null) {
            throw new RuntimeException("账号不存在！");
        }
        if (false) {
            throw new RuntimeException("密码错误!");
        }
        //4 返回查询到的用户对象
        return existUser;
    }
}
