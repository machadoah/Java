package a_fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // 1 -> 1.0
		System.out.println(a);
		
		float b = (float) 1.12334758435888; // Double(default) -> float | (CAST)
						// 1.1233476
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; // o CAST força um int caber no byte, podendo perdem informação
		
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}

}
