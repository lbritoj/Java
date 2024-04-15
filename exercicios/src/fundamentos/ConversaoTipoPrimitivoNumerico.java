package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //conversao implicita int -> double
		System.out.println(a);
		
		//float b = (float) 1.12345; //conversao explicita (CAST)
		// tambem poderia ser: 
		float b = 1.0F;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		
	}

}
