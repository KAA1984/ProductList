import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
              productList.add(new Product(123, "milk",10,"Slovyanochka 2.5",Category.MILK));
              productList.add(new Product(124, "milk1",11,"Mlekovita 2.5",Category.MILK));
              productList.add(new Product(125, "milk2",12,"Prastokvashino 2.5",Category.MILK));
              productList.add(new Product(126, "pork poland",100,"pork meat 5",Category.MEAT));
              productList.add(new Product(127, "beef ukrainian",110,"beef meat",Category.MEAT));
              productList.add(new Product(128, "nasha ryaba",50,"chicken meat",Category.MEAT));
              productList.add(new Product(129, "salmon norway",200,"sea fish",Category.FISH));
              productList.add(new Product(130, "dorado italy",160,"sea fish",Category.FISH));
              productList.add(new Product(131, "carp ukrainian ",90,"river fish",Category.FISH));

              //STREAM

            productList.stream().filter(product -> product.getCategory().equals(Category.MILK)).forEach(System.out::println);
            productList.stream().filter(product -> product.getCategory().equals(Category.MEAT)).forEach(System.out::println);
            productList.stream().filter(product -> product.getCategory().equals(Category.FISH)).forEach(System.out::println);
            productList.stream().filter(product -> product.getPrice()<100).forEach(System.out::println);
            productList.stream().filter(product -> product.getName().contains("ukrainian")).forEach(System.out::println);

            // For each

        List<Product> milkarr = new ArrayList<>();
        List<Product> meatarr = new ArrayList<>();
        List<Product> fisharr = new ArrayList<>();


       for(Product prod:productList) {

           if(prod.getCategory().equals(Category.MILK)){
               milkarr.add(prod);
           }
           if (prod.getCategory().equals(Category.MEAT)){
               meatarr.add(prod);
           }
           if(prod.getCategory().equals(Category.FISH)){
               fisharr.add(prod);
           }
           if (prod.price<100){
               //System.out.println(prod.getPrice());
       }
           if(prod.name.contains("ukrainian")){
               //System.out.println(prod.getName());
           }
       }
        // System.out.println(milkarr);
        //System.out.println(meatarr);
        //System.out.println(fisharr);
    }
}

