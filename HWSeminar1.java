public class HWSeminar1 {
	public static void main(String[] args) {
		boolean p, q;

		System.out.println("p\tq\tp & q\tp | q\tp ^ q\t!p");
        System.out.println("----------------------------------------------");
 

		p = false;
		q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = true;
		q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = false;
		q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = true;
		q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));
	}
}