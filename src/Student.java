import java.util.Objects;

/*
* Classname : Student
*
* Created on 14 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*
* Module 2 "Programming patterns. Factory, Builder." task
*
*/
public class Student {

    private String firstName;
    private String lastName;
    private String patronimic;
    private String email;
    private int phoneNumber;
    private String dateOfBirth;
    private boolean nonresident; //иногородний
    private boolean livesInDormitory;
    private String universityName;
    private String facultyName;
    private String department;
    private String speciality;
    private String groupName;
    private boolean budget; // бюджет или контракт
    private String studyForm; // очная, заочная, вечерняя
    private boolean scholarship; // стипендия
    private int amountOfArticles;
    private int amountOfTheses;
    private boolean headman; // староста
    private double averageScoreOfZNO; //средний балл ЗНО
    private double semesterGradePointAverage;
    private String graduateSupervisor;//дипломный руковод.
    private String gender;

    /*
    * Constructor with all parameters
    * */
    public Student(String firstName, String lastName, String patronimic,
                   String email, int phoneNumber, String dateOfBirth,
                   boolean nonresident, boolean livesInDormitory,
                   String universityName, String facultyName,
                   String department, String speciality, String groupName,
                   boolean budget, String studyForm, boolean scholarship,
                   int amountOfArticles, int amountOfTheses, boolean headman,
                   double averageScoreOfZNO, double semesterGradePointAverage,
                   String graduateSupervisor) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.patronimic = patronimic;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.nonresident = nonresident;
        this.livesInDormitory = livesInDormitory;
        this.universityName = universityName;
        this.facultyName = facultyName;
        this.department = department;
        this.speciality = speciality;
        this.groupName = groupName;
        this.budget = budget;
        this.studyForm = studyForm;
        this.scholarship = scholarship;
        this.amountOfArticles = amountOfArticles;
        this.amountOfTheses = amountOfTheses;
        this.headman = headman;
        this.averageScoreOfZNO = averageScoreOfZNO;
        this.semesterGradePointAverage = semesterGradePointAverage;
        this.graduateSupervisor = graduateSupervisor;
    }

    /*
     * Constructor without parameters
     * */
    public Student() {
    }

    /*
     * Getters for all class fields
     * */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isNonresident() {
        return nonresident;
    }

    public boolean isLivesInDormitory() {
        return livesInDormitory;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGroupName() {
        return groupName;
    }

    public boolean isBudget() {
        return budget;
    }

    public String getStudyForm() {
        return studyForm;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public int getAmountOfArticles() {
        return amountOfArticles;
    }

    public int getAmountOfTheses() {
        return amountOfTheses;
    }

    public boolean isHeadman() {
        return headman;
    }

    public double getAverageScoreOfZNO() {
        return averageScoreOfZNO;
    }

    public double getSemesterGradePointAverage() {
        return semesterGradePointAverage;
    }

    public String getGraduateSupervisor() {
        return graduateSupervisor;
    }

    public String getGender() {
        return gender;
    }

    /*
         *Setters for all class fields
         * */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNonresident(boolean nonresident) {
        this.nonresident = nonresident;
    }

    public void setLivesInDormitory(boolean livesInDormitory) {
        this.livesInDormitory = livesInDormitory;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setBudget(boolean budget) {
        this.budget = budget;
    }

    public void setStudyForm(String studyForm) {
        this.studyForm = studyForm;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public void setAmountOfArticles(int amountOfArticles) {
        this.amountOfArticles = amountOfArticles;
    }

    public void setAmountOfTheses(int amountOfTheses) {
        this.amountOfTheses = amountOfTheses;
    }

    public void setHeadman(boolean headman) {
        this.headman = headman;
    }

    public void setAverageScoreOfZNO(double averageScoreOfZNO) {
        this.averageScoreOfZNO = averageScoreOfZNO;
    }

    public void setSemesterGradePointAverage(double semesterGradePointAverage){
        this.semesterGradePointAverage = semesterGradePointAverage;
    }

    public void setGraduateSupervisor(String graduateSupervisor) {
        this.graduateSupervisor = graduateSupervisor;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /*
         * Override toString() method
         * */

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronimic='" + patronimic + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", nonresident=" + nonresident +
                ", livesInDormitory=" + livesInDormitory +
                ", universityName='" + universityName + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", department='" + department + '\'' +
                ", speciality='" + speciality + '\'' +
                ", groupName='" + groupName + '\'' +
                ", budget=" + budget +
                ", studyForm='" + studyForm + '\'' +
                ", scholarship=" + scholarship +
                ", amountOfArticles=" + amountOfArticles +
                ", amountOfTheses=" + amountOfTheses +
                ", headman=" + headman +
                ", averageScoreOfZNO=" + averageScoreOfZNO +
                ", semesterGradePointAverage=" + semesterGradePointAverage +
                ", graduateSupervisor='" + graduateSupervisor + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    /*
     * Override equals() method.
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getPhoneNumber() != student.getPhoneNumber()) return false;
        if (isNonresident() != student.isNonresident()) return false;
        if (isLivesInDormitory() != student.isLivesInDormitory()) return false;
        if (isBudget() != student.isBudget()) return false;
        if (isScholarship() != student.isScholarship()) return false;
        if (getAmountOfArticles() != student.getAmountOfArticles())
            return false;
        if (getAmountOfTheses() != student.getAmountOfTheses()) return false;
        if (isHeadman() != student.isHeadman()) return false;
        if (Double.compare(student.getAverageScoreOfZNO(),
                getAverageScoreOfZNO()) != 0) return false;
        if (Double.compare(student.getSemesterGradePointAverage(),
                getSemesterGradePointAverage()) != 0) return false;
        if (getFirstName() != null ?
                !getFirstName().equals(student.getFirstName())
                : student.getFirstName() != null)
            return false;
        if (getLastName() != null ?
                !getLastName().equals(student.getLastName())
                : student.getLastName() != null)
            return false;
        if (getPatronimic() != null ?
                !getPatronimic().equals(student.getPatronimic())
                : student.getPatronimic() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(student.getEmail())
                : student.getEmail() != null) return false;
        if (getDateOfBirth() != null ?
                !getDateOfBirth().equals(student.getDateOfBirth())
                : student.getDateOfBirth() != null)
            return false;
        if (getUniversityName() != null ?
                !getUniversityName().equals(student.getUniversityName())
                : student.getUniversityName() != null)
            return false;
        if (getFacultyName() != null ?
                !getFacultyName().equals(student.getFacultyName())
                : student.getFacultyName() != null)
            return false;
        if (getDepartment() != null ?
                !getDepartment().equals(student.getDepartment())
                : student.getDepartment() != null)
            return false;
        if (getSpeciality() != null ?
                !getSpeciality().equals(student.getSpeciality())
                : student.getSpeciality() != null)
            return false;
        if (getGroupName() != null ?
                !getGroupName().equals(student.getGroupName())
                : student.getGroupName() != null)
            return false;
        if (getStudyForm() != null ?
                !getStudyForm().equals(student.getStudyForm())
                : student.getStudyForm() != null)
            return false;
        if (getGraduateSupervisor() != null ?
                !getGraduateSupervisor().equals(student.getGraduateSupervisor())
                : student.getGraduateSupervisor() != null)
            return false;
        return getGender() != null ? getGender().equals(student.getGender())
                : student.getGender() == null;
    }

    /*
     * Override hash() method.
     * */

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ?
                getLastName().hashCode() : 0);
        result = 31 * result + (getPatronimic() != null ?
                getPatronimic().hashCode() : 0);
        result = 31 * result + (getEmail() != null ?
                getEmail().hashCode() : 0);
        result = 31 * result + getPhoneNumber();
        result = 31 * result + (getDateOfBirth() != null ?
                getDateOfBirth().hashCode() : 0);
        result = 31 * result + (isNonresident() ? 1 : 0);
        result = 31 * result + (isLivesInDormitory() ? 1 : 0);
        result = 31 * result + (getUniversityName() != null ?
                getUniversityName().hashCode() : 0);
        result = 31 * result + (getFacultyName() != null ?
                getFacultyName().hashCode() : 0);
        result = 31 * result + (getDepartment() != null ?
                getDepartment().hashCode() : 0);
        result = 31 * result + (getSpeciality() != null ?
                getSpeciality().hashCode() : 0);
        result = 31 * result + (getGroupName() != null ?
                getGroupName().hashCode() : 0);
        result = 31 * result + (isBudget() ? 1 : 0);
        result = 31 * result + (getStudyForm() != null ?
                getStudyForm().hashCode() : 0);
        result = 31 * result + (isScholarship() ? 1 : 0);
        result = 31 * result + getAmountOfArticles();
        result = 31 * result + getAmountOfTheses();
        result = 31 * result + (isHeadman() ? 1 : 0);
        temp = Double.doubleToLongBits(getAverageScoreOfZNO());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSemesterGradePointAverage());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getGraduateSupervisor() != null ?
                getGraduateSupervisor().hashCode() : 0);
        result = 31 * result + (getGender() != null ?
                getGender().hashCode() : 0);
        return result;
    }

    public static class Builder {
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        public Builder setSimilarTo(Student student) {
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.dateOfBirth = student.dateOfBirth;
            this.studentToBuild.phoneNumber = student.phoneNumber;
            this.studentToBuild.email = student.email;
            this.studentToBuild.patronimic = student.patronimic;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.amountOfArticles = student.amountOfArticles;
            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.averageScoreOfZNO = student.averageScoreOfZNO;
            this.studentToBuild.amountOfTheses = student.amountOfTheses;
            this.studentToBuild.budget = student.budget;
            this.studentToBuild.department = student.department;
            this.studentToBuild.facultyName = student.facultyName;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.graduateSupervisor = student.graduateSupervisor;
            this.studentToBuild.groupName = student.groupName;
            this.studentToBuild.headman = student.headman;
            this.studentToBuild.livesInDormitory = student.livesInDormitory;
            this.studentToBuild.nonresident = student.nonresident;
            this.studentToBuild.scholarship = student.scholarship;
            this.studentToBuild.semesterGradePointAverage =
                    student.semesterGradePointAverage;
            this.studentToBuild.studyForm = student.studyForm;
            this.studentToBuild.universityName = student.universityName;

            return this;
        }

        public Builder setSpeciality(String speciality){
            studentToBuild.setSpeciality(speciality);
            return this;
        }
    }
}
