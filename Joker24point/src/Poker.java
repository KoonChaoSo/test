
public class Poker {
	
	private String pokers;
	
	private boolean flag;

	public Poker(String pokers){
		this.flag = false;
		setPokers(pokers);
	}
	public String getPokers() {
		return pokers;
	}

	public void setPokers(String pokers) {
		if("A".equals(pokers)){
			this.pokers = "1";
		}
		else if("J".equals(pokers)){
			this.pokers = "11";
		}
		else if("Q".equals(pokers)){
			this.pokers = "12";
		}
		else if("K".equals(pokers)){
			this.pokers = "13";
		}else{
			this.pokers = pokers;	
		}
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	
}
