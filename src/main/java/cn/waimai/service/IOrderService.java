package cn.waimai.service;

import cn.waimai.pojo.Order;

import java.sql.SQLException;

public interface IOrderService {
    void saveOrder(Order order) throws SQLException;
}
