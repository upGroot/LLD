package LLD.BookMyShow;

import java.util.*;

public class Theatre {
    private int id;
    List<Screen> screenList;
    List<Show> showList;

    public Theatre(int id, List<Screen> screenList, List<Show> showList) {
        this.id = id;
        this.screenList = screenList;
        this.showList = showList;
    }
}
