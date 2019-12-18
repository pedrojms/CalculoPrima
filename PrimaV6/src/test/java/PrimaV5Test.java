
import org.junit.Test;

public class PrimaV5Test {

	@Test
	public void CalculoPrima() {
		PrimaV5.CalculoPrima(25, 25);
		PrimaV5.CalculoPrima(35, 30);
		PrimaV5.CalculoPrima(20, 10);
		PrimaV5.CalculoPrima(45, 27);
		PrimaV5.CalculoPrima(60, 30);
		PrimaV5.CalculoPrima(70, 10);
		PrimaV5.CalculoPrima(10, 20);
		PrimaV5.CalculoPrima(25, 0);
		PrimaV5.CalculoPrima(30, -1);
		PrimaV5.CalculoPrima(-2, 30);
		PrimaV5.CalculoPrima(17, 20);
		PrimaV5.CalculoPrima(70, 27);
		PrimaV5.CalculoPrima(20, 30);
		PrimaV5.CalculoPrima(25, 30);
		PrimaV5.isNumeric("Hola");
		PrimaV5.isNumeric("2");
		PrimaV5.FactorEdad(100);
		PrimaV5.CalculoRCS(38, 21);
		PrimaV5.CalculoRCS(50, 27);
	}

}
