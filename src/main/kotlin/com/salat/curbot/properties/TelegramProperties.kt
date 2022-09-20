package com.salat.curbot.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("bot")
data class TelegramProperties(
    val name: String,
    val token: String
) {

}