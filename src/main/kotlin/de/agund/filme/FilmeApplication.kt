package de.agund.filme

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FilmeApplication

fun main(args: Array<String>) {
    runApplication<FilmeApplication>(*args)
}
