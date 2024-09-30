package com.sid.entity;

public class Player {

	// POJO CLASS

	private String name;
	private int jrcyNo;
	private String teamName;
	private int runs;
	private int wickets;
	private int matches;

	// Zero param const
	public Player(Player player) {
		super();

	}

	// parameterized const
	public Player(String name, int jrcyNo, String teamName, int runs, int wickets, int matches) {

		this.name = name;
		this.jrcyNo = jrcyNo;
		this.teamName = teamName;
		this.runs = runs;
		this.wickets = wickets;
		this.matches = matches;

	}

	// getter setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJrcyNo() {
		return jrcyNo;
	}

	public void setJrcyNo(int jrcyNo) {
		this.jrcyNo = jrcyNo;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	// toString()
	@Override
	public String toString() {
		return " Player [Name=" + name + ", Jourcy NO=" + jrcyNo + ", Team Name=" + teamName + ", Runs=" + runs
				+ ", Wickets=" + wickets + ", Matches=" + matches + "]";
	}

}
