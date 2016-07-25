//Clase donde se realizan los metodos y muestra el resultado
public class Main {
	
	public static void main(String []args)
	{
		CalcuPost calcu= new CalcuPost();
		String cadena= "8 2 /";
		
		calcu.Calcular(cadena);
		System.out.println(calcu.toString());
	}

	
}
