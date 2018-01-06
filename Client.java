/**
 *  Adam Ely
 *  Project 3
 *  03/26/2015
 */
public class Client {
	
	//Declare variables for the information that the user will be entering
	private String name;
	private int lengthOfLawn;
	private int widthOfLawn;
	private int numberOfPayments;
	int lawnSize = 0;
	int twoPayments = 2;
	int totalServiceCharge = 0;
	int twoPaymentsServiceCharge = 5;
	int twentyPayments = 20;
	int twentyPaymentsServiceCharge = 3;
	double totalOfAllPayments = 0.00;
	int smallLawnSize = 400;
	int smallLawnCharge = 25;
	int largeLawnSize = 600;
	int mediumLawnCharge = 35;
	int largeLawnCharge = 50;
	double amountOfEachPayment = 0.00;
	int numberOfMowings = 20;
	
	
	//Set/Get methods for the variables
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLengthOfLawn() {
		return lengthOfLawn;
	}
	
	public void setLengthOfLawn(int lengthOfLawn) {
		this.lengthOfLawn = lengthOfLawn;
	}
	
	public int getWidthOfLawn() {
		return widthOfLawn;
	}
	
	public void setWidthOfLawn(int widthOfLawn) {
		this.widthOfLawn = widthOfLawn;
	}
	
	public int getNumberOfPayments() {
		return numberOfPayments;
	}
	
	public void setNumberOfPayments(int numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
	}
	
    public String display() {
        return "Client: " + getName();
    }
	
	public int calculateLawnSize() {
		return lawnSize = this.widthOfLawn * this.lengthOfLawn;
	}
	
    //This method will calculate the totalServiceCharge and return amountOfEachPayment
	public double calculateTotalOfAllPayments() {
		
		if(numberOfPayments == twoPayments)	{
			totalServiceCharge = twoPayments * twoPaymentsServiceCharge;
		} else if(numberOfPayments == twentyPayments) {
			totalServiceCharge = twentyPayments * twentyPaymentsServiceCharge;
		} else {
			totalServiceCharge = 0;
		}
		
		if(calculateLawnSize() < smallLawnSize) {
			totalOfAllPayments = ((double)smallLawnCharge) * numberOfMowings + totalServiceCharge;
		} else if(calculateLawnSize() >= smallLawnSize && calculateLawnSize() < largeLawnSize) {
			totalOfAllPayments = ((double)mediumLawnCharge) * numberOfMowings + totalServiceCharge;
		} else {
			totalOfAllPayments = ((double)largeLawnCharge) * numberOfMowings + totalServiceCharge;
		}
		
		return totalOfAllPayments;
	}
	
	//This method will calculate the amount of each payment
	public double calculateAmountOfEachPayment() {
		return amountOfEachPayment = ((double)calculateTotalOfAllPayments()) / numberOfPayments;
	}
	//This method is used to output the totals of entered by the user
	public void outputClientTotals() {
		System.out.println("Lawn Size: " + lawnSize + " sq. ft."
				+ "\nNumber of Payments: " + numberOfPayments
				+ "\nAmount of each payment: $" + amountOfEachPayment
				+ "\nTotal of all payments: $" + totalOfAllPayments);
	}
}