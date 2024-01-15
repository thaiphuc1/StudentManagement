/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Model.Student;
import View.Menu;
import Controller.StudentManagement;
import java.util.Scanner;
/**
 *
 * @author thaip
 */
public class Input {
    StudentManagement std = new StudentManagement();
    Scanner sc = new Scanner(System.in);
    public void doAdd(){
        String id = Menu.getString("Enter Student ID : ");
        String name = Menu.getString("Enter Student Name : ");
        String course =Menu.getString("Enter Course : ");
        int semester = Integer.parseInt(Menu.getString("Enter Semester : "));
        Student b = new Student(id, name, course, semester);
        std.addStudent(b);
        if(std.size() >= 10){
            System.out.println("Do You Want To Continue : (Y/N) ? ");
            String ch = sc.next().toLowerCase();
            if(ch.equals("y")){
                doAdd();
            }
        }

    }
    public void doFind(){
        String name = Menu.getString("Enter Student Name : ");
        std.findStudent(name);
    }
    public void doUpDe(){
        String id = Menu.getString("Enter Student ID : ");
        std.updateDelete(id);
    }
    public void display(){
        std.display();
    }
}
