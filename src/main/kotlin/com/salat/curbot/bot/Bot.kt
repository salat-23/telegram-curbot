package com.salat.curbot.bot

import com.salat.curbot.bot.receiver.UpdateHandler
import com.salat.curbot.properties.TelegramProperties
import org.springframework.core.task.TaskExecutor
import org.springframework.stereotype.Component
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update

@Component
final class Bot(
    private val telegramProperties: TelegramProperties,
    private val updateReceiver: UpdateHandler,
    private val taskExecutor: TaskExecutor
) : TelegramLongPollingBot() {

    init {
        BOT = this
    }

    companion object {
        lateinit var BOT: Bot
    }

    override fun getBotToken(): String {
        return telegramProperties.token
    }

    override fun getBotUsername(): String {
        return telegramProperties.name
    }

    override fun onUpdateReceived(update: Update) {
        taskExecutor.execute {
            updateReceiver.handle(update)
        }
    }
}