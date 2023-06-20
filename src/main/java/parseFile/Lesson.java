package parseFile;

import jdk.nashorn.internal.objects.NativeJSON;
import jdk.nashorn.internal.parser.JSONParser;
import sun.security.util.Length;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        String[] splitedString = strForSplit.split(patternToSplit);
        return splitedString;
    }

    public List<String> fromArrayToString(String[] splitedString) { //на вход придет массив строк, который получили в прежнем методе, и из этот массив нужно превратить в лист сторок
        List<String> listFromArray = new ArrayList<>();
        for (String str : splitedString) {
            listFromArray.add(str);
        }
        return listFromArray;
    }

    public List<String> fromStringToJson(List<String> strings) {
        String jsonString = null;
        int counter = 0;
        for (int i = 0; i < strings.size(); i++) {

            counter++;

            if (counter == 1) {
                strings.set(i, "number : " + strings.get(i));
            }

            if (counter == 2) {
                strings.set(i, "id : " + strings.get(i));
            }
            if (counter == 3) {
                strings.set(i, "repCode : " + strings.get(i));
            }

            if (counter == 4) {
                strings.set(i, "repName : " + strings.get(i));
            }
            if (counter == 5) {
                strings.set(i, "repType : " + strings.get(i));
            }
            if (counter == 6) {
                strings.set(i, "repFileName : " + strings.get(i));
            }
            if (counter == 7) {
                strings.set(i, "repFileType : " + strings.get(i));
            }
            if (counter == 8) {
                strings.set(i, "update : " + strings.get(i));
                counter++;

                break;
            }
            continue;

        }
        return strings;

    }

    public String fromStringToJson2(List<String> strings) {
        List<List<String>> listOfStringLists = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\"reports\": [");
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).matches("\\d{1,2}")) {
                stringBuilder.append("{\"number\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("\\d{3,5}")) {
                stringBuilder.append("\"id\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[A-Z_\\d]{8,}")) {
                stringBuilder.append("\"rep_Code\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[A-Z]{4,}")) {
                stringBuilder.append("\"rep_type\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[a-zA-Zа-яёА-ЯЁ_.\\s\\d()]{14,}")) {
                stringBuilder.append("\"rep_file_name\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[a-zA-Zа-яёА-ЯЁ\\s\\d№()-]{9,}")) {
                stringBuilder.append("\"repName\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[a-z/.-]{15,}")) {
               stringBuilder.append("\"rep_file_type\": \""  + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[\\d\\s:. ]{19,}")) {
                stringBuilder.append("\"date\": \"" + strings.get(i) + "\"},");
            }
        }
        stringBuilder.append("]}");
        return stringBuilder.toString();
    }
}


//До: 0,361,REP_TEST,Тестовый отчет,JASPER,REP_TEST.jrxml,application/octet-stream,11.01.2015 22:02:11,
//После:{"number": "0","id": "361","repCode": "REP_TEST","repName": "Тестовый отчет","repType": "JASPER","repFileNa