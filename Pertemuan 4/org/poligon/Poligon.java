/**
* File : MPoligon.java 15/03/23
* Penulis : Fahriant Ekrie/24060121130071
* Deskripsi : representasi dasar dari objek poligon (segi banyak)
*/


package org.poligon;

public class Poligon{
		protected int jumlahSisi;
		
		public void Poligon(){
			jumlahSisi = 0;
		}
		
		public int getJumlahSisi(){
			return this.jumlahSisi;
		}
		
		public void setJumlahSisi(int sisi){
			jumlahSisi = sisi;
		}
		
	
	}