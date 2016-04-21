package com.example.web.controller

import com.example.domain.entity.UserTest
import com.example.service.UserTestService
import groovy.json.JsonBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration
@RequestMapping('/users')
class UserTestController {

    @Autowired
    UserTestService userTestService

    @RequestMapping('{id}')
    @ResponseBody
    @Transactional(readOnly = true)
    def index(@PathVariable int id) {
        UserTest ut = userTestService.getUserTestById id
        def json = new JsonBuilder()
        json.user {
            rowId ut?.id
            name ut?.name
            created ut?.created
            updated ut?.updated
            info {
                rowId ut?.userInfo?.id
                sex ut?.userInfo?.sex
                email ut?.userInfo?.email
                password ut?.userInfo?.password
            }
            history {
                rowId ut?.userHistory?.id
                billingFlg ut?.userHistory?.billingFlg
                userAgent ut?.userHistory?.userAgent
                loginFailCount ut?.userHistory?.loginFailCount
            }
        }
        json?.toString()
    }
}

