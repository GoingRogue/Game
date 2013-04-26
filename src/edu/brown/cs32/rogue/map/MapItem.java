package edu.brown.cs32.rogue.map;

import org.newdawn.slick.Image;

import edu.brown.cs32.rogue.util.Location;

/** An abstract class giving the framework for storing different types of map items.
 * A "map item" is an item whose position does not change, such as a chest or a spawn point
 * 
 * @author Dominic Adams
 * @author Ben Weedon
 * @author John Adler
 * @author Ken Lin
 * @version 1.0 4/13
 */
public abstract class MapItem {
	
	protected Location loc;
	
	/** Returns the image to draw to represent the item
	 */
	public abstract Image getImage();
	
	/** Returns the item's location, snapped to the grid
	 */
	public int[] getLocation() {
		return loc.snap();
	}
}
