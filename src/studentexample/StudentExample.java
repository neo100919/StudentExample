package studentexample;

import java.util.Scanner;

/**
 * This class another project for review
 * 
 * @author Paul Bonenfant
 */
public class StudentExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Student[] students = new Student[5];
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter a name");
            String name = input.nextLine();
            students[i] = new Student(name);            
        }
        
        students[2].setAge(18);
        
        for (Student student: students) {
            System.out.printf("Student %s is %d years old\n", 
                    student.getName(), student.getAge());
        }
        
    }
}
