package com.sid.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import com.sid.dao.TeamData;
import com.sid.entity.Player;

public class Operations {
	private static final List<Player> Player = null;
	static Scanner sc = new Scanner(System.in);
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	// csk all player is here
	public static void getCSKAllPlayers() {
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		List<Player> csk = TeamData.cskPlayers();
		for (Player player : csk) {
			// BATCHMAN
			if (player.getRuns() > 2500 && player.getWickets() <= 5) {

				if (count == 0) {
					System.out.println("-----------------");
					System.out.println("|" + "Batsman" + "|");
					System.out.println();
					count++;
				}

				System.out.println(player.getName());

			}
			// BOLLER
			if (player.getWickets() > 100 && player.getRuns() <= 1000) {

				if (count1 == 0) {
					System.out.println("-----------------");
					System.out.println("|" + "Boller" + "|");
					System.out.println();
					count1++;
				}

				System.out.println(player.getName());

			}
			// allrounder
			if (player.getRuns() > 1000 && player.getWickets() > 50) {

				if (count2 == 0) {
					System.out.println("-----------------");
					System.out.println("|" + "All Rounder" + "|");
					System.out.println();
					count2++;

				}

				System.out.println(player.getName());
			}

		}
		cskplayerInfo();// call to player info

	}

	// single player info print
	public static void cskplayerInfo() {
		int choice = 0;
		int j = 0;
		do {
			// for player details
			if (j == 0) {
				System.out.println("==============================================");
				System.out.println("Enter Player Name Which you want to full info");
				j--;
			}
			String name = null;
			try {
				name = bf.readLine();
			} catch (Exception e) {
				System.out.println("invalid input");
				e.printStackTrace();
			}
			// System.out.println(name);

			List<Player> csk = TeamData.cskPlayers();

			int i = 0;
			for (Player player : csk) {

				if (player.getName().equalsIgnoreCase(name)) {
					System.out.println(player);
					i++;
				}

			}
			if (i == 0) {
				System.out.println("Enter Valid Player Name");

			}

			for (Player player : csk) {

				if (player.getName().equalsIgnoreCase(name)) {

					j++;
					System.out.println("============================================");
					System.out.println();
					System.out.println(" |   choice   |   ");
					System.out.println("------------------");
					System.out.println("1.Another Player Info");
					System.out.println("2.Main Menu");
					// System.out.println("3.Exit");
					System.out.println("Enter choice");

					try {
						choice = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Invalid Input");
//		break;
					}
				}
			}
			// while(true){
			// do {
			switch (choice) {
			case 1: {
				// Operations.playerInfo();//print playerInfo

				break;
			}
			case 2: {
				// System.out.println("This is case 2");
				// Test.main(null);

				break;
			}

			default:
				System.out.println("InValid Number");
				System.out.println("Enter Choice From Bellow Menu Only");
				break;

			}

			// }

		}

		while (choice != 2);

	}

	static List<Player> mi = TeamData.miPlayers();

	public static void getMIAllPlayers() {
		int count = 0;
		int count1 = 0;
		int count2 = 0;

		for (Player player : mi) {
			// BATCHMAN
			if (player.getRuns() > 2500 && player.getWickets() <= 5) {

				if (count == 0) {
					System.out.println("-----------------");
					System.out.println("|" + "Batsman" + "|");
					System.out.println();

					count++;
				}
				// count++;
				System.out.println(player.getName());

			}
			// BOLLER
			if (player.getWickets() > 100 && player.getRuns() <= 1000) {

				if (count1 == 0) {
					System.out.println("-----------------");
					System.out.println("|" + "Boller" + "|");
					count1++;
					System.out.println();

				}

				System.out.println(player.getName());

			}
			// allrounder
			if (player.getRuns() > 1000 && player.getWickets() > 50) {

				if (count2 == 0) {
					System.out.println("-----------------");
					System.out.println("|" + "All Rounder" + "|");
					count2++;
					System.out.println();

				}

				System.out.println(player.getName());
			}

		}
		miPlayerInfo();

	}

