/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import java.util.Scanner;
import service.menu.inter.MenuAddTeacherServiceInter;

/**
 *
 * @author MustafabeyliMM
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter{
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc.nextLine();
        
        Teacher s = new Teacher();
        s.setName(name);
        s.setSurname(surname);
        
        Config.instance().appendTeacher(s);
        
        System.out.println("teacher added");
    }
}
