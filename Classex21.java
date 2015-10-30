/**
 * Name- Nathnael Atsbeha
 * Date- 11/01/2015
 * Contact- Natitad@gmail.com(for any kind of use)
 * Descrption - This program finds average of any ten number inserted
 */
import java.util.Scanner;
public class Classex21 {
	public static void main(String[] args){
	double A,B,C,D,E,F,G,H,I,J,Ave;//initializing 
	Scanner Keyboard = new Scanner(System.in);//Using Scanner
	Keyboard.useDelimiter(",");//Using "," As a Delimiter
	System.out.println("Enter \n 10 Number(Using the Delimiter)");//The program prompts the user to enter 10 numbers using comma and used escape sequence
	A = Keyboard.nextDouble();//Enter the Number
	B = Keyboard.nextDouble();//Enter the Number
	C = Keyboard.nextDouble();//Enter the Number
	D = Keyboard.nextDouble();//Enter the Number
	E = Keyboard.nextDouble();//Enter the Number
	F = Keyboard.nextDouble();//Enter the Number
	G = Keyboard.nextDouble();//Enter the Number
	H = Keyboard.nextDouble();//Enter the Number
	I = Keyboard.nextDouble();//Enter the Number
	J = Keyboard.nextDouble();//Enter the Number
	System.out.println("\"Calculating average ....\"");//Calculating average
	Ave = (A+B+C+D+E+F+G+H+I+J)/10;//Formula for Average
	System.out.println("The Average is \t" + Ave );//Displays Answer
	}
}
