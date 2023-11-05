package com.cocomo.service.order.application

import com.cocomo.service.order.domain.Order
import com.cocomo.service.order.domain.OrderId

interface OrderFinder {
    fun find(id: OrderId): Order?
}