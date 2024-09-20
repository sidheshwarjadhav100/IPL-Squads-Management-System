package com.test;

import java.util.Scanner;

import com.dao.TeamData;
import com.entity.Player;
import com.service.Ops;

public class Main {

	public static void main(String[] args) {
		int choice;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("All Teams Of IPL-2024");
			System.out.println("------------------------");
			Ops.displayTeam();// display all teams of IPL-2024
			System.out.println();

//		System.out.println("Enter Team Name");// enter choice team
//		String tname = sc.next();// accept in team

			Ops.getTeamName();// done till here
			// Ops.displayTeam();
			System.out.println("----------------------");

			System.out.println("Enter Player name of above team that you want to see all details");

			String pname = sc.nextLine();
			Ops.getPlayer(pname);
			System.out.println("________________________________________________");

			System.out.println();
			System.out.println("Enter choice");
			System.out.println("1.see all teams again");
			System.out.println("2.exit");
			do {
				choice = sc.nextInt();

				// System.out.println();
				switch (choice) {
				case 1: {

					break;
				}
				case 2: {

					break;

				}
				default:
					System.out.println("Please Enter Valid Choice");
					// throw new IllegalArgumentException("Unexpected value: " + choice);
				}
			} while (choice <= 0 || choice > 2);
		} while (choice == 1);
	}

}
