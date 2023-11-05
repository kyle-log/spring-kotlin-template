package com.cocomo.app.api.service.order.web

import com.cocomo.service.order.application.OrderCreateCommand
import com.cocomo.service.order.application.OrderCreateProcessor
import com.cocomo.service.order.application.OrderFinder
import com.cocomo.service.order.domain.OrderId
import com.cocomo.service.order.domain.OrderNotFoundException
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/orders")
class OrderController(
    val orderCreateProcessor: OrderCreateProcessor,
    val orderFinder: OrderFinder,
) {

    @PostMapping
    fun create(): OrderId {
        val command = OrderCreateCommand(name = "order-1")
        return orderCreateProcessor.process(command)
    }

    @GetMapping("/{id}")
    fun find(@PathVariable id: Long): OrderResponse {
        val order = orderFinder.find(OrderId(id)) ?: throw OrderNotFoundException()
        return OrderResponse(
            id = order.requireId(),
            name = order.name,
        )
    }
}

data class OrderResponse(
    val id: OrderId,
    val name: String,
)