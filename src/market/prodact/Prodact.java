package market.prodact;

import java.time.LocalDate;

public  abstract class Prodact {
      private int id;
      private String name;
      private  String companyName;
      private LocalDate date;
    public Prodact(int id, String name, String companyName, LocalDate date) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Prodact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", date=" + date +
                '}';
    }


}
