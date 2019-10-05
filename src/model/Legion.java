package model;
import java.util.ArrayList;

public class Legion{
	private ArrayList<Angels> archangel;

	public void addAngel(String name, String power, String photo, String prayer, int day, String month,Candle candle){
		Angels angels = new Angels(name,power,photo,prayer,day,month,candle);
		archangel.add(angels);

	}
	public void addCandle(String color, String essence, double size, double luminescence){
		Candle candle = new Candle(color,essence,size,luminescence);
	}

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


	public boolean checkDifferentName(String name){
		boolean result = true;
		for(int i = 0; i < archangel.size() && result; i++){
			if(name.toLowerCase() == archangel.get(i).getName().toLowerCase()){
				result = false;
			}
		}
		return result;
	}

	public void showInformationName(String name){
		int aux = -1;
		for(int i = 0; i < archangel.size() && aux== -1;i++ ){
			if(name.toLowerCase() == archangel.get(i).getName().toLowerCase() ){
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

	public void showInformationPower(String power){
		int aux = -1;
		for(int i = 0; i < archangel.size();i++ ){
			if(power.toLowerCase() == archangel.get(i).getPower().toLowerCase() ){
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

	public int calculateNumberAngels(){
		int result = archangel.size();
		return result;
	}
/*
	public String verifyNotSimilarPower(Angels a){
		String msj = "";
		boolean t = false;

		for(int i = 0; i < archangel.size() && !t;i++){
			if(archangel.get(i).getPower().equalsIgnoreCase(a.getPower())){
				t = true;
				msj = "No se pudo agregar";
			}

		}
		if(t == false){
			msj = "Se agrego el angel";
			archangel.add(a);
		}


		return msj;

	}
	**/

	
	public boolean newPower(String power){
		boolean result = true;
		for(int i = 0; i < archangel.size() && result == true;i++ ){
			if(archangel.get(i).getPower().equalsIgnoreCase(power)){
				result = false;
			}
		}
		return result;
		
		}
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
	public void showDatesMonth(String month){
		for(int i = 0; i < archangel.size(); i++){
			if(archangel.get(i).getMonth().equals(month)){
			    System.out.println(archangel.get(i).getName()+": "+archangel.get(i).getDay()+" de "+archangel.get(i).getMonth()+" vela: "+archangel.get(i).getCandle().getColor()+" de "+archangel.get(i).getCandle().getEssence());	
			}
		}
	}
	public void showAllDates(){
		for(int i = 0; i < archangel.size(); i++){
				System.out.println(archangel.get(i).getName()+": "+archangel.get(i).getDay()+" de "+archangel.get(i).getMonth());
			
			}

	}
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