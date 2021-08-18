public class TowerOfHanoi{
	public static int hanoi(int n,char from,char temp,char to){
		if(n==1) return 1;
		int step1=hanoi(n-1,from,to,temp);
		int step2=1;
		int step3=hanoi(n-1,to,temp,from);
		return step1+step2+step3;
	}
	public static void main(String[] args){
		int n=3;
		System.out.println(hanoi(n,'A','B','C'));
	}
}