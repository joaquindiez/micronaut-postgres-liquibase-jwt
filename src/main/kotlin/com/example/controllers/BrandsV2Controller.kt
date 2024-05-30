package com.example.controllers

import com.example.dto.BrandsDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import io.swagger.v3.oas.annotations.tags.Tag
import java.util.UUID
import net.datafaker.Faker
import org.slf4j.LoggerFactory

@Controller("/v2/brands")
class BrandsV2Controller {

    val logger = LoggerFactory.getLogger(this::class.java)

    @Tag(name = "Brand-Model-Version")
    /*@Operation(
            summary = "Obtener lista de Marcas ",
            description = "Recupera la lista de Marcas de Vehiculos en SwichtFleet",
            operationId = "getBrands v2"
    )
    @ApiResponses(
            ApiResponse(
                    responseCode = "200",
                    description = "Lista de Marcas obtenida exitosamente"
            ),
            ApiResponse(responseCode = "404", description = "No encontrado")
    )*/
    @Get("/")
    @Secured(SecurityRule.IS_ANONYMOUS)
    fun findAllBrands(): HttpResponse<List<BrandsDto>> {

        logger.info("Find all Brands ")

        val faker = Faker()

        var l = listOf(BrandsDto(id = UUID.randomUUID(), name = faker.name().fullName()))

        return HttpResponse.ok(l)
    }
}
