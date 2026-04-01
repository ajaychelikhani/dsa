package dsa.basics;
//Lecture - 5
/*
1)Varible - Named Storage Location

2)Rules for variable naming
    1.Case Sensitivity[age vs AGE]
    2.Starting Character[a,A,_,$]
    3.Subsequent Characters[0 to 9,_,$]
    4.No Reserved Keywords[class,static etc]
    5.Length[no limit,but meaningful names needed]
    6.Conventions:camelCase,UpperCase for Constants etc
*/
public class Variables {
    static void main() {
        //create //declare
        int age;
        //System.out.println(age);
        //assign value
        age = 10;
        age = 11;
        System.out.println(age);

        //define or initialize
        int totalMarks = 20;
        System.out.println(totalMarks);

        //Case Sensitive
        int weight = 80;
        int WEIGHT = 90;
        System.out.println("weight:"+weight);
        System.out.println("WEIGHT:"+WEIGHT);

        //Starting Letter
        int marks = 10;
        int MARKS = 11;
        int _marks = 12;
        int $marks = 13;

        //Subsequent Letters
        int height5 = 21;
        int height_love = 33;
        int height$12Love = 44;
        int height_ = 22;
        int height$ = 23;

        //No Reserved Keywords
        //int class = 23;

        int main = 5; //main is not a reserved keyword in Java.

        //length
        int hellotherehowareyou = 10;
        int a = 1;
        int b = 2;
        int c = 3;

        //CamelCase
        int myNameIsAjay = 21;
        //int totalMarks = 100;

        //constants
        int DAYS_IN_YEAR = 365;
    }
}
