package com.example.dto

import io.micronaut.serde.annotation.Serdeable
import java.util.*

@Serdeable data class BrandsDto(val id: UUID, val name: String)
