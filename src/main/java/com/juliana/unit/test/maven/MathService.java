package com.juliana.unit.test.maven;

public class MathService {
    public static void main(String[] args) {
        MathService obj = new MathService();

        System.out.println(obj.factorial(-3));
    }

    public int doubleNum(int num){
        return num + num;
    }

    public int factorial(int num) throws IllegalArgumentException{
        if(num < 0){
            throw new IllegalArgumentException("Cannot be below 0"); //handles n < 0
        }
        else if(num ==0){
            return 1;
        }
        return num * factorial(num -1);
    }






}
