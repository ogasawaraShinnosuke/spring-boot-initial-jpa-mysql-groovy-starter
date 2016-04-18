package com.example.web

import com.example.DemoApplication
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.boot.test.TestRestTemplate
import org.springframework.boot.test.WebIntegrationTest
import org.springframework.web.client.RestTemplate
import spock.lang.Specification

@SpringApplicationConfiguration(classes = DemoApplication)
@WebIntegrationTest
class SpecBase extends Specification {
    protected static final RestTemplate template = new TestRestTemplate()
    protected static final String LOCALHOST = "http://localhost:8080/"
}
