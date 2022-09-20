package com.salat.curbot

import com.salat.curbot.properties.TelegramProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class CurbotApplication

fun main(args: Array<String>) {
    runApplication<CurbotApplication>(*args)
}
