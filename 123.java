public class triangle2
{
    public static void main (String[] args) {
        draw(3); // 畫出三層三角形
    }

    static void draw(int layer) {
    	
    	for (int j = 1 ; j <= layer ; j++) {
			for (int i = layer ; i > j ; i--) {
				System.out.print(" ");
			}
			for (int i = 1 ; i <= 2 * j - 1 ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
    	
    }
}