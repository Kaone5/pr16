package ru.mirea.ivashchenko.pr16;

public class Main {
    public static void main(String [] args)
    {
        Dish pasta=new Dish(500,"Pasta","With tomatoes");
        Drink Pivo=new Drink(1000,"Garage","For 18+");
        InternetOrder firstclient=new InternetOrder();
        firstclient.addOrder(pasta);
        firstclient.addOrder(Pivo);
        System.out.println(firstclient.TotalPrice());
    }
}

