package task3;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String input) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            char[] chars = input.toCharArray();
            if(chars[i] == ' ') continue;
            chars[i] = Character.toUpperCase(chars[i]);
            result.add(new String(chars));
        }
        return result.toArray(new String[0]);
    }
}
