public class test11	 {
    public static void main(String[] args) {
       	int row = 0 ;
		int t = row;
		int star = 0;
			while(row < 10) {
				if (row >= 5) {
					t = 8 - row;
				}
			}
			while(star < t){	
				System.out.print("*");
				star = star +1;				
			}						
			System.out.println("");
			row = row + 1;
	}
			
}
