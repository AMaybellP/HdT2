
public class CalcuPost implements I_Calculadora
{
	Stack<Integer> MiPila= new Stack<>();
	int resultado= 0;
	String string= " ";
	/*public void prueba()
	{
		String cadena= "1234 ja* /+-";
		char[] cadena2= cadena.toCharArray();
		
		//int  i;
		for(char i: cadena2)
		{
			int num= Character.getNumericValue(i);
			System.out.println(num);
		}
	}*/

	@Override
	public int Calcular(String vector) {
		// TODO Auto-generated method stub
		char[] cadena= vector.toCharArray();
		for (char i: cadena)
		{
			int num= Character.getNumericValue(i);
			if(num>=0)
			{
				MiPila.push(num);
			}
			else
			{
				/*if(i==' ')
				{
					
				}*/
				if(i=='+')
				{
					resultado= MiPila.pop()+MiPila.pop();
				}
				if(i=='-')
				{
					resultado= MiPila.pop()-MiPila.pop();
				}
				if(i=='*')
				{
					resultado= MiPila.pop()*MiPila.pop();
				}
				if(i=='/')
				{
					resultado= MiPila.pop()/MiPila.pop();
				}
			}
		}
		return resultado;
	}

	@Override
	
	public String LeerArchivo(String direccion) {
	 // Se abre el documento 
        String fileName = "canastadefrutas2.txt";

        // Leer una linea a la vez 
        String line = null;

        try {
            // FileReader lee el texto 
            FileReader fileReader = 
                new FileReader(fileName);

            
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Cerrar el texto 
            bufferedReader.close();         
        }
        //Si no logra abir el archivo mandar un mensaje 
        catch(IOException ex) {
            System.out.println(
                "No se pudo leer el archivo '" 
                + fileName + "'");                  
        
        }
        return null;
    }

}
