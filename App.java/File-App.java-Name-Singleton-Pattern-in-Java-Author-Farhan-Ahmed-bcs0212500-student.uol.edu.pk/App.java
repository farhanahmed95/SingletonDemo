/*
*
* File : App.java
* Name : Singleton Pattern in Java
* Author : Farhan Ahmed
* bcs0212500@student.uol.edu.pk
*
*/

public class App
{
	private static App instance = null; 

	private App()
	{
	}

	public static App getInstance()
	{
		if( instance == null )
		{
			 instance = new App();
		}
		return instance;
	}
	public void sayHello()
	{
		System.out.println("Hello");
	}
}
