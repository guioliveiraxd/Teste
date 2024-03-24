import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'f';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, Wich price is $ %.1f%n%s, wich price is $ %.3f%n %nRecord: %d years old, code %d and gender: %s%nMeasure with eight decimal places: %.8f%nRouded: %.3f%nUS decimal point: %.3f   ", product1, price1, product2, price2, age, code, gender, measure, measure, measure);
		
		
	}
} 