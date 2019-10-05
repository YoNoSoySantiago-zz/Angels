package ui;
import java.util.Scanner;
import model.*;
import java.util.Scanner;

public class Principal{
	private Scanner S;
	private Legion legions = new Legion();
	private Candle candle;
	public Principal(){
		
	}

	public static void main(String[] args){
		Principal principal = new Principal();
		principal.init();
		Scanner S = new Scanner(System.in);
		Scanner N = new Scanner(System.in);
		int process,day=0,month=1,process2;
		double luminescence,size;
		String name="",power="",photo="",prayer="",color="",essencence="";
		boolean result1 = false,result2=false;
		do{
		principal.showMenu();
		process = N.nextInt();
		switch (process){
			//Crear Angel
			case 1:
			result1 =false;
			result2=false;
			while(result1== false || result2 == false){
				System.out.println("por favor ingrese el nombre del arcangel(recuerde que e nombre debe termianr es 'el' y que los arcangeles Miguel y gabriel ya han sido creados): ");
			    name = S.nextLine();
			    result1 = principal.legions.checkSyllable(name);
			    result2 = principal.legions.checkDifferentName(name);
			    if(result1 == false || result2 == false){
				System.out.println("este nombre no es valido");
			}
		}
			result2 = false;result1=false;
			while(result1==false ){
				 System.out.println("escoja el poder: \n"+
			    	"1. Sabiduría divina\n"+
			    	"2. Amor impersonal\n"+
			    	"3. Transmutación\n"+
			    	"4. Cura enfermedades psicosomáticas\n"+
			    	"5. Sanación\n"+
			    	"6. Crar un poder: \n"+
			    	"7. Cancelar");
				 process2 = N.nextInt();
				if(process2 == 6){
					power = S.nextLine();
					result1 = principal.legions.newPower(power);
				}else if(process != 7){
				switch (process){

					case 1:
					power = "Sabiduría divina";
					result1 = principal.legions.newPower(power);
					break;

					case 2:
					power = "Amor impersonal";
					result1 = principal.legions.newPower(power);
					break;

					case 3:
					power = "Transmutación";
					result1 = principal.legions.newPower(power);
					break;

					case 4:
					power = "Cura enfermedades psicosomáticas";
					result1 = principal.legions.newPower(power);
					break;

					case 5:
					power = "Sanación";
					result1 = principal.legions.newPower(power);
					break;
				}
			}
			if(result1 == false){
				System.out.println("este poder no es valido");
			}
		}
	        System.out.println("ingrese el nombre o direccion de la foto del arcangel (ejemplo: arcangel.jpg) ");
            photo = S.nextLine();
            System.out.println("ingrese la oracion perteneciente al arcangel");
            prayer = S.nextLine();
            result1 = false;
            while(result1 == false){
            System.out.println("ingrese la fecha del arcangel (en formato numerico)\n"+
	                           "Día: ");
	        day = N.nextInt();
	        System.out.println("mes: ");
            month = N.nextInt();
	        result1 = principal.legions.verifyDate(day,month);
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
            size = N.nextDouble();
            System.out.println("4. indique el nivel de luminicencia de la vela");
            luminescence = N.nextDouble();
            principal.candle = new Candle(color,essencence,size,luminescence);
            principal.legions.addAngel(name,power,photo,prayer,day,principal.legions.converterToMonth(month),principal.candle);

            break;
			case 2:
			System.out.println("la cantidad de arcangeles agregados son: "+ principal.legions.calculateNumberAngels());
			break;
			case 3:
			System.out.println("indique el nombre del arcangel que desea buscar");
			name = S.nextLine();
			System.out.println("Su arcangel es: ");
			principal.legions.showInformationName(name);
			break;
			case 4:
			System.out.println("indique el poder del arcangel que desea buscar");
			power = S.nextLine();
			System.out.println("Su arcangel es: ");
			principal.legions.showInformationPower(power);
			break;
			case 5:
			System.out.println("Indique el mes(en numeros del 1 al 12) en el que desea buscar");
			month = N.nextInt();
			principal.legions.showDatesMonth(principal.legions.converterToMonth(month));
			break;
			case 6:
			principal.legions.showAllDates();
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
		legions.addAngel("Miguel","Curar","miguel.jpg","hola miguelito",23,"Julio",new Candle("Azul","Lavanda",15,0.5));
		candle.setColor("Rojo");candle.setEssence("Limon");candle.setSize(21);candle.setLuminescence(0.8);
		legions.addAngel("Gabriel","volar","gabriel.jpg","holi UwU",12,"Diciembre",candle);
	}
}



