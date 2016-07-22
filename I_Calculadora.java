
public interface I_Calculadora 
{
	public int Calcular (String vector);
	public String toString();
	public String LeerArchivo(String direccion);
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
    }
}
