
public class DifferentVectorSizeException extends Exception{

		public static final long serialVersionUID = 1L;
		
		public DifferentVectorSizeException(int s1, int s2){
			System.out.println("Wektory nie sa rownej dlugosci! Wektor pierwszy to: "+s1+" Wektor drugi to: "+s2);
		}
}
