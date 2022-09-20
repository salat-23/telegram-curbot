package com.salat.curbot.bot.configuration

import com.salat.curbot.bot.receiver.UpdateHandlerImpl
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope
import org.springframework.core.task.SimpleAsyncTaskExecutor
import org.springframework.core.task.TaskExecutor

@Configuration
class Beans {

    @Bean
    fun updateHandler(): com.salat.curbot.bot.receiver.UpdateHandler {
        return UpdateHandlerImpl();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    fun taskExecutor(): TaskExecutor {
        return SimpleAsyncTaskExecutor()
    }

}