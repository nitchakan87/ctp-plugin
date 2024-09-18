package com.ctp

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyDependenciesPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.dependencies.apply {
            add("implementation", "org.springframework.boot:spring-boot-starter-webflux:3.1.2")
            add("implementation", "com.fasterxml.jackson.module:jackson-module-kotlin:2.14.0")
            add("implementation","org.springframework.cloud:spring-cloud-function-kotlin:3.1.0")
            add("implementation","org.springframework.cloud:spring-cloud-starter-stream-kafka:3.1.0")


        }
    }
}