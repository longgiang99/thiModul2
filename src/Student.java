//package model;

public class Student {
    private String codeStudent;
    private String name;
    private byte age;
    private String sex;
    private String adrress;
    private double mediumScore;

    public Student(String codeStudent, String name, byte age, String sex, String adrress, double mediumScore) {
        this.codeStudent = codeStudent;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.adrress = adrress;
        this.mediumScore = mediumScore;
    }

    public Student() {
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "Student{" +
               "codeStudent='" + codeStudent + '\'' +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", sex='" + sex + '\'' +
               ", adrress='" + adrress + '\'' +
               ", mediumScore=" + mediumScore +
               '}';
    }
}
