package typeprimitif;
public class TypePrimitifsTests
{
	public static void main(String[] args)
	{
		byte	variableByte;
		short	variableShort;
		int		variableInt, i;
		long 	variableLong;
		float	variableFloat;
		double	variableDouble;
		boolean	variableBoolean;
		char	variableChar;
		
		variableByte = 10;
		variableShort = 100;
		variableInt = 1000;
		variableLong = 10000;
		variableFloat = 12.5f;
		variableDouble = 155.5;
		variableBoolean = true;
		variableChar = 'A';
		i = 0;
		
		System.out.println("Variable byte = "+variableByte);
		System.out.println("Variable short = "+variableShort);
		System.out.println("Variable int = "+variableInt);
		System.out.println("Variable long = "+variableLong);
		System.out.println("Variable float = "+variableFloat);
		System.out.println("Variable double = "+variableDouble);
		if (variableBoolean) {
			System.out.println("Boolean fonctionne");
		}
		while(i<26){
			System.out.print(variableChar);
			variableChar++; //variableChar = variableChar + 1
			i++; //i = i + 1
		}
	}
}





