/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import DAO.OrderList;
/**
 *
 * @author HP
 */
public class Customer {
    private String cusID;
    private String phone;
    private String name;
    private OrderList oList; //Nhan ca cai OrderList vao roi in ra

    public Customer(String cusID, String phone, String name) {
        this.cusID = cusID;
        this.phone = phone;
        this.name = name;
    }

    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
