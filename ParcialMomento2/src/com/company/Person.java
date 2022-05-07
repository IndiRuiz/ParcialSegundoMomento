package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addProfile(String profile){
        this.profiles.add(profile);
    }

    private ArrayList<String> profiles = new ArrayList<>();
    private String name;
    private  String identification;
    private int age;

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String stopExecution = "NO";
        ArrayList<Watchman> watchman = new ArrayList();
        ArrayList<CleaningStaff> cleaningStaff = new ArrayList();
        ArrayList<Accountant> accountant = new ArrayList();
        ArrayList<Admin> admin = new ArrayList();

        while (stopExecution.equals("NO")) {
            Watchman userWatchman = new Watchman();
            CleaningStaff UserCleanStaff = new CleaningStaff();
            Accountant userAccountant = new Accountant();
            Admin userAdmin = new Admin();
            String profile;

            System.out.println("Enter the profile:");
            profile = inputData.nextLine();






        }

        }



}
