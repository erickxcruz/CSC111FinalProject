package pkgParkingReservation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Reservation {
	
	
	//customer index work in progress
	final int STDNTSIZE;
	int si; //student index
	Permit students[];
	int selstdnt; // student index
	
	
	Reservation()
	{
		STDNTSIZE = 3;
		students = new Permit[3];
		selstdnt = -1; // index of the customer logged in
		si = -1;
	}
	
	
	/****************************************Load Customers
	 * @throws FileNotFoundException **********************************/
	void loadAccounts() throws FileNotFoundException
	{

			//Working variables
			 FileReader acctfile = new FileReader("ReservationAccounts.dat");
			 Scanner fileReader = new Scanner(acctfile);
				//public Customer(int permitid, String fullname, String user, String password) {	
			 //create the variables for the file
			 short i = 0; 		//index for the array
			 int permitid = 0;
			 String fullname = "",  password = "";
			 String eachLine = "";
			 StringTokenizer st; 
			 
			 while (fileReader.hasNextLine()) //tests for the eof
			 {
				 eachLine = fileReader.nextLine();
				 st = new StringTokenizer(eachLine, ",");
				 while (st.hasMoreTokens()) 
				 	{ //remember the order of the text file
					 	permitid = Integer.parseInt(st.nextToken());
					 	fullname = st.nextToken();
					 	password= st.nextToken();
					 				 
					 	//add the students to the Array
					 	students[i] = new Permit(permitid, fullname,  password); 
					 	i++;
				 	}//end of reading one line
			 }//end of reading the file
			 fileReader.close();
			 
			 System.out.println("Accounts Loaded");
	} 
				
	/****************************************End of Load Customers***************************/
	
	
//Login
boolean login()
{		
		//Customer Variables
	boolean validchoice = false;
		
		char 	morecomps = 'x';

		//Working Variables
		Scanner scnr = new Scanner (System.in);
		int option = 0;
		int numatts = 0;
		int entuser = 0;
		String entpass = "";
		boolean validlogin = false;
		

		
		System.out.println("Parking Reservation by Rossetta Code");
		
		do
		{		System.out.print("Please enter your student id: ");
				entuser = scnr.nextInt();
				
				System.out.print("Please enter your password: ");
				entpass = scnr.next();
			
				for (int i =0; i < STDNTSIZE; i++)
				{	if (entuser == students[i].getPermitID() && entpass.equals(students[i].getPassword()))
					{	validlogin = true;
						si = i;
					}
			
				}
				if (!validlogin)
					System.out.println("Invalid login, try again ");
				numatts++;
		
		}while (numatts < 3 && !validlogin);

		
	return validlogin;
		
		}
//Login Ended



}
