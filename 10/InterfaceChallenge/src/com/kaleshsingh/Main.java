package com.kaleshsingh;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Player kalesh = new Player("Kalesh", 10, 15);
		System.out.println(kalesh.toString());
		saveObject(kalesh);

		kalesh.setHitPoints(8);
		System.out.println(kalesh.toString());
		kalesh.setWeapon("Stormbringer");
		saveObject(kalesh);
		loadObject(kalesh);
		System.out.println(kalesh);

		ISavable werewolf = new Monster("Werewolf", 20, 40);
		System.out.println("Strength = " + ((Monster) werewolf).getStrength());			// Notice the casting 
		System.out.println(werewolf);
		saveObject(werewolf);

	}

	public static ArrayList<String> readValues() {
		ArrayList<String> values = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n" + 
						   "\t1 - To enter a string\n" + 
						   "\t0 - To quit\n");

		while (!quit) {
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 0:
					quit = true;
					break;
				case 1:
					System.out.print("Enter a string: ");
					String stringInput = scanner.nextLine();
					values.add(index, stringInput);
					index++;
					break;
			}
		}

		return values;
	}

	public static void saveObject(ISavable objectToSave) {
		for (int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i) + " to storge device.");
		}
	}

	public static void loadObject(ISavable objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}
}
