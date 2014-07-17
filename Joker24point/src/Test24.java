import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test24 {
	
	public static void main(String[] args) {
		int num = 0;
		double count = 0;
		String ans = "";
		List<Poker> pokerList = new ArrayList<Poker>();
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<4;i++){
			Poker p = new Poker(in.next());
			pokerList.add(p);
		}
		Algorithm a = new Algorithm();
		if(null!=pokerList.get(0)){
		}
		a.dfs(pokerList, num, count, ans);
		if(!Algorithm.isFinish){
			System.out.println("None");
		}
	}
}
