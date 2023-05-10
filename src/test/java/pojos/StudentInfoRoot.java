package pojos;

public class StudentInfoRoot {

        private StudentInfoObject object;
        private String message;
        private String httpStatus;

    public StudentInfoRoot() {
    }

    public StudentInfoRoot(StudentInfoObject object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public StudentInfoObject getObject() {
        return object;
    }

    public void setObject(StudentInfoObject object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "StudentInfoRoot{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}



