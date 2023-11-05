package com.cocomo.service.order.domain

data class Order(
    val id: OrderId?,
    val name: String,
) {
    fun requireId() = id ?: throw OrderNotFoundException()

    companion object {
        fun create(name: String) = Order(
            id = null,
            name = name,
        )
    }
}

class OrderNotFoundException : RuntimeException()

@JvmInline
value class OrderId(val value: Long)
