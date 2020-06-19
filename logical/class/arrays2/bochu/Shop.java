package bochu;

public class Shop 
{
	int airstock=10;
	int landstock=50;
	int firestock=100;
	int waterstock=150;
	int skystock=200;
	int bal;
	public Shop(int num1) 

	airstock=airstock-num1;
}
public Shop(int num2)
{
	landstock=landstock-num2;
}
public Shop(int num3)
{
	firestock=firestock-num3;
}
public Shop(int num4)
{
	waterstock=waterstock-num4;
}
public Shop(int num5)
{
	skystock=skystock-num5;
}
public String toString()
{
	return "air bal is: "+this.airstock+
			"land bal is: "+this.landstock+
			"fire bal is: "+this.firestock+
			"water bal is: "+this.waterstock+
			"sky bal is: "+this.skystock;
}
}
