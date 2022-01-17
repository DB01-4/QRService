package com.example.qrservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class QrServiceApplication

fun main(args: Array<String>) {
    runApplication<QrServiceApplication>(*args)
}
