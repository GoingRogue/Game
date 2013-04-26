package edu.brown.cs32.rogue.item;

import java.util.List;

/** An interface detailing the necessary functionality of an item which contains other items
 * such as a chest or fallen player
 * 
 * @author Dominic Adams
 * @author Ben Weedon
 * @author John Adler
 * @author Ken Lin
 * @version 1.0 4/13
 */
public interface Container {
	
	/** Returns a list of all items in this container
	 */
	public List<Item> getItems();
	
	/** Returns a list of all items in this container, removing them from the container
	 */
	public List<Item> takeAllItems();
	
	/** Removes just the item specified from the container
	 * 
	 * @param item The item to remove
	 * @return True if the container did contain the item, false if not
	 */
	public boolean takeItem(Item item);
}
