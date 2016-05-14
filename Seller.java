package ObserverAbstractFactorySingleton;
//Seller is a singleton class
public class Seller 
{
	private static Seller instance = new Seller();
	
	private Seller(){}
	int Quantity=10;
	
	public static Seller getInstance()
	{
	      return instance;
	}
	private Observer[] observers = new Observer[10];
    private int totalObs = 0;
    private String sellerName;
    
    public void attach( Observer o ) 
    {
        observers[totalObs++] = o;
    }
    
    public void update()
    {
    	System.out.println("out of stock");
    }
    

  		public void quantity()
  		{
  			for(int i=0;i<10;i++)
  			{
  				Buyer.buy();
  				Quantity--;
  			}
  		}
  		
  		public int getQuantity()
  		{
  			return Quantity;
  		}
  		
  		public void setQuantity(int n)
  		{
  			Quantity=n;
  			notifyObservers();
  		}
  		
  		public void notifyObservers() {
  	        for (int i = 0; i < totalObs; i++)
  	            observers[i].update();
  	    }

   
}
