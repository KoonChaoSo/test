import java.util.List;


public class Algorithm {
	public static boolean isFinish = false;
	Operators operator = Operators.getInstance();
	public void dfs(List<Poker> pokerList,int num,double count,String ans){
		//��24�㲢��ʹ����4����֮���ʾ�ɹ�
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
		//��Ϊÿ�����鶼�п��ܴ��ںܶ����������Ҫ����Ƿ��ҵ�һ����ϾͿ���
		
		//ȷ��ÿ���ƶ�ʹ�ù�
		for(int i=0;i<pokerList.size();i++){
			Poker p = pokerList.get(i);
			//ѡ��ûʹ�õ���	
			if(!pokerList.get(i).isFlag()){
				//�ж�С��ʹ��
				if("joker".equals(p.getPokers())||"JOKER".equals(p.getPokers())){
					System.out.println("ERROR  \n");
					return ;
				}
				//�ӷ�
				p.setFlag(true);
				if(ans!=""&&ans!=null){
					dfs(pokerList,num+1,operator.plus(count,Double.valueOf(p.getPokers())),ans+"+"+p.getPokers());
				}else
				{
					dfs(pokerList,num+1,operator.plus(count,Double.valueOf(p.getPokers())),ans+p.getPokers());
				}
				
				if(num>0){
					//��
					dfs(pokerList,num+1,operator.minus(count,Double.valueOf(p.getPokers())),ans+"-"+p.getPokers());
					//��
					dfs(pokerList,num+1,operator.multiplication(count,Double.valueOf(p.getPokers())),ans+"*"+p.getPokers());
					//��
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
