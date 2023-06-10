package org.main;

import org.kubus.Kubus;
import org.bangundatar.BujurSangkar;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Luas Alas  : "+bujurSangkar.hitungLuas());
		System.out.println("Luas Permukaan Kubus  : "+kubus.hitungLuasAlas());
		System.out.println("Volume Kubus  : "+kubus.hitungVolume());
	}
}
