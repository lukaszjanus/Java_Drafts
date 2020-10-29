package objects;

/**
 * @title wlasny wyjatek 
 *
 * @date 6 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class ZleImieException extends Exception{

	@Override
	public String getMessage() {
		return "Podano zle imie";
		
	}
}
