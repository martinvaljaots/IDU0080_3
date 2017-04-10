package ee.ttu.idu0080.raamatupood.types;
import java.util.ArrayList;
import java.util.List;
//serialiseerib klassi state'i (olukorra)
import java.io.Serializable;

public class Tellimus implements Serializable {
	private static final long serialVersionUID = 1L;
	public List<TellimuseRida> tellimuseRead;
	
	public Tellimus(){
		tellimuseRead = new ArrayList <TellimuseRida>();
	}
	
	public void addTellimuseRida(TellimuseRida tellimuseRida){
		this.tellimuseRead.add(tellimuseRida);
	}
	
	public List<TellimuseRida> getTellimuseRead(){
		return tellimuseRead;
	}
	
	public String printTellimus(){
		return "Tellimus [tellimuseRead=" + tellimuseRead + "]";
	}
}
