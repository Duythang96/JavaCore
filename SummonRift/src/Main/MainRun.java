package Main;

import entity.Fingure;
import entity.FingureAtion;
import entity.SummonRift;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Fingure> fingures = new ArrayList<>();
        FingureAtion fingureAtion = new FingureAtion();
        //Input information for team
        ArrayList<Team> teams = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            //input information for fingure
            System.out.println("Input inforation for team "+(i+1)+":");
            for (int j = 0; j < 5; j++) {
                Fingure fingure = fingureAtion.FingureInput(scanner,j);
                fingures.add(fingure);
            }
            Team team = new Team(fingures);
            teams.add(team);
        }
        //Show SummonRift's infor
        SummonRift summonRift = new SummonRift(teams);
        System.out.println("SummonRift");
        for (int i = 0; i < teams.size() ; i++) {
            System.out.println(summonRift.getTeams().get(i));
        }
        System.out.println(summonRift.getTimes());

    }
}
