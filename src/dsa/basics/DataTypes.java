package dsa.basics;
/*
1.Data type
Data type is an entity which defines what kind data will the variable
store or work with.
Range = -2^(n-1) to 2^(n-1)-1,n = number of bits

2.Datatype implicit or explicit conversion:(Type casting)
*/
public class DataTypes {
    static void main() {
        //1. Data Types
        //Numeric DT - byte,short,int,long
        byte num1 = 100; //Size(1byte(8 bits)),Range(-128 to 127 or -2^7 to 2^7 - 1)
        System.out.println(num1);

        short num2 = 500; //Size(2bytes(16bits)),Range(-32,768 to 32,767 or -2^15 to 2^15 - 1)
        System.out.println(num2);

        int num3 = 50000; // Size(4 bytes = 32 bits), Range(-2,147,483,648 to 2,147,483,647 or -2^31 to 2^31 - 1)
        System.out.println(num3);

        long num4 = 329421370L; // Size(8 bytes = 64 bits), Range(-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 or -2^63 to 2^63 - 1)
        System.out.println(num4);

        //floating DTs
        float num5 = 3.142436f; //~6-7 decimal digits precision
        System.out.println(num5);

        double num6 = 3.142435464777779; //~15 decimal digits precision
        System.out.println(num6);

        //Other data types - Char, Boolean
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'a';
        System.out.println("My First Character is: " + (char)(firstCharacter+2));


        //2. Type Casting
        long newNum1 = num1;
        System.out.println("new Num" + newNum1); //Implicit conversion

        long value1 = 12345678;
        int value2 = (int)value1;
        System.out.println(value2);




    }
}
