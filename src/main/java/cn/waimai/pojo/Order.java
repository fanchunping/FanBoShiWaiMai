package cn.waimai.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String oid;//订单编号
    private Date ordertime;//下单时间
    private double total;//总计
    private Integer state;//状态
    private String address; //收货人地址
    private String name; //收货人姓名
    private String telephone; //收货人电话

    //private String uid;
    //1.程序对象和对象发生关系，而不是对象和对象的属性发生关系
    //2.设计Order目的：让Order携带订单上的数据向service，dao传递，user对象是可以携带更多的数据
    private UserInfo user;

    //程序中体现订单对象和订单项之间的关系。查询订单的同时还需要获取订单下的所有订单项
    private List<OrderItem> list = new ArrayList<OrderItem>();

    public List<OrderItem> getList() {
        return list;
    }

    public void setList(List<OrderItem> list) {
        this.list = list;
    }
    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }
    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
