package com.cocomo.service.order.data.local

import com.cocomo.service.order.domain.Order
import com.cocomo.service.order.domain.OrderId
import com.cocomo.service.order.domain.OrderRepository

class LocalOrderRepository: OrderRepository {

    private val orders = mutableMapOf<OrderId, Order>()
    private var id = 0L
    private fun generateId() = OrderId(++id)

    override fun save(order: Order): Order {
        val newId = generateId()
        val newOrder = order.copy(id = newId)
        orders[newId] = newOrder
        return newOrder
    }

    override fun findById(id: OrderId): Order? {
        return orders[id]
    }
}