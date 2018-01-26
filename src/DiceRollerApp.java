import java.util.Scanner;

public class DiceRollerApp {
	public static void main(String[] args) {
		//Ask the user to enter the number of slides for a pair of dice
		Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to Grand Circus Casino!");
        System.out.println();
		System.out.println("How many sides should each die have?"); 
		//type, variable, assining the user input to variable(I made(ie sidesOfdice)
		int sidesOfdice= scnr.nextInt(); 
		
		// printing out the number, calling the variable input 
		System.out.println(addNums(sidesOfdice));
		System.out.println(addNums(sidesOfdice));
	}
	
     
	// generate a number from 0 - 6 using a method
        public static int addNums (int num) {
    		int randomNum = (int) (Math.random() * num); 
    		return randomNum +1;

	}
	
}
