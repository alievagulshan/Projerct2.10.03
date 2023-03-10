package market.prodact.meatProdact;

import market.prodact.Prodact;

import java.time.LocalDate;

public  abstract class MeatProdact extends Prodact {
    public MeatProdact(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
