package ru.mirea.ivashchenko.pr16;

interface Order {

    void addOrder(Item item);

    void deleteOrder(String name);
    int deleteAllWithName(String name);
    int TotalnumberofPosition();
    String TotalPosition();
    int TotalPrice();
    Item[] Lowtohighprice();
}

