package com.snapchat.controller;

import java.util.Scanner;

import com.snapchat.entity.SnapchatUser;
import com.snapchat.service.SnapchatService;
import com.snapchat.service.SnapchatServiceInterface;

public class SnapchatController implements SnapchatControllerInterface {

	public void createProfile() {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		System.out.println("Enter email: ");
		String email = sc.next();
		
		System.out.println("Enter address: ");
		String address = sc.next();
		
		SnapchatUser su = new SnapchatUser();
		su.setName(name);
		su.setPassword(password);
		su.setEmail(email);
		su.setAddress(address);
		
		SnapchatServiceInterface ss = new SnapchatService();
		int i = ss.createProfileService(su);

	}

}
