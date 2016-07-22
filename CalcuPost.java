
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
		// TODO Auto-generated method stub
		return null;
	}

}
