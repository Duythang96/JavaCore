package entity;

import java.util.Scanner;

public class FingureAtion {
    public Fingure FingureInput(Scanner scanner,int i){
        System.out.println("Input name for fingure "+(i+1)+":");
        String fingureName = scanner.nextLine();
        System.out.println("Input possition for fingure "+(i+1)+":");
        String fingurePossition = scanner.nextLine();
        Fingure fingure = new Fingure(fingureName, fingurePossition);
        return fingure;
    }
}
