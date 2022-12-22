package org.example;


import Commands.CommandsManager;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBot {
    public static final TelegramBot bot = new TelegramBot(DEFS.TOKEN);
    CommandsManager commandsManager = new CommandsManager();

    public MyBot() {
        bot.setUpdatesListener(updates -> {
            updates.forEach(this::updateState);
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    public void updateState(Update update) {
        long chatId = update.message().chat().id();
        String txtMsg = update.message().text();
        if (!checkCommands(chatId, txtMsg)) bot.execute(new SendMessage(chatId, "я могу пока только ролять....))"));
    }

    private boolean checkCommands(long chatId, String txtMsg) {

        for (Command command : commandsManager.getCommands()) {

            if (("/roll" + command.getNameCommand()).equalsIgnoreCase(txtMsg.replaceAll(" ",""))) {

                bot.execute(new SendMessage(chatId, command.execute()));
                return true;
            }
        }
        return false;
    }
    private String parse(String msg){///roll4d4

        return "";
    }


    public static void main(String[] args) {
        new MyBot();
    }
}
