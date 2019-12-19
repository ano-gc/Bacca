package always.anything.entity;

import lombok.Data;

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
@Table(name = "bacca", schema = "ano", catalog = "")
public class BaccaEntity {
    private String baccaId;
    private String baccaname;
    private String account;
    private String password;
    private String url;
    private String group;
    private String module;
    private String comments;
    private Timestamp createtime;

    @Id
    @Column(name = "bacca_id", nullable = false, length = 64)
    public String getBaccaId() {
        return baccaId;
    }

    public void setBaccaId(String baccaId) {
        this.baccaId = baccaId;
    }

    @Basic
    @Column(name = "baccaname", nullable = true, length = 255)
    public String getBaccaname() {
        return baccaname;
    }

    public void setBaccaname(String baccaname) {
        this.baccaname = baccaname;
    }

    @Basic
    @Column(name = "account", nullable = true, length = 255)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 1024)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "group", nullable = true, length = 255)
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Basic
    @Column(name = "module", nullable = true, length = 255)
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Basic
    @Column(name = "comments", nullable = true, length = 255)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "createtime", nullable = true)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaccaEntity that = (BaccaEntity) o;
        return Objects.equals(baccaId, that.baccaId) &&
                Objects.equals(baccaname, that.baccaname) &&
                Objects.equals(account, that.account) &&
                Objects.equals(password, that.password) &&
                Objects.equals(url, that.url) &&
                Objects.equals(group, that.group) &&
                Objects.equals(module, that.module) &&
                Objects.equals(comments, that.comments) &&
                Objects.equals(createtime, that.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baccaId, baccaname, account, password, url, group, module, comments, createtime);
    }
}
