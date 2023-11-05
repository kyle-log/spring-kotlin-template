package com.cocomo.app.api

import com.cocomo.app.api.service.order.OrderApiConfiguration
import org.springframework.boot.Banner
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import kotlin.system.exitProcess

@SpringBootApplication
class ApiApplication

fun main(args: Array<String>) {
    try {
        SpringApplicationBuilder()
            .sources(ParentApiConfiguration::class.java).run {
                web(WebApplicationType.NONE)
                bannerMode(Banner.Mode.OFF)
            }
            .child(OrderApiConfiguration::class.java).run {
                web(WebApplicationType.NONE)
                bannerMode(Banner.Mode.OFF)
            }
            .sibling(ApiApplication::class.java).run {
                web(WebApplicationType.SERVLET)
                bannerMode(Banner.Mode.OFF)
            }
            .run(*args)
    } catch (e: Exception) {
        exitProcess(-1)
    }
}