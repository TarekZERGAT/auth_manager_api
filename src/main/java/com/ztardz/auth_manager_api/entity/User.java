package com.ztardz.auth_manager_api.entity;

import javax.persistence.*;
import java.util.Date;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 50)
    private String login_user;
    @Column(nullable = false,length = 100)
    private String password_user;
    @Column(nullable = false,length = 100)
    private String name_user;
    private byte enabled;
    @Column(nullable = false)
    private Date created_at;
    @Column(nullable = false)
    private User created_by;
    @Column(nullable = false)
    private Date updated_at;
    @Column(nullable = false)
    private User updated_by;
    private Date deleted_at;
    private User deleted_by;
    private int i;

    public User(Long id, String login_user, String password_user, String name_user, byte enabled, Date created_at, User created_by, Date updated_at, User updated_by, Date deleted_at, User deleted_by) {
        this.id = id;
        this.login_user = login_user;
        this.password_user = password_user;
        this.name_user = name_user;
        this.enabled = enabled;
        this.created_at = created_at;
        this.created_by = created_by;
        this.updated_at = updated_at;
        this.updated_by = updated_by;
        this.deleted_at = deleted_at;
        this.deleted_by = deleted_by;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin_user() {
        return login_user;
    }

    public void setLogin_user(String login_user) {
        this.login_user = login_user;
    }

    public String getPassword_user() {
        return password_user;
    }

    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public User getCreated_by() {
        return created_by;
    }

    public void setCreated_by(User created_by) {
        this.created_by = created_by;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public User getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(User updated_by) {
        this.updated_by = updated_by;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }

    public User getDeleted_by() {
        return deleted_by;
    }

    public void setDeleted_by(User deleted_by) {
        this.deleted_by = deleted_by;
    }
}

