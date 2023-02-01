package org.zubarev.command.basic;

import org.telegram.telegrambots.meta.api.objects.Update;
import org.zubarev.storage.Storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TextParsingCommand {

    private Storage storage = new Storage();

    //надо определиться с логикой работы hashmap и как грамотно получить значения по ключу
    public String parseMessageText(String message) {
        String response = "";
        for (Map.Entry<String,String> entry :
            storage.getStorageMap().entrySet()){
            if (entry.getKey().equalsIgnoreCase(message)){
                response = entry.getValue();
            }

        }
        if (message.equalsIgnoreCase("/start")){
            response = "hi!";
        }
        return response;
    }
}





