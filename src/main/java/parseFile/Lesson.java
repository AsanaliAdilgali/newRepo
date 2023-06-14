package parseFile;
import sun.security.util.Length;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson {
    public String parseFile(String pathToFile) throws IOException { //на вход задается один параметр в виде строки, и это путь к файлу на компе
        FileReader input = new FileReader(pathToFile);
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(input)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                return line;
            }
            String str = builder.toString();
            return str;

        }
    }
    public String cleanString(String dirtyString, String anyGarbage){ //на вход задается 1-ый параметр String (например строка распарсенная из файла) и 2-ой параметр символ от которого нужно почистить эту строку (например символ ")
        String cleanString = null;
        cleanString = dirtyString.replaceAll("\"", "");
        return cleanString;

    }
}
