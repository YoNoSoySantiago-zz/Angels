package model;
public class Angels{
// Atributes
	private String name;
	private String power;
	private String photo;
	private String prayer;
	private int day;
	private String month;
    private Candle candle;

// Methods
	//Constructor
	public Angels(String name, String power, String photo, String prayer, int day, String month, Candle candle){
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
	public String getPower(){
		return this.power;
	}
	public String getPhoto(){
		return this.photo;
	}
	public String getPrayer(){
		return this.prayer;
	}
	public int getDay(){
		return this.day;
	}
	public String getMonth(){
		return this.month;
	}
	public Candle getCandle(){
		return this.candle;
	}

	
}