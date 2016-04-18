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
    }
}
