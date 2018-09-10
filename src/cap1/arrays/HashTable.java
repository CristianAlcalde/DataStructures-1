package cap1.arrays;

public class HashTable {
	private SimplePeopleList vector[];
	private int tamano;

	public HashTable(int tam) {

		this.tamano = tam;
		vector = new SimplePeopleList[tam];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = new SimplePeopleList();
			}
		}
	
	public int hash(int clave) {

		return clave % this.tamano;
	}
	
	public void setInsert(int clave, String valor) {
		int posicion = hash(clave);
		vector[posicion].addBeggining(clave, valor);
	}

	public String setSearch(int clave) {
		int posicion = hash(clave);

		return vector[posicion].setSearch(clave);
	}

	public void Update(int nuevaclave, String nuevavalor, int clave) {

		int posicion = hash(clave);
		vector[posicion].setUpdate(nuevaclave, nuevavalor, clave);
	}

	public void list() {
		for (int i = 0; i < vector.length; i++) {
			vector[i].show();
		}
	}

	public int funcionHash(String cedula) {
		// TODO Auto-generated method stub
		return 27;
	}

}
