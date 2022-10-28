package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Main {

    public static boolean jeLiBroj(String s){
        for(int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        String unos = "";
        List<Integer> brojevi = new ArrayList<>();

        while(true) {
            System.out.println("Unesi broj ili stop: ");
            unos = ulaz.nextLine();
            if(jeLiBroj(unos)) {
                brojevi.add(Integer.parseInt(unos));
                continue;
            }
            if(unos.equalsIgnoreCase("stop"))
                    break;

        }

        Integer maximalni = max(brojevi);
        Integer minimalni = min(brojevi);
        System.out.println("Maksimalni element je: " + maximalni + ", a minimalni element je: " + minimalni);


    }
}
