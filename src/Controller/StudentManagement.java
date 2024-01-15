/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author thaip
 */
public class StudentManagement extends ArrayList<Student>{
    private Student std;
    Scanner sc = new Scanner(System.in);
    public void addStudent(Student a){
        this.add(a);
    }
    public int countCourse(Student a){
        int count = 0;
        for (Student thi : this) {
            if(thi.getStdName().equals(a.getStdName()) && thi.getCourseName().equals(a.getCourseName()))
            count ++;
                }
        
        return count;
    }
    public void findStudent(String name){
        Collections.sort(this);
        for (Student k : this) {
            if(k.getStdName().contains(name)){
                System.out.println(k.getStdName() + " | " + k.getSemester() + " | " + k.getCourseName());
            }
        }
    }
    
    public void display(){
        Collections.sort(this);
        for (Student a : this) {
            System.out.println(a.getStdName() + " | " + a.getCourseName() + " | " + countCourse(a));
            if(this.contains(a)){
                continue;
            }
        }
    }
    public void updateDelete(String id){
        for (Student k : this) {
            if(k.getId().equalsIgnoreCase(id)){
                System.out.println(k.toString());
                System.out.println("Do You Want Update or Delete : (U/D) ? ");
                String ch = sc.next().toLowerCase();
                switch (ch) {
                    case "u":
                        sc = new Scanner(System.in);

        System.out.println("Update Student ID: ");
        String ids = sc.nextLine();
        if (ids != null) {
            k.setId(ids);
        }

        System.out.println("Update Student Name: ");
        String namest = sc.nextLine();
        if (namest != null) {
            k.setStdName(namest);
        }
        System.out.println("Do you want to update Student semester : (Y/N)");
        String choice = sc.next().toLowerCase();
        if(choice.equals('y')){
        System.out.println("Update Student Semester: ");
        
        int se = sc.nextInt();
         if (se != k.getSemester()) {
             k.setSemester(se);
        }
        
        }
        sc = new Scanner(System.in);
        System.out.println("Update Student Course Name: ");
        String course = sc.nextLine();
        if (course != null) {
            k.setCourseName(course);
        }
        break;
        case "d":
                        this.remove(k);
                    
                }
            }
        }
    }
}
