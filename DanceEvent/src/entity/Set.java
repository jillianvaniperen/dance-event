package entity;
import java.io.Serializable;

public class Set implements Serializable {
    private long setID;
    private String nameSet;
    private String beginTime;
    private String endTime;
    private String day;
    private String stage;

    public Set() {}

    public Set(long setID, String nameSet, String beginTime, String endTime, String day, String stage) {
        this.setID = setID;
        this.nameSet = nameSet;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.day = day;
        this.stage = stage;
    }

    public long getSetID() { return setID; }

    public void setSetID(long setID) { this.setID = setID; }

    public String getNameSet() {
        return this.nameSet;
    }

    public void setNameSet(String nameSet) {
        this.nameSet = nameSet;
    }

    public String getBeginTime() {
        return this.beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDay() { return this.day; }

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

