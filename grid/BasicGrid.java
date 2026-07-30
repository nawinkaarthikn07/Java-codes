package grid;
public class BasicGrid {
	static void grid(int n) {
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	int n=5;
	grid(n);
	}
}