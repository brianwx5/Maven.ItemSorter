package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    public int compare(Item item, Item item2) {
       return item.getName().compareTo(item2.getName());
    }
}
