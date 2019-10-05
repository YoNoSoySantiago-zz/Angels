package model;
public class Angels{
// Atributes
	private String name;
	private String power;
	private String photo;
	private String prayer;
	private int day;
	private int month;
    private Candle candle;

// Methods
	//Constructor
	public Angels(String name, String power, String photo, String prayer, int day, int month, Candle candle){
		this.name = name;
		this.power = power;
		this.photo = photo;
		this.prayer = prayer;
		this.day = day;
		this.month = month;
		this.candle = candle;
	}

	//Modifiers
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
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
	public void setMonth(int month){
		this.month = month;
	}
	public int getMonth(){
		return this.month;
	}
	public void setCandle(Candle candle){
		this.candle = candle;
	}
	public Candle getCandle(){
		return this.candle;
	}

	
}