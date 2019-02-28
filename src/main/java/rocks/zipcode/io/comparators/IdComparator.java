package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
    public int compare(Item item, Item item2) {
       return item.getId().compareTo(item2.getId());
    }
}
