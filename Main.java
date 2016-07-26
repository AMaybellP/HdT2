
public class Main {
	
	public static void main(String []args)
	{
		CalcuPost calcu= new CalcuPost();
		//String cadena= "8 2 / 2 + 3 -";
		
		String cadena= calcu.LeerArchivo("datos.txt");
		calcu.Calcular(cadena);
		System.out.println(calcu.toString());
	}

	
}
