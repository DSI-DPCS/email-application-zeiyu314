import java.util.Random;
import java.util.Scanner;
class email{
	String emailString;
	String passwd;
	String fName;
	String lName;
	String department;
	int mCap=10;
	public String getRandomString_8bit(){
	     String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	     Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<8;i++){
	       int number=random.nextInt(62);
	       sb.append(str.charAt(number));
	     }
	     return sb.toString();
	 }
	public email(String firstName, String lastName) {
		fName = firstName;
		lName = lastName;
		System.out.println("Sales ¨C sales\r\n"
				+ "Development ¨C dev\r\n"
				+ "Accounting ¨C acct\r\n"
				+ "");
		Scanner sc = new Scanner(System.in);
		department = sc.next();
		sc.close();
		if(department == "") {
			department="_";
		}
		emailString = firstName + "." + lastName +"@" + department +"company.com";
		passwd = getRandomString_8bit();
		System.out.println(passwd);
	}
	public void showName() {
		System.out.println(fName + "." +lName);
	}
	public void showEmail() {
		System.out.println(emailString);
	}
	public void mailCapacity() {
		System.out.println(mCap);
	}
	public void changePasswd() {
		System.out.println("The old password?");
		Scanner sc2 = new Scanner(System.in);
		String oldPass = sc2.next();
		sc2.close();
		if (oldPass == passwd) {
			System.out.println("Set the new one.");
			Scanner sc3 = new Scanner(System.in);
			passwd = sc3.next();
			sc2.close(); 
			System.out.print(" New pass: ");
			System.out.println(passwd);
		}
	}
}
public class lei {
	public static void main(String[] args) {
		
		

	}

}
