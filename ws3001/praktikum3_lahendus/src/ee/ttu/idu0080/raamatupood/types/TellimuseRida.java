package ee.ttu.idu0080.raamatupood.types;

//serialiseerib klassi state'i (olukorra)
import java.io.Serializable;

public class TellimuseRida implements Serializable {
	private long kogus;
	private Toode toode;
	
	public TellimuseRida(Toode toode, long kogus){
		this.toode = toode;
		this.kogus = kogus;
	}
	
	public Toode getToode(){
		return toode;
	}
	
	public void setToode(Toode toode){
		this.toode = toode;
	}
	
	public long getKogus(){
		return kogus;
	}
	
	public void setKogus(long kogus){
		this.kogus = kogus;
	}	
}
