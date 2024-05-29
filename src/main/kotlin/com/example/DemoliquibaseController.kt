package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule

@Controller("/demo")
class DemoliquibaseController {

    @Get(uri = "/", produces = ["text/plain"])
    @Secured(SecurityRule.IS_ANONYMOUS)
    fun index(): String {
        return "Example Response"
    }
}
