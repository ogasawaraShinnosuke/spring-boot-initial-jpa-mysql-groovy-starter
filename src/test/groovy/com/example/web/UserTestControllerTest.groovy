package com.example.web

import com.example.domain.entity.UserHistory
import com.example.domain.entity.UserInfo
import com.example.service.UserTestService
import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Unroll

class UserTestControllerTest extends SpecBase {
    @Autowired
    UserTestService userTestService

//    def setup() {
//        userTestService.saveUserTests(
//                [createUser('ken'),
//                 createUser('mike'),
//                 createUser('bob'),
//                 createUser('marry')])
//        userTestService.saveUserInfoList(
//                [createUser(1, 'example+0001@example.com', UserInfo.Sex.MAN),
//                 createUser(2, 'example+0002@example.com', UserInfo.Sex.MAN),
//                 createUser(3, 'example+0003@example.com', UserInfo.Sex.MAN),
//                 createUser(4, 'example+0004@example.com', UserInfo.Sex.WOMAN)])
//    }
//
//    private static UserInfo createUser(int userId, String email, UserInfo.Sex sex) {
//        UserInfo ui = new UserInfo()
//        ui.setUserId(userId)
//        ui.setEmail(email)
//        ui.setSex(sex.get())
//        ui
//    }
//
//    private static UserTest createUser(String name) {
//        def date = new Date()
//        UserTest ut = new UserTest()
//        ut.setName(name)
//        ut.setCreated(date)
//        ut.setUpdated(date)
//        ut
//    }

    @Unroll
    def user() {
        when:
        def body = template.getForEntity("${LOCALHOST}users/1", String).body

        then:
        def json = new JsonSlurper().parseText(body)
        json.user.rowId == 1
        json.user.name == 'ken'
        json.user.info.sex == UserInfo.Sex.MAN.get()
        json.user.info.email == 'example+0001@example.com'
        json.user.info.password == null

//        List<UserInfo> users = userTestService.getUserInfoByUserId(1)
//        users.each { user ->
//            println ' user - info '
//            if (user instanceof UserInfo) {
//                println user.id
//                println user.userId
//                println user.email
//                println user.sex
//            }
//            println ' not user info '
//            println user
//        }

        userTestService.findByUserId(1).each { user ->
            println ' user - info by userId'
            if (user instanceof UserInfo) {
                println "id=$user.id"
                println "userId=$user.userId"
                println "email=$user.email"
                println "sex=$user.sex"
            } else {
                println ' not user info '
                println user
            }
            println()
        }

        userTestService.findByEmail('example+0001@example.com').each { user ->
            println ' user - info by email'
            if (user instanceof UserInfo) {
                println "id=$user.id"
                println "userId=$user.userId"
                println "email=$user.email"
                println "sex=$user.sex"
            } else {
                println ' not user info '
                println user
            }
            println()
        }

        userTestService.findByUserIdAndEmail(1, 'example+0001@example.com').each { user ->
            println ' user - info by userId and email'
            if (user instanceof UserInfo) {
                println "id=$user.id"
                println "userId=$user.userId"
                println "email=$user.email"
                println "sex=$user.sex"
            } else {
                println ' not user info '
                println user
            }
            println()
        }

        userTestService.findByUserIdAndSexAndEmail(1, 1, 'example+0001@example.com').each { user ->
            println ' user - info by userId and sex and email'
            if (user instanceof UserInfo) {
                println "id=$user.id"
                println "userId=$user.userId"
                println "email=$user.email"
                println "sex=$user.sex"
            } else {
                println ' not user info '
                println user
            }
            println()
        }

        userTestService.findHistoryById(1).each { user ->
            println ' user - history by id'
            if (user instanceof UserHistory) {
                println "id=$user.id"
                println "billingFlg=$user.billingFlg"
                println "userId=$user.userId"
                println "loginFailCount=$user.loginFailCount"
                println "userAgent=$user.userAgent"
            } else {
                println ' not user history '
                println user
            }
            println()
        }

        userTestService.findHistoryByUserId(2).each { user ->
            println ' user - history by userId'
            if (user instanceof UserHistory) {
                println "id=$user.id"
                println "billingFlg=$user.billingFlg"
                println "userId=$user.userId"
                println "loginFailCount=$user.loginFailCount"
                println "userAgent=$user.userAgent"
            } else {
                println ' not user history '
                println user
            }
            println()
        }
    }
}
