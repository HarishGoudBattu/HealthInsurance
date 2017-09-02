import java.util.Scanner;



public class ReadDataFromUser {
	
public static void main(String[] args) {
	UserDeatils ud=new UserDeatils();
	
	Scanner sc=new Scanner(System.in);
	
	//Read the User Info
	System.out.println("Please enter Name");
	         ud.setName(sc.nextLine());
	         System.out.println("Please enter Gender");
	         ud.setGender((sc.nextLine()));
	         System.out.println("Please enter Age");
	         ud.setAge(Integer.parseInt(sc.nextLine()));
	         
	         //Read the User Current health:
             
	         System.out.println("Please enter Blood pressure");
	         ud.setBP(sc.nextLine());
	         
	         System.out.println("Please enter Hypertension");
	         ud.setHypertension(sc.nextLine());
	         
	         System.out.println("Please enter Blood sugar");
	         ud.setBS(sc.nextLine());
	         System.out.println("Please enter Overweight");
	         ud.setOW(sc.nextLine());
	         
	         //Read user Habits
	         
	         System.out.println("Please enter Smoking:");
	         ud.setSmoking(sc.nextLine());
	         System.out.println("Please enter Alcohol:");
	         ud.setAlcohol(sc.nextLine());
	         System.out.println("Please enter Daily exercise:");
	         ud.setDE(sc.nextLine());
	         System.out.println("Please enter Drug:");
	         ud.setDrugs(sc.nextLine());

	         System.out.println("Your Health Insurance Premium is below calualcating");
	         
	         BUSINESSRULES br=new BUSINESSRULES();
	         br.CalPremium(ud);
	         sc.close();
}
}
