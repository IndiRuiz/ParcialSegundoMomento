package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CleaningStaff extends Person{
    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }

    private String dayOff;

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String stopExecution = "NO";
        ArrayList<CleaningStaff> cleaningStaff = new ArrayList();

        while (stopExecution.equals("NO")) {
            CleaningStaff userCleaningStaff = new CleaningStaff();

            System.out.println("Name:");
            userCleaningStaff.setName(inputData.nextLine());

            System.out.println("Identification: ");
            userCleaningStaff.setIdentification(inputData.nextLine());

            System.out.println("Age: ");
            userCleaningStaff.setAge(inputData.nextInt());

            System.out.println("Day Off: ");
            userCleaningStaff.setDayOff(inputData.nextLine());

            cleaningStaff.add(userCleaningStaff);

            System.out.println("Continuar");
            String stop = inputData.nextLine();
            if (stop.toUpperCase().equals("NO")) {
                //break;
                stopExecution = "SI";
            }
        }

        for(int i=0; i < cleaningStaff.size(); i++){
            System.out.println("Nombre: "+cleaningStaff.get(i).getName() + " Id: " + cleaningStaff.get(i).getIdentification() + " Age: " + cleaningStaff.get(i).getAge() + " Day Off: " + cleaningStaff.get(i).getDayOff());
        }
    }
}
