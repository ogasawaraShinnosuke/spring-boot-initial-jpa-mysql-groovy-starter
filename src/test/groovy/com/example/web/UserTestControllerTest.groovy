package com.example.web

import com.example.domain.UserInfo
import com.example.domain.UserTest
import com.example.service.UserTestService
import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Unroll

class UserTestControllerTest extends SpecBase {
    @Autowired
    UserTestService userTestService

    def setup() {
        userTestService.saveUserTests(
                [createUser('ken'),
                 createUser('mike'),
                 createUser('bob'),
                 createUser('marry')])
        userTestService.saveUserInfoList(
                [createUser(1, 'example+0001@example.com', UserInfo.Sex.MAN),
                 createUser(2, 'example+0002@example.com', UserInfo.Sex.MAN),
                 createUser(3, 'example+0003@example.com', UserInfo.Sex.MAN),
                 createUser(4, 'example+0004@example.com', UserInfo.Sex.WOMAN)])
    }

    private static UserInfo createUser(int userId, String email, UserInfo.Sex sex) {
        UserInfo ui = new UserInfo()
        ui.setUserId(userId)
        ui.setEmail(email)
        ui.setSex(sex.get())
        ui
    }

    private static UserTest createUser(String name) {
        def date = new Date()
        UserTest ut = new UserTest()
        ut.setName(name)
        ut.setCreated(date)
        ut.setUpdated(date)
        ut
    }

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
    }
}
