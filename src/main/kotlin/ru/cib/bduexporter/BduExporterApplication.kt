package ru.cib.bduexporter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BduExporterApplication

fun main(args: Array<String>) {
    runApplication<BduExporterApplication>(*args)
}
