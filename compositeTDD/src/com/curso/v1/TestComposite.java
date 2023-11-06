package com.curso.v1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestComposite {

	@Test
	void testConstante1() {
		double d = 5.0;
		Component c1 = new LeafConstante(d);
		assertEquals(d, c1.operation());
	}
	
	@Test
	void testConstante2() {
		double d = -6.0;
		Component c1 = new LeafConstante(d);
		assertEquals(d, c1.operation());
	}
	
	@Test
	void testSuma() {
		double d1 = -6.0;
		double d2 = 8.0;
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		Component c3 = new CompositeSuma(c1,c2);
		assertEquals(d1+d2, c3.operation());
	}
	
	@Test
	void testSuma2() {
		double d1 = -6.0;
		double d2 = 8.0;
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		Component c3 = new CompositeSuma(c1,c2);
		assertEquals(d1+d2, c3.operation());
		
		double d3 = -4.0;
		double d4 = 1.0;
		Component c4 = new LeafConstante(d3);
		Component c5 = new LeafConstante(d4);
		Component c6 = new CompositeSuma(c4,c5);
		assertEquals(d3+d4, c6.operation());
		
		Component c7 = new CompositeSuma(c3,c6);
		
		assertEquals(d1+d2+d3+d4, c7.operation());
	}
	
	@Test
	void testResta() {
		double d1 = -6.0;
		double d2 = 8.0;
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		Component c3 = new CompositeResta(c1,c2);
		assertEquals(d1-d2, c3.operation());
		
		double d3 = -4.0;
		double d4 = 1.0;
		Component c4 = new LeafConstante(d3);
		Component c5 = new LeafConstante(d4);
		Component c6 = new CompositeResta(c4,c5);
		assertEquals(d3-d4, c6.operation());
		
		Component c7 = new CompositeResta(c3,c6);
		
		assertEquals(d1-d2-(d3-d4), c7.operation());
	}
	
	@Test
	void testMulti() {
		double d1 = -6.0;
		double d2 = 8.0;
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		Component c3 = new CompositeMulti(c1,c2);
		assertEquals(d1*d2, c3.operation());
		
		double d3 = -4.0;
		double d4 = 1.0;
		Component c4 = new LeafConstante(d3);
		Component c5 = new LeafConstante(d4);
		Component c6 = new CompositeMulti(c4,c5);
		assertEquals(d3*d4, c6.operation());
		
		Component c7 = new CompositeMulti(c3,c6);
		
		assertEquals(d1*d2*d3*d4, c7.operation());
	}
	
	@Test
	void testDiv() {
		double d1 = -6.0;
		double d2 = 8.0;
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		Component c3 = new CompositeDiv(c1,c2);
		assertEquals(d1/d2, c3.operation());
		
		double d3 = -4.0;
		double d4 = 1.0;
		Component c4 = new LeafConstante(d3);
		Component c5 = new LeafConstante(d4);
		Component c6 = new CompositeDiv(c4,c5);
		assertEquals(d3/d4, c6.operation());
		
		Component c7 = new CompositeDiv(c3,c6);
		
		assertEquals((d1/d2)/(d3/d4), c7.operation());
	}
	
	@Test
	void testComplejo() {
		double d1 = -6.0;
		double d2 = 8.0;
		double d3 = -4.0;
		double d4 = 1.0;
		double d5 = 5.0;
		double d6 = 2.0;
		
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		Component c3 = new LeafConstante(d3);
		Component c4 = new LeafConstante(d4);
		Component c5 = new LeafConstante(d5);
		Component c6 = new LeafConstante(d6);
		
		Component c7 = new CompositeSuma(c1,c2);
		Component c8 = new CompositeResta(c3,c4);
		Component c9 = new CompositeMulti(c5,c6);
		Component c10 = new CompositeDiv(c7,c8);
		Component c11 = new CompositeSuma(c9,c10);

		assertEquals((d5*d6)+((d1+d2)/(d3-d4)), c11.operation());
	}
	
	@Test
	void testComplejo2() {
		
		Component c = new CompositeSuma(
				new CompositeMulti(
						new LeafConstante(5.0),
						new LeafConstante(2.0)
						),
				new CompositeDiv(
						new CompositeSuma(
								new LeafConstante(-6.0),
								new LeafConstante(8.0)
								),
						new CompositeResta(
								new LeafConstante(-4.0),
								new LeafConstante(1.0)
								)
						)
				);
				
		assertEquals((5.0*2.0)+((-6.0+8.0)/(-4.0-1.0)), c.operation());
	}
	
	@Test
	void testComplejo3() {
		
		Component c = new CompositeSuma(
				new CompositeMulti(
						new LeafConstante(5.0),
						new LeafConstante(2.0)
						),
				new CompositeDiv(
						new CompositeSuma(
								new LeafConstante(-6.0),
								new LeafConstante(8.0)
								),
						new CompositeResta(
								new LeafConstante(-4.0),
								new LeafConstante(1.0)
								)
						)
				);
				
		assertEquals(9.66, c.operation(),0.08);
	}
	

}
