package mock9_2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Helper {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the Team:");
		String teamName = scanner.nextLine();
		Team team = new Team();
		team.setName(teamName);
		ArrayList<Player> players = new ArrayList<Player>();
		team.setPlayerList(players);
		boolean close = false;
		while (!close) {
			System.out.println("1.Add Player\n" + "2.Delete Player\n" + "3.Display Players\n" + "4.Exit\n");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter the details of player in CSV format:");
				String in = scanner.nextLine();
				String[] inLine = in.split(",");
				Player player = Player.createPlayer(inLine);
				team.getPlayerList().add(player);
				break;

			}
			case 2: {
				System.out.println("Enter the name of the player to be deleted:");
				String name = scanner.nextLine();
				if (team.removePlayerFromTeam(name))
					System.out.println("Player " + name + " deleted");
				else
					System.out.println("Player not found in the team");
				break;

			}
			case 3: {
				team.displayPlayers();
				break;
			}
			case 4: {
				close = true;
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		}
		scanner.close();

	}

}
