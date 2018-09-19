package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap2.DoubleLinkNode;
import cap2.DoubleLinkedList;
import cap2.MP3;

class DoubleLinkedListTest {

	@Test
	void testInsertaPorCola() {
	DoubleLinkedList myList = new DoubleLinkedList();
	
	String author = "Aerosmith";
	String song = "jjfdsklf3424432kdkjsflkjsgf##@#";
	String name = "Amazing";
	String trackNo = "4";
	DoubleLinkNode node = new DoubleLinkNode(name,author,song,trackNo);
	myList.insertaPorCola(node);
	
	MP3 cancion = myList.getHead().getDato();
	
	assertEquals(author, cancion.getAuthor());
	assertEquals(song, cancion.getSong());
	assertEquals(name, cancion.getName());
	assertEquals(trackNo, cancion.getTrackNo());
	
	}

	@Test
	void testInsertaPorCabeza() {
    DoubleLinkedList myList = new DoubleLinkedList();
    String author = "ozuna";
    String song = "farsante";
    String name = "farsante";
    String trackNo = "0008";
    
    DoubleLinkNode node = new DoubleLinkNode(name,author,song,trackNo);
    myList.insertaPorCabeza(node);
    
    MP3 cancion = myList.getHead().getDato();
	
	assertEquals(author, cancion.getAuthor());
	assertEquals(song, cancion.getSong());
	assertEquals(name, cancion.getName());
	assertEquals(trackNo, cancion.getTrackNo());
	
	}

	@Test
	void testInsertaOrdenado() {
	DoubleLinkedList myList = new DoubleLinkedList();
	
	String author = "anuel";
	String song = "bebe";
	String name = "bebe";
	String trackNo = "00015";
	
	DoubleLinkNode node = new DoubleLinkNode(name,author,song,trackNo);
	myList.insertaOrdenado(node);
	
	MP3 cancion = myList.getHead().getDato();
	
	assertEquals(author, cancion.getAuthor());
	assertEquals(song, cancion.getSong());
	assertEquals(name, cancion.getName());
	assertEquals(trackNo, cancion.getTrackNo());
	
	
	
	}

	@Test
	void testListar() {
	DoubleLinkedList myList = new DoubleLinkedList();
	
	String valoresperado="3";
	
	String author = "Aerosmith";
	String song = "jjfdsklf3424432kdkjsflkjsgf##@#";
	String name = "Amazing";
	String trackNo = "4";
	DoubleLinkNode node = new DoubleLinkNode(name,author,song,trackNo);

	author = "ozuna";
	song = "farsante";
	name = "farsante";
	trackNo = "0008";
	DoubleLinkNode node2 = new DoubleLinkNode(name,author,song,trackNo);

	author = "anuel";
	song = "bebe";
	name = "bebe";
	trackNo = "00015";
	DoubleLinkNode node3 = new DoubleLinkNode(name,author,song,trackNo);

	myList.insertaPorCola(node);
	myList.insertaPorCola(node2);
	myList.insertaPorCola(node3);
	
	String valorobtenido = myList.listar(myList);
			
	assertEquals(valoresperado, valorobtenido);
	
	
	}
    
	@Test
	void testbuscarportrack() {
		
	}
	
	
	
	
	
	@Test
	void testEliminaportrack() {
		
	}

}
