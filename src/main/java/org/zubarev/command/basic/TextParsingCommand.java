package org.zubarev.command.basic;

import org.telegram.telegrambots.meta.api.objects.Update;
import org.zubarev.storage.Storage;

import java.util.Map;
import java.util.Set;

public class TextParsingCommand {

    Storage storage;
    Update update;

    //надо определиться с логикой работы hashmap и как грамотно получить значения по ключу
    public String parseMessageText(String message) {
        String response;
        switch (message) {
            case ("/start"):
                response = "hello";
                break;
            default:
                response = "null";

        }
        return response;
    }
}





