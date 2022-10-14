public class test9	 {
    public static void main(String[] args) {
       	int row = 0 ;
		int row2 = 0 ;

		String text = "*" ;
		
			while(row < 5) {
				int star = 0;
						while(star <= row){	
							System.out.print(text);
							star = star + 1;
						}
						
				System.out.println("");
				row = row + 1;
			}
			
	}
}