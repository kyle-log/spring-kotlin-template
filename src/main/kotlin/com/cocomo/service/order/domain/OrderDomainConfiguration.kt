package com.cocomo.service.order.domain

import com.cocomo.service.order.application.OrderHostService
import com.cocomo.service.order.application.OrderQueryService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OrderDomainConfiguration {

    @Bean
    fun orderHostService(
        orderRepository: OrderRepository,
    ) = OrderHostService(
        orderRepository = orderRepository,
    )

    @Bean
    fun orderQueryService(
        orderRepository: OrderRepository,
    ) = OrderQueryService(
        orderRepository = orderRepository,
    )
}