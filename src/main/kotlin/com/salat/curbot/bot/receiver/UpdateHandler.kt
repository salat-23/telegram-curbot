package com.salat.curbot.bot.receiver

import org.telegram.telegrambots.meta.api.objects.Update

interface UpdateHandler {

    fun handle(update: Update): UpdateHandlerResult

}