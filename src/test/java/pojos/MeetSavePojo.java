package pojos;

import java.util.ArrayList;

public class MeetSavePojo {
    public String date;
    public String description;
    public String startTime;
    public String stopTime;
    public ArrayList<Integer> studentIds;

    public MeetSavePojo() {
    }

    public MeetSavePojo(String date, String description, String startTime, String stopTime, ArrayList<Integer> studentIds) {
        this.date = date;
        this.description = description;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.studentIds = studentIds;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public ArrayList<Integer> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(ArrayList<Integer> studentIds) {
        this.studentIds = studentIds;
    }

    @Override
    public String toString() {
        return "MeetSavePojo{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", studentIds=" + studentIds +
                '}';
    }
}
