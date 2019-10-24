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
            //��ȡ����
            	conn=BaseDao.getConn();
            // ��������
            	conn.setAutoCommit(false);
            // ���涩��
            	orderDao.saveOrder(conn,order);
            // ���涩����
            	for (OrderItem item : order.getList()) {
            			orderDao.saveOrderItem(conn,item);
            		}
            // �ύ
             	conn.commit();
             	}
             catch (Exception e)
             {
            // �ع�
             conn.rollback();
        }

    }
}
