
package database;

public class StudentTech extends Student {

	private String prechodnyRok;

	public StudentTech(String jmeno, String prijmeni, int rokNarozeni, int mesicNarozeni, int denNarozeni) {
		super(jmeno, prijmeni, rokNarozeni, mesicNarozeni, denNarozeni);
	}

	public String getPrechodnyRok() {
		return prechodnyRok;
	}

	public void setPrechodnyRok() {
		if (rokNarozeni % 4 == 0) {
			if (rokNarozeni % 100 == 0) {
				if (rokNarozeni % 400 == 0) {
					this.prechodnyRok = "je přestupný";
				}
				this.prechodnyRok = "je nepřestupný";
			}
			this.prechodnyRok = "je přestupný";
		} else {
			this.prechodnyRok = "je nepřestupný";
		}

	}

	public String toString() {
		return "Index: " + ID + " " + jmeno + " " + prijmeni + " " + denNarozeni + "." + mesicNarozeni + "."
				+ rokNarozeni + ". Jeho ročník " + prechodnyRok + ". Jeho průměr: " + prumer;
	}

}
