package com.example.qrservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QrServiceApplication

fun main(args: Array<String>) {
    runApplication<QrServiceApplication>(*args)
}
