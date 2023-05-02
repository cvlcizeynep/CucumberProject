package pojos;

public class LessonPojo {
        public String compulsory;
        public String creditScore;
        public String lessonName;

    public LessonPojo() {
    }

    public LessonPojo(String compulsory, String creditScore, String lessonName) {
        this.compulsory = compulsory;
        this.creditScore = creditScore;
        this.lessonName = lessonName;
    }

    public String getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(String compulsory) {
        this.compulsory = compulsory;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "LessonPojo{" +
                "compulsory='" + compulsory + '\'' +
                ", creditScore='" + creditScore + '\'' +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }
}

