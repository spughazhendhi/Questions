package section10;

public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(zigzag("paypalishiring",3));
	}
	
	public static String zigzag(String s,int rows) {
		
		StringBuilder[] sbs = new StringBuilder[rows];
		
		for(int i=0;i<rows;i++) {
			sbs[i] = new StringBuilder();
		}
		
		
		int row =0;
		int step =1;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			System.out.println("position here "+row);
			StringBuilder sb = sbs[row];
			sb.append(c);
			if(row ==rows-1) {
				step =-1;
			}else if(row ==0) {
				step =1;
			}
			
			row = row+step;
			
		}
		
		StringBuilder result = new StringBuilder();
		
		for(StringBuilder sb:sbs) {
			System.out.println("sb -->"+sb.toString());
			result.append(sb);
		}
		
		return result.toString();
	}

}
