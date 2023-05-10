package pojos;

import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MeetRootPojo {
    public MeetObjectPojo meetObjectPojo;
    public String message;
    public String httpStatus;

    public MeetRootPojo() {
    }

    public MeetObjectPojo getMeetObjectPojo() {
        return meetObjectPojo;
    }

    public void setMeetObjectPojo(MeetObjectPojo meetObjectPojo) {
        this.meetObjectPojo = meetObjectPojo;
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

    public MeetRootPojo(MeetObjectPojo meetObjectPojo, String message, String httpStatus) {
        this.meetObjectPojo = meetObjectPojo;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "MeetRootPojo{" +
                "meetObjectPojo=" + meetObjectPojo +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
