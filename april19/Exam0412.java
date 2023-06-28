package april19;
import java.util.Scanner;

public class Exam0412 {
	
	Price p1 = new Price();
	
	Exam0412() {
		p1.setPrice(-100);
		System.out.println("setPrice(100) = " + p1.getPrice());
	}

	public static void main(String[] args) {
		new Exam0412();
		int a = 10;
		Price[] prices = new Price[5];
		for (int i = 0; i < prices.length; i++) {
         prices[i] = new Price();
         prices[i].setPrice(100);
      }
		prices[1].setPrice(200);
		Price.x = 300;

		System.out.println("prices[1].getPrice() = " + prices[1].getPrice());
		System.out.println("(static) Bihin.x = " + Price.x);
		System.out.println();



		Scanner sc = new Scanner(System.in);


	}
}
