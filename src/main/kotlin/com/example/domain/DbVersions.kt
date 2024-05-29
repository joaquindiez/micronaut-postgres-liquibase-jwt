package com.example.domain

import io.micronaut.serde.annotation.Serdeable
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset

@Serdeable
@Entity
@Table(name = "db_versions")
data class DbVersions(
        @Id val id: Int,
        @Column(name = "version", nullable = false, unique = true) val version: String,
        @Column(name = "description", nullable = false, unique = false) val description: String,
        @Column(name = "status", nullable = false, unique = false) val status: String,
        @Column(name = "created_at", nullable = false, unique = false)
        var createdAt: LocalDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC),
        @Column(name = "update_at", nullable = false, unique = false)
        var updateAt: LocalDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC),
)
