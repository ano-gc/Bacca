package always.anything.contorller;

import always.anything.entity.AlwaysuserEntity;
import always.anything.service.LoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @program: springboot
 * @description:
 * @author: Ano
 * @create: 2019-10-25 09:06
 **/

@Controller("loginController")
@Scope("prototype")
public class LoginController extends ActionSupport implements ModelDriven<AlwaysuserEntity> {
    private AlwaysuserEntity alwaysUser = new AlwaysuserEntity();

    @Resource(name = "loginService")
    private LoginService loginService;

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public String login() throws Exception {
        //1 调用Service执行登陆逻辑
        AlwaysuserEntity  u = loginService.getUserByNamePassword(alwaysUser.getAccount(),alwaysUser.getPassword());
        //2 将返回的User对象放入session域
        ActionContext.getContext().getSession().put("AlwaysuserEntity", u);
        //3 重定向到项目首页
        return "Home";
    }

    @Override
    public AlwaysuserEntity getModel() {
        return alwaysUser;
    }
}
