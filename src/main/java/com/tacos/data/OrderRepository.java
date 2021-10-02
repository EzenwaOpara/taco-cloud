package com.tacos.data;

/*
 * Created by Benjamin
 * On 9/30/2021 - 1:30 AM
 */

import com.tacos.Order;

public interface OrderRepository {

    Order save(Order order);
}
