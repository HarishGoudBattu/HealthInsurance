public class BUSINESSRULES {
	double basicPremium = 5000;
	int basicAge = 18;
	int Finalage = 100;
	int oldAge = 45;
	double CalPrem;
	UserDeatils ud = new UserDeatils();

	boolean currentHealthCalucalation() {
		if ((ud.getHypertension() == "NO" || ud.getBP() == "NO"
				|| ud.getBS() == "NO" || ud.getOW() == "YES")) {
			return true;
		}

		return true;
	}

	boolean genderCalucalation() {
		if (((ud.getGender() == "Male" || ud.getGender() == "Female"))) {
			return true;
		}

		return true;
	}

	// (ud.getGender()=="Male"||ud.getGender()=="Female")
	// &&(ud.getHypertension()=="NO"||ud.getBP()=="NO"||ud.getBS()=="NO"||ud.getOW()=="YES")
	void CalPremium(UserDeatils ud) {
		if (ud.getAge() < basicAge && currentHealthCalucalation()
				&& genderCalucalation()) {
			System.out.println("first level");
			if (ud.getDE() == "YES") {
				CalPrem=basicPremium * 0.0;
				basicPremium=basicPremium+CalPrem;
				System.out.println("Health Insurance Premium for Mr."
						+ ud.getName() + " : Rs." + CalPrem);
			} else {
				CalPrem=basicPremium * 0.6;
				basicPremium=basicPremium+CalPrem;
				System.out.println("Health Insurance Premium for Mr."
						+ ud.getName() + " : Rs." + basicPremium);
			}

		} else if ((ud.getAge() > basicAge && ud.getAge() < oldAge)
				&& currentHealthCalucalation() && genderCalucalation()) {
			System.out.println("Cal premum");
			if (ud.getDE() == "YES") {
				CalPrem=basicPremium * 0.8;
				basicPremium=CalPrem+basicPremium;
				System.out.println("Health Insurance Premium for Mr."
						+ ud.getName() + " : Rs." + basicPremium);
			} else {
				CalPrem=basicPremium * 0.14;
				basicPremium=CalPrem+basicPremium;
				System.out.println("Health Insurance Premium for Mr."
						+ ud.getName() + " : Rs." + basicPremium);
			}

		} else {
System.out.println("From else fianl");
			while (Finalage >= oldAge) {
				if (ud.getDE() == "YES") {
					CalPrem=basicPremium * 0.2;
					basicPremium=CalPrem+basicPremium;
					System.out.println("Health Insurance Premium for Mr."
							+ ud.getName() + " : Rs." + basicPremium);
					oldAge += 5;
				} else {
					CalPrem=basicPremium * 0.17;
					basicPremium=CalPrem+basicPremium;
					System.out.println("Health Insurance Premium for Mr."
							+ ud.getName() + " : Rs." + basicPremium);
					oldAge += 5;
				}

			}
		}
	}
}
