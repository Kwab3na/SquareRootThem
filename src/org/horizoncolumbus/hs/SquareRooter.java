package org.horizoncolumbus.hs;

import java.util.*;

public class SquareRooter {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    ArrayList<Integer> numbers = new ArrayList<>();
	    for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: ");
            numbers.add(input.nextInt());
        }

	    for (double rootedNumber : numbers){
	        rootedNumber = Math.sqrt(rootedNumber);
            System.out.println(rootedNumber + "\t");
        }
    }
}
