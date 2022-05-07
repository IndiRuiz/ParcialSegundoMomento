package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Watchman extends Person {
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    private String weapon;
    private String workDay;

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String stopExecution = "NO";
        ArrayList<Watchman> watchman = new ArrayList();

        while (stopExecution.equals("NO")) {
            Watchman userWatchman = new Watchman();

            System.out.println("Name:");
            userWatchman.setName(inputData.nextLine());

            System.out.println("Identification: ");
            userWatchman.setIdentification(inputData.nextLine());

            System.out.println("Age: ");
            userWatchman.setAge(inputData.nextInt());

            System.out.println("Weapon: ");
            userWatchman.setWeapon(inputData.nextLine());

            System.out.println("Work Day: ");
            userWatchman.setWorkDay(inputData.nextLine());

            watchman.add(userWatchman);

            System.out.println("Continuar");
            String stop = inputData.nextLine();
            if (stop.toUpperCase().equals("NO")) {
                //break;
                stopExecution = "SI";
            }
        }

        for(int i=0; i < watchman.size(); i++){
            System.out.println("Nombre: "+ watchman.get(i).getName() + " Id: " + watchman.get(i).getIdentification() + " Age: " + watchman.get(i).getAge() + " Weapon: " + watchman.get(i).getWeapon() + " Work Day: " + watchman.get(i).getWorkDay());
        }
    }
        }

