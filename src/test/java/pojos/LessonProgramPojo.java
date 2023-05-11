package pojos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LessonProgramPojo {
    private String day;
    private int educationTermId;
    private ArrayList<Integer> lessonIdList;
    private String startTime;
    private String stopTime;

    public LessonProgramPojo() {
    }


    public LessonProgramPojo(String day, int educationTermId, ArrayList<Integer> lessonIdList, String startTime, String stopTime) {
        this.day = day;
        this.educationTermId = educationTermId;
        this.lessonIdList = lessonIdList;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(int educationTermId) {
        this.educationTermId = educationTermId;
    }

    public ArrayList<Integer> getLessonIdList() {
        return lessonIdList;
    }

    public void setLessonIdList(ArrayList<Integer> lessonIdList) {
        this.lessonIdList = lessonIdList;
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

    @Override
    public String toString() {
        return "LessonProgramPojo{" +
                "day='" + day + '\'' +
                ", educationTermId=" + educationTermId +
                ", lessonIdList=" + lessonIdList +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                '}';
    }
}
