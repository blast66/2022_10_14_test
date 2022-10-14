public class test12	 {
    public static void main(String[] args) {
       	int row = 0 ;
		String star = "*";
			while(row < 5) {                  //行數
				int b = 4 - row;
				
				while(b > 0){                 //列印空格遞減
					System.out.print(" ");    //印出空格
					b = b - 1;                //每次減 1 
				}
				System.out.println(star);     //印出星星
				star = star + "**";		      //每次遞增兩顆星星
			    
				row = row + 1;
			}
	}
}
