package javaCodes;
public class FindTheRangeCoefficient {
    public float getMax(float arr[]){
        float res=arr[0];
        for(int i=0;i<arr.length;i++){
            res=Math.max(res,arr[i]);
        }
        return res;
    }
    public float getMin(float arr[]){
        float res=arr[0];
        for(int i=0;i<arr.length;i++){
            res=Math.min(res,arr[i]);
        }
        return res;
    }
    public float getCoeffRange(float min,float max){
        float result=(max-min)/(max+min);
        return result;
    }
	public static void main (String[] args) {
		float arr[]={15,16,10,9,6,7,17};
		FindTheRangeCoefficient gfg=new FindTheRangeCoefficient();
		float fres=gfg.getCoeffRange(gfg.getMin(arr),gfg.getMax(arr));
		System.out.print(fres);
	}
}