package parseFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.objects.NativeJSON;
import parseFile.ReportDto;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson {
    public String parseFile(String pathToFile) throws IOException {
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

    public String cleanString(String dirtyString, String anyGarbage) {
        String cleanString = null;
        cleanString = dirtyString.replaceAll("\"", "");
        return cleanString;

    }

    public String[] splitString(String strForSplit, String patternToSplit) {
        String[] splitedString = strForSplit.split(patternToSplit);
        return splitedString;
    }

    public List<String> fromArrayToString(String[] splitedString) {
        List<String> listFromArray = new ArrayList<>();
        for (String str : splitedString) {
            listFromArray.add(str);
        }
        return listFromArray;
    }

    public String fromStringToJson2(List<String> strings) {
        List<List<String>> listOfStringLists = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("{\"reports\": [");
        stringBuilder.append("[");
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).matches("\\d{1,2}")) {
                stringBuilder.append("{\"number\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("\\d{3,5}")) {
                stringBuilder.append("\"id\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[A-Z_\\d]{8,}")) {
                stringBuilder.append("\"repCode\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[A-Z]{4,}")) {
                stringBuilder.append("\"repType\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[a-zA-Zа-яёА-ЯЁ_.\\s\\d()]{14,}")) {
                stringBuilder.append("\"repFileName\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[a-zA-Zа-яёА-ЯЁ\\s\\d№()-]{9,}")) {
                stringBuilder.append("\"repName\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[a-z/.-]{15,}")) {
                stringBuilder.append("\"repFileType\": \"" + strings.get(i) + "\", ");
            } else if (strings.get(i).matches("[\\d\\s:. ]{19,}")) {
                stringBuilder.append("\"date\": \"" + strings.get(i) + "\"},");
            }
        }
//        stringBuilder.append("]}");
        stringBuilder.append("]");
        return stringBuilder.toString();

    }

    public FileWriter write(String filePath, String data) throws IOException {

        File file = new File(filePath);
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write(data);
        writer.flush();
        writer.close();

//        FileReader fr = new FileReader(file);
//        char[] a = new char[1000];
//        fr.read(a);
//
//        for (char c : a)
//            System.out.println(c);
//        fr.close();
        return writer;

    }

    public List<ReportDto> parseJson(String path) throws IOException {
        FileReader input = new FileReader(path);
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(input)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }

            ObjectMapper objectMapper = new ObjectMapper();
            return Arrays.asList(objectMapper.readValue(new File(path), ReportDto[].class));
        }



//Создание метод
//1. идентификатор доступа public private protected
//2. что возвращает 1) ничего то есть void 2) объект либо примитив (например String)
//3. название метода с маленькой буквы

    }


}

