package org.zubarev.command.basic;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TextParsingCommand {

    public  String parseMessageText(String message) {
        String response;
        if (message.equals("Мартин")) {
            response = "https://drive.google.com/file/d/1rNdIhYyFZgDQ3J8f0RAY6jUSufVrYHNG/view?usp=sharing";
        } else if (message.equals("Блох")) {
            response = "https://drive.google.com/file/d/1yC-5_Xq6nVNGbmi8oHCx9DpAI1Lx4_LL/view?usp=sharing";

        } else if (message.equals("Пейн")) {
            response = "https://drive.google.com/file/d/1ogl-Mbe142G7NYRYlJey4LGzg3ddKqhx/view?usp=sharing";
        } else if (message.equals("Бхаргава")) {
            response = "https://drive.google.com/file/d/145b4_JJYzcteZgw-V42s1N7WMlr3PKyp/view?usp=sharing";
        } else if (message.equals("Вопросы для собеседования")) {
            response = "https://drive.google.com/file/d/1ws7q7VFqxaPp_7TcuIxC-CEmrIsS--J7/view?usp=sharing";

        } else if (message.equals("Паттерны")) {
            response = "https://drive.google.com/file/d/145b4_JJYzcteZgw-V42s1N7WMlr3PKyp/view?usp=sharing";
        } else if (message.equals("/start")) {
            response = "Доступные книги:\n" +
                    " Блох; Пейн;\n" +
                    " Мартин; Вопросы для собеседований\n" +
                    "Бхаргава; Паттерны\n" + "для получения информации о порядке загрузки введите команду /info";

        } else if (message.equals("/info")) {
            response = "Для загрузки книги введите фамилию автора с большой буквы";
        } else {
            response = "не распознано!";
        }

        return response;
    }

}





