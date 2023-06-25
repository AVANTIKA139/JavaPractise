
//package com.company
//packages are used to group the related classes
//the "Package" keyword is used to create packages in Java
//Here,com.company is the name of our package



public class Main {

//for classes like Main given above we use PascalConvention
//    In Java every program must contain class.
//    The filename and name of the class should be the same
//    here we have  a created a class named "Main"
//    It is the entry point to the location
    public static void main(String[] args) {
//        this is the main() method of our Java program
//        Every java program must contain the main()method
//        write your code here
//        for functions like main given above we use camelCaseConvention
        System.out.println("The sum of these numbers"  );
//        the above coe is  used to display the output on the screen
//        anything passed inside the inverted commas is printed on the screen as plain text
int num1 = 5;
int num2 = 4;
int num3 = 9;
int sum = num1+num2+num3;
System.out.println(sum);
    }
}
//add two number
//AddTwoNumber --> Pascal naming convention
//addTwoNumber --> camel Case naming convention

//Anatomy of a Java program
//Documentation Section----> Suggested
//Package Statement----> Optional
//Import Statement---->Optionals
//Interface Statement--->Optional
//Class Definitions ---->Optional
//Main Method Class
//{
//Main Method definitions----->Essential
//}