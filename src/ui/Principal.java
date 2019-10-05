package ui;
import java.util.Scanner;
import model.*;

public class Principal{
	private Scanner S;
	private Legion legions;
	private Candle candle;
	public Principal(){
		init();
		S = new Scanner(System.in);
	}

	public void main(String[] args){
		Principal principal = new Principal();
		int process,day,month,process2;
		double luminescence,size;
		String name,power,photo,prayer,color,essencence;
		boolean result1 = false,result2=false;
		do{
		principal.showMenu();
		process = S.nextInt();
		switch (process){
			//Crear Angel
			case 1:
			while(result1 && result2){
				System.out.println("por favor ingrese el nombre del arcangel(recuerde que e nombre debe termianr es 'el' y que los arcangeles Miguel y gabriel ya han sido creados): ");
			    name = S.nextLine();
			    result1 = legions.checkSyllable(name);
			    result2 = legions.checkDifferentName(name);
			    if(result1 == false || result2 == false){
				System.out.println("este nombre no es valido");
			}
		}
			result2 = false;result1=false;
			while(result1 && result2){
				 System.out.println("escoja el poder: \n"+
			    	"1. Sabiduría divina\n"+
			    	"2. Amor impersonal\n"+
			    	"3. Transmutación\n"+
			    	"4. Cura enfermedades psicosomáticas\n"+
			    	"5. Sanación\n"+
			    	"6. Crar un poder: \n"+
			    	"7. Cancelar");
				 process2 = S.nextInt();
				if(process2 == 6){
					power = S.nextLine();
					result1 = legions.newPower(power);
				}else if(process != 7){
				switch (process){
					case 1:
					power = "Sabiduría divina";
					result1 = legions.newPower(power);
					break;

					case 2:
					power = "Amor impersonal";
					result1 = legions.newPower(power);
					break;

					case 3:
					power = "Transmutación";
					result1 = legions.newPower(power);
					break;

					case 4:
					power = "Cura enfermedades psicosomáticas";
					result1 = legions.newPower(power);
					break;

					case 5:
					power = "Sanación";
					result1 = legions.newPower(power);
					break;
				}
			}
			if(result1 == false || result2 == false){
				System.out.println("este poder no es valido");
			}
		}
	        System.out.println("ingrese el nombre o direccion de la foto del arcangel(ejemplo: arcangel.jpg ó https://www.google.com.eg/url?sa=i&source=images&cd=&ved=2ahUKEwj-xpLv-PvkAhXQxlkKHTVyDC0QjRx6BAgBEAQ&url=https%3A%2F%2Fhermandadblanca.org%2Flos-siete-arcangeles-significado%2F&psig=AOvVaw1a2d-H3y1AQdeROsgocfyh&ust=1570049645919489");
            photo = S.nextLine();
            System.out.println("ingrese la oracion perteneciente al arcangel");
            prayer = S.nextLine();
            while(result1 == false){
            System.out.println("ingrese la fecha del arcangel\n"+
	                           "Día: ");
	        day = S.nextInt();
	        System.out.println("mes: ");
            month = S.nextInt();
	        result1 = legions.verifyDate(day,month);
	        if(result1 == false){
		        System.out.println("esta fecha no es valida");
	    }
    }
            System.out.println("por ultimo cree la vela correspondiente para este arcangel\n"+
	                       "1. indique el color de la vela: ");
            color = S.nextLine();
            System.out.println("2. indique la esencia: ");
            essencence = S.nextLine();
            System.out.println("3. indique el tamaño de la vela en cm");
            size = S.nextDouble();
            System.out.println("4. indique el nivel de luminicencia de la vela");
            luminescence = S.nextDouble();
            candle.setColor(color);candle.setEssence(essencence);candle.setSize(size);candle.setLuminescence(luminescence);

            break;
			case 2:
			System.out.println("la cantidad de arcangeles agregados son: "+ legions.calculateNumberAngels());
			break;
			case 3:
			System.out.println("indique el nombre del arcangel que desea buscar");
			name = S.nextLine();
			System.out.println("Su arcangel es: ");
			legions.showInformationName(name);
			break;
			case 4:
			System.out.println("indique el poder del arcangel que desea buscar");
			power = S.nextLine();
			System.out.println("Su arcangel es: ");
			legions.showInformationName(power);
			break;
			case 5:
			System.out.println("Indique el mes(en numeros del 1 al 12) en el que desea buscar");
			month = S.nextInt();
			legions.showDatesMonth(legions.converterToMonth(month));
			break;
			case 6:
			legions.showAllDates();
			break;
		}
		}while(process != 0);
	

	}


	public void showMenu(){
		System.out.println("Bienvenido!\n"+
			"1. Agregar Arcangel\n"+
			"2. Mostrar cantidad de Arcangeles\n"+
			"3. Desplgar información de un Arcangel con su nombre\n"+
			"4. Desplgar informacion de un Arcangel con su poder\n"+
			"5. Desplegar las celebraciones de un mes\n"+
			"6. Desplegar todas las celebraciones\n"+
			"0. Salir");
		}

	
	// valores predeterminados 
	public void init(){
		Candle candle = new Candle("Azul","Lavanda",15,0.5);
		Legion legions = new Legion();
		legions.addAngel("Miguel","Curar","miguel.jpg","hola miguelito",23,"Julio",candle);
		candle.setColor("Rojo");candle.setEssence("Limon");candle.setSize(21);candle.setLuminescence(0.8);
		legions.addAngel("Gabriel","volar","gabriel.jpg","holi UwU",12,"Diciembre",candle);
	}
}



