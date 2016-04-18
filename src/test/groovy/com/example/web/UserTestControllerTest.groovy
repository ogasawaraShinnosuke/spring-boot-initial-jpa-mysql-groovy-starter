package com.example.web

import groovy.json.JsonSlurper
import spock.lang.Unroll

class UserTestControllerTest extends SpecBase {
    @Unroll
    def user() {
        when:
        def body = template.getForEntity("${LOCALHOST}users/1", String).body

        then:
        def json = new JsonSlurper().parseText(body)
        json.user.rowId == 1
        json.user.name == 'ken'
        json.user.info.sex == 'MAN'
        json.user.info.email == 'example+0001@example.com'
        json.user.info.password == null
    }
}
