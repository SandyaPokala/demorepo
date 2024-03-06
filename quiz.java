import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = LocalDate.parse("2014-06-14").format(DateTimeFormatter.ISO_DATE); //
		System.out.println(date);

	}

}

