package langpackage;

import java.util.Scanner;

public class Kundali {
	public static int twoDigit(int a) {
		String a1 = String.valueOf(a);
		String a2[] = a1.split("");
		int sum = 0;
		if (a2.length > 1) {
			for (String arr : a2) {
				sum += Integer.parseInt(arr);
			}
			if (String.valueOf(sum).length() > 1) {
				return twoDigit(sum);
			}
			return sum;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB in \"DDMMYYYY\" format");
		String date = sc.nextLine();
		String adDate[] = date.split("");
		int gudank = 0;
		for (String a : adDate) {
			gudank += Integer.parseInt(a);
		}
		int conductor = twoDigit(gudank);
		int driver = twoDigit(Integer.parseInt(adDate[0]) + Integer.parseInt(adDate[1]));
		System.out.println("Conductor :- " + conductor);
		System.out.println("Driver :- " + driver);
		String total = conductor + "" + driver + date;
		System.out.println("Total :- " + total);
		System.out.println();
		String surya1 = "Surya missing";
		String chand2 = "Chandra missing";
		String guru3 = "Guru missing";
		String rahu4 = "Raahu missing";
		String budh5 = "Budh missing";
		String sukra6 = "Sukra missing";
		String ketu7 = "Ketu missing";
		String sani8 = "Shani missing";
		String mangal9 = "Mangal missing";
		for (String a : total.split("")) {
			int number = Integer.parseInt(a);
			switch (number) {
			case 1:
				surya1 = (surya1.equals("Surya missing")) ? "Surya" + " " + number : surya1 + "," + number;
				break;
			case 2:
				chand2 = (chand2.equals("Chandra missing")) ? "Chandra" + " " + number : chand2 + "," + number;
				break;
			case 3:
				guru3 = (guru3.equals("Guru missing")) ? "Guru" + " " + number : guru3 + "," + number;
				break;
			case 4:
				rahu4 = (rahu4.equals("Raahu missing")) ? "Raahu" + " " + number : rahu4 + "," + number;
				break;
			case 5:
				budh5 = (budh5.equals("Budh missing")) ? "Budh" + " " + number : budh5 + "," + number;
				break;
			case 6:
				sukra6 = (sukra6.equals("Sukra missing")) ? "Sukra" + " " + number : sukra6 + "," + number;
				break;
			case 7:
				ketu7 = (ketu7.equals("Ketu missing")) ? "Ketu" + " " + number : ketu7 + "," + number;
				break;
			case 8:
				sani8 = (sani8.equals("Shani missing")) ? "Sani" + " " + number : sani8 + "," + number;
				break;
			case 9:
				mangal9 = (mangal9.equals("Mangal missing")) ? "Mangal" + " " + number : mangal9 + "," + number;
				break;
//			default:
//				 Zero
			}
		}
		System.out.print(rahu4 + "\t");
		System.out.print("|");
		System.out.print(mangal9 + "\t");
		System.out.print("|");
		System.out.println(chand2);
		System.out.println("----------------------------------------------");
		System.out.print(guru3 + "\t");
		System.out.print("|");
		System.out.print(budh5 + "\t");
		System.out.print("|");
		System.out.println(ketu7);
		System.out.println("----------------------------------------------");
		System.out.print(sani8 + "\t");
		System.out.print("|");
		System.out.print(surya1 + "\t");
		System.out.print("|");
		System.out.println(sukra6);
	}
}

