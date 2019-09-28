package model;
public class Angels{
// Atributes
	private String name;
	private String power;
	private  String photo:
	private String prayer;
	private int day;
	private int mounth;
	private Candle candle;

// Relations

// Methods
	//Constructor
	public void setName(String name, String power, String photo, String prayer, int day, int mounth, Candle candle){
		this.name = name:
		this.power = power;
		this.photo = photo;
		this.prayer = prayer;
		this.day = day;
		this.mounth = mounth;
		this.candle = candle;
	}
	public Angels newAngel(){
		Angels angel = new Angels();
		return angel;
	}

	//Modifiers
	public String getName(){
		return this.name;
	}
	public void setPower(String power){
		this.power = power;
	}
	public String getPower(){
		return this.power;
	}
	public void setPhoto(String photo){
		this.photo = photo;
	}
	public String getPhoto(){
		return this.photo;
	}
	public void setPrayer(String prayer){
		this.prayer = prayer;
	}
	public String getPrayer(){
		return this.prayer;
	}
	public void setDay(int day){
		this.day = day;
	}
	public int getDay(){
		return this.day;
	}
	public void setMounth(int mounth){
		this.mounth = mounth;
	}
	public int getMounth(){
		return this.mounth;
	}

	
}