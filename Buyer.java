package ObserverAbstractFactorySingleton;

public class Buyer extends Observer {
	private String BuyerName;

	private static String  RequiredItem;
	private static int RequiredQuantity;
	String [] RequiredList=new String[10];

	public Buyer(Seller s, String RequiredItem,int RequiredQuantity){
		this.RequiredItem=RequiredItem;
		this.RequiredQuantity= RequiredQuantity;
		s.attach(this);
	}
	
	public static void buy(){

		Buyer buyer = new Buyer( null, RequiredItem , RequiredQuantity);
		while((RequiredItem=item[i])&&(RequiredQuantity!=0))
		{
			System.out.println("Available");
			buyer.updateCart();
			
		}
		
	}
	
	public void updateCart(){
		for(int i=0; i<RequiredList.length-1;i++){
			RequiredList[i]=RequiredItem;
			
		}
		
	}

	@Override
	public void update() {
		System.out.println("updated the cart list");
	}
	
	
}
