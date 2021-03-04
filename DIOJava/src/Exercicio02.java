import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio02 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate hoje = LocalDate.now();
		System.out.printf("Data de hoje: %tD\n", hoje);
		
		try{
			System.out.println("Insira a data da fatura: (dd/MM/yyyy) ");
			Scanner entrada = new Scanner(System.in);
		
			String dataCliente = entrada.nextLine();
			
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate data = LocalDate.parse(dataCliente, formato);
			System.out.println(formato.format(data));
			
			Long range = ChronoUnit.DAYS.between(hoje, data); // Vejo quantos dias tem entre a data inicial e a final. Preciso do pacote ChronoUnit.
			
			
			if(data.equals(hoje)) {
				if(data.getDayOfWeek() == DayOfWeek.SATURDAY) {
					System.out.println("A conta deve ser paga até " + hoje.plusDays(2));
				} else if (data.getDayOfWeek() == DayOfWeek.SUNDAY) {
					System.out.println("A conta deve ser paga até " + hoje.plusDays(1));
				} else {
					System.out.println("O cliente deve pagar a conta hoje.");
				}
			} else if (data.isAfter(hoje)){
				System.out.println("O cliente tem " + range + " dias para pagar.");
			} else {
				System.out.println("A conta está em atraso. O cliente deverá pagar juros.");
			}
		} catch (DateTimeParseException e) {
			System.out.println("A data inserida está fora do padrão tente novamente.");
		}
	}
	
}