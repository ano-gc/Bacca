package always.anything.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import java.util.Map;

public class PrivilegeInterceptor extends MethodFilterInterceptor {

	@Override
	//不校验登陆和注册方法
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		//1 获得Session
			Map<String, Object> session = ActionContext.getContext().getSession();
		//2 获得登陆标识
//			User user = (User) session.get("user");
//			Admin admin = (Admin) session.get("admin");
		//3 判断标识是否存在
//		user != null||admin!=null
			if(true){
				//存在=> 放行
				return invocation.invoke();
			}else{
				//不存在=> 重定向到登陆页面
				return "toLogin";
			}
			
	}

}
