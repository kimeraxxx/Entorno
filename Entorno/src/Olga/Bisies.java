package Olga;

public class Bisies {
public String esBisiesto(int anno) {
	
	if (!(anno%400==0)) {
		if (!(anno%100==0)) {
			if (anno%4==0) {
				return "SI";
			
			else return "NO";
		}
		else return "NO";
			
	}
	else return "NO";	
	}
}}

