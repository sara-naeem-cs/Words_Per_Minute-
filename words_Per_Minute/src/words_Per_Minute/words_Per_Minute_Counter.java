package words_Per_Minute;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class words_Per_Minute_Counter {
	
	static String[] words = {"Hey", "how", "are", "you", "five","six","seven", 
							"eight", "nine", "ten", "password", "track", "essay", 
							"kick", "boot", "push", "defendent", "by", "noise", 
							"systematic", "dividend", "liberal", "exotic", 
							"foreigner", "stich", "deserve", "shine", "adviser", 
							"pony", "lounge"};
	public static void main(String[] args) throws InterruptedException {

	System.out.println("A short paragraph will appear on the screen. Once you see this paragraph, the timer starts.");
	System.out.println("Write out the sentences as fast as you can and at the end you'll be able to ");
	System.out.println("find out what your typing speed is (in Words Per Minute). Good luck! ");
	TimeUnit.SECONDS.sleep(4);
	boolean run = true;
	
	while (run) {	
	System.out.println("On your mark...");
	TimeUnit.SECONDS.sleep(1);
	
	System.out.println("Get set...");
	TimeUnit.SECONDS.sleep(1);

	System.out.println("GOOOOO!!!!!");
	TimeUnit.SECONDS.sleep(1);

	//create a random number generator 
	Random rand = new Random();
	String type = "";
	//For loop prints random numbers up to 30
	for(int i = 0; i<30; i++) {
		if (i != 0) {
		type = type + " " + words[rand.nextInt(29)];
		}
		else {
			type = type + words[rand.nextInt(29)];
		}
	}
	System.out.println(type);
	System.out.println();
	System.out.println("Type the words below:");
	
	double start = LocalTime.now().toNanoOfDay();;

	Scanner scan = new Scanner(System.in);
	String typedWords = scan.nextLine();
	
	//We can get the nanoseconds of the day after user hits enter
	double end = LocalTime.now().toNanoOfDay();
	
	//Storing the elapsed time
	double elapsedTime = end - start;
	
	//Rounding the time so the user doesnt need to deal with 'e' notation
	double seconds = elapsedTime/1000000000.0;
	
	int numChars = typedWords.length();
	
	int wpm = (int)((((double) numChars / 5) / seconds) * 60);
	
	if (type.equals(typedWords)) {
		System.out.println("Your WPM: " + wpm);
	}else {
		System.out.println("Your input doesn't match the given text :( Try again, type carefully!");
	}
	
	System.out.println();
	System.out.println("Do you want to try again? Type yes or no. Program will exit on any other input.");
	Scanner scan1 = new Scanner(System.in);
	String continues = scan1.nextLine();
	
	if (continues.equals("yes")){
		run = true;
	}
	else {
		System.exit(0);
	}
	
	
	
	} //End of while loop 

	
	}//end of public static
	
}// End of class 
