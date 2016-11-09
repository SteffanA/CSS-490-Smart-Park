package com.smartpark.firebase;

public class Main {
	
	private final static String datebaseUrl = "https://smartpark-aa8eb.firebaseio.com/";
	private final static String serviceAccountPath = "C:/Users/Tyler/Dropbox/CSS 490 Developing Modern Software/SmartPark-a58d3074b302.json";
	private final static String spacesFilePath = "file/allSpaces.txt";
	
	public static void main(String[] args) {		
		Firebase fb = new Firebase(datebaseUrl, serviceAccountPath, spacesFilePath);
		fb.uploadData(fb.getData());
		System.exit(0);
	}
}