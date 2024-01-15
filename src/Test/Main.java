/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import View.Menu;

import Library.Input;
/**
 *
 * @author thaip
 */
public class Main extends Menu<String>{
    private static String[] mc={"Add new student","Find and Sort","Update/Delete","Report","Exit"};
    private Input lib = new Input();
    
    public Main() {
        super("Student Management System",mc);
        
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
    
    @Override
    public void execute(int ch) {
        switch(ch) {
            case 1: lib.doAdd(); break;
            case 2: lib.doFind(); break;
            case 3: lib.doUpDe(); break;
            case 4: lib.display();break;
            case 5: System.exit(0);
        }
    }
    
    
}
