package parseFile;

import SqlSample.Configs;
import com.fasterxml.jackson.databind.ObjectMapper;
import parseFile.Lesson;
import parseFile.ReportDto;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main extends DatabaseHandler {

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

        String jsonStringWithZap9ta9 = lesson.fromStringToJson2(str3);
        int sizeOfLastStr = jsonStringWithZap9ta9.length();
        String jsonString = jsonStringWithZap9ta9.substring(0, sizeOfLastStr - 2) + jsonStringWithZap9ta9.substring(sizeOfLastStr - 1, sizeOfLastStr);
        System.out.println(jsonString);

        FileWriter jFile = lesson.write(jsonFile, jsonString);

        DatabaseHandler dataH = new DatabaseHandler();

        List<ReportDto> reportDtos = lesson.parseJson(jsonFile);
        for (ReportDto r : reportDtos) {
            dataH.saveData(String.valueOf(r.number), String.valueOf(r.id), r.repCode, r.repName, r.repType, r.repFileName, r.repFileType, r.date);
        }
    }
}














