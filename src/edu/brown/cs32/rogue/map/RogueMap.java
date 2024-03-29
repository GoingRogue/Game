package edu.brown.cs32.rogue.map;

import java.util.List;

/** An interface to allow access to map info inside the given bounds
 * Only handles access to things that are snapped to the grid, which means it does not handle
 * moving creatures, dropped items, etc
 * 
 * @author Dominic Adams
 * @author Ben Weedon
 * @author John Adler
 * @author Ken Lin
 * @version 1.0 4/13
 */
public interface RogueMap {
	
	/** Returns all tiles in the area specified by the given bounds
	 */
	public List<Tile> getData(int minX, int minY, int maxX, int maxY);
	
	/** Returns all map items in the area specified by the given bounds
	 * Includes chests and spawn points
	 */
	public List<MapItem> getMapItems();
}
