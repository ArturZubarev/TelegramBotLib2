package org.zubarev.storage;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter

public class Storage {
    private Map <String,String> storageMap;
    public Storage() {
          final Map<String, String> storageMap = new HashMap<>(Map.of(
                "Мартин", "https://drive.google.com/file/d/1yC-5_Xq6nVNGbmi8oHCx9DpAI1Lx4_LL/view?usp=sharing",
                "Блох", "https://drive.google.com/file/d/1yC-5_Xq6nVNGbmi8oHCx9DpAI1Lx4_LL/view?usp=sharing",
                "Пейн", "https://drive.google.com/file/d/1ogl-Mbe142G7NYRYlJey4LGzg3ddKqhx/view?usp=sharing",
                "Бхаргава", "https://drive.google.com/file/d/145b4_JJYzcteZgw-V42s1N7WMlr3PKyp/view?usp=sharing",
                "Вопросы для собеседования", "https://drive.google.com/file/d/1ws7q7VFqxaPp_7TcuIxC-CEmrIsS--J7/view?usp=sharing",
                "Паттерны", "https://drive.google.com/file/d/145b4_JJYzcteZgw-V42s1N7WMlr3PKyp/view?usp=sharing"));
    }
}






