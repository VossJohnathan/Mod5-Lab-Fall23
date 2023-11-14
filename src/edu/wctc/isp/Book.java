package edu.wctc.isp;

import java.time.LocalDate;
public interface Book extends Product {

    //Trim them down, remove those that are similar to Album.
    String getAuthor();
    int getPages();
    String getISBN();

}
