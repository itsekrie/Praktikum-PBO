
/**
* File : MPoligon.java 15/03/23
* Penulis : Fahriant Ekrie/24060121130071
* Deskripsi : representasi dari objek persegi panjang, turunan kelas poligon
*/


package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	
	public double getPanjangSisi(){
		return panjangSisi;
	}
}