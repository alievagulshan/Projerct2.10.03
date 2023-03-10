import market.prodact.Prodact;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ServiceImpl  implements MarketService{
     private  final List<Prodact>list=new ArrayList<>();
     private  final  List<Prodact>list1=new ArrayList<>();
     Manager manager = new Manager();

    @Override
    public void addnewProdact(List<Prodact> prodacts) {
        prodacts.stream().filter(a->a.getCompanyName().equals("Nur")||a.getCompanyName().equals("Milka")
                ||a.getCompanyName().equals("Toibos")).filter(b->b.getDate().minusMonths(1)
                .isAfter(LocalDate.now())).forEach(System.out::println);
        list.addAll(prodacts);
    }
    @Override
    public void sortByDiscount(List<Prodact> prodacts1) {
//        List<Prodact>list3=prodacts1.stream().filter(a->a.getDate().isBefore(LocalDate.now())).toList();
//          list3.forEach(System.out::println);
          prodacts1.removeIf(b->b.getDate().isBefore(LocalDate.now())); //просроченный товарларды очуруп алдык
//        System.out.println(prodacts1);
          List<Prodact>list4=prodacts1.stream().filter(s->s.getCompanyName().equals("Toibos")||
                  s.getCompanyName().equals("Nur")||s.getCompanyName().equals("Milka")).filter(o->!o.getDate()
                  .isAfter(LocalDate.now().plusDays(7))).toList(); // 7кун калса, 15% скидка мн
        System.out.println("Products with discount 15%");
          list4.forEach(System.out::println);
    }
    @Override
    public void checkToManager(List<Prodact> prodacts2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("login jaz");
        String log = sc.nextLine();
        System.out.println("parol jaz");
        String pass = sc.nextLine();

        if (log.equals(manager.getLogin())){
            System.out.println("welcome");
            addnewProdact(prodacts2);
            sortByDiscount(prodacts2);
        } else {
            throw new RuntimeException("parol je login tuura emes");
        }
    }
}
