package always.anything.dao.impl;

import always.anything.dao.LoginDao;
import always.anything.entity.AlwaysuserEntity;
import org.hibernate.*;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-10-31 09:29
 **/

@Repository("loginDao")
public class LoginDaoImpl extends BaseDaoImpl<AlwaysuserEntity> implements LoginDao {

    @Resource(name = "sessionFactory")
    public void setSF(SessionFactory sf) {
        super.setSessionFactory(sf);
    }

    @Override
    public AlwaysuserEntity getUser(final String account) {
//        Session session=this.getHibernateTemplate().getSessionFactory().openSession();
//        String hql = "select * from alwaysuser where account = ?";
//        SQLQuery query = session.createSQLQuery(hql);
//        query.setParameter(0, account);
//        AlwaysuserEntity alwaysUser = (AlwaysuserEntity) query.list();
//        return alwaysUser;
        return getHibernateTemplate().execute(new HibernateCallback<AlwaysuserEntity>() {
            @Override
            public AlwaysuserEntity doInHibernate(Session session) throws HibernateException {
                String hql = "from AlwaysuserEntity where account = ? ";
                Query query = session.createQuery(hql);
                query.setParameter(0, account);
                AlwaysuserEntity alwaysUser = (AlwaysuserEntity) query.uniqueResult();
                return alwaysUser;
            }
        });
    }


}
