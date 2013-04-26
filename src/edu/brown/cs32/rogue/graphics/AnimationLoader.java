package edu.brown.cs32.rogue.graphics;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/** Loads an animation from file given a pathname
 * 
 * @author Dominic Adams
 * @author Ben Weedon
 * @author John Adler
 * @author Ken Lin
 * @version 1.0 4/13
 */

public class AnimationLoader {
	
	public static Animation load(String path) {
		
		List<Image> images=new ArrayList<>();
		
		//Loads images until one cannot be found
		try {
			
			int i=1;
			while(true) {
				
			//TEST
				System.out.println("Trying to load "+path+i+".png");
				
				images.add(new Image(path+i+".png"));
				i++;
			}
		
		} catch(RuntimeException e) {
			
		} catch(SlickException e) {
			
		}
		
		//Creates an auto-updating image from the found files
		Animation a=new Animation(images.toArray(new Image[]{}),
									(int)(1000./Constants.FRAMERATE),
									true);
		return a;
	}
	
	public static Animation loadMove(String path) {
		return load(path+"move/");
	}
	
	public static Animation loadAttack(String path) {
		return load(path+"attack/");
	}
}