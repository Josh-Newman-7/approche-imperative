package fr.declaration.variable;

public class DeclarationApp {
	public static void main(String[] args) {
		byte var_byte = 0;
		short var_short = 0;
		int var_int = 0;
		long var_long = 0L;
		float var_float = 0.0F;
		double var_double = 0D;
		char var_char = 'c';
		boolean var_bool = true;
		String var_string = "string";
		
		System.out.println(0);
		System.out.println(var_byte);
		System.out.println(var_short);
		System.out.println(var_int);
		System.out.println(var_long);
		System.out.println(var_float);
		System.out.println(var_double);
		System.out.println(var_char);
		System.out.println(var_bool);
		System.out.println(var_string);
		
		String randomString = "Voici le résultat d'un calcul :\n1+5=6";
		System.out.println(randomString);
	}
}
