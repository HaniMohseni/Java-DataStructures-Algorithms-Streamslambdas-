package com.sg.lambdasAndStreams;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PrintMessage printMessage=new PrintMessageImpl();
        printMessage.print();

        //second way without creating a class and Interface
        PrintMessage printMessage1 = new PrintMessage() {
            @Override
            public void print() {
                System.out.println("Functional interface and Lambdas");
            }
        };
        printMessage1.print();

        //third way lambdas
        PrintMessage printMessage2 = ()->{
            System.out.println("Functional interface and Lambdas");
        };
        printMessage2.print();

        Calculator calculator = (int x, int y)->{
            Random random = new Random();
           int randomNumber = random.nextInt(50);
           return x+y+randomNumber;
        };


    }

    }


