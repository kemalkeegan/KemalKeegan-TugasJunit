package com.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.junit.kecepatan.KecepatanRataRata;

public class TestingKecepatanRataRata {
	KecepatanRataRata kecepatan;

	@Before
	public void setUp() throws Exception {
		kecepatan = new KecepatanRataRata();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHitungKecepatan() {
		
		assertEquals(40.0, kecepatan.HitungKecepatan(200.0, 5.0),0.0);
			
		
	}
	

}
