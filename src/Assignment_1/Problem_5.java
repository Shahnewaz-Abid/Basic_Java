package Assignment_1;

import java.util.*;

//Write a program to calculate CGPA and find grade

public class Problem_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many courses do you have: ");
        int no_of_courses = input.nextInt();
        double course_credit;
        double marks;
        double grade_point;
        System.out.println("enter your marks, grade point & credit hour: ");
        double total_credit= 0;
        double total_grade_multi_credit = 0;
        double cgpa;
        for(int i = 0; i<no_of_courses; i++) {
            marks = input.nextInt();
            grade_point = input.nextDouble();
            course_credit = input.nextDouble();
            total_credit += course_credit;
            total_grade_multi_credit += (grade_point * course_credit);
            if(marks>=80){
                System.out.println("Marks "+marks+" Grade point "+grade_point+" Credit hour "+course_credit+" Grade earned A+");
            }
            else if((marks>=75) && (marks<80)) {
                System.out.println("Marks "+marks+" Grade point "+grade_point+" Credit hour "+course_credit+" Grade earned A");
            }
            else if((marks>=70) && (marks<75)) {
                System.out.println("Marks "+marks+" Grade point "+grade_point+" Credit hour "+course_credit+" Grade earned A-");
            }
            else if((marks>=65) && (marks<70)) {
                System.out.println("Marks "+marks+" Grade point "+grade_point+" Credit hour "+course_credit+" Grade earned B+");
            }
            else if((marks>=60) && (marks<65)) {
                System.out.println("Marks "+marks+" Grade point "+grade_point+" Credit hour "+course_credit+" Grade earned B");
            }
            else if((marks>=55) && (marks<60)) {
                System.out.println("Marks "+marks+" Grade point "+grade_point+" Credit hour "+course_credit+" Grade earned B-");
            }
            else if((marks>=50) && (marks<55)) {
                System.out.println("Marks "+marks+" Grade point "+grade_point+" Credit hour "+course_credit+" Grade earned C+");
            }
            else if((marks>=45) && (marks<50)) {
                System.out.println("Marks "+marks+" Grade point "+grade_point+" Credit hour "+course_credit+" Grade earned C");
            }
            else if((marks>=40) && (marks<45)) {
                System.out.println("Marks "+marks+" Grade point "+grade_point+" Credit hour "+course_credit+" Grade earned D");
            }
            else {
                System.out.println("Marks "+marks+" Grade point "+grade_point+" Credit hour "+course_credit+" Grade earned F");
            }
        }

        cgpa = (total_grade_multi_credit/total_credit);
        System.out.println("Total CGPA: "+cgpa);
    }
}