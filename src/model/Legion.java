package model;
import java.util.ArrayList;

public class Legion{
	//Atributes
	private ArrayList<Angels> archangel = new ArrayList<Angels>();

//Mtodos
	/**
	<p> desc: <p> Receive attributes for a new archangel, this method allows you to create and add an angel object, to the list of archangels
	<p> post: <p> You must instantiate the Angels class within the method
	<p> pre: <p> An ArrayList of Angels must already be instantiated	
	@Params *, todos los atributos representan a los atributos correspondientes de la clase Angels
	*/
	public void addAngel(String name, String power, String photo, String prayer, int day, String month,Candle candle){
		Angels angels = new Angels(name,power,photo,prayer,day,month,candle);
		archangel.add(angels);

	}
	/**
	<p> desc: <p> Recibe una cadena de caracteres, este metodo permite comprobar si la cadena recibida termina en 'el' o no
	@Param name, this parameter represents a character string
        @Return este este metodo representa un valor de verdad, el cual respresenta si el parametro termina en el o no 	
	*/

	public boolean checkSyllable(String name){
		boolean result;
		char[] arrayName;
		arrayName = name.toCharArray();
		if(arrayName[arrayName.length - 1] =='l' || arrayName[arrayName.length - 1] == 'L'){
			if(arrayName[arrayName.length - 2] =='e' || arrayName[arrayName.length - 2] =='E'){
				result = true;
			}else{
				result = false;
			}
		}else{
			result = false;	
		}
		return result;
	}

   	/**
	<p> desc: <p> Receive a string of characters, this method allows you to check if the entered parameter is equal to the attribute
	name of at least one of the angels in the arrangement of angels
	<p> pre: <p> An ArrayList of Angels must already be instantiated
	@Param name, this parameter represents a character string
	@Return this method returns a true value, which represents whether or not the entered parameter is equal to the name attribute of
	at least one of the angels in the arrangement of angels
	*/	
	public boolean checkDifferentName(String name){
		boolean result = true;
		for(int i = 0; i < archangel.size() && result; i++){
			if(archangel.get(i).getName().equalsIgnoreCase(name)){
				result = false;
			}
		}
		return result;
	}
	
	/**
	<p> desc: <p> Receive a string of characters, this method displays the list of all the attributes of the entered parameter on the screen
	pertaining to the Angel class, the parameter must represent the name attribute of the angel class
	<p> pre: <p> An ArrayList of Angels must already be instantiated
	@Param name, this parameter represents a character string
	*/
	public void showInformationName(String name){
		int aux = -1;
		for(int i = 0; i < archangel.size() && aux== -1;i++ ){
			if(archangel.get(i).getName().toLowerCase().equalsIgnoreCase(name) ){
				aux = i;
			}
		}
		if(aux != -1){
			System.out.println("name: "+ archangel.get(aux).getName());
			System.out.println("power: "+ archangel.get(aux).getPower());
			System.out.println("photo: "+ archangel.get(aux).getPhoto());
			System.out.println("prayer: "+ archangel.get(aux).getPrayer());
			System.out.print("date: "+ archangel.get(aux).getMonth());
			System.out.println(" "+ archangel.get(aux).getDay());
			System.out.println("candle color: "+ archangel.get(aux).getCandle().getColor());

		}else{
			System.out.println("este angel no Existe");
		}
	}
	
	/**
	<p> desc: <p> Receive a string of characters, this method displays the list of all the attributes of the entered parameter on the screen
	pertaining to the Angel class, the parameter must represent the power attribute of the angel class
	<p> pre: <p> An ArrayList of Angels must already be instantiated
	@Param name, this parameter represents a character string
	*/
	public void showInformationPower(String power){
		int aux = -1;
		for(int i = 0; i < archangel.size();i++ ){
			if(archangel.get(i).getPower().equalsIgnoreCase(power) ){
				aux = i;
			}
		}
		if(aux != -1){
			System.out.println("name: "+ archangel.get(aux).getName());
			System.out.println("power: "+ archangel.get(aux).getPower());
			System.out.println("photo: "+ archangel.get(aux).getPhoto());
			System.out.println("prayer: "+ archangel.get(aux).getPrayer());
			System.out.print("date : "+ archangel.get(aux).getMonth());
			System.out.println(" "+ archangel.get(aux).getDay());
			System.out.println("candle color: "+ archangel.get(aux).getCandle().getColor());

		}else{
			System.out.println("este angel no Existe");
		}
	}

	/**
	<p> desc: <p> This method allows you to calculate the number of Objects within the array of archangels onjetos
	<p> pre: <p> An ArrayList of Angels must already be instantiated
  	@Return this method returns a positive integer that represents the number of objects in the array
	*/
	public int calculateNumberAngels(){
		int result = archangel.size();
		return result;
	}

	/**
	<p> desc: <p> receives a string of characters, this method allows you to check if the entered parameter is equal to the attribute
power of at least one of the angels in the arrangement of angels
<p> pre: <p> An ArrayList of Angels must already be instantiated
@Param power, this parameter represents a character string
@Return this method returns a true value, which represents whether or not the entered parameter is equal to the power attribute of
at least one of the angels in the arrangement of angels
	*/ 	
	public boolean newPower(String power){
		boolean result = true;
		for(int i = 0; i < archangel.size() && result == true;i++ ){
			if(archangel.get(i).getPower().equalsIgnoreCase(power)){
				result = false;
			}
		}
		return result;
		
		}
	/**
	<P> desc: <p> recibe dos numeros enteros, este metodo permite comprobar si una fecha ingresada en formato numerico es valida o no
	@param day, este parametro es un numero entero
	@Param month, este parametro es un numero entero
	@Return este metodo retorna un valor de verda que indica si los valores ingresados representan una fecha valida o no
	*/ 
	public boolean verifyDate(int day,int month){
		boolean result = false;
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
			if(day <= 31 && day > 0){
				result = true;
			}
		
		}else if(month == 2){
			if(day <=29 && day > 0){
				result = true;
			}
		}else{
			if(day<=30 && day > 0){
				result = true;
			}
		}
		if(month > 12 || month < 0){
			result = false;
		}
		return result;
	}
	
	/**
	<p> desc <p> Recibe una cadena de caracteres, este metodo permite mostrar por pantalla los atributos name, day, month de la clase Angels y 
	los atributos color y essence de la clase Candle , siempre y cuando el atributo month de la clase Angels sea igual al parametro 
	<p> pre: <p> An ArrayList of Angels must already be instantiated
	@Param month, este parametro es una cadena de Caracteres
	*/
	public void showDatesMonth(String month){
		for(int i = 0; i < archangel.size(); i++){
			if(archangel.get(i).getMonth().equals(month)){
			    System.out.println(archangel.get(i).getName()+": "+archangel.get(i).getDay()+" de "+archangel.get(i).getMonth()+" \ncolor de vela: "+archangel.get(i).getCandle().getColor()+"\nesencia de: "+archangel.get(i).getCandle().getEssence());	
			}
		}
	}
	public void showAllDates(){
		for(int i = 0; i < archangel.size(); i++){
				System.out.println(archangel.get(i).getName()+": "+archangel.get(i).getDay()+" de "+archangel.get(i).getMonth());
			
			}

	}
	/**
	<p> desc: <p> Recibe un numero entero, este metodo permite convertir un numero del 1 al 12 en formato de meses del year
	@Param este parametro representa un numero entero del 1 al 12
	@Return este metodo retorna una cadena de caracteres la cual representa uno de los 12 meses del year
	*/
	public String converterToMonth(int month){
		String result = "";
		switch(month){
  case 1:
    {
      result="Enero";
      break;
    }
  case 2:
    {
      result="Febrero";
      break;
    }
  case 3:
    {
      result="Marzo";
      break;
    }
  case 4:
    {
      result="Abril";
      break;
    }
  case 5:
    {
      result="Mayo";
      break;
    }
  case 6:
    {
      result="Junio";
      break;
    }
  case 7:
    {
      result="Julio";
      break;
    }
  case 8:
    {
      result="Agosto";
      break;
    }
  case 9:
    {
      result="Septiembre";
      break;
    }
  case 10:
    {
      result="Octubre";
      break;
    }
  case 11:
    {
      result="Noviembre";
      break;
    }
  case 12:
    {
      result="Diciembre";
      break;
    }
  default:
    {
      result="Error";
      break;
    }
}
return result;

	}
	

	
	
}