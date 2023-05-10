package pojos;

public class StudentInfoRequest {

        private String absentee;
    private String educationTermId;
    private String finalExam;
    private String infoNote;
    private String lessonId;
    private String midtermExam;
    private String studentId;

    public StudentInfoRequest() {
    }

    public StudentInfoRequest(String absentee, String educationTermId, String finalExam, String infoNote, String lessonId, String midtermExam, String studentId) {
        this.absentee = absentee;
        this.educationTermId = educationTermId;
        this.finalExam = finalExam;
        this.infoNote = infoNote;
        this.lessonId = lessonId;
        this.midtermExam = midtermExam;
        this.studentId = studentId;
    }

    public String getAbsentee() {
        return absentee;
    }

    public void setAbsentee(String absentee) {
        this.absentee = absentee;
    }

    public String getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(String educationTermId) {
        this.educationTermId = educationTermId;
    }

    public String getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(String finalExam) {
        this.finalExam = finalExam;
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(String midtermExam) {
        this.midtermExam = midtermExam;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentInfoRequest{" +
                "absentee='" + absentee + '\'' +
                ", educationTermId='" + educationTermId + '\'' +
                ", finalExam='" + finalExam + '\'' +
                ", infoNote='" + infoNote + '\'' +
                ", lessonId='" + lessonId + '\'' +
                ", midtermExam='" + midtermExam + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}

