package com.service;

import com.dao.*;
import com.entity.Player;

public class Ops {

	private static final String String = null;

	public static void displayTeam() {

		String tm[] = TeamData.getTeams();
		for (String iterable_element : tm) {
			System.out.println(iterable_element);

		}
		System.out.println("_________________________________________");

	}

	public static String getTeamName(String tName) {

		if ("csk".equalsIgnoreCase(tName)) {
			// csk method call
			Ops.csk();

		} else if ("dc".equalsIgnoreCase(tName)) {
			//// dc method call
			Ops.dc();
		}

		else if ("gt".equalsIgnoreCase(tName)) {
			//// method call
			Ops.gt();
		}

		// System.out.println(string);

		// }

		return tName;

	}

	public static void getPlayer(String playername) {

		Player[] pldata = TeamData.playersData();

		for (Player player : pldata) {

			if (player.getName().equalsIgnoreCase(playername)) {

				System.out.println(player);
			}

		}

	}

	public static Player[] csk() {
		System.out.println("CSK SQUAD");
		System.out.println("-------------------------------------------------------");

		Player[] pldata = TeamData.playersData();

		for (Player player : pldata) {

			if (player.getTeamName().equalsIgnoreCase("csk")) {

				System.out.println(player);

			}

		}
		System.out.println("-------------------------------------------------------");

		return pldata;

	}

	public static void dc() {
		String teamName=Ops.getTeamName(String);
		Player[] dc = TeamData.playersData();
		for (Player player : dc) {

			if (player.getTeamName().equalsIgnoreCase(teamName)) {

			}

		}

	}

	public static void gt() {
		System.out.println("GT team");
	}

}
