package com.tsif.Abstraction;
abstract class Filecompressor {
	abstract void compress(String filename);
	void showdetails() {
		System.out.println("Compression started...");
	}
}

class Zipcompressor extends Filecompressor {

	@Override
	void compress(String filename) {
		System.out.println("Compressing using zip...");
		int originalsize=100;
		int compressedsize=originalsize*60/100;
		System.out.println("original Size:"+originalsize+"MB");
		System.out.println("Compressed Size:"+compressedsize+"MB");
		
	}
	
}

class GZipcompressor extends Filecompressor {
	
	@Override
	void compress(String filename) {
		System.out.println("Compressing using zip...");
		int originalsize=100;
		int compressedsize=originalsize*50/100;
		System.out.println("original Size:"+originalsize+"MB");
		System.out.println("Compressed Size:"+compressedsize+"MB");
		
	}
	
}

public class CompressionApp {
	public static void main(String[] args) {
		
		Zipcompressor z=new Zipcompressor();
		z.compress("project.zip");
		System.out.println();
		
		GZipcompressor g=new GZipcompressor();
		g.compress("project.gz");
			
		}
	}

