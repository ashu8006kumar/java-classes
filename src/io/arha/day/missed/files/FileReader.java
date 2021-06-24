package io.arha.day.missed.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] agr) {
		File file = new File("/Users/ashish/Documents/2021/test-repo/", "newFile.txt");
		if (file.exists()) {
			Scanner readScanner = null;
			try {
				readScanner = new Scanner(file);
				while (readScanner.hasNextLine()) {
					String line = readScanner.nextLine();
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				System.err.println(e.getMessage());
			} finally {
				if (readScanner != null)
					readScanner.close();
			}
		}

	}
}
