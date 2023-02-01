package org.zubarev.util;

import lombok.Getter;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MyKeyboard  {
     private ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
     public MyKeyboard(){
          keyboardMarkup.setResizeKeyboard(true);
          keyboardMarkup.setOneTimeKeyboard(false);

          List<KeyboardRow> rows = new ArrayList<>();
          KeyboardRow row = new KeyboardRow();
          rows.add(row);
          row.add(new KeyboardButton("/start"));
          keyboardMarkup.setKeyboard(rows);
     }



}
