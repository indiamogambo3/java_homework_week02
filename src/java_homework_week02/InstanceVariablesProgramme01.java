package java_homework_week02;

/**
 * 1. Write a Java programme using the following steps.
 * Declare two instance variables
 * Declare one instance method
 * Call both instance variables into the instance method inside the print statement.
 * Declare the Main method.
 * Call the above instance method into the Main method and Run the programme.
 */

public class InstanceVariablesProgramme01 {

    int a = 25;
    int b = 30;

    public static void main(String[] args) {

        InstanceVariablesProgramme01 m1 = new InstanceVariablesProgramme01();
        System.out.println(m1.a);
        System.out.println(m1.b);

    }

    public void m1() {

        InstanceVariablesProgramme01 c = new InstanceVariablesProgramme01();
        System.out.println(c.a);
        System.out.println(c.b);


    }


}
