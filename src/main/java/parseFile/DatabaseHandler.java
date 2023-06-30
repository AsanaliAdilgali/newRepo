package parseFile;

import SqlSample.Configs;
import SqlSample.Const;
import com.fasterxml.jackson.databind.JsonNode;

import javax.jws.soap.SOAPBinding;
import java.io.File;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileWriter;
import java.sql.*;


public class DatabaseHandler {

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        Connection dbConnection;
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "asanka56");
        return connection;
    }

    public void saveData(String number, String id, String repCode, String repName, String repType,
                         String repFileName, String repFileType, String date) {
        String insert = "INSERT INTO reports(report_number, id, RepCode, RepName, RepType, RepFileName, RepFileType, report_date)" +
                "VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, number);
            prSt.setString(2, id);
            prSt.setString(3, repCode);
            prSt.setString(4, repName);
            prSt.setString(5, repType);
            prSt.setString(6, repFileName);
            prSt.setString(7, repFileType);
            prSt.setString(8, date);
            System.out.println("Success");
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
            System.out.println("Error");
        }
    }
}



