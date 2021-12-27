package Project;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LockedMeFile {
	
	String mainPath = "C:\\Users\\satish_das\\eclipse-workspace\\JavaCore\\src\\Project\\main";
	Scanner sc = new Scanner(System.in);
	File file = new File(mainPath);
	public void welcome() throws IOException {
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("                    WELCOME TO LOCKEDME.COM FILE HANDLING FUNCTION !!!                  ");
		System.out.println("----------------------------------------------------------------------------------------\n");
		
		try {
			if (!file.exists()) {
				file.mkdir();
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
	
	public void mainMenu() throws IOException, InputMismatchException {
		
		try {
			while(true) {
				
			System.out.println("MAIN MENU");
			System.out.println("-----------");
			System.out.println("1. List all files.");
			System.out.println("2. Secondary Menu.");
			System.out.println("3. Exit.");
			
					
				switch (sc.nextInt()) {
				
				case 1:
					System.out.println("Files list below:");
					System.out.println("-----------------");
					String[] filenames = file.list();
					for (String filename : filenames) {
						System.out.println(filename);
					}
					System.out.println();
					break;
					
				case 2:
					subMenu();
					break;
										
				case 3:
					System.out.println("Program exits !!!");
					System.exit(0);
				
				default:
					System.out.println("Input correct values and retry:\n");
					
				}

			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid input, Program Ends !!!");
		} 
}
	
	public void subMenu() throws IOException, InputMismatchException {
		
		try {
			
		while(true) {
		System.out.println();
		System.out.println("SUB MENU");
		System.out.println("-----------");
		System.out.println("1. Add a file.");
		System.out.println("2. Delete a file.");
		System.out.println("3. Search file.");
		System.out.println("4. Return to Main Menu.");
		System.out.println("5. Exit.");
				
			switch (sc.nextInt()) {
			
			case 1:
				System.out.println("Enter a file name to add:");
				System.out.println("-----------------");
				String fileName = sc.next();
								
				File file = new File(mainPath+"//"+fileName);
					if (file.createNewFile()) {
						System.out.println("File "+fileName+" is created");
					} else {
						System.out.println("File "+fileName+" exists");
					}
				break;

			 case 2:
				System.out.println("Enter a file name to delete:");
				System.out.println("-----------------");
				String deleteFile = sc.next();
				
				File file2 = new File(mainPath+"//"+deleteFile);
					if (file2.delete()) {
						System.out.println("File "+deleteFile+ " is deleted");
					} else {
						System.out.println("File "+deleteFile+" doesn't exists");
					}
				break;	
				
			 case 3:
					System.out.println("Enter keyword to search:");
					System.out.println("-----------------");
					String searchFile = sc.next();
					File file4 = new File(mainPath);
					FilenameFilter filter = new FilenameFilter() {
						
						@Override
						public boolean accept(File file4, String name){
							// TODO Auto-generated method stub
							return name.startsWith(searchFile);
						}
					};
					
					String[] list = file4.list(filter);
					if (list.length == 0) {
						System.out.println("No file exists !!!");
					}else {
						System.out.println("Below files exists:\n");
						for (int i=0;i<list.length;i++) {
							String result = list[i];
							System.out.println(result);
						}
					}
					break;
					
			 case 4:
				 mainMenu();
				 break;
				
			 case 5:
				 System.out.println("Program Exits !!!");
			 	 System.exit(0);
			 	 
			 default:
				System.out.println("Input correct values and retry:");
			}
		  } 
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Wrong input, program exits !!!");
			System.exit(1);
			}
}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		LockedMeFile lockedMeFile = new LockedMeFile();
		lockedMeFile.welcome();
		lockedMeFile.mainMenu();
		

		
		
	}

}
