import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;

/**
* File Manager Program
* 
* @author Priyanka Kapoor
* Feb 7, 2014
*
*/
public class FileManager{
	
	void deleteFile(){
		System.out.println("Enter the file to be deleted");
		BufferedReader keyboard = new BufferedReader( new InputStreamReader(System.in));
		String sfile=null;
		try{
			sfile=keyboard.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		File file = new File(sfile);
		
		if(file.exists() && file.isFile()){
			file.delete();
			System.out.println("File Deleted");
		}
		
	}
	void listDirectoryContent(){
		System.out.println("Enter the name of Directory whose contents are to be listed");
		BufferedReader keyboard = new BufferedReader( new InputStreamReader(System.in));
		String dirName=null;
		try{
			dirName=keyboard.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		File dir = new File(dirName);
		File [] fList = dir.listFiles();
		System.out.println("Files and Subdirectories of given Directory are:");
		for(File file:fList){
			System.out.println(file.getName());
		}
		System.out.println("Files of given Directory are:");
		for(File file:fList){
			if(file.isFile()){
				System.out.println(file.getName());
			}
		}
		
	}
	void fileCopy(){
		System.out.println("Enter the name of source file");
		BufferedReader keyboard = new BufferedReader( new InputStreamReader(System.in));
		String sfile=null;
		try{
			sfile=keyboard.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		FileInputStream sourceFile=null;
		try{
			sourceFile = new FileInputStream(sfile);
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found");
			e.printStackTrace();
		}
		System.out.println("Enter the name of destination file");
		String dfile=null;
		try{
			dfile = keyboard.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		FileOutputStream destFile=null;
		try{
			destFile = new FileOutputStream(dfile);
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found");
			e.printStackTrace();
		}
		int tempVar=0;
		try{
			while((tempVar= sourceFile.read())!=-1){
				destFile.write(tempVar);
			
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			
			try{
				sourceFile.close();
				destFile.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String [] args){
		System.out.println("File Manager");
		System.out.println("1. List Contents of a Directory");
		System.out.println("2. Copy Files");
		System.out.println("3. Delete a File");
		System.out.println("4. Exit");
		System.out.println("Enter your choice");
		BufferedReader keyboard = new BufferedReader( new InputStreamReader( System.in));
		int choice=0;
		try{
			choice = Integer.parseInt(keyboard.readLine());
		}
		catch(IOException e){
			e.printStackTrace();
		}	
		FileManager obj = new FileManager();
		switch(choice){
			case 1:
				obj.listDirectoryContent();
				break;
			case 2:
				obj.fileCopy();
				break;
			case 3:
				obj.deleteFile();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
}