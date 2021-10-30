package mock9_1;

import java.util.Date;

public class Player {

	public Player(String name, Date dateOfBirth, String skill, Integer numberOfMatches, Integer runs, Integer wickets,
			String nationality, Double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}

	@Override
	public String toString() {
		return "Name:" + name + "\nDate of birth:" + dateOfBirth + "\nSkill:" + skill + "\nNumber of matches:"
				+ numberOfMatches + "\nRuns:" + runs + "\nWickets:" + wickets + "\nNationality:" + nationality
				+ "\nPower rating:" + powerRating + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		Player player = (Player) obj;
		if (this.name.equalsIgnoreCase(player.name) && this.skill.equalsIgnoreCase(player.skill)
				&& this.nationality.equalsIgnoreCase(player.nationality))
			return true;
		else
			return false;

	}

	private String name;
	private Date dateOfBirth;
	private String skill;
	private Integer numberOfMatches;
	private Integer runs;
	private Integer wickets;
	private String nationality;
	private Double powerRating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Integer getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(Integer numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public Integer getRuns() {
		return runs;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}

	public Integer getWickets() {
		return wickets;
	}

	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Double getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(Double powerRating) {
		this.powerRating = powerRating;
	}

}
