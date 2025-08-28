package sumitframework;

public class MySingletonClass {
	private static MySingletonClass single;
	
	private MySingletonClass()
	{
		
		
	}
	
	public static MySingletonClass getInstance()
	{
		if(single==null)
		{
		 single=new MySingletonClass();
		}
		return single;
	}

}
