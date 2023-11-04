package com.example.backendengineerdata;

import java.util.Scanner;

class Example {
    public static void findAbs() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();

        System.out.println(num < 0 ? -num : num);
    }

    public static void main(String args[]) {
        findAbs();
    }


}

