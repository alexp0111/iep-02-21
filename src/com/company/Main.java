package com.company;
//Petrovskiy A. A.
//06.10.21

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User user = new User();
        System.out.println("Enter your name, age and group:");
            user.setName(in.next());
            user.setAge(in.next());
            user.setGroup(in.next());
        System.out.println("User " + user.getName() + " has created");
        //smth
    }
}
