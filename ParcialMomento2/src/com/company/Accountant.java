package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Accountant extends Person {
    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    private String leader;
    private String parking;

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String stopExecution = "NO";
        ArrayList<Accountant> accountant = new ArrayList();

        while (stopExecution.equals("NO")) {
            Accountant userAccountant = new Accountant();

        }
    }

}
