package inheritance;

public class DemoTaxation {

		public static void main(String[] args) {
			IncomeTax incomeTax = new IncomeTax();
			Gst gst = new Gst();
			int tax = gst.calculateTax(25000);
			System.out.println("tax is  "+tax);
		}



}
