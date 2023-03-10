package org.zubarev.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.zubarev.command.basic.TextParsingCommand;
import org.zubarev.util.MyKeyboard;

public class TelegramBot extends TelegramLongPollingBot {

    private TextParsingCommand textParsingCommand = new TextParsingCommand();
    private MyKeyboard keyboard = new MyKeyboard();
    private String BOT_NAME = System.getenv("BOT_NAME");
    private String BOT_TOKEN = System.getenv("BOT_TOKEN");

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            String inMessageText = update.getMessage().getText();
            String response = textParsingCommand.parseMessageText(inMessageText);
            message.setText(response);
            message.setReplyMarkup(keyboard.getKeyboardMarkup());

            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }




}


