package com.cpl.springcloud.service.impl;

import com.cpl.springcloud.dao.PaymentDao;
import com.cpl.springcloud.entities.Payment;
import com.cpl.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    public int create(Payment Payment){
        return paymentDao.create(Payment);
    }

    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
