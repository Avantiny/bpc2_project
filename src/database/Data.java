
package database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Data {

	ArrayList<StudentTech> studentTech;
	ArrayList<StudentHum> studentHum;
	ArrayList<StudentKomb> studentKomb;

	public ArrayList<StudentTech> getStudentTech() {
		return studentTech;
	}

	public ArrayList<StudentHum> getStudentHum() {
		return studentHum;
	}

	public ArrayList<StudentKomb> getStudentKomb() {
		return studentKomb;
	}

	private int studentTechSize = 0;
	private int studentHumSize = 0;
	private int studentKombSize = 0;

	public Data() {
		this.studentTech = new ArrayList<>();
		this.studentHum = new ArrayList<>();
		this.studentKomb = new ArrayList<>();
	}

	public int getStudentTechSize() {
		return studentTechSize;
	}

	public void setStudentTechSize() {
		this.studentTechSize = studentTech.size();
	}

	public int getStudentHumSize() {
		return studentHumSize;
	}

	public void setStudentHumSize() {
		this.studentHumSize = studentHum.size();
	}

	public int getStudentKombSize() {
		return studentKombSize;
	}

	public void setStudentKombSize() {
		this.studentKombSize = studentKomb.size();
	}

	public void addStudentTech(StudentTech tech) {
		studentTech.add(tech);
	}

	public void addStudentHum(StudentHum hum) {
		studentHum.add(hum);
	}

	public void addStudentKomb(StudentKomb komb) {
		studentKomb.add(komb);
	}

	public int getFinalSize() {
		return this.studentHumSize + this.studentKombSize + this.studentTechSize;
	}

	public void vypisStudentTech() {
		System.out.println("");
		System.out.println("Výpis studentů technického oboru:");
		System.out.println("");
		Collections.sort(studentTech, Comparator.comparing(Student::getPrijmeni));
		for (int i = 0; i < studentTech.size(); i++) {
			System.out.println(studentTech.get(i).toString());
		}
	}

	public void vypisStudentHum() {
		System.out.println("");
		System.out.println("Výpis studentů humanitárního oboru:");
		System.out.println("");
		Collections.sort(studentHum, Comparator.comparing(Student::getPrijmeni));
		for (int i = 0; i < studentHum.size(); i++) {
			System.out.println(studentHum.get(i).toString());
		}
	}

	public void vypisStudentKomb() {
		System.out.println("");
		System.out.println("Výpis studentů kombinovaného oboru:");
		System.out.println("");
		Collections.sort(studentKomb, Comparator.comparing(Student::getPrijmeni));
		for (int i = 0; i < studentKomb.size(); i++) {
			System.out.println(studentKomb.get(i).toString());
		}
	}

	public void getIndex(int index) {

		for (StudentTech s : studentTech) {
			if (index == s.getID()) {
				System.out.println(s);
			}
		}
		for (StudentHum s : studentHum) {
			if (index == s.getID()) {
				System.out.println(s);
			}
		}
		for (StudentKomb s : studentKomb) {
			if (index == s.getID()) {
				System.out.println(s);
			}
		}

	}

	public int removeIndex(int index) {

		int indexis = 0;

		for (StudentTech s : studentTech) {
			if (index == s.getID()) {
				indexis = studentTech.indexOf(s);
			}
		}
		for (StudentHum s : studentHum) {
			if (index == s.getID()) {
				indexis = studentHum.indexOf(s);
			}
		}
		for (StudentKomb s : studentKomb) {
			if (index == s.getID()) {
				indexis = studentKomb.indexOf(s);
			}
		}

		return indexis;

	}

	public double prumerDohromadyTech() {

		double dohromady = 0;
		double pocetZnamek = 0;

		for (StudentTech s : studentTech) {
			dohromady += s.znamkaSum();
		}

		for (StudentTech s : studentTech) {
			pocetZnamek += s.znamka.size();
		}

		return dohromady / pocetZnamek;
	}

	public double prumerDohromadyHum() {

		double dohromady = 0;
		double pocetZnamek = 0;

		for (StudentHum s : studentHum) {
			dohromady += s.znamkaSum();
		}

		for (StudentHum s : studentHum) {
			pocetZnamek += s.znamka.size();
		}

		return dohromady / pocetZnamek;
	}

	public void znamka(int index, int znamka) {

		for (StudentTech s : studentTech) {
			if (index == s.getID()) {
				s.setZnamka(znamka);
			}
		}
		for (StudentHum s : studentHum) {
			if (index == s.getID()) {
				s.setZnamka(znamka);
			}
		}
		for (StudentKomb s : studentKomb) {
			if (index == s.getID()) {
				s.setZnamka(znamka);
			}
		}
	}

	public void deleteTech(int id) {

		int index = removeIndex(id);
		studentTech.remove(index);
	}

	public void deleteHum(int id) {

		int index = removeIndex(id);
		studentHum.remove(index);
	}

	public void deleteKomb(int id) {

		int index = removeIndex(id);
		studentKomb.remove(index);
	}

}
