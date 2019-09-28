package model;
public class Legion{
	private Angles[] angels = new Angels[n];

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


	public boolean checkDifferentName(String name, Angels[] angels){
		boolean result = true;
		for(int i = 0; i < angels.length && result; i++){
			if(name.toLowerCase() == angels[i].getName.toLowerCase()){
				result = false;
			}
		}
		return result;
	}

	public void showInformationName(String name, Angels[] angels){
		int aux = -1;
		for(int i = 0; i < angels.length && aux== -1;i++ ){
			if(name.toLowerCase() == angels[i].getName.toLowerCase() ){
				aux = i;
			}
		}
		if(aux != -1){
			System.out.println("name: "+ angels[aux].getName);
			System.out.println("power: "+ angels[aux].getPower);
			System.out.println("photo: "+ angels[aux].getPhoto);
			System.out.println("prayer: "+ angels[aux].getPrayer);
			System.out.println("day: "+ angels[aux].getDay);
			System.out.println("mounth: "+ angels[aux].getMounth);
			System.out.println("candle color: "+ angels[aux].getCandle.getColor);

		}else{
			System.out.println("este angel no Existe");
		}
	}

	public void showInformationPower(String power, Angels[] angels){
		int aux = -1;
		for(int i = 0; i < angels.length;i++ ){
			if(power.toLowerCase() == angels[i].getPower.toLowerCase() ){
				aux = i;
			}
		}
		if(aux != -1){
			System.out.println("name: "+ angels[aux].getName);
			System.out.println("power: "+ angels[aux].getPower);
			System.out.println("photo: "+ angels[aux].getPhoto);
			System.out.println("prayer: "+ angels[aux].getPrayer);
			System.out.println("day: "+ angels[aux].getDay);
			System.out.println("mounth: "+ angels[aux].getMounth);
			System.out.println("candle color: "+ angels[aux].getCandle.getColor);

		}else{
			System.out.println("este angel no Existe");
		}
	}

	public int calculateNumberAngels(Angels[] angels){
		int result;
		for(int i = 0; i < angels.length && Angels[i].isEmpty() == false; i++){

		}
		return result;
	}

	public String newPower(String power, ArrayList angels){
		int aux = -1;
		for(int i = 0; i < angels.size();i++ ){
			if(power.toLowerCase() == angels(i).this.power.toLowerCase() ){
				aux = i;
			}
		}
		if(aux == -1){
			Angels.setPower(power);
		}else{
			System.out.println("no es posible crear este Poder");
		}

	}

}