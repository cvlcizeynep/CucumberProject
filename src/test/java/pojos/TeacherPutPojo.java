package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeacherPutPojo {

    private ObjectPojo object;
    private String message;
    private String httpStatus;
    private long lessonsIdList;
    private boolean isAdvisorTeacher;


    public TeacherPutPojo() {
    }

    public TeacherPutPojo(ObjectPojo object, String message, String httpStatus, long lessonsIdList, boolean isAdvisorTeacher) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
        this.lessonsIdList = lessonsIdList;
        this.isAdvisorTeacher = isAdvisorTeacher;
    }

    public long getLessonsIdList() {
        return lessonsIdList;
    }

    public void setLessonsIdList(long lessonsIdList) {
        this.lessonsIdList = lessonsIdList;
    }

    public ObjectPojo getObject() {
        return object;
    }

    public void setObject(ObjectPojo object) {
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



    public boolean isAdvisorTeacher() {
        return isAdvisorTeacher;
    }

    public void setAdvisorTeacher(boolean advisorTeacher) {
        isAdvisorTeacher = advisorTeacher;
    }
}