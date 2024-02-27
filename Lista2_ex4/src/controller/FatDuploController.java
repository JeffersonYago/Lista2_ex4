package controller;

public class FatDuploController {

	public FatDuploController() {
		super();
	}
	public int FatDuplo(int a) {
		if (a <= 0) {
			return 1;
		}else {
			return a * FatDuplo(a-2);
		}
	}
}
