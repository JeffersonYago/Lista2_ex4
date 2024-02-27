package main;

import javax.swing.JOptionPane;

import controller.FatDuploController;

public class Principal {

	public static void main(String[] args) {
		FatDuploController fdc = new FatDuploController();
		int a = Integer.parseInt(JOptionPane.showInputDialog("insira um número impar"));
		if(a % 2 == 0) {
			a = Integer.parseInt(JOptionPane.showInputDialog("insira um número impar!"));
		}
		int res = fdc.FatDuplo(a);
		System.out.println(res);
	}

}
