public class Candle{
	public static String[] newCandle(String color, String essence, double size,double luminescence){
		String[] result = new String[4];
		result[0] = color;
		result[1] = essence;
		result[2] = String.valueOf(size);
		result[3] = String.valueOf(luminescence);
return result;
	}
}