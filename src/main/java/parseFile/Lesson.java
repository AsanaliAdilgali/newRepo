package parseFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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


