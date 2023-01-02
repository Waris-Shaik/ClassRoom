import java.util.ArrayList;
public class twoDArrayList {
    public static void main(String[] args){

      ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<String>();
            bakeryList.add("Bread");
            bakeryList.add("Biscuits");
            bakeryList.add("Cake");
            bakeryList.add("Choclates");
            bakeryList.add("Kurkure");

        ArrayList<String> produceList = new ArrayList<String>();
            produceList.add("Tomatoes");
            produceList.add("Gralic");
            produceList.add("Ginger");
            produceList.add("Lemon");
            produceList.add("Popcorn");


        ArrayList<String> drinkList = new ArrayList<String>();
            drinkList.add("Soda");
            drinkList.add("Red-Bull");
            drinkList.add("Sprite");
            drinkList.add("Thums-Up");
            drinkList.add("String");


      groceryList.add(bakeryList);
      groceryList.add(produceList);
      groceryList.add(drinkList);

        System.out.println(groceryList);


    }
}
