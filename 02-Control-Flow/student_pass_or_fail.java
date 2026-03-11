import java.util.*;
public class student_pass_or_fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of Student");
        int marks =sc.nextInt();
        String pass_fail=(marks>=33)? "Pass": "Fail";
        System.out.println("Student is : "+pass_fail);

    }
}
