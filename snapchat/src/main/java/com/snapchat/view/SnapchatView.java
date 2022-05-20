package com.snapchat.view;

import java.util.Scanner;

import com.snapchat.controller.SnapchatController;
import com.snapchat.controller.SnapchatControllerInterface;

public class SnapchatView {

	public static void main(String[] args) {
		
		String s = "y";
		Scanner sc = new Scanner(System.in);
		
		while(s.equals("y")) {
			System.out.println("******** Main Menu **********");
			System.out.println("Press 1 to create your profile");
			System.out.println("Press 2 to view your profile");
			System.out.println("Press 3 to delete a profile");
			System.out.println("Press 4 to view all profiles");
			
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			
			SnapchatControllerInterface sc1 = new SnapchatController();
			
			
			
			switch(ch) {
				case 1:
					sc1.createProfile();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					System.out.println("Wrong choice");						
			}
			System.out.println("Press y to continue");
			s = sc.next();
		}

	}

}