	public static void miPlayerInfo() {

		int choice = 0;
		int j = 0;
		do {
			// for player details
			if (j == 0) {
				System.out.println("==============================================");
				System.out.println("Enter Player Name Which you want to full info");
				j--;
			}
			String name = null;
			try {
				name = bf.readLine();
			} catch (Exception e) {
				System.out.println("invalid input");
				e.printStackTrace();
			}
			// System.out.println(name);

			// List<Player> csk = TeamData.cskPlayers();

//			if (name) {
//				
//			}
			int i = 0;
			for (Player player : mi) {

				if (player.getName().equalsIgnoreCase(name)) {
					System.out.println();
					System.out.println(player);
					i++;
					System.out.println();
				}

			}
			if (i == 0) {
				System.out.println("Enter Valid Player Name");

			}

			for (Player player : mi) {

				if (player.getName().equalsIgnoreCase(name)) {
					j++;
					System.out.println();
					System.out.println("============================================");
					System.out.println();
					System.out.println(" |   choice   |   ");
					System.out.println("------------------");
					System.out.println("1.Another Player Info");
					System.out.println("2.Main Menu");
					// System.out.println("3.Exit");
					System.out.println("Enter choice");

					try {
						choice = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Invalid Input");
//		break;
					}
				}
			}
			// while(true){
			// do {
			switch (choice) {
			case 1: {
				// Operations.playerInfo();//print playerInfo

				break;
			}
			case 2: {
				// System.out.println("This is case 2");
				// Test.main(null);

				break;
			}

			default:
				System.out.println("InValid Number");
				System.out.println("Enter Choice From Above Menu Only");
				break;

			}

			// }

		}

		while (choice != 2);

	}

	static List<Player> rcb = TeamData.rcbPlayers();

	public static void getRCBAllPlayers() {
		int count = 0;
		int count1 = 0;
		int count2 = 0;

		for (Player player : rcb) {
			// BATCHMAN

			if (player.getRuns() > 2500 && player.getWickets() <= 5) {

				if (count == 0) {
					System.out.println("------------------------------");
					System.out.println("|" + "Batsman" + "|");
					System.out.println();

					count++;
				}
				// count++;
				System.out.println(player.getName());

			}
			// BOLLER
			if (player.getWickets() > 100 && player.getRuns() <= 1000) {

				if (count1 == 0) {
					System.out.println("------------------------------");
					System.out.println("|" + "Boller" + "|");
					System.out.println();
					count1++;
				}

				System.out.println(player.getName());

			}
			// allrounder
			if (player.getRuns() > 1000 && player.getWickets() > 50) {

				if (count2 == 0) {
					System.out.println("------------------------------");
					System.out.println("|" + "All Rounder" + "|");
					System.out.println();
					count2++;
				}

				System.out.println(player.getName());
			}

		}
		rcbPlayerinfo();

	}

	public static void rcbPlayerinfo() {

		int choice = 0;
		int j = 0;
		do {
			// for player details
			if (j == 0) {
				System.out.println("==============================================");
				System.out.println("Enter Player Name Which you want to full info");
				j--;
			}
			String name = null;
			try {
				name = bf.readLine();
			} catch (Exception e) {
				System.out.println("invalid input");
				e.printStackTrace();
			}
			// System.out.println(name);

			List<Player> csk = TeamData.cskPlayers();

//			if (name) {
//				
//			}
			int i = 0;
			for (Player player : rcb) {

				if (player.getName().equalsIgnoreCase(name)) {
					System.out.println(player);
					i++;
				}

			}
			if (i == 0) {
				System.out.println("Enter Valid Player Name");

			}

			for (Player player : rcb) {

				if (player.getName().equalsIgnoreCase(name)) {

					j++;
					System.out.println("============================================");
					System.out.println();
					System.out.println(" |   choice   |   ");
					System.out.println("------------------");
					System.out.println("1.Another Player Info");
					System.out.println("2.Main Menu");
					// System.out.println("3.Exit");
					System.out.println("Enter choice");

					try {
						choice = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Invalid Input");
//		break;
					}
				}
			}
			// while(true){
			// do {
			switch (choice) {
			case 1: {
				// Operations.playerInfo();//print playerInfo

				break;
			}
			case 2: {
				// System.out.println("This is case 2");
				// Test.main(null);

				break;
			}

			default:
				System.out.println("InValid Number");
				System.out.println("Enter Choice From Bellow Menu Only");
				break;

			}

			// }

		}

		while (choice != 2);

	}

}
