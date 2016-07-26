//Clase donde se realizan los metodos y muestra el resultado
public class Main {
	
	public static void main(String []args)
	{
		CalcuPost calcu= new CalcuPost();
		String cadena=calcu.LeerArchivo("datos.txt");
		
		calcu.Calcular(cadena);
		System.out.println(calcu.toString());
	}

	
}
