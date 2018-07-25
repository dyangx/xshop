package com.dyang.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 8303313066211646769L;

    @Id
    private String id;

    @Column(name="USERNAME")
    private String username;

    @Column(name="NICK")
    private String nick;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="REGISTERIP")
    private String registerIp;

    @Column(name="REGISTERDATE")
    private Date registerDate;

    @Column(name="PHONE")
    private String phone;

    @Column(name="EMAIL")
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", registerIp='" + registerIp + '\'' +
                ", registerDate=" + registerDate +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
