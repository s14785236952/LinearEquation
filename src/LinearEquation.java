import java.util.Scanner;

public class LinearEquation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 要求使用者輸入數值
		System.out.println("Please Input the Value of a,b,c,d,e and f : ");
		// 宣告使用者輸入之數值
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = scanner.nextDouble();
		double f = scanner.nextDouble();
		// create object
		Calculate calculate = new Calculate(a, b, c, d, e, f);
		// 輸出計算完畢後的數值
		System.out.print("When a = " + calculate.getA());
		System.out.print(" , b = " + calculate.getB());
		System.out.print(" , c = " + calculate.getC());
		System.out.print(" , d = " + calculate.getD());
		System.out.print(" , e = " + calculate.getE());
		System.out.println(" and f = " + calculate.getF());
		if (calculate.isSolvable() == true)
			System.out.println(
					"The Equation's solution :\n" + "x = " + calculate.getX() + " and y = " + calculate.getY());
		// 分母為零所以沒有答案
		else
			System.out.println("The Eqution Has No Solution.");

	}

}

class Calculate {
	private double a, b, c, d, e, f;
	private double x, y;

	// constructor
	Calculate(double A, double B, double C, double D, double E, double F) {
		a = A;
		b = B;
		c = C;
		d = D;
		e = E;
		f = F;

	}

	double getA() {
		return a;
	}

	double getB() {
		return b;
	}

	double getC() {
		return c;
	}

	double getD() {
		return d;
	}

	double getE() {
		return e;
	}

	double getF() {
		return f;
	}

	double getX() {
		x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
		return x;
	}

	double getY() {
		y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
		return y;
	}

	boolean isSolvable() {
		if ((a * d - b * c) != 0)
			return true;
		else
			return false;
	}
}