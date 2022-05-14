
public class Joc {

	private String numeEchipa1;
	private String numeEchipa2;
	private int numarGoluriEchipa1;
	private int numarGoluriEchipa2;
	private int numarTotalCornere;
	private int numarTotalOut;
	
	public Joc(String numeEchipa1, String numeEchipa2) {
		this.numeEchipa1 = numeEchipa1;
		this.numeEchipa2 = numeEchipa2;
	}
	
	@Override
	public String toString() {
		return "numeEchipa1=" + numeEchipa1 + ": " + numarGoluriEchipa1 + " goluri" +
				"numeEchipa2=" + numeEchipa2 + ": " + numarGoluriEchipa2 + " goluri" +
				 ", numarTotalCornere=" + numarTotalCornere + ", numarTotalOut= " + numarTotalOut;
	}
	
	public void simuleaza()
	{
		Minge minge = new Minge(50, 25);
		
		for(int i=0; i<=1000; i++)
		{
			
			try {
				minge.suteaza();
			}
			catch(ExceptieOut e) {
				minge = new Minge(minge.getX(), minge.getX());
			}
			catch(ExceptieCorner e) {
				if(minge.getX() == 0)
					if(minge.getY()<=20)
						minge = new Minge(0, 0);
					else
						minge = new Minge(0, 50);
				else
					if(minge.getY()<=20)
						minge = new Minge(100, 0);
					else
						minge = new Minge(100, 50);
			}
			catch(ExceptieGol e) {
				minge = new Minge(50, 25);
			}
			finally {
				System.out.println(numeEchipa1 + " - " + numeEchipa2 + 
						": Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY()+ ")");
			}
		}
	}
}
