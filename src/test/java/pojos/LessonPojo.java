package pojos;

import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class LessonPojo {

    private LessonObjectPojo object;
    private String message;
    private String httpStatus;


    public LessonPojo() {
    }

    public LessonPojo(LessonObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public LessonObjectPojo getObject() {
        return object;
    }

    public void setObject(LessonObjectPojo object) {
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
        return "LessonPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}

