package always.anything.dao;

import always.anything.entity.AlwaysuserEntity;

public interface LoginDao extends BaseDao<AlwaysuserEntity> {
    AlwaysuserEntity getUser(String account);
}
