package com.myepark.apartment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class ApartmentApplication

fun main(args: Array<String>) {
    runApplication<ApartmentApplication>(*args)
}
