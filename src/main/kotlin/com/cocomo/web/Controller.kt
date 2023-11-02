package com.cocomo.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author kyle.kim@daangn.com
 */
@RestController
class Controller {

    @GetMapping
    fun hello(): String {
        return "Hello, World!"
    }
}