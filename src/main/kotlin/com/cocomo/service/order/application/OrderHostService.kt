package com.cocomo.service.order.application

import com.cocomo.service.order.domain.Order
import com.cocomo.service.order.domain.OrderId
import com.cocomo.service.order.domain.OrderRepository

class OrderHostService(
    val orderRepository: OrderRepository,
): OrderCreateProcessor {

    override fun process(command: OrderCreateCommand): OrderId {
        val order = Order.create(command.name)
        return orderRepository.save(order).requireId()
    }
}