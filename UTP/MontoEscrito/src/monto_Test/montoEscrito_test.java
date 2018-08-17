package monto_Test;
import montoEscrito_pkg.MontoEscrito;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class montoEscrito_test {

	@Test
	void Unidad_Prueba() {
		MontoEscrito Monto = new MontoEscrito();
		//Cada unidad a excepción de los miles añade un espacio
		//así que se debe añadir al resultadoEsperado un espacio al inicio
		String resultadoEsperado  = " ocho";
		String resultadoObtenido = Monto.EscribirMonto(8);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	//
	@Test
	void Decenas_Prueba() {
		MontoEscrito Monto = new MontoEscrito();
		//Cada unidad a excepción de los miles añade un espacio
		//así que se debe añadir al resultadoEsperado un espacio al inicio
		String resultadoEsperado  = " setenta y seis";
		String resultadoObtenido = Monto.EscribirMonto(76);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	//
	@Test
	void Centenas_Prueba() {
		MontoEscrito Monto = new MontoEscrito();
		//Cada unidad a excepción de los miles añade un espacio
		//así que se debe añadir al resultadoEsperado un espacio al inicio
		String resultadoEsperado  = " novecientos noventa y seis";
		String resultadoObtenido = Monto.EscribirMonto(996);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	//
	@Test
	void Miles_Prueba() {
		MontoEscrito Monto = new MontoEscrito();
		//La unidad de miles no pide espacio al inicio
		//dado que es la unidad máxima que soporta el programa
		//apt
		String resultadoEsperado  = "Mil cuatrocientos noventa y dos";
		String resultadoObtenido = Monto.EscribirMonto(1492);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}

}
