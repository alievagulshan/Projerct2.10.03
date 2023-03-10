package market.prodact.molochnyiProdact;

import market.prodact.Prodact;

import java.time.LocalDate;

public abstract class MoloshnyiProdact extends Prodact {
    public MoloshnyiProdact(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
