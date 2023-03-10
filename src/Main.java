import market.prodact.Prodact;
import market.prodact.flourProdact.Makaron;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Prodact>prodactList=new ArrayList<>();
        ServiceImpl service=new ServiceImpl();

        Makaron makaron=new Makaron(1,"Rogki","Makfa", LocalDate.of(2023,3,12));
        prodactList.add(makaron);
        Makaron makaron2=new Makaron(2,"Spiral","Nur",LocalDate.of(2023,3,11));
        prodactList.add(makaron2);
        Makaron makaron3=new Makaron(3,"Kalbasa","Toibos",LocalDate.of(2023,3,16));
        prodactList.add(makaron3);
        Makaron makaron4=new Makaron(4,"Moloko","Milka",LocalDate.of(2023,3,15));
        prodactList.add(makaron4);
        Makaron makaron5 =new Makaron(5,"si","Nur",LocalDate.of(2023,4,15));
        prodactList.add(makaron5);
        Makaron makaron6=new Makaron(6,"dhf","gdds",LocalDate.of(2023,12,31));
        prodactList.add(makaron6);

        System.out.println(prodactList);
        service.addnewProdact(prodactList);
        service.sortByDiscount(prodactList);
        service.checkToManager(prodactList);

    }
}