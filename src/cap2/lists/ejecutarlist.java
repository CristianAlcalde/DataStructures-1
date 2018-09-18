package cap2.lists;

import utils.Mp3;

public class ejecutarlist {

	public static void main(String[] args) {
		DoublyLinkedList testedVector = new DoublyLinkedList();
		Mp3 primero = new Mp3();
		primero.setArtista("A");
		primero.setCancion("A");
		primero.setNombre("A");
		primero.setTrack(1);
		Mp3 segunto = new Mp3();
		segunto.setArtista("C");
		segunto.setCancion("C");
		segunto.setNombre("C");
		segunto.setTrack(4);

		testedVector.insertNode(primero);
		testedVector.insertNode(segunto); 

	}

}
