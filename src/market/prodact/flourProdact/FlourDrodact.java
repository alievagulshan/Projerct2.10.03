package market.prodact.flourProdact;

import market.prodact.Prodact;

import java.time.LocalDate;

public  abstract class FlourDrodact extends Prodact {
    public FlourDrodact(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
