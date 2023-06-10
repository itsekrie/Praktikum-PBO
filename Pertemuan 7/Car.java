/**
 * File 		    : PolimorfismeCoercion.java
 * Deskripsi		: contoh polimorfisme coercion
 * Nama Pembuat 	: Fahriant Ekrie
 * NIM			    : 24060121130071
 */
package com.oracle.training;

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}

