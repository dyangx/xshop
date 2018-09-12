package com.dyang.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by DYang on 2018/9/12
 */
@Entity
@Table(name = "PRODUCT")
public class ProductVO implements Serializable {

    @Id
    private String id;
    @Column(name="NAME")
    private String name;
    @Column(name = "IMGURL")
    private String imgUrl;
    @Column(name = "BIMGURL")
    private String bImgUrl;
    @Column(name = "DESCRIBE")
    private String describe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getbImgUrl() {
        return bImgUrl;
    }

    public void setbImgUrl(String bImgUrl) {
        this.bImgUrl = bImgUrl;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "ProductVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", bImgUrl='" + bImgUrl + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
