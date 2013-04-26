package edu.brown.cs32.rogue.map;

import org.newdawn.slick.tests.xml.Item;

import edu.brown.cs32.rogue.graphics.GraphicsPaths;
import edu.brown.cs32.rogue.util.Location;

/**
 * @author Dominic Adams
 * @author Ben Weedon
 * @author John Adler
 * @author Ken Lin
 * @version 1.0 4/13
 */
public class Tile {
	
	public final Type type;
	public final int level;
	public final int x;
	public final int y;
	
	public MapItem item;
	
	public Tile(Type t, int level, int x, int y) {
		this.type=t;
		this.level=level;
		this.x=x;
		this.y=y;
	}
	
	/** An enum detailing different types of tiles
	 */
	public static enum Type {
		
		// TODO
		
		GROUND(GraphicsPaths.SCENERY.path),
		WATER(""),
		WALL_N(""),
		WALL_S(""),
		WALL_E(""),
		WALL_W(""),
		WALL_NE(""),
		WALL_NW(""),
		WALL_SE(""),
		WALL_SW("");
		
		public final String path;
		
		Type(String _path) {
			path=_path;
		}
	}
}
