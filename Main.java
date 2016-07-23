
public class Main {
	
	public static void main(String []args)
	{
		CalcuPost calcu= new CalcuPost();
		String cadena= "8 2 /";
		
		calcu.Calcular(cadena);
		System.out.println(calcu.toString());
	}

	
}
