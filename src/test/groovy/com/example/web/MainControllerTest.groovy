package com.example.web

import spock.lang.Unroll

class MainControllerTest extends SpecBase {
    @Unroll
    def helloworld() {
        when:
        def body = template.getForEntity(LOCALHOST, String).body

        then:
        body == "hello, world"
    }

}
