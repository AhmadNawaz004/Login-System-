import java.util.Random;
import java.util.Scanner;

public class Soduku
{
	public static void main(String []args)
	{
	
		Scanner in=new Scanner(System.in);
		String s[][]=new String[1][2];
		String r[][]=new String[1][2];
		boolean a = false,b = false,c = false,d = false,e,f = false,g=true;
		System.out.println("Sign up");
		System.out.print("Enter user name:");
		s[0][0]=in.nextLine();
		while(g==true){
		System.out.print("Enter the password:");
		s[0][1]=in.nextLine();
		for(int i=0;i<s[0][1].length();i++){
			 char w=s[0][1].charAt(i);
			    a=Character.isLowerCase(w);
				b=Character.isUpperCase(w);
				e=Character.isDigit(w);
				if(a)
					c=true;
				if(b)
					d=true;
				if(e)
					f=true;
				
			}
			if(s[0][0].equalsIgnoreCase(s[0][1])){
				System.out.println("User name and password can not be same.\n");
			}
			else if(s[0][1].length()<8&&s[0][1].length()>20){
				System.out.println("Invalid password. Password must contain minimum 8 characters and maximum 20 charcter.\n");}
			else if(c&&d&&f){
				System.out.println("Password Accepted!!");
				g=false;
			}
			else{
				System.out.println("Invalid password. Your password must contain a upper case, lower case and a digit.\n");
			}}
		System.out.println("\n\n	LOG IN");
		System.out.print("Enter your user name:");
		r[0][0]=in.nextLine();
		System.out.print("Enter your the password:");
		r[0][1]=in.nextLine();
		int counter=0;
		while(g==false^counter==2){
			if(s[0][1].equals(r[0][1])&&s[0][0].equals(r[0][0])){
				g=true;}
			else{
				counter++;
			System.out.println("Invalid Username or Password.\nPlease try again.");
			System.out.print("Enter your user name:");
			r[0][0]=in.nextLine();
			System.out.print("Enter your the password:");
			r[0][1]=in.nextLine();
			}	
			}
		if(counter==2){
			System.out.println("You have tried too many wrong attempts.");
		}else if(g==true){
			int i=0;
			String q[][]=new String[8][10];
			String h[]={"A","C","A","D","B","B","A","C","D","A"};
			int count[]=new int[8];
			for(i=0;i<8;i++){
				System.out.printf("Enter the answers of Student %d:",i);
			for(int j=0;j<10;j++){
				q[i][j]=in.next();
			}}
			for(i=0;i<8;i++){
			for(int j=0;j<10;j++){
				if(q[i][j].equalsIgnoreCase(h[j])){
				count[i]++;}
			}
			System.out.printf("Correct answers of %d Student are:"+count[i]+"\n",i);
			}
		}
	}
	}