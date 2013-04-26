package edu.brown.cs32.rogue.graphics;

/** An enum for storing the paths to the images/animations needed in Rogue
 * Stores the paths to directories, not images themselves
 * Some paths store superpaths to help with layered organization (eg. creatures <- monsters <- [monstername])
 * 
 * @author Dominic Adams
 * @author Ben Weedon
 * @author John Adler
 * @author Ken Lin
 * @version 1.0 4/13
 */
public enum GraphicsPaths {
	
	GRAPHICS("graphics/"),
	
	SCENERY("scenery/", GRAPHICS),
		WALLS("walls/", SCENERY),
	
	CREATURES("creatures/", GRAPHICS),
		CHARACTERS("", CREATURES),
			CHAR_1("", CHARACTERS),
			CHAR_2("", CHARACTERS),
			CHAR_3("", CHARACTERS),
			CHAR_4("", CHARACTERS),
		MONSTERS("monsters/", CREATURES),
			BAT("bat/", MONSTERS),
	
	ITEMS("items/", GRAPHICS);
	
	public final String path;
	final GraphicsPaths superpath;
	
	GraphicsPaths(String _path) {
		superpath=null;
		path=_path;
	}
	
	GraphicsPaths(String _path, GraphicsPaths _superpath) {
		superpath=_superpath;
		path=superpath.path+_path;
	}
}