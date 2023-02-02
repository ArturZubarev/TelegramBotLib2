package org.zubarev.command.basic;

import org.telegram.telegrambots.meta.api.objects.Update;
import org.zubarev.storage.Storage;

import java.util.*;

public class TextParsingCommand {

    private Storage storage = new Storage();

    //надо определиться с логикой работы hashmap и как грамотно получить значения по ключу
    public String parseMessageText(String message) {
        String response = "";
        for (Map.Entry<String, String> entry :
                storage.getStorageMap().entrySet()) {
            if (entry.getKey().equalsIgnoreCase(message)) {
                response = entry.getValue();
            }

        }
        if (message.equalsIgnoreCase("/start")) {
            response = "Привет!\n" +
                    "Бот хранит и присылает книги по программированию на языке Java.\n" +
                    "Для получения инструкции нажми /info";
        } else if (message.equalsIgnoreCase("/info")) {
            response = "Для скачивания книги введите фамилию автора.\n" +
                    "Для скачивания вопросов к собеседованию введите слово 'Вопросы' \n" +
                    "Для скачивания книги по паттернам программирования введите слово 'Паттерны'";

        } else if (message.equalsIgnoreCase("/books")) {
            List<String> booksList = new ArrayList<>();
            StringJoiner joiner = new StringJoiner("\n");
            booksList.addAll(storage.getStorageMap().keySet());
            for (String s:
                 booksList) {
                joiner.add(s);
            }
            response = joiner.toString();
            System.out.println(response);


        } else
            response = "не распознано";
        return response;
    }
}







