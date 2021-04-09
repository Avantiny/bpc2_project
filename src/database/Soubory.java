
package database;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Soubory {
	public Soubory() {

	}

	public void zapsatTech(ArrayList<StudentTech> string, String jmeno) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubory.txt", true))) {

			bw.newLine();
			bw.newLine();
			bw.write(jmeno);
			bw.newLine();
			bw.newLine();

			for (StudentTech s : string) {
				bw.write(s.toString());
				bw.newLine();
			}

			bw.newLine();
			bw.newLine();
			bw.close();

		} catch (Exception e) {
			System.err.println("Do souboru se nepovedlo zapsat.");
		}
	}

	public void zapsatHum(ArrayList<StudentHum> string, String jmeno) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubory.txt", true))) {

			bw.newLine();
			bw.newLine();
			bw.write(jmeno);
			bw.newLine();
			bw.newLine();

			for (StudentHum s : string) {
				bw.write(s.toString());
				bw.newLine();
			}

			bw.newLine();
			bw.newLine();
			bw.close();

		} catch (Exception e) {
			System.err.println("Do souboru se nepovedlo zapsat.");
		}
	}

	public void zapsatKomb(ArrayList<StudentKomb> string, String jmeno) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubory.txt", true))) {

			bw.newLine();
			bw.newLine();
			bw.write(jmeno);
			bw.newLine();
			bw.newLine();

			for (StudentKomb s : string) {
				bw.write(s.toString());
				bw.newLine();
			}

			bw.newLine();
			bw.newLine();
			bw.close();

		} catch (Exception e) {
			System.err.println("Do souboru se nepovedlo zapsat.");
		}
	}

}
