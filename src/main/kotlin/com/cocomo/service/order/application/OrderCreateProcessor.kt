package com.cocomo.service.order.application

import com.cocomo.service.order.domain.OrderId

interface OrderCreateProcessor {
    fun process(command: OrderCreateCommand): OrderId
}

data class OrderCreateCommand(
    val name: String,
)