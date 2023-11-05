package com.cocomo.service.order.data

import com.cocomo.service.order.data.local.LocalOrderRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OrderDataConfiguration {

    @Bean
    fun localOrderRepository() = LocalOrderRepository()
}