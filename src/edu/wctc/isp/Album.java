package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;
public interface Album extends Product {

    //Trim this down so it's just album specific.
    String getArtist();
    Duration getPlayingTime();

}
