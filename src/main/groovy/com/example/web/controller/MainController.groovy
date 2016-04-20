package com.example.web.controller

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration
class MainController {

    @RequestMapping('/')
    @ResponseBody
    @Transactional(readOnly = true)
    def helloworld() {
        "hello, world"
    }
}
