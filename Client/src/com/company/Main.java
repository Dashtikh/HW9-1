package com.company;

import Remote.SiteInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        SiteInterface siteInterface = (SiteInterface) Naming.lookup("//192.168.1.104/site");


        int menu;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("for create user insert 1 /n for update user insert 2");
            menu = scanner.nextInt();
            if (menu == 1) {
                String user, password;
                Scanner uscanner = new Scanner(System.in);
                Scanner pscanner = new Scanner(System.in);
                System.out.println("enter you user name !");
                user = uscanner.nextLine();
                System.out.println("enter your pass ! ");
                password = pscanner.nextLine();
                try {
                    System.out.println(siteInterface.save(user, password));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (menu == 2) {
                String uuser, upassword;
                Scanner uuscanner = new Scanner(System.in);
                Scanner upscanner = new Scanner(System.in);
                System.out.println("enter your new user !");
                uuser = uuscanner.nextLine();
                System.out.println("enter your new password !");
                upassword = upscanner.nextLine();
                try {
                    System.out.println(siteInterface.update(uuser, upassword));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
