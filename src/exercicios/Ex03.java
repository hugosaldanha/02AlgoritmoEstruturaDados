package exercicios;

public class Ex03 {
	
	public static int impar(int n, int cont) {
		cont++;
		if (cont>=11) {
			return n;
		} else {
			return impar(n+2, cont);
		}
	}

	public static void main(String[] args) {
		System.out.println(impar(1, 0));
	}
	
}
