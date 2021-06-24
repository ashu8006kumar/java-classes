package io.arha.day.missed.files;

import java.io.File;

public class FileManger {
	static int numberOfFolders = 0;
	static int numberOfFiles = 0;

	public static void main(String[] agr) {
		File file = new File("/Users/ashish/Documents/2021/teaching/practical/java-classes");

		processFile(file);
		System.out.println(numberOfFiles);
		System.out.println(numberOfFolders);

	}

	private static void processFile(File file) {
		if (file.isDirectory()) {
			numberOfFolders++;
			File[] files = file.listFiles();
			for (File checkFile : files) {
				processFile(checkFile);
			}
		} else {
			numberOfFiles++;
			System.out.print("Hidden:"+file.isHidden()); 
			System.out.println(file.getAbsolutePath());
		}
	}
}
