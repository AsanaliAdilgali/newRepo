package parseFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileWithData = "C:\\Users\\w2\\Downloads\\text_for_parse.txt";
        String jsonFile = "C:\\Users\\w2\\Downloads\\dataFromFile2.json";
        Lesson lesson = new Lesson();
        String str = lesson.parseFile(fileWithData);

        String garbage = "\"";
        String str2 = lesson.cleanString(str, garbage);


        String patternTo = ",";
        String[] parts = lesson.splitString(str2, patternTo);


        List<String> str3 = lesson.fromArrayToString(parts);
        //System.out.println(str3);
        String jsonStringWithZap9ta9 = lesson.fromStringToJson2(str3);
        int sizeOfLastStr = jsonStringWithZap9ta9.length();
        String jsonString = jsonStringWithZap9ta9.substring(0, sizeOfLastStr - 3) + jsonStringWithZap9ta9.substring(sizeOfLastStr - 2, sizeOfLastStr - 1) + "}";
        // System.out.println(jsonString);


        FileWriter jFile = lesson.write(jsonFile, jsonString);
        System.out.println(jFile);

    }
}