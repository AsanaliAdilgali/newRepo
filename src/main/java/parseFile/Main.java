package parseFile;

import java.io.IOException;
import java.security.acl.AclNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        String fileWithData = "C:\\Users\\w2\\Downloads\\text_for_parse.txt";
        Lesson lesson = new Lesson();
        String str = lesson.parseFile(fileWithData);
        //System.out.println(str);

        String garbage = "\"";
        String str2 = lesson.cleanString(str, garbage);
        //System.out.println(str2);

        String patternTo = ",";
        String[] parts = lesson.splitString(str2, patternTo);
        for (String part : parts) {
          //    System.out.println(part);
        }

        List<String> str3 = lesson.fromArrayToString(parts);
        //System.out.println(str3);
        String jsonStringWithZap9ta9 = lesson.fromStringToJson2(str3);
        int sizeOfLastStr = jsonStringWithZap9ta9.length();
        String jsonString = jsonStringWithZap9ta9.substring(0, sizeOfLastStr - 3) + jsonStringWithZap9ta9.substring(sizeOfLastStr - 2, sizeOfLastStr - 1) + "}";
        System.out.println(jsonString);
    }
}