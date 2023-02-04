package event;

import character.*;

public class Event {
	public static boolean checkHit(Cat cat, Wave wave) {
		if(cat.x+cat.catSize>wave.x && cat.x<wave.x) {
			if(cat.y+cat.catSize>=wave.y-wave.height) {
				return true;
			}
			
		}
		return false;
		
	}
	public static void gameStop(Wave[] wave,Environment[] env) {

	}
}