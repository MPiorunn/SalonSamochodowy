package com.konrad_janek.SalonSamochodowy.Exceptions;

/**
 * @author Konrad Zolynski | https://github.com/Konrad-code | konrad.zolynski@gmail.com | +48 533 683 168
**/

public class NoLowercaseLetter extends Exception{
	public NoLowercaseLetter(){
		System.out.println("Password with no lowercase letters. Password has to contain at least 1 lowercase letter");
//		JOptionPane.showMessageDialog(null, "Password with no lowercase letters. Password has to contain at least 1 lowercase letter");
	}
}