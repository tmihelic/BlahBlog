import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class login{

 public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter Username: ");
String username = input.nextLine();
System.out.print("Enter Password: ");
String password = input.nextLine();

System.out.print("Your Username: " + username + '\n');
System.out.println("Your Password: " + password);

//FileInputStream fis = new FileInputStream("login.blah");
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String s = username + " " + password;

System.out.print(s);
s = br.readLine();

}

return username;
}

/*
class  file
{
public static void main(String arg[])throws Exception
{
FileInputStream fis=new	FileInputStream("a.txt");

String s;
char ch;
int i,j,exit=0,flag=0;
boolean x=true;
System.out.println("Enter the	string to be found");
s=br.readLine();
while(x)
{
j=0;
for(i=0;i<s.length();i++)
{
ch=((char)fis.read());
if(ch==-1)
{
exit=1;
System.out.println(exit+"for");
break;
}
if(ch==s.charAt(i))
{
j++;
}
}
if(exit==1)
{
System.out.println(exit+"while");
break;
}
if(j==s.length())
{
flag=1;
System.out.println("Success");
break;
}
}
if(flag==1)
System.out.println("The	string is found");
else
System.out.println("The	string is not found");
}
}
*/	
