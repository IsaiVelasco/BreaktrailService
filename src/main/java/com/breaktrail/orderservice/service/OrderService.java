package com.breaktrail.orderservice.service;

import com.breaktrail.orderservice.dto.OrderRequest;
import com.breaktrail.orderservice.dto.OrderResponse;
import com.breaktrail.orderservice.entities.Order;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    public Order createOrder(OrderRequest orderRequest){
        Order response = new Order();
        response.setAccountId(orderRequest.getAccountId());
        response.setOrderId("9999");
        response.setStatus("PENDING");
        response.setTotalAmount(100.00);
        response.setTotalTax(10.00);
        response.setTransactionDate(new Date());
        return response;
    }

    public List<Order> findAllOrders(){
        List<Order> orderList = new ArrayList();
        Order response = new Order();
        response.setAccountId("999819");
        response.setOrderId("11123");
        response.setStatus("PENDING");
        response.setTotalAmount(100.00);
        response.setTotalTax(10.00);
        response.setTransactionDate(new Date());

        Order response02 = new Order();
        response02.setAccountId("999819");
        response02.setOrderId("11124");
        response02.setStatus("PENDING");
        response02.setTotalAmount(120.00);
        response02.setTotalTax(12.00);
        response02.setTransactionDate(new Date());

        orderList.add(response);
        orderList.add(response02);
        return orderList;
    }
}
