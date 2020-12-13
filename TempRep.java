class Sol{
	public static void main(String[] args){
		float result = 0;
		
		Sol s = new Sol();
		float[] arr = {10, 20, 30};
		result = s.CumulativeDisc(arr);
		System.out.println(result);
	}
	
	static float CumulativeDisc(float[] arr){
		float mktp = 100;
		float mktbk = mktp;
		
		for(int i=0;i<arr.length;i++){
			mktp = mktp*((mktbk-arr[i])/100);
		}
		
		float cumel = mktbk-((mktp/mktbk)*100);
		return cumel;
	}
}