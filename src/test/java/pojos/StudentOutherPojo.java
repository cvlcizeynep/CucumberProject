package pojos;

public class StudentOutherPojo {
    private StudentObjectPojo object;
    private String message;

    public StudentOutherPojo() {
    }

    public StudentOutherPojo(StudentObjectPojo object, String message) {
        this.object = object;
        this.message = message;
    }

    public StudentObjectPojo getObject() {
        return object;
    }

    public void setObject(StudentObjectPojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "StudentOutherPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                '}';
    }
}
