package com.cocomo.app.api.service.order

import com.cocomo.service.order.OrderConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Import(
    OrderConfiguration::class
)
@Configuration
class OrderApiConfiguration {
}