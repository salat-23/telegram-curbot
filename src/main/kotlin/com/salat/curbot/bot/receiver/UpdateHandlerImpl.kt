package com.salat.curbot.bot.receiver

import org.springframework.stereotype.Component
import org.telegram.telegrambots.meta.api.objects.Update

@Component
class UpdateHandlerImpl : UpdateHandler {

    override fun handle(update: Update): UpdateHandlerResult {


        return UpdateHandlerResult.DONE
    }
}