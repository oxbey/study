package com.company;
import com.company.studyClassNull.Puzzle4b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
        Puzzle4b[] obs = new Puzzle4b[6];
//    Puzzle4b obs1 = new Puzzle4b();
//    obs1.input1 = input;
        int y = 1;
        int x = 0;
        int result = 0;
        while ( x < 6 ){
            obs[x] = new Puzzle4b();
            obs[x].ivar = y;
//        System.out.println("ivar = " + obs[x].ivar);
            y = y * 10;
//        System.out.println("method = " + obs[x].doStuff(x));
            x = x + 1;


//        System.out.println("y = " + y);
        }
        x = 6;
        while (x > 0){
            x = x - 1;
            result = result + obs[x].doStuff(x);
//        System.out.println("Result = " + result);
        }
        System.out.println("Результат "+ result);
    }
}





