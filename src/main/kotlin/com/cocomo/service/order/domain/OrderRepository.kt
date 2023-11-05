package com.cocomo.service.order.domain

interface OrderRepository {
    fun save(order: Order): Order
    fun findById(id: OrderId): Order?
}