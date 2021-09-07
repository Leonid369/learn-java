package com.sara;

class Subject{
    private String subId;
    private String name;
    private double maxMarks;
    private double marksObtained;

    public Subject(String subId, String name) {
        this.subId = subId;
        this.name = name;
    }

    public Subject(String subId, String name, double maxMarks) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public double getMaxMarks() {
        return maxMarks;
    }

    public double getMarksObtained() {
        return marksObtained;
    }

    public void setMaxMarks(double maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtained(double marksObtained) {
        this.marksObtained = marksObtained;
    }

    boolean isQualified(){
        return marksObtained >= (maxMarks/10*4);
    }

    public String toString(){
        return "\nSubject ID: " + subId + "\nName: " + name + "\nMarks Obtained " + marksObtained;
    }


}

class Studenti{
    private String rollNo;
    private String name;
    private String dept;
    private Subject[] subjects;

    public Studenti(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Studenti(String rollNo, String name, String dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
    }


    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Subject[] getSubjects() {
        return subjects;
    }


    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSubjects(Subject... subjects) {
        this.subjects = subjects;
    }
}

public class StudentComplete {
    public static void main(String[] args){
        Subject s[] = new Subject[3];
        s[0] = new Subject("S101", "DS",100);
        s[0].setMarksObtained(89);
        s[1] = new Subject("S102", "Algo",100);
        s[2] = new Subject("S103", "Java",100);



        Studenti st = new Studenti("34E21","Joe");
        st.setDept("Computer Science");
        st.setSubjects(s);
        System.out.println(s[0].toString());


    }
}
