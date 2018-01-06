import java.util.*;
/**
 *  Adam Ely
 *  Project 3
 *  03/26/2015
 */
 public class ProcessClient {
	
	//Create instance variables for this class
	private InputHelper input;
	private ArrayList<Client> clients;
	Client aClient = new Client();
	
	String name = "";
	String moreClients = "";
	String lengthOfLawnString = "";
	String widthOfLawnString = "";
	String numberOfPaymentsString = "";
	int numberOfPayments = 0;
	int lengthOfLawn = 0;
	int widthOfLawn = 0;
	int totalNumberOfClients = 0;
	int totalSquareFootage = 0;
	double totalSummerRevenue = 0.00;
	
	//Call the methods that will be in the run method 
	public void run() {
		clientDataEntry();
		displayClientInfo();
		System.out.println("Total Number of clients: " + totalNumberOfClients);
		displayEndOfSummerReport();	
	}
	
	public void clientDataEntry() {
		
		//Create a new arraylist for the Client class
		clients = new ArrayList<Client>();
		input = new InputHelper();
	
		Client newClient = null;
		
		//This loop will prompt the user to enter information and won't stop until the user enters Y or y
		while(true) {
			name = input.getUserInput("Enter clients name:");
			lengthOfLawnString = input.getUserInput("Enter the length of the clients lawn in feet:");
			lengthOfLawn = Integer.parseInt(lengthOfLawnString);
			widthOfLawnString = input.getUserInput("Enter the width of the clients lawn in feet:");
			widthOfLawn = Integer.parseInt(widthOfLawnString);
			numberOfPaymentsString = input.getUserInput("Enter number of payments (1, 2, or 20 payments):");
			numberOfPayments = Integer.parseInt(numberOfPaymentsString);
			newClient = new Client();			
			newClient.setName(name);
			newClient.setLengthOfLawn(lengthOfLawn);
			newClient.setWidthOfLawn(widthOfLawn);
			newClient.setNumberOfPayments(numberOfPayments);
			clients.add(newClient);
			totalNumberOfClients ++;			
            moreClients = input.getUserInput(
                    "Would you like to enter another? (Y or y for yes and N or n for no)");
            if (!moreClients.equals("y")) {
                if(moreClients.equals("Y")) {
					moreClients.equals("y");
				}
				break;
            }
			System.out.println();
		}
	}

	//This methed is used to loop through the array list, calculate client totals and output
	public void displayClientInfo() {
 
        Client  client  = null;
        for (int i = 0; i < clients.size(); i++) {
            client = (Client) clients.get(i);
			System.out.println();
            System.out.println(client.display());
			client.calculateLawnSize();
			client.calculateTotalOfAllPayments();
			client.calculateAmountOfEachPayment();
			client.outputClientTotals();
            System.out.println();
        }
    }
	
	public void displayEndOfSummerReport() {
        Client  client  = null;
        for (int i = 0; i < clients.size(); i++) {
            client = (Client) clients.get(i);
			totalSquareFootage += client.calculateLawnSize();
			totalSummerRevenue +=  client.calculateTotalOfAllPayments();
		}
		System.out.println("Total Square feet of mowing: " + totalSquareFootage);	
		System.out.println("Total Revenue for the summer: " + totalSummerRevenue);
	}
 }