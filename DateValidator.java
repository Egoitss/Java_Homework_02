import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ievadiet datumu: ");
		int date = sc.nextInt();
		System.out.print("Ievadiet mçnesi: ");
		int month = sc.nextInt();
		System.out.print("Ievadiet gadu: ");
		int year = sc.nextInt();
		sc.close();
		String[] allMonth = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };

		int leapYear = (year % 100) % 4;

		if (month > 12 || month < 1) {
			System.out.println("Ievadîti nepareizi dati 1!");

		} else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
				|| month == 12) && (date <= 0 || date >= 32)) {
			System.out.println("Ievadîti nepareizi dati 2!");

		}else if ((month == 4 || month == 6 || month == 9 || month == 11) && (date < 1 || date > 30)) {
			System.out.println("Ievadîti nepareizi dati 3!");

		}else if (month == 2 && leapYear == 0 && (date >= 30 || date <= 0)) {
			System.out.println("Ievadîti nepareizi dati 4!");

		} else if (month == 2 && leapYear != 0 && (date >= 29 || date <= 0)) {
			System.out.println("Ievadîti nepareizi dati 5!");
		} else {
			System.out.print(date);
			System.out.print(" B " + allMonth[month - 1]);
			System.out.print(" " + year);
		}

	}

}
