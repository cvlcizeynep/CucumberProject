package pojos;

import java.util.ArrayList;

public class LessonProgramRequest {

        private String day;
        private String educationTermId;
        private ArrayList<Integer> lessonIdList;
        private String startTime;
        private String stopTime;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(String educationTermId) {
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

    public LessonProgramRequest() {
    }

    public LessonProgramRequest(String day, String educationTermId, ArrayList<Integer> lessonIdList, String startTime, String stopTime) {
        this.day = day;
        this.educationTermId = educationTermId;
        this.lessonIdList = lessonIdList;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    @Override
    public String toString() {
        return "LessonProgramRequest{" +
                "day='" + day + '\'' +
                ", educationTermId='" + educationTermId + '\'' +
                ", lessonIdList=" + lessonIdList +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                '}';
    }
}

