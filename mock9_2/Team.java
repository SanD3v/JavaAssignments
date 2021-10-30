package mock9_2;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class Team {
	public Team() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public Team(String name, List<Player> playerList) {
		this.name = name;
		this.playerList = playerList;
	}

	private String name;
	private List<Player> playerList;

	public void addPlayerToTeam(Player player) {
		this.playerList.add(player);
	}

	public Boolean removePlayerFromTeam(String name) {
		Iterator itr = this.playerList.iterator();
		while (itr.hasNext()) {
			Player player = (Player) itr.next();
			if (player.getName().equals(name)) {
				itr.remove();
				return true;
			}

		}
		return false;

	}

	public void displayPlayers() {
		if (this.playerList.isEmpty()) {
			System.out.println("No players to show");
			return;
		}
		System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name", "Date of birth", "Skill",
				"No of matches", "Runs", "Wickets", "Nationality", "Rating");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		for (Player p : this.playerList) {
			System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", p.getName(),
					formatter.format(p.getDateOfBirth()), p.getSkill(), p.getNumberOfMatches(), p.getRuns(),
					p.getWickets(), p.getNationality(), p.getPowerRating());

		}
	}

}
