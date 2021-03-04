import java.util.Date;
import java.util.Calendar;


public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		c.set(1985, Calendar.APRIL, 22);
		Long data = c.getTimeInMillis();
		System.out.println("Data: " + data);
		
		Calendar x = Calendar.getInstance();
		x.set(2010, Calendar.MAY, 15);
		Long dataCheck = x.getTimeInMillis();
		System.out.println("Data: " + dataCheck);
		
		Date meuNiver = new Date(483026054266L);
		//System.out.println(meuNiver);
		
		Date dayMay = new Date(1273932088849L);
		
		boolean isAfter = meuNiver.after(dayMay);
		
		if(isAfter) {
			System.out.println("A data do meu aniversário não é antes de 15/05/2010.");
		} else {
			System.out.println("A data do meu aniversário é antes de 15/05/2010.");
		}
		
	}

}
