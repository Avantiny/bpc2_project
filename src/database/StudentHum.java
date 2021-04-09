
package database;

public class StudentHum extends Student {

	private String znameni;

	public StudentHum(String jmeno, String prijmeni, int rokNarozeni, int mesicNarozeni, int denNarozeni) {
		super(jmeno, prijmeni, rokNarozeni, mesicNarozeni, denNarozeni);
	}

	public String getZnameni() {
		return znameni;
	}

	public void setZnameni() {
		switch (mesicNarozeni) {
		case 1:
			if (denNarozeni < 21) {
				this.znameni = "Kozoroh";
			} else {
				this.znameni = "Vodnář";
			}
			break;
		case 2:
			if (denNarozeni < 21) {
				this.znameni = "Vodnář";
			} else {
				this.znameni = "Ryby";
			}
			break;
		case 3:
			if (denNarozeni < 21) {
				this.znameni = "Ryby";
			} else {
				this.znameni = "Beran";
			}
			break;
		case 4:
			if (denNarozeni < 21) {
				this.znameni = "Beran";
			} else {
				this.znameni = "Býk";
			}
			break;
		case 5:
			if (denNarozeni < 22) {
				this.znameni = "Býk";
			} else {
				this.znameni = "Blíženec";
			}
			break;
		case 6:
			if (denNarozeni < 22) {
				this.znameni = "Blíženec";
			} else {
				this.znameni = "Rak";
			}
			break;
		case 7:
			if (denNarozeni < 23) {
				this.znameni = "Rak";
			} else {
				this.znameni = "Lev";
			}
			break;
		case 8:
			if (denNarozeni < 23) {
				this.znameni = "Lev";
			} else {
				this.znameni = "Panna";
			}
			break;
		case 9:
			if (denNarozeni < 23) {
				this.znameni = "Panna";
			} else {
				this.znameni = "Váhy";
			}
			break;
		case 10:
			if (denNarozeni < 24) {
				this.znameni = "Váhy";
			} else {
				this.znameni = "Štír";
			}
			break;
		case 11:
			if (denNarozeni < 23) {
				this.znameni = "Štír";
			} else {
				this.znameni = "Střelec";
			}
			break;
		case 12:
			if (denNarozeni < 22) {
				this.znameni = "Střelec";
			} else {
				this.znameni = "Kozoroh";
			}
			break;
		}
	}

	public String toString() {
		return "Index: " + ID + " " + jmeno + " " + prijmeni + " " + denNarozeni + "." + mesicNarozeni + "."
				+ rokNarozeni + ". Znamení studenta je:  " + znameni + ". Jeho průměr: " + prumer;
	}

}
