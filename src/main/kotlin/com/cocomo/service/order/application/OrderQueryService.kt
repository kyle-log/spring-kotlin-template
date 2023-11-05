package com.cocomo.service.order.application

import com.cocomo.service.order.domain.Order
import com.cocomo.service.order.domain.OrderId
import com.cocomo.service.order.domain.OrderRepository

class OrderQueryService(
    val orderRepository: OrderRepository,
) : OrderFinder {

    override fun find(id: OrderId): Order? {
        return orderRepository.findById(id)
    }
}