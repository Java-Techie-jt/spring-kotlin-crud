package com.javatechie.spring.kotlin.crud.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringKotlinCrudApplication

fun main(args: Array<String>) {
	SpringApplication.run(SpringKotlinCrudApplication::class.java, *args)
}
