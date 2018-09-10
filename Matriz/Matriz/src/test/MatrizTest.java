package test;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

class MatrizTest {
	private int numeroFilas;
	private int numeroColumnas;
	private int[][] elements;

	public MatrizTest(int newnumeroFilas, int newnumeroColumnas) {
		this.numeroFilas = newnumeroFilas;
		this.numeroColumnas = newnumeroColumnas;
		this.elements = new int[newnumeroFilas][newnumeroColumnas];
	}

	public int getnumeroFilas() {
		return numeroFilas;
	}

	public void setnumeroFilas(int numeroFilas) {
		this.numeroFilas = numeroFilas;
	}

	public int getnumeroColumnas() {
		return numeroColumnas;
	}

	public void setnumeroColumnas(int numeroColumnas) {
		this.numeroColumnas = numeroColumnas;
	}

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}

	public int[][] insertarElemento(int numeroFilas, int numeroColumnas, int element) {
		this.elements[numeroFilas][numeroColumnas] = element;
		return this.elements;
	}

	public String buscarElemento(int element) {
		int i = 0;
		int j = 0;
		int yes = 0;
		for (i = 0; i < this.numeroFilas; i++) {
			for (j = 0; j < this.numeroColumnas; j++) {
				int serchElement = elements[i][j];
				if (serchElement == element) {
					yes = 1;
					break;
				}
			}
			if (yes == 1) {
				break;
			}
		}
		return i + ", "+ j;
	}

	public int[][] updateElement(int numeroFilas, int numeroColumnas, int element) {
		this.elements[numeroFilas][numeroColumnas] = element;
		return this.elements;
	}

	public int[][] eliminarElemento(int numeroFilas, int numeroColumnas) {
		this.elements[numeroFilas][numeroColumnas] = 0;
		return this.elements;
	}

}

	