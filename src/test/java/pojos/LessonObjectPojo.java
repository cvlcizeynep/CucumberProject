package pojos;

public class LessonObjectPojo {

    private String lessonName;
    private int creditScore;
    private String compulsory;

    public LessonObjectPojo() {

    }

    public LessonObjectPojo( String lessonName, int creditScore, String compulsory) {

        this.lessonName = lessonName;
        this.creditScore = creditScore;
        this.compulsory = compulsory;
    }



    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(String compulsory) {
        this.compulsory = compulsory;
    }

    @Override
    public String toString() {
        return "LessonObjectPojo{" +
                ", lessonName='" + lessonName + '\'' +
                ", creditScore=" + creditScore +
                ", compulsory='" + compulsory + '\'' +
                '}';
    }
}
