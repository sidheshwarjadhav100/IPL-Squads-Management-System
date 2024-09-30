package com.sid.dao;

import java.util.ArrayList;
import java.util.List;
import com.sid.entity.Player;

public class TeamData {

	static List<Player> la = null;

	public static List<Player> cskPlayers() {
		la = new ArrayList<Player>();
		
		

		la.add(new Player("MS Dhoni", 7, "CSK", 5045, 0, 234));// run,wic,match
		la.add(new Player("Ruturaj Gaikwad", 3, "CSK", 2883, 3, 102));
		la.add(new Player("Deepak Chahar", 9, "CSK", 914, 109, 90));
		la.add(new Player("Mukesh Choudhari", 63, "CSK", 190, 154, 118));
		la.add(new Player("Ravindra Jadeja", 8, "CSK", 1827, 165, 192));
		la.add(new Player("Shivam Dube", 4, "CSK", 1034, 53, 58));

		return la;

	}

	public static List<Player> miPlayers() {
		la = new ArrayList<Player>();
		la.add(new Player("Rohit Sharma ", 45, "MI", 4982, 0, 187));
		la.add(new Player("Suryakumar Yadav", 63, "MI", 2700, 0, 120));
		la.add(new Player("Piyush Chawla", 11, "MI", 550, 157, 170));
		la.add(new Player("Jason Behrendorff", 67, "MI", 00, 160, 140));
		la.add(new Player("Cameron Green", 42, "MI", 2600, 55, 50));
		la.add(new Player("Tim David", 20, "MI", 1500, 51, 70));

		return la;

	}

	public static List<Player> rcbPlayers() {
		la = new ArrayList<Player>();
		la.add(new Player("Virat Kohli", 18, "RCB", 7263, 4, 237));
		la.add(new Player("Faf du Plessis", 18, "RCB", 4048, 0, 137));
		la.add(new Player("Mohammed Siraj", 13, "RCB", 85, 102, 79));
		la.add(new Player("Karn Sharma", 33, "RCB", 317, 159, 173));
		la.add(new Player("Glenn Maxwell", 32, "RCB", 2711, 58, 120));
		la.add(new Player("Cameron Green", 42, "RCB", 2343, 77, 123));

		return la;

	}

}

