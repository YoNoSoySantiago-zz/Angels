public class Candle{
	private String color;
	private String essence;
	private double size;
	private double luminescence;

	public void SetColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public void setEssence(String essence){
		this.essence = essence;
	}
	public String getEssence(){
		return this essence;
	}
	public void setSize(double size){
		this.size = size;
	}
	public double getSize(){
		return this.size;
	}
	public void setLuminescence(double luminescence){
		this.luminescence = luminescence;
	}
	public double getLuminescence(){
		return this.luminescence;
	}
	public static void newCandle(){
		Candle Candle = new Candle();
	}
}