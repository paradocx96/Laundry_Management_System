package com.lms.service;

import com.lms.model.Delivery;

import java.sql.SQLException;

public interface Database {
    public void InserIntoDelivery(Delivery delivery) throws SQLException;
}
