package always.anything.service;

import always.anything.entity.AlwaysuserEntity;

/**
 * @program: springboot
 * @description:
 * @author: Ano
 * @create: 2019-10-25 09:11
 **/
public interface LoginService {
    AlwaysuserEntity getUserByNamePassword(String account, String password);
}
