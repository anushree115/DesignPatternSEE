package ObserverAbstractFactorySingleton;
import java.util.Scanner; 
public class ShoppingClient
{
	public static void main(String[] args)
	{
		String[] ListOfItems=new String[10];
		Seller object = Seller.getInstance();
	
		Buyer buyer = new Buyer(object, String RequiredItem, RequiredQuantity);
		for(int i=0;i<ListOfItems.length;i++)
		{
			System.out.println(ListOfItems[i]); 
		}
		System.out.println("Enter your required item and quantity");
		Scanner in = new Scanner(System.in);
		buyer.buy();
		
		object. notifyObservers();
	
		
	}
}
