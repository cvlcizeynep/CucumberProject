package pojos;

public class AdminOutherPojo {
    public AdminObjectPojo object;
    public String message;
    public String httpStatus;

    public AdminOutherPojo() {
    }

    public void AAdminOutherPojo(AdminObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public AdminObjectPojo getObject() {
        return object;
    }

    public void setObject(AdminObjectPojo object) {
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
        return "AAdminOutherPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}

