
package database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Database {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Data data = new Data();
		Soubory file = new Soubory();

		boolean loop = true;
		boolean loopMesic = true;
		boolean loopDen = true;
		boolean loopZnamka = true;
		int volba;
		int rok = 0;
		int index = 0;
		int den = 0;
		int mesic = 0;
		int znamka = 0;

		String jmeno;
		String prijmeni;
		String tech = "Technický obor: ";
		String hum = "Humanitní obor: ";
		String komb = "Kombinovaný obor: ";

		while (loop) {
			System.out.println("");
			System.out.println("1. Přidání studenta technického oboru");
			System.out.println("2. Přidání studenta humanitárního oboru");
			System.out.println("3. Přidání studenta kombinovaného oboru");
			System.out.println("4. Seznam studentů technického oboru");
			System.out.println("5. Seznam studentů humanitárního oboru");
			System.out.println("6. Seznam studentů kombinovaného oboru");
			System.out.println("7. Uložení do txt souboru");
			System.out.println("8. Nalezení studenta podle ID");
			System.out.println("9. Smazání studenta technického oboru podle ID");
			System.out.println("10. Smazání studenta humanitárního oboru podle ID");
			System.out.println("11. Smazání studenta kombinovaného oboru podle ID");
			System.out.println("12. Celkový počet studentů oboru");
			System.out.println("13. Přidání známky");
			System.out.println("14. Průměr známek technického oboru");
			System.out.println("15. Průměr známek humanitního oboru");
			System.out.println("16. Konec");
			System.out.println("");
			System.out.println("Volba:");

			volba = sc.nextInt();
			try {
				switch (volba) {
				case 1:

					System.out.println("");
					System.out.println("Zadej jméno:");
					jmeno = sc.next();
					System.out.println("Zadej příjmení");
					prijmeni = sc.next();
					System.out.println("Zadej rok narození");
					rok = sc.nextInt();
					System.out.println("Zadej měsíc narození");

					if (!loopMesic) {
						loopMesic = true;
					}

					while (loopMesic) {
						mesic = sc.nextInt();
						if (mesic > 0 && mesic < 13) {
							loopMesic = false;
						} else {
							System.out.println("Zadal jste měsíc špatně, zkuste to znovu:");
						}
					}

					System.out.println("Zadej den narození:");

					if (!loopDen) {
						loopDen = true;
					}

					while (loopDen) {
						den = sc.nextInt();
						if (mesic == 1 || mesic == 3 || mesic == 5 || mesic == 7 || mesic == 8 || mesic == 10
								|| mesic == 12) {
							if (den > 0 && den < 32) {
								loopDen = false;

							} else {
								System.out.println("Zadal jste den špatně, zkuste to znovu");
							}
						}
						if (mesic == 4 || mesic == 6 || mesic == 9 || mesic == 11) {
							if (den > 0 && den < 31) {
								loopDen = false;

							} else {
								System.out.println("Zadal jste den špatně, zkuste to znovu");
							}
						}
						if (mesic == 2) {
							if (den > 1 && den < 30) {
								loopDen = false;

							} else {
								System.out.println("Zadal jste den špatně, zkuste to znovu");
							}
						}

					}

					StudentTech studentTech = new StudentTech(jmeno, prijmeni, rok, mesic, den);
					studentTech.setPrechodnyRok();

					studentTech.setID(data.getFinalSize() + 1);
					System.out.println(studentTech.getID());

					System.out.println("Přechodný rok?");
					System.out.println(studentTech.getPrechodnyRok());
					System.out.println("");

					data.addStudentTech(studentTech);
					data.setStudentTechSize();
					System.out.println(data.getStudentTechSize());
					System.out.println("");

					break;
				case 2:

					System.out.println("");
					System.out.println("Zadej jméno:");
					jmeno = sc.next();
					System.out.println("Zadej příjmení");
					prijmeni = sc.next();
					System.out.println("Zadej rok narození");
					rok = sc.nextInt();
					System.out.println("Zadej měsíc narození");

					if (!loopMesic) {
						loopMesic = true;
					}

					while (loopMesic) {
						mesic = sc.nextInt();
						if (mesic > 0 && mesic < 13) {
							loopMesic = false;
						} else {
							System.out.println("Zadal jste měsíc špatně, zkuste to znovu:");
						}
					}

					System.out.println("Zadej den narození:");

					if (!loopDen) {
						loopDen = true;
					}

					while (loopDen) {
						den = sc.nextInt();
						if (mesic == 1 || mesic == 3 || mesic == 5 || mesic == 7 || mesic == 8 || mesic == 10
								|| mesic == 12) {
							if (den > 0 && den < 32) {
								loopDen = false;

							} else {
								System.out.println("Zadal jste den špatně, zkuste to znovu");
							}
						}
						if (mesic == 4 || mesic == 6 || mesic == 9 || mesic == 11) {
							if (den > 0 && den < 31) {
								loopDen = false;

							} else {
								System.out.println("Zadal jste den špatně, zkuste to znovu");
							}
						}
						if (mesic == 2) {
							if (den > 1 && den < 30) {
								loopDen = false;

							} else {
								System.out.println("Zadal jste den špatně, zkuste to znovu");
							}
						}

					}

					StudentHum studentHum = new StudentHum(jmeno, prijmeni, rok, mesic, den);
					studentHum.setZnameni();

					studentHum.setID(data.getFinalSize() + 1);
					System.out.println(studentHum.getID());

					System.out.println("Znamení?");
					System.out.println(studentHum.getZnameni());
					System.out.println("");

					data.addStudentHum(studentHum);
					data.setStudentHumSize();
					System.out.println(data.getStudentHumSize());
					System.out.println("");

					break;
				case 3:

					System.out.println("");
					System.out.println("Zadej jméno:");
					jmeno = sc.next();
					System.out.println("Zadej příjmení");
					prijmeni = sc.next();
					System.out.println("Zadej rok narození");
					rok = sc.nextInt();
					System.out.println("Zadej měsíc narození");

					if (!loopMesic) {
						loopMesic = true;
					}

					while (loopMesic) {
						mesic = sc.nextInt();
						if (mesic > 0 && mesic < 13) {
							loopMesic = false;
						} else {
							System.out.println("Zadal jste měsíc špatně, zkuste to znovu:");
						}
					}

					System.out.println("Zadej den narození:");

					if (!loopDen) {
						loopDen = true;
					}

					while (loopDen) {
						den = sc.nextInt();
						if (mesic == 1 || mesic == 3 || mesic == 5 || mesic == 7 || mesic == 8 || mesic == 10
								|| mesic == 12) {
							if (den > 0 && den < 32) {
								loopDen = false;

							} else {
								System.out.println("Zadal jste den špatně, zkuste to znovu");
							}
						}
						if (mesic == 4 || mesic == 6 || mesic == 9 || mesic == 11) {
							if (den > 0 && den < 31) {
								loopDen = false;

							} else {
								System.out.println("Zadal jste den špatně, zkuste to znovu");
							}
						}
						if (mesic == 2) {
							if (den > 1 && den < 30) {
								loopDen = false;

							} else {
								System.out.println("Zadal jste den špatně, zkuste to znovu");
							}
						}

					}

					StudentKomb studentKomb = new StudentKomb(jmeno, prijmeni, rok, mesic, den);
					studentKomb.setZnameni();
					studentKomb.setPrechodnyRok();

					studentKomb.setID(data.getFinalSize() + 1);
					System.out.println(studentKomb.getID());

					System.out.println("Přechodný rok?");
					System.out.println(studentKomb.getPrechodnyRok());
					System.out.println("");

					System.out.println("Znamení?");
					System.out.println(studentKomb.getZnameni());
					System.out.println("");

					data.addStudentKomb(studentKomb);
					data.setStudentKombSize();
					System.out.println(data.getStudentKombSize());
					System.out.println("");

					break;

				case 4:
					data.vypisStudentTech();
					break;
				case 5:
					data.vypisStudentHum();
					break;
				case 6:
					data.vypisStudentKomb();
					break;
				case 7:
					file.zapsatTech(data.getStudentTech(), tech);
					file.zapsatHum(data.getStudentHum(), hum);
					file.zapsatKomb(data.getStudentKomb(), komb);
					break;
				case 8:
					System.out.println("");
					System.out.println("Zadej index: ");
					index = sc.nextInt();
					data.getIndex(index);
					break;
				case 9:
					System.out.println("");
					System.out.println("Zadej index: ");
					index = sc.nextInt();
					data.deleteTech(index);
					break;
				case 10:
					System.out.println("");
					System.out.println("Zadej index: ");
					index = sc.nextInt();
					data.deleteHum(index);
					break;
				case 11:
					System.out.println("");
					System.out.println("Zadej index: ");
					index = sc.nextInt();
					data.deleteKomb(index);
					break;
				case 12:
					System.out.println("");
					System.out.println("Celkový počet studentů technického oboru:");
					System.out.println(data.getStudentTechSize());
					System.out.println("");
					System.out.println("Celkový počet studentů humanitního oboru:");
					System.out.println(data.getStudentHumSize());
					System.out.println("");
					System.out.println("Celkový počet studentů kombinovaného oboru:");
					System.out.println(data.getStudentKombSize());
					System.out.println("");
					break;
				case 13:

					System.out.println("");
					System.out.println("Zadejte index: ");
					index = sc.nextInt();
					System.out.println("Zadejte znamku: ");
					if (!loopZnamka) {
						loopZnamka = true;
					}

					while (loopZnamka) {
						znamka = sc.nextInt();
						if (znamka > 0 && znamka < 6) {
							loopZnamka = false;
						} else {
							System.out.println("Zadal jste známku špatně, zkuste to znovu:");
						}
					}

					data.znamka(index, znamka);
					break;
				case 14:
					System.out.println("Celkový průměr technického oboru " + data.prumerDohromadyTech());
					break;
				case 15:
					System.out.println("Celkový průměr humanitního oboru " + data.prumerDohromadyHum());
					break;
				case 16:
					System.out.println("Tož zatím!");
					loop = false;
					break;
				}

			} catch (InputMismatchException e) {
				System.err.println("Špatná volba datového typu:");
				sc.next();
			}
		}

	}
}
