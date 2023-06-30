package SqlSample;

public class Report {
    private String number;
    private String id;
    private String repCode;
    private String repName;
    private String repType;
    private String repFileName;
    private String repFileType;
    private String date;

    public Report (String number, String id, String repCode, String repName, String repType, String repFileName, String repFileType, String date) {
        this.number = number;
        this.id = id;
        this.repCode = repCode;
        this.repName = repName;
        this.repType = repType;
        this.repFileName = repFileName;
        this.repFileType = repFileType;
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRepCode() {
        return repCode;
    }

    public void setRepCode(String repCode) {
        this.repCode = repCode;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public String getRepType() {
        return repType;
    }

    public void setRepType(String repType) {
        this.repType = repType;
    }

    public String getRepFileName() {
        return repFileName;
    }

    public void setRepFileName(String repFileName) {
        this.repFileName = repFileName;
    }

    public String getRepFileType() {
        return repFileType;
    }

    public void setRepFileType(String repFileType) {
        this.repFileType = repFileType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
