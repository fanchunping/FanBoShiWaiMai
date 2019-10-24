package cn.waimai.dao.impl;

import cn.waimai.dao.IOrderDao;
import cn.waimai.pojo.Order;
import cn.waimai.pojo.OrderItem;
import cn.waimai.pojo.QueryRunner;

import java.sql.Connection;

public class OrderDaoImpl implements IOrderDao {

    public void saveOrder(Connection conn, Order order) {
        String sql="INSERT INTO orders VALUES(?,?,?,?,?,?,?,?)";
        QueryRunner qr=new QueryRunner();
        Object[] params={order.getOid(),order.getOrdertime(),order.getTotal(),order.getState(),order.getAddress(),order.getName(),order.getTelephone(),order.getUser().getUid()};
        qr.update(conn,sql,params);

    }

    public void saveOrderItem(Connection conn, OrderItem orderItem) {
        OrderItem item = new OrderItem();
        String sql="INSERT INTO orderitem VALUES(?,?,?,?,?)";
        QueryRunner qr=new QueryRunner();
        Object[] params={item.getItemid(),item.getQuantity(),item.getTotal(),item.getProduct().getPid(),item.getOrder().getOid()};
        qr.update(conn,sql,params);


    }

}
