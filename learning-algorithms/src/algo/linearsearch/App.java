package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int linearSearch(Object[] a, Object x) {
		int answer = -1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				answer = i;
			}
		}
		return answer;
	}

}
