package objects.equals;

import java.util.Objects;

/**
 * @title Do powtórki Javy: metoda equals do porównania obiektów
 *
 * @date 5 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class Animal {

	String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		// na początek sprawdzam referencje, null object i klasę
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		// potem rzutujemy porownowany objekt
		Animal other = (Animal) obj;

		// i porownojemy po wybranych polach (tutaj tylko 'name')
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*
	 * //wersja z InteliJ
	 * 
	 * @Override public boolean equals(Object o) { if(this==o) return false;
	 * if(o==null || getClass() != o.getClass()) return false; //jw, ale zgodność
	 * klas i czy o nie jest puste
	 * 
	 * Animal a = (Animal) o;
	 * 
	 * return Objects.equals(name, a.name); //i po czym porownojemy znow equalsem }
	 */

}
