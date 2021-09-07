package com.sara;

class Student1{
    public String rollNo;
    public String name;
    public double m1, m2, m3;
    public String course;

    public double total(){
        return m1+m2+m3;
    }

    public double average(){
        return total()/3;
    }

    public String grade(){
        if(average() > 90)
            return "A";
        else if(average()>85 && average()<=90)
            return "A-";
        else if(average()>80 && average()<=85)
            return "B+";
        else if(average()>75 && average()<=80)
            return "B";
        else if(average()>70 && average()<=75)
            return "B-";
        else if(average()>=65 && average()<=70)
            return "C";
        else
            return "F";
    }

    public String details(){
        return "Roll No: " + rollNo + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n";
    }
}

public class Student {
    public static void main(String[] args){
        Student1 s = new Student1();
        s.m1 = 70;
        s.m2 = 80;
        s.m3 = 65;
        s.name = "Joe";
        s.course = "Computer Science";
        s.rollNo = "12E631";
        System.out.println("Details of the student:\n" + s.details());
        System.out.println("Total marks of the student: " + s.total());
        System.out.println("Average marks of the student: " + s.average());
        System.out.println("Grade of the student: " + s.grade());
    }

}
