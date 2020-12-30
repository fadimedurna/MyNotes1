package tr.edu.mu.ceng.mad.mynotes1;


import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable { //parceable better thn serializable
    private String header;
    private Date date;
    private String filePath;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
