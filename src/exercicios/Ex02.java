package exercicios;

public class Ex02 {

	public static int pg(int n, int q, int cont) {
		cont++;
		if (cont>=10) {
			return n;
		} else {
			return pg(n*q, 2,cont);
		}
	}

	public static void main(String[] args) {
		System.out.println(pg(1,2,0));
	}
}