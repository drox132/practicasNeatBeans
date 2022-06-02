
package com.fran.reportsystemcascon.model;

import java.util.Date;

/**
 *
 * @author Francisco
 */
public class Worker {
 
    private int id;
    private String name;
    private String phone;
    private Date dateOfAdmission;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date dateOfAdmission() {
        return dateOfAdmission;
    }

    public void dateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
    
    
}
