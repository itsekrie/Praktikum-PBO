/**
 * File 		    : PolimorfismeCoercion.java
 * Deskripsi		: contoh polimorfisme coercion
 * Nama Pembuat 	: Fahriant Ekrie
 * NIM			    : 24060121130071
 */
package com.oracle.training;

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}
