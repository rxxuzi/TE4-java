package may17;

import java.time.LocalDate;

public class Bihin {
   String name;
   LocalDate date;
   int price;
   int quantity;

   public Bihin() {
      this.name = "";
      this.date = LocalDate.now();
      this.price = 0;
      this.quantity = 0;
   }

   public Bihin(String name, LocalDate date, int price, int quantity) {
      this.name = name;
      this.date = date;
      this.price = price;
      this.quantity = quantity;
   }

   public Bihin(String name, int price , int quantity) {
      this.name = name;
      this.price = price;
      this.quantity = quantity;
   }

   @Override
   public String toString() {
      return " : Bihin [name=" + name + ", date=" + date + ", price=" + price + ", quantity=" + quantity + "]";
   }

   public int add(int x){
      return x + 100;
   }

   //add(5)

   public int getPrice() {
      return price;
   }
   public String getName() {
      return name;
   }
   public LocalDate getDate() {
      return date;
   }
   public int getQuantity() {
      return quantity;
   }
   public void setPrice(int price) {
      this.price = price;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void setDate(LocalDate date) {
      this.date = date;
   }
   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }
}
