import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DOBChallenge {
	
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		String dob = ob.next();
		try {
			Date date = dateFormat.parse(dob);
			SimpleDateFormat dateNewFormat = new SimpleDateFormat("dd/MMM/yyyy");
			
			System.out.println("Date - "+date.getDate()+"\nDay - "+date.getDay()+"\nMonth - "+date.getMonth());
			System.out.println(dateNewFormat.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
