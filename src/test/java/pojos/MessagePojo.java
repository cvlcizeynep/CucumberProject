package pojos;

public class MessagePojo {

    private MessageObjectPojo object;
    private String message;
    private String httpStatus;

    public MessagePojo() {
    }

    public MessageObjectPojo getObject() {
        return object;
    }

    public void setObject(MessageObjectPojo object) {
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

    public MessagePojo(MessageObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "MessagePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}