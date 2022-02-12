
public class EffortDetails {
	private int actualeffort;
	private int esteffort;
	
	public EffortDetails(int actualeffort, int esteffort) {
		super();
		this.actualeffort = actualeffort;
		this.esteffort = esteffort;
	}
	public int getActualeffort() {
		return actualeffort;
	}
	public void setActualeffort(int actualeffort) {
		this.actualeffort = actualeffort;
	}
	public int getEsteffort() {
		return esteffort;
	}
	public void setEsteffort(int esteffort) {
		this.esteffort = esteffort;
	}
	
	@Override
	public String toString() {
		return "EffortDetails [actualeffort=" + actualeffort + ", esteffort=" + esteffort + "]";
	}
	
}
