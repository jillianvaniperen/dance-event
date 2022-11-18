package Entity;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;

public class Set implements Serializable {
    private String nameSet;
    private DateTimeFormatter beginTime;
    private DateTimeFormatter endTime;
    private String day;
    private String stage;

    public Set() {}

    public String getNameSet() {
        return this.nameSet;
    }

    public void setNameSet(String nameSet) {
        this.nameSet = nameSet;
    }

    public DateTimeFormatter getBeginTime() {
        return this.beginTime;
    }

    public void setBeginTime(DateTimeFormatter beginTime) {
        this.beginTime = beginTime;
    }

    public DateTimeFormatter getEndTime() {
        return this.endTime;
    }

    public void setEndTime(DateTimeFormatter endTime) {
        this.endTime = endTime;
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStage() {
        return this.stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}

