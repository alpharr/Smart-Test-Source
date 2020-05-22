package me.alpharr.smarttest;

import java.awt.AWTException;
import java.awt.TrayIcon.MessageType;

import xyz.impdevmc.notifications.NotificationAPI;

public class Test {

	public static void main(String[] args) throws AWTException {
		
		// String Helpers | Random Number Generator
		String title = "---[ Smart Test ]---";
		String title2 = "Smart Test";
		String load = "SYSTEM » Loading SmartAPI";
		String pf = "SYSTEM »";
		String pf2 = "TEST »";
		int random = (int) (Math.random() * 100);
		
		// Start of Code
		try {
			SmartAPI.send(title);
			SmartAPI.send(load);
			Thread.sleep(3000);
			SmartAPI.send(pf + " Successfully Loaded SmartAPI");
			Thread.sleep(1000);
			SmartAPI.send(pf + " Loading Rest of System");
			Thread.sleep(5000);
			SmartAPI.send(pf2 + " Starting Test..");
			Thread.sleep(3000);
			SmartAPI.send(pf + " Loaded Rest of System. Going sleep mode.");
			Thread.sleep(1000);
			SmartAPI.send(pf2 + " Successfully loaded Smart Test");
			Thread.sleep(1000);
			SmartAPI.send(pf2 + " Analyzing..");
			Thread.sleep(2000);
			SmartAPI.send("Results: " + random + "% Smart!");
			Thread.sleep(2000); 
			SmartAPI.send(pf2 + " Since its now over, we will shutdown our selfs.");
			Thread.sleep(3000);
			SmartAPI.send(pf + " Shutting down System (Program)");
			Thread.sleep(3000);
			SmartAPI.send(pf + " See you next time !");
			Thread.sleep(4000);
			NotificationAPI.displayTray("Smart Test", "NOTE > This program was all made by Alphar. Hope you enjoyed it :D", MessageType.INFO, "SmartNotifi", "SmartNotifi");
			System.exit(0);
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
