package com.sid.test;

import java.util.Scanner;

import com.sid.controller.TeamController;
import com.sid.service.Operations;

public class Test {
	static int count = 0;

	public static void main(String[] args) {

		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------------------------------");

			System.out.println(" MENU ");
			System.out.println("------------------------------");

			System.out.println("1.CSK");
			System.out.println("2.MI");
			System.out.println("3.RCB");
			count++;
			// System.out.println(count);
			if (count > 1) {
				System.out.println("4.Exit");

			}

			System.out.println("==============================");
			System.out.println("Enter a choice");
			do {
				try {
					choice = sc.nextInt();

				} catch (Exception e) {
					System.out.println("InValid Input");
					break;
				}

				switch (choice) {
				case 1: {
					// String team="CSK";
				//	Operations.getCSKAllPlayers();
					TeamController.gerCSKAllPlayers();

					break;
				}
				case 2: {
					// String team="MI";

					//Operations.getMIAllPlayers();
					
					TeamController.getMIAllPlayers();
					break;

				}
				case 3: {
					// String team="RCB";
					// Operations.getRCBAllPlayers();
					TeamController.getRCBAllPlayers();
					
					break;
				}
				case 4: {

					break;
				}

				default: {
					System.out.println("Please Enter Valid Choice");
					System.out.println("Enter Choice From Above Menu Only");
					break;
				}
				}
			} while (choice > 4 || choice <= 0);

		} while (choice != 4);

	}
}
