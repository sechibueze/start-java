import java.util.Date;
public class LearnDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date("20/08/2019");
		System.out.println("Date : " + date);
		System.out.println("Date : Day " + date.getDay());
		System.out.println("Date : Hours " + date.getHours());
		System.out.println("Date : Minutes " + date.getMinutes());
		System.out.println("Date : seconds " + date.getSeconds());
	}

}
