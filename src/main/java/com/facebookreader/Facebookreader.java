package com.facebookreader;

import java.io.IOException;

public class Facebookreader {
	
	private Facebookreader() {
	}
	public static Facebookreader facebookread() {

		Facebookreader fbr = new Facebookreader();
		return fbr;
	}
	public Facebookconfigure getconfig() throws IOException {
		Facebookconfigure fbc = new Facebookconfigure();
		return fbc;
	}
}
