/**
 *  Adam Ely
 *  Project 3
 *  03/26/2015
 */
 public class TestClient {
	
	//Create instance variables
	public Client[] clients;
	private Client client;
	
	public void run() {
		
		//Create a new object for Client class
		clients = new Client[9];
	
		clients[0] = new Client();
		clients[1] = new Client();
		clients[2] = new Client();
		clients[3] = new Client();
		clients[4] = new Client();
		clients[5] = new Client();
		clients[6] = new Client();
		clients[7] = new Client();
		clients[8] = new Client();
		
		//Set the clients object equal to set methods
		clients[0].setName("Rick");
		clients[0].setLengthOfLawn(100);
		clients[0].setWidthOfLawn(100);
		clients[0].setNumberOfPayments(1);	
		
		clients[1].setName("Matt");
		clients[1].setLengthOfLawn(100);
		clients[1].setWidthOfLawn(100);
		clients[1].setNumberOfPayments(2);
		
		clients[2].setName("Ron");
		clients[2].setLengthOfLawn(100);
		clients[2].setWidthOfLawn(100);
		clients[2].setNumberOfPayments(20);
		
		clients[3].setName("Sarah");
		clients[3].setLengthOfLawn(25);
		clients[3].setWidthOfLawn(16);
		clients[3].setNumberOfPayments(1);
		
		clients[4].setName("Frank");
		clients[4].setLengthOfLawn(25);
		clients[4].setWidthOfLawn(16);
		clients[4].setNumberOfPayments(2);
		
		clients[5].setName("Clark");
		clients[5].setLengthOfLawn(25);
		clients[5].setWidthOfLawn(16);
		clients[5].setNumberOfPayments(20);
		
		clients[6].setName("Ashley");
		clients[6].setLengthOfLawn(21);
		clients[6].setWidthOfLawn(19);
		clients[6].setNumberOfPayments(1);
		
		clients[7].setName("Morgan");
		clients[7].setLengthOfLawn(21);
		clients[7].setWidthOfLawn(19);
		clients[7].setNumberOfPayments(2);
		
		clients[8].setName("Morgan");
		clients[8].setLengthOfLawn(21);
		clients[8].setWidthOfLawn(19);
		clients[8].setNumberOfPayments(20);
		
		//If/else statements that test the calculation methods inside of the Client class
		//Client 1
		System.out.println("This is client 1:");
		if(clients[0].calculateAmountOfEachPayment() == 1000) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
		System.out.println();
		//Client 2
		System.out.println("This is client 2:");
		if(clients[1].calculateAmountOfEachPayment() == 505) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
		System.out.println();	
		//Client 3
		System.out.println("This is client 3:");
		if(clients[2].calculateAmountOfEachPayment() == 53) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
		System.out.println();
		//Client 4
		System.out.println("This is client 4:");
		if(clients[3].calculateAmountOfEachPayment() == 700) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
		System.out.println();
		//Client 5
		System.out.println("This is client 5:");
		if(clients[4].calculateAmountOfEachPayment() == 355) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
		System.out.println();
		//Client 6
		System.out.println("This is client 6:");
		if(clients[5].calculateAmountOfEachPayment() == 38) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
		System.out.println();	
		//Client 7
		System.out.println("This is client 7:");
		if(clients[6].calculateAmountOfEachPayment() == 500) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
		System.out.println();
		//Client 8
		System.out.println("This is client 8:");
		if(clients[7].calculateAmountOfEachPayment() == 255) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
		System.out.println();	
		//Client 9
		System.out.println("This is client 9:");
		if(clients[8].calculateAmountOfEachPayment() == 28) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
		System.out.println();			
	}
 }
