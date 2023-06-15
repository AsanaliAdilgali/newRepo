package parseFile;
import sun.security.util.Length;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

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

    public String cleanString(String dirtyString, String anyGarbage) { //на вход задается 1-ый параметр String (например строка распарсенная из файла) и 2-ой параметр символ от которого нужно почистить эту строку (например символ ")
        String cleanString = null;
        cleanString = dirtyString.replaceAll("\"", "");
        return cleanString;

    }

    public String[] splitString(String strForSplit, String patternToSplit) { //на вход задается 1-ый параметр String (например почищенная строка) и 2-ой параметр это Pattern по которому будет делиться строка
        String[] splitedString = strForSplit.split(",");
        return splitedString;
    }

    public List<String> fromArrayToString (String[] splitedString){ //на вход придет массив строк, который получили в прежнем методе, и из этот массив нужно превратить в лист сторок
        List<String> listFromArray = new ArrayList<>();
        for (String str : splitedString) {
            listFromArray.add(str);
        }
        return listFromArray;
    }
}