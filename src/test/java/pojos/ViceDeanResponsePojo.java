package pojos;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ViceDeanResponsePojo {
    private ViceDeanResInnerPojo object;
    private String message;
    private String httpStatus;

    public ViceDeanResponsePojo() {
    }

    public ViceDeanResponsePojo(ViceDeanResInnerPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public ViceDeanResInnerPojo getObject() {
        return object;
    }

    public void setObject(ViceDeanResInnerPojo object) {
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
        return "ViceDeanResponsePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
