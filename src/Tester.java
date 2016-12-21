import java.io.*;
import java.util.*;
import java.text.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		ArrayList<BankAccount> aryList = new ArrayList<BankAccount>();

		do {
			Scanner kbReader = new Scanner(System.in);
			System.out.println("Please enter the name to whom the account belongs. (\"Exit\") to abort");
			name = kbReader.nextLine();

			if (!name.equalsIgnoreCase("EXIT")) {
				System.out.println("Please enter the amount of the deposit.");

				Double amount = kbReader.nextDouble();
				System.out.println(" ");

				aryList.add(new BankAccount(name, amount));
			}
		} while (!name.equalsIgnoreCase("EXIT"));

		BankAccount ba = aryList.get(0);
		double maxBalance = ba.balance;
		String maxName = ba.name;

		for (int j = 1; j < aryList.size(); j++) {
			BankAccount ab = aryList.get(j);
			if (ab.balance > maxBalance) {
				maxBalance = ab.balance;
				maxName = ab.name;
			} else {
				continue;
			}
		}
		System.out.println("The biggest account holder is " + maxName + " with $" + maxBalance);
	}

}
