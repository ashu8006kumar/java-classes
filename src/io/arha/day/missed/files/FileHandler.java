package io.arha.day.missed.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
	public static void main(String[] args) {
		File file = new File("/Users/ashish/Documents/2021/test-repo/", "newFile.txt");
		FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);
			writer.write(System.lineSeparator());
			writer.write("This is line three ");
			writer.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			if (writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
