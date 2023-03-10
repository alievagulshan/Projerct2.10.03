import market.prodact.Prodact;

import java.util.List;

public interface MarketService {
    public  void addnewProdact (List<Prodact> prodacts);
    public  void sortByDiscount(List<Prodact>prodacts1);
    public  void checkToManager(List<Prodact>prodacts2);


}
