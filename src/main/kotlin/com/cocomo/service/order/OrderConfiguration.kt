package com.cocomo.service.order

import com.cocomo.service.order.data.OrderDataConfiguration
import com.cocomo.service.order.domain.OrderDomainConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Import(
    OrderDataConfiguration::class,
    OrderDomainConfiguration::class
)
@Configuration
class OrderConfiguration {
}