package parseFile;

import java.util.List;
import java.util.Objects;

public class Report {
    private int number;
    private int id;
    private String rep_code;
    private String rep_name;
    private String rep_type;
    private String rep_file_name;
    private String rep_file_type;
    private int date;
//
//    public Report(ReportDto fileDto){
//    }

    public int getNumber() {
        return number;
    }

    public void setNumber(){
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getRep_code(){
        return rep_code;
    }

    public void setRep_code(String rep_code){
        this.rep_code = rep_code;
    }

    public String getRep_name(){
        return rep_name;
    }

    public void setRep_name(String rep_name){
        this.rep_name = rep_name;
    }

    public String getRep_type(){
        return rep_name;
    }

    public void setRep_type(String rep_type){
        this.rep_type = rep_type;
    }

    public String getRep_file_name(){
        return rep_file_name;
    }

    public void setRep_file_name(String rep_file_name){
        this.rep_file_name = rep_file_name;
    }

    public String getRep_file_type(){
        return rep_file_type;
    }

    public void setRep_file_type(String rep_file_type){
        this.rep_file_type = rep_file_type;
    }

    public int getDate(){
        return date;
    }

    public void setDate(){
        this.date = date;
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(number,id,rep_code,rep_name,rep_type,rep_file_name,rep_file_type,date);
    }*/

    @Override
    public String toString() {
        return "Object{" +
                "number'" + number + '\'' +
                ", id" + id + '\'' +
                ", rep_code" + rep_code + '\''
                + ", rep_name" + rep_name + '\'' +
                ", rep_type" + rep_type + '\'' +
                ", rep_file_name" + rep_file_name + '\'' +
                ", rep_file_type" + rep_file_type + '\'' +
                ", date" + date +
                '}';
    }
    public Report(){

    }

//    public Report(ReportDto dto){
//        this.number = number;
//        this.id = id;
//        this.rep_code = rep_code;
//        this.rep_name = rep_name;
//        this.rep_type = rep_type;
//        this.rep_file_name = rep_file_name;
//        this.rep_file_type = rep_file_type;
//        this.date = date;
//    }
}
