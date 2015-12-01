/*
*
* File : Main.java
* Name : Singleton Pattern in Java
* Author : Farhan Ahmed
* bcs0212500@student.uol.edu.pk
*
*/

public class Main
{
	public static void main(String [] args)
	{
		App instance = App.getInstance();
		instance.sayHello();
	}
}
