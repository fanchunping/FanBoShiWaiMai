package cn.waimai.service.impl;

import cn.waimai.dao.BaseDao;
import cn.waimai.dao.impl.OrderDaoImpl;
import cn.waimai.pojo.Order;
import cn.waimai.pojo.OrderItem;
import cn.waimai.service.IOrderService;

import java.sql.Connection;
import java.sql.SQLException;


public class OrderServiceImpl implements IOrderService {
    OrderDaoImpl orderDao=new OrderDaoImpl();

    public void saveOrder(Order order) throws SQLException {
        Connection conn=null;
        try {
            //获取连接
            	conn=BaseDao.getConn();
            // 开启事务
            	conn.setAutoCommit(false);
            // 保存订单
            	orderDao.saveOrder(conn,order);
            // 保存订单项
            	for (OrderItem item : order.getList()) {
            			orderDao.saveOrderItem(conn,item);
            		}
            // 提交
             	conn.commit();
             	}
             catch (Exception e)
             {
            // 回滚
             conn.rollback();
        }

    }
}
