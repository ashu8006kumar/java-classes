package io.arha.day.missed.files;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		File source = new File("/Users/ashish/Documents/2021/test-repo/", "newFile.txt");

		InputStream in = new ByteArrayInputStream(Files.readAllBytes(source.toPath()));

		File des = new File("/Users/ashish/Documents/2021/", "newFile.txt");
		Files.copy(in, des.toPath(), StandardCopyOption.REPLACE_EXISTING);
		source.delete();

	}
}
