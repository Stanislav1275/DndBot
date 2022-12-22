package org.example;

import com.pengrad.telegrambot.TelegramBot;

public abstract class Command {
    private  String nameCommand;
    public TelegramBot bot;
    public Command(String name){
        this.nameCommand = name;
        bot = MyBot.bot;
    }
    public abstract String execute();

    public String getNameCommand() {
        return nameCommand;
    }

    public void setNameCommand(String nameCommand) {
        this.nameCommand = nameCommand;
    }
}
