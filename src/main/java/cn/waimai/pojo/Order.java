package cn.waimai.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String oid;//�������
    private Date ordertime;//�µ�ʱ��
    private double total;//�ܼ�
    private Integer state;//״̬
    private String address; //�ջ��˵�ַ
    private String name; //�ջ�������
    private String telephone; //�ջ��˵绰

    //private String uid;
    //1.�������Ͷ�������ϵ�������Ƕ���Ͷ�������Է�����ϵ
    //2.���OrderĿ�ģ���OrderЯ�������ϵ�������service��dao���ݣ�user�����ǿ���Я�����������
    private UserInfo user;

    //���������ֶ�������Ͷ�����֮��Ĺ�ϵ����ѯ������ͬʱ����Ҫ��ȡ�����µ����ж�����
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
