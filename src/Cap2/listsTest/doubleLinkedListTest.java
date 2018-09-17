package Cap2.listsTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import Cap2.lists.doubleLinkedList;
import utils.Mp3;

class doubleLinkedListTest {

	@Test
	//insertar en una lista
	void testInsertElementOrderList() {
	//inicializar
		doubleLinkedList myList2 = new doubleLinkedList();
		assertEquals(0,myList2.getSize());
		//valor esperado
		//cancion 1
		String author ="Rescate Rock";
		String file ="Argentina";
		String name = "Buscando Lio Sinfonico";
		int trackNo = 002;		
		
		myList2.addOrder(author, file, name, trackNo);		
		assertEquals(1,myList2.getSize());
		
		/* //cancion2
		String author2 ="Toma Tu Lugar Band";
		String file2 ="Argentina";
		String name2 = "Te amo";
		int trackNo2 = 004;		
		
		myList2.addOrder(author2, file2, name2, trackNo2);		
		assertEquals(2,myList2.getSize());
		
		 //cancion3
		String author3 ="Hillsong";
		String file3 ="Australia";
		String name3 = "El Eco de su Voz";
		int trackNo3 = 003;		
		
		myList2.addOrder(author3, file3, name3, trackNo3);		
		assertEquals(3,myList2.getSize());
		*/
		//OPCION 2		
		Mp3 cancion =myList2.getHead().getData();
		//verificar la informacion que este correcto
		assertEquals(author,cancion.getAuthor());
		assertEquals(file,cancion.getFile());
		assertEquals(name,cancion.getName());
		assertEquals(trackNo,cancion.getTrackNo());
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test
	//Buscar por elemento
	void testSearchElementInEmpetyList() {
	//inicializar
		LinkedList myList = new LinkedList();
		assertEquals(0,myList.getSize());
		//valor esperado
		
		String author ="Toma Tu Lugar Band";
		String file ="Argentina";
		String name = "Te amo";
		String trackNo = "002";		
		
		myList.add(author, file, name, trackNo);		
		assertEquals(1,myList.getSize());
		
		//OPCION 1		
		assertEquals(author,myList.getHead().getData().getAuthor());
		assertEquals(file,myList.getHead().getData().getFile());
		assertEquals(name,myList.getHead().getData().getName());
		assertEquals(trackNo,myList.getHead().getData().getTrackNo());
		
		//OPCION 2		
		Mp3 cancion =myList.getHead().getData();
		//verificar la informacion que este correcto
		assertEquals(author,cancion.getAuthor());
		assertEquals(file,cancion.getFile());
		assertEquals(name,cancion.getName());
		assertEquals(trackNo,cancion.getTrackNo());
		
		Mp3 searchResponse = myList.searchByName("Te amo");
		assertNotNull(searchResponse);
		
		//se crea esta forma para no poner datos quemados
		assertEquals(author,searchResponse.getAuthor());
		assertEquals(file,searchResponse.getFile());
		assertEquals(name,searchResponse.getName());
		assertEquals(trackNo,searchResponse.getTrackNo());
	}	
	
	@Test
	//Buscar por posision 
	void testSearchByPosition() {
	//inicializar
		LinkedList myList = new LinkedList();
		assertEquals(0,myList.getSize());
		//valor esperado
		
		String author ="Toma Tu Lugar Band";
		String file ="Argentina";
		String name = "Te amo";
		String trackNo = "002";		
		
		myList.add(author, file, name, trackNo);		
		assertEquals(1,myList.getSize());
		//canicon 2
		String author2 ="Rescate";
		String file2 ="Argentina";
		String name2 = "Quita Mancha";
		String trackNo2 = "005";		
		
		
		myList.add(author2, file2, name2, trackNo2);		
		assertEquals(2,myList.getSize());
		
		//cancion 3
		String author3 ="Aposento Alto";
		String file3 ="Republica Dominicana";
		String name3 = "Bomba 5";
		String trackNo3 = "007";		
		
		myList.add(author3, file3, name3, trackNo3);		
		assertEquals(3,myList.getSize());

		
		
		Mp3 searchResponse = myList.getAt(2);//ubicacion 0-1-2  -> pos 1-2-3
		assertNotNull(searchResponse);
		
		//se crea esta forma para no poner datos quemados
		assertEquals(author3,searchResponse.getAuthor());
		assertEquals(file3,searchResponse.getFile());
		assertEquals(name3,searchResponse.getName());
		assertEquals(trackNo3,searchResponse.getTrackNo());
	}	
	
}*/