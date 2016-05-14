package ObserverAbstractFactorySingleton;

public abstract class User {
	abstract Buyer getBuyer(String buyer);
	abstract Seller getSeller (String seller) ;

}
