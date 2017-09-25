package ar.edu.unlam.pb2.disco;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscoTest {

	Disco unDisco = new Disco(30.0,50.);
	
	@Test
	public void testGetRadioInterior() {
		double interior = unDisco.getRadioInterior();
		double esperado = 30.0;
		assertEquals(esperado, interior,0.0001);//el_tercer_termino_corresponde_a_la_tolerancia//
	}
	
	@Test
	public void testGetRadioExterior(){
		double exterior = unDisco.getRadioExterior();
		double esperado = 50.0;
		assertEquals(esperado, exterior,0.0001);
	}
	
	@Test
	public void testGetPerimetroInterior() {
		double perimInterior = unDisco.getPerimetroInterior();
		double esperado = 30.0*2*3.141592;
		assertEquals(esperado, perimInterior,0.0001);//el_tercer_termino_corresponde_a_la_tolerancia//
	}
	
	@Test
	public void testGetPerimetroExterior(){
		double perimExterior = unDisco.getPerimetroExterior();
		double esperado = 50.0*2*3.141592;
		assertEquals(esperado,perimExterior,0.0001);
	}
	@Test
	public void testSuperficieYSetters(){
		unDisco.setRadioInterior(20.0);
		unDisco.setRadioExterior(40.0);
		double valorRadioInterior = unDisco.getRadioInterior();
		double valorRadioExterior = unDisco.getRadioExterior();
		double radioTotalCalculado = valorRadioInterior + valorRadioExterior;
		double superficieCalculada = 3.141592 * radioTotalCalculado * radioTotalCalculado;
		double esperado = unDisco.getSuperficie();
		assertEquals(esperado, superficieCalculada, 0.0001);
	}
	
}
