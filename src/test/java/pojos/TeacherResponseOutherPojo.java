package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeacherResponseOutherPojo {
    private TeacherResponseObjectPojo object;
    private String message;
    private String httpStatus;

    public TeacherResponseOutherPojo() {
    }

    public TeacherResponseOutherPojo(TeacherResponseObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public TeacherResponseObjectPojo getObject() {
        return object;
    }

    public void setObject(TeacherResponseObjectPojo object) {
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
        return "ResponseTeacherOutherPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}