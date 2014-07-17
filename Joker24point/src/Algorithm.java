import java.util.List;


public class Algorithm {
	public static boolean isFinish = false;
	Operators operator = Operators.getInstance();
	public void dfs(List<Poker> pokerList,int num,double count,String ans){
		//当24点并且使用了4张牌之后表示成功
		if(isFinish){
			return ;
		}
		if(4==num&&24==count){
			System.out.println(ans);
			System.out.println("Done!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("");
			isFinish = true;
			return ;
		}
		//因为每个牌组都有可能存在很多组合所以需要标记是否找到一个组合就可以
		
		//确保每张牌都使用过
		for(int i=0;i<pokerList.size();i++){
			Poker p = pokerList.get(i);
			//选择没使用的牌	
			if(!pokerList.get(i).isFlag()){
				//判断小鬼和大鬼
				if("joker".equals(p.getPokers())||"JOKER".equals(p.getPokers())){
					System.out.println("ERROR  \n");
					return ;
				}
				//加法
				p.setFlag(true);
				if(ans!=""&&ans!=null){
					dfs(pokerList,num+1,operator.plus(count,Double.valueOf(p.getPokers())),ans+"+"+p.getPokers());
				}else
				{
					dfs(pokerList,num+1,operator.plus(count,Double.valueOf(p.getPokers())),ans+p.getPokers());
				}
				
				if(num>0){
					//减
					dfs(pokerList,num+1,operator.minus(count,Double.valueOf(p.getPokers())),ans+"-"+p.getPokers());
					//乘
					dfs(pokerList,num+1,operator.multiplication(count,Double.valueOf(p.getPokers())),ans+"*"+p.getPokers());
					//除
					dfs(pokerList,num+1,operator.division(count,Double.valueOf(p.getPokers())),ans+"/"+p.getPokers());
				}
				p.setFlag(false);
			}
			
		}
		if(isFinish){
			return ;
		}
	}
}
