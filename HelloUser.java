import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ievadiet lûdzu savu vârdu un uzvârdu: ");
		String name = sc.nextLine();
		sc.close();
		name = name.trim();
		String[] nameSplit = name.split("\\s+");

		int namesCount = 1;
		for (int i = 0; i <= name.length() - 1; i++) {
			if ((name.charAt(i) == ' ') && (name.charAt(i + 1) != ' ')) {
				namesCount++;
			}
		}
		String firstNameLetter = "";
		String firstNameSecondPart = "";
		String fstSurname = "";
		String scndSurname = "";
		String mistake = "";
		if (namesCount <= 1 || namesCount > 3) {
			mistake = "Kïûda!!!";

		} else if (namesCount == 2) {
			String part = nameSplit[0];
			String letterOne = part.substring(0, 1);
			firstNameLetter = letterOne.toUpperCase();
			firstNameSecondPart = part.substring(1);
			firstNameSecondPart = firstNameSecondPart.toLowerCase(); 

			String surname = nameSplit[1];
			fstSurname = surname.toUpperCase();

		} else {
			String parts = nameSplit[0];
			String letterOne = parts.substring(0, 1);
			firstNameLetter = letterOne.toUpperCase();
			firstNameSecondPart = parts.substring(1);
			firstNameSecondPart = firstNameSecondPart.toLowerCase(); 
			
			String surnemeOne = nameSplit[1];
			fstSurname = surnemeOne.toUpperCase();

			String surnameTwo = nameSplit[2];
			scndSurname = surnameTwo.toUpperCase();

		}
		if (namesCount <= 1 || namesCount > 3) {
			System.err.println(mistake);
		} else if (namesCount == 2) {
			System.out.println("Vârds: '" + firstNameLetter + firstNameSecondPart + "'");
			System.out.println("Uzvârds: '" + fstSurname + "'");
		} else {
			System.out.println("Vârds: '" + firstNameLetter + firstNameSecondPart + "'");
			System.out.println("Uzvârds: '" + fstSurname + "'");
			System.out.println("Uzvârds: '" + scndSurname + "'");
		}
	}
}