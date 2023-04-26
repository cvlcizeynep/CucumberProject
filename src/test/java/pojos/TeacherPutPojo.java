package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeacherPutPojo {

    private String birthDay;
    private String birthPlace;
    private String email;
    private String gender;
    private Boolean isAdvisorTeacher;
    private List<Integer> lessonsIdList;
    private String name;
    private String password;
    private String phoneNumber;
    private String ssn;
    private String surname;
    private String username;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public TeacherPutPojo() {
    }


    public TeacherPutPojo(String birthDay, String birthPlace, String email, String gender, Boolean isAdvisorTeacher, List<Integer> lessonsIdList, String name, String password, String phoneNumber, String ssn, String surname, String username) {
        super();
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.email = email;
        this.gender = gender;
        this.isAdvisorTeacher = isAdvisorTeacher;
        this.lessonsIdList = lessonsIdList;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.surname = surname;
        this.username = username;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getIsAdvisorTeacher() {
        return isAdvisorTeacher;
    }

    public void setIsAdvisorTeacher(Boolean isAdvisorTeacher) {
        this.isAdvisorTeacher = isAdvisorTeacher;
    }

    public List<Integer> getLessonsIdList() {
        return lessonsIdList;
    }

    public void setLessonsIdList(List<Integer> lessonsIdList) {
        this.lessonsIdList = lessonsIdList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}