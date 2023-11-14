package edu.wctc.isp;

import java.time.LocalDate;

public interface Product {

    //get the things that are similar from Album and Book
    //Then put those in here instead!
    //Title + release dates go here.
    String getTitle();
    LocalDate getReleaseDate();
    String getFormattedReleaseDate();

    //Cost + Quantity go here.
    double getCost();
    int getQuantityOnHand();

    //Finish it off with order.
    void order(int quantity);
}
