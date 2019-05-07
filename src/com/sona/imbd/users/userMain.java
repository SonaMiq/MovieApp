package com.sona.imbd.users;

import java.util.Scanner;

public class userMain {
    public static void main(String[] args) {
        User user = new User();
        System.out.println("Insert username");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Insert password");
        scanner = new Scanner(System.in);
        String password = scanner.next();
        user.userRegister(username, password);
        System.out.println("Insert Login");
        scanner = new Scanner(System.in);
        String login = scanner.next();
        System.out.println("Insert Password");
        scanner = new Scanner(System.in);
        password = scanner.next();
        if (user.userLogin(login, password))
            System.out.println("Login");
        else
            System.out.println("Incorect Login or password");
    }
}
