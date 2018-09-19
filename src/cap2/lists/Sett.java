package cap2.lists;

import java.util.Set;
import java.util.*;

public class Sett {

	LinkedHashSet  linked = new LinkedHashSet<String>;
	this.linked.add("A");

	public Set add(String dato) {
		linked.add(dato);
		return linked;
	}

	public Set remove(String dato) {
		linked.remove(dato);
		return linked;
	}

	public boolean serch(String dato) {
		boolean respuesta;
		respuesta = linked.contains(dato);
		return respuesta;
	}

	public String list() {
		String respuesta = null;
		Iterator itr = linked.iterator();
		while (itr.hasNext()) {
			respuesta = respuesta + itr.next();
		}
		return respuesta;
	}

}
