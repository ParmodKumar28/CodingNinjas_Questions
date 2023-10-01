// Total Salary
// Send Feedback
// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//     totalSalary = basic + hra + da + allow – pf
// where :
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basicSalary = s.nextInt();
        if (basicSalary == 0) {
            System.out.println(0);
        }
        char Grade = s.next().charAt(0);
        double hra = 0.20 * basicSalary;
        double da = 0.50 * basicSalary;
        double allow = 0;
        if (Grade == 'A') {
            allow = 1700;
        } else if (Grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }
        double pf = 0.11 * basicSalary;
        double totalSalary = (basicSalary + hra + allow + da) - pf;
        System.out.println((int) Math.round(totalSalary));
        s.close();
    }
}
