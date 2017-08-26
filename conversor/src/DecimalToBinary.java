
public class DecimalToBinary {
	public static void converter(int n){
	int rest;
	int dividend=n;
	StringBuilder result = new StringBuilder("");
	while(dividend>1) {
		rest=dividend;
		rest%=2;
		dividend/=2;
		result.insert(0,rest);
		}
	result.insert(0,dividend);
	System.out.println(result);
	}
}
