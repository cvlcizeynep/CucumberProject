package pojos;

public class StudentMeetPojo {
    public int id;
    public String username;
    public String ssn;
    public String name;
    public String surname;
    public String birthDay;
    public String birthPlace;
    public String phoneNumber;
    public String gender;
    public String motherName;
    public String fatherName;
    public int studentNumber;
    public String email;
    public boolean active;

    public StudentMeetPojo() {
    }

    public StudentMeetPojo(int id, String username, String ssn, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String motherName, String fatherName, int studentNumber, String email, boolean active) {
        this.id = id;
        this.username = username;
        this.ssn = ssn;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.studentNumber = studentNumber;
        this.email = email;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "StudentMeetPojo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", studentNumber=" + studentNumber +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }
}
