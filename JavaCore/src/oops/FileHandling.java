package oops;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileHandling {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		//createFile();
		createFileOpStream();

	}


private static void createFile() throws IOException {
	
	//Create File
	File file = new File("C:\\Users\\satish_das\\testFile.txt");
	
	try {
				
		if (file.createNewFile()) {
			System.out.println("File is created !");
		}
		else  {
			System.out.println("File exists !");
		}
	}
	catch (IOException e) {
		System.out.println(e);
	}	
	
	//Write Content
	FileWriter writer = new FileWriter(file);
	
	try {
		
			writer.write("Test Data");
			writer.close();
			System.out.println("File updated !");
		}
	catch (IOException e) {
		System.out.println(e);
	}
	
		
}

private static void createFileOpStream() throws IOException {
	
	String data = "Test Data from FileOpStream";
	FileOutputStream out = new FileOutputStream("C:\\Users\\satish_das\\testFile.txt");
	out.write(data.getBytes());
	out.close();
	
}




}


