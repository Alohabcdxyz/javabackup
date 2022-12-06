package facade;

public class LamBanhMi {
	private static LamBanhMi instance;
	private BanhMiThapCam banhMiThapCam;
	private BanhMiTrung banhMiTrung;
	
	private LamBanhMi() {
		banhMiThapCam = new BanhMiThapCam();
		banhMiTrung = new BanhMiTrung();
	}
	
	public static LamBanhMi getInstance() {
		if(instance == null) {
			instance = new LamBanhMi();
			}
		return instance;
	}
	
	public void lamBanhMiThapCam(){
		banhMiThapCam.lamBanhMi();
	}
	public void lamBanhMiTrung(){
		banhMiTrung.lamBanhMi();
	}
}
