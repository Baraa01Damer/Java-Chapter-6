package temperature;
import java.util.Scanner;
public class Temperature

{
	
	double ftemp;
	Temperature(double ftemp)
	{
		this.ftemp = ftemp;
	}
	
	public void setF(double ftemp)
	{
		this.ftemp = ftemp;
	}
	
	double getF()
	{
		return ftemp;
	}
	
	double getC()
	{
		return ((double)5/9*(ftemp-32));
	}
	
	double getK()
	{
		return (((double)5/9*(ftemp-32))+273);
	}
	
	public static void main(String[] args) {
		double ftemp;

		Scanner input = new Scanner(System.in);
		System.out.print("Input a temperature value in Fahrenheit: ");
		ftemp = input.nextDouble();

		Temperature temp = new Temperature(ftemp);

		temp.setF(ftemp);
		System.out.println("The temperature in Fahrenheit degrees is " + temp.getF());
		System.out.println("The temperature in Celsius degrees is " + temp.getC());
		System.out.println("The temperature in Kelvin degrees is " + temp.getK());
	}
}