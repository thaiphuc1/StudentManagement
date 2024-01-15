/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thaip
 */
public class Student implements Comparable<Student>{
    private String id, stdName, courseName;
    private int semester;

    public Student() {
    }

    public Student(String id, String stdName, String courseName, int semester) {
        this.id = id;
        this.stdName = stdName;
        this.courseName = courseName;
        this.semester = semester;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    public String getTen(){
        String s = this.getStdName().trim();
        if(s.indexOf(" ") >= 0){
            int vt = s.lastIndexOf(" ");
            return s.substring(vt + 1);
        }
        else {
            return s;
        }
    }
    
    @Override
    public int compareTo(Student o) {
        return this.getTen().compareTo(o.getTen());
    }

    @Override
    public String toString() {
        return String.format("%-5s | %-10s | %-10s | %-5s", id, stdName, courseName, semester);
    }
    
}
