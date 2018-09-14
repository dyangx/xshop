package com.dyang.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by DYang on 2018/9/12
 */
@Entity
@Table(name = "MENU")
public class MenuVO implements Serializable {
    private static final long serialVersionUID = 8303313126211646769L;

    @Id
    private String number;

    @Column(name = "NAME")
    private String name;

    @Transient
    private List<ProductVO> list;

    private int lSize;

    public int getlSize() {
        return lSize;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductVO> getList() {
        return list;
    }

    public void setList(List<ProductVO> list) {
        this.lSize = list.size();
        this.list = list;
    }

    @Override
    public String toString() {
        return "MenuVO{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
