package pojos;

public class TeacherObjectPojo {

    private String birthDay;
    private String birthPlace;
    private String email;
    private String gender;
    private boolean isAdvisorTeacher;
    private long lessonsIdList;
    private String name;
    private String password;
    private String phoneNumber;
    private String ssn;
    private String surname;
    private String username;

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

    public boolean isAdvisorTeacher() {
        return isAdvisorTeacher;
    }

    public void setAdvisorTeacher(boolean advisorTeacher) {
        isAdvisorTeacher = advisorTeacher;
    }

    public long getLessonsIdList() {
        return lessonsIdList;
    }

    public void setLessonsIdList(long lessonsIdList) {
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

    public TeacherObjectPojo() {
    }

    public TeacherObjectPojo(String birthDay, String birthPlace, String email, String gender, boolean isAdvisorTeacher, long lessonsIdList, String name, String password, String phoneNumber, String ssn, String surname, String username) {
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

    @Override
    public String toString() {
        return "TeacherObjectPojo{" +
                "birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", isAdvisorTeacher=" + isAdvisorTeacher +
                ", lessonsIdList=" + lessonsIdList +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}