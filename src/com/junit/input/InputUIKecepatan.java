package com.junit.input;

import java.util.Scanner;

import com.junit.kecepatan.KecepatanRataRata;


public class InputUIKecepatan {
	KecepatanRataRata kecepatan;
	double jarak, waktu;
	
	public InputUIKecepatan() {
		if(kecepatan == null) {
			kecepatan = new KecepatanRataRata();
		}
	}
	
	public void showHitungKecepatan() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukan Jarak : ");
		double jerak = scan.nextFloat();
		System.out.print("Masukan Waktu : ");
		double waktu = scan.nextFloat();
		
		System.out.println("Kecepatan rata-rata anda adalah " + kecepatan.HitungKecepatan(jerak, waktu)+ " km/jam");
	}
}
