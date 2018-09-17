package com.dyang.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by DYang on 2018/9/17
 */
@Entity
@Table(name = "STAR_PRO")
public class StarProVO implements Serializable {

    @Id
    private String id;

    @Column(name = "PROID")
    private String proid;

    @Column(name = "ORDERD")
    private String orderd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public String getOrderd() {
        return orderd;
    }

    public void setOrderd(String orderd) {
        this.orderd = orderd;
    }
}
