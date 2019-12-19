package always.anything.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-16 16:40
 **/
@Entity
@Table(name = "alwaysuser", schema = "ano", catalog = "")
public class AlwaysuserEntity {
    private String userId;
    private String orgId;
    private String username;
    private String account;
    private String password;
    private String actualname;
    private String identityaccount;
    private String mobile;
    private String email;
    private Timestamp createdate;
    private Timestamp logindate;
    private Timestamp lastdate;
    private Long count;

    @Id
    @Column(name = "user_id", nullable = false, length = 64)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "org_id", nullable = true, length = 64)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 64)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "account", nullable = true, length = 64)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 64)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "actualname", nullable = true, length = 16)
    public String getActualname() {
        return actualname;
    }

    public void setActualname(String actualname) {
        this.actualname = actualname;
    }

    @Basic
    @Column(name = "identityaccount", nullable = true, length = 64)
    public String getIdentityaccount() {
        return identityaccount;
    }

    public void setIdentityaccount(String identityaccount) {
        this.identityaccount = identityaccount;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 64)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 64)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "createdate", nullable = true)
    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    @Basic
    @Column(name = "logindate", nullable = true)
    public Timestamp getLogindate() {
        return logindate;
    }

    public void setLogindate(Timestamp logindate) {
        this.logindate = logindate;
    }

    @Basic
    @Column(name = "lastdate", nullable = true)
    public Timestamp getLastdate() {
        return lastdate;
    }

    public void setLastdate(Timestamp lastdate) {
        this.lastdate = lastdate;
    }

    @Basic
    @Column(name = "count", nullable = true)
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlwaysuserEntity that = (AlwaysuserEntity) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(account, that.account) &&
                Objects.equals(password, that.password) &&
                Objects.equals(actualname, that.actualname) &&
                Objects.equals(identityaccount, that.identityaccount) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(email, that.email) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(logindate, that.logindate) &&
                Objects.equals(lastdate, that.lastdate) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, orgId, username, account, password, actualname, identityaccount, mobile, email, createdate, logindate, lastdate, count);
    }
}
