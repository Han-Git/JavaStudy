package ch6;

public class Product {
	static int count = 0;
	int serialNo;
	
	{
		count = count + 1;
		serialNo = count;
	}
	
	public Product() {}
}
