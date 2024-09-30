package com.sid.controller;

import java.util.List;
import java.util.Scanner;

import javax.swing.table.TableColumn;

import com.sid.entity.Player;
import com.sid.service.Operations;

public class TeamController {

	public static void gerCSKAllPlayers() {

		Operations.getCSKAllPlayers();

	}

	public static void getMIAllPlayers() {

		Operations.getMIAllPlayers();

	}

	public static void getRCBAllPlayers() {

		Operations.getRCBAllPlayers();

	}

}
