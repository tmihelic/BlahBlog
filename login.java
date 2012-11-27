import java.util.Scanner;
import java.io.*;

public class login{
 
 //needs to be commented out 
 //(added to run on own)
 public static void main(String[] args) throws Exception{

		Scanner input = new Scanner(System.in);


		System.out.print("Enter Username: ");
		String username = input.nextLine();
		System.out.print("Enter Password: ");
		String password = input.nextLine();
		//combines username and password into a single string
		String s = username + " " + password;


		try{
			//selects file login.txt to be read
   //(need to change name of file)
			FileReader file1 = new FileReader(new File("/Users/hawaiian242/Documents/CPSC-330/login.txt"));
			//reads file
			BufferedReader f = new BufferedReader(file1);
			//creates temp string file to save each line read
			String temp;
			Boolean found = false;

			while((temp=f.readLine())!=null && found == false)
			{
				if(temp.equals(s))
				{
					System.out.println("It Worked");
					found = true;
				}
			}
		}
		catch(Exception e)
		{System.out.println("Error Reading Login file");}
	}
 //(return statement needs to be uncommented out)
	//return username;
}
