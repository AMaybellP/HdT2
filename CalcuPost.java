//Se importa java.io para poder leer el archivo 
import java.io.*;

//Clase que implementa la interfaz de la calculadora
public class CalcuPost implements I_Calculadora
{
	//Instancia del stack y variables
	Stack<Integer> MiPila= new Stack<>();
	int resultado= 0;
	String string= " ";
	String direccion = "datos.txt";
	
	@Override
	public int Calcular(String vector) {
		// TODO Auto-generated method stub
		char[] cadena= vector.toCharArray();
		for (char i: cadena)
		{
			//Verificar si es un numero 
			int num= Character.getNumericValue(i);

			//Si es un numero, se hace un push
			if(num>=0)
			{
				MiPila.push(num);
			}
			else
			//Si es un signo, dependiendo de la jerarquia realiza las operaciones
			{
				/*if(i==' ')
				{
					
				}*/
				if(i=='+')
				{
					int a= MiPila.pop();
					int b= MiPila.pop();
					resultado= a + b;
					MiPila.push(resultado);
					string = string + "Suma: "+ a + "+" + b + "=" + resultado + "\n";
				}
				if(i=='-')
				{
					int a= MiPila.pop();
					int b= MiPila.pop();
					resultado= b - a;
					MiPila.push(resultado);
					string = string + "Resta: "+ b + "-" + a + "=" + resultado + "\n";
				}
				if(i=='*')
				{
					int a= MiPila.pop();
					int b= MiPila.pop();
					resultado= b * a;
					MiPila.push(resultado);
					string = string + "Multiplicacion: "+ b + "*" + a + "=" + resultado + "\n";
				}
				if(i=='/')
				{
					int b= MiPila.pop();
					int a= MiPila.pop();
					resultado= a/b;
					MiPila.push(resultado);
					string = string + "Division: "+ a + "/" + b + "=" + resultado + "\n";
				}
			}
		}
		return resultado;

	@Override
	
	//Metodo que lee un txt y devuelve un string con lo escrito dentro
	public String LeerArchivo(String direccion) {
        // Leer una linea a la vez 
        String line = null;

        try {
            // FileReader lee el texto 
            FileReader fileReader = new FileReader(direccion);

            BufferedReader bufferedReader =  new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                return line;
            }   

            // Cerrar el texto 
            bufferedReader.close();         
        }
        //Si no logra abir el archivo mandar un mensaje 
        catch(IOException ex) {
            System.out.println(
                "No se pudo leer el archivo '" 
                + direccion + "'");                  
        
        }
       
    }
    
    public String toString()
	{
		return string;
	}


}
