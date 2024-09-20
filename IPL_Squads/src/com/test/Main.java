package com.test;

import java.util.Scanner;

import com.dao.TeamData;
import com.entity.Player;
import com.service.Ops;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Ops.displayTeam();// display all teams
		System.out.println();

		System.out.println("Enter Team");// enter choice team
		String tname = sc.next();// accept in team

		Ops.getTeamName(tname);

		System.out.println("Enter Player name");

		sc.nextLine();
		String pname = sc.nextLine();
		Ops.getPlayer(pname);

	}

}
