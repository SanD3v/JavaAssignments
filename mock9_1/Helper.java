package mock9_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Helper {
	public static Player createPlayer(String[] inputLine) throws ParseException {
		Date date = new SimpleDateFormat("dd-MM-yyyy").parse(inputLine[1]);
		Player p1 = new Player(inputLine[0], date, inputLine[2], Integer.valueOf(inputLine[3]),
				Integer.valueOf(inputLine[4]), Integer.valueOf(inputLine[5]), inputLine[6],
				Double.valueOf(inputLine[7]));
		return p1;
	}

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter player 1 detail:");
		String input = scanner.nextLine();
		String[] inputLine = input.split(",");
		Player p1 = createPlayer(inputLine);
		System.out.println("Enter player 2 detail:");
		input = scanner.nextLine();
		scanner.close();
		inputLine = input.split(",");
		Player p2 = createPlayer(inputLine);
		System.out.println("\nPlayer 1:");
		System.out.println(p1);
		System.out.println("\n");
		System.out.println("Player 2:");
		System.out.println(p2);
		if (p1.equals(p2))
			System.out.println("Player 1 is same as Player 2");
		else
			System.out.println("Player 1 and Player 2 are different");

	}

}