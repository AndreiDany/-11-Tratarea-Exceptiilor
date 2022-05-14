
public class Minge {

	private int X;
	private int Y;
	
	public Minge(int x, int y) {	
		X = x;
		Y = y;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public void suteaza() throws ExceptieOut, ExceptieGol, ExceptieCorner
	{
		CoordinateGenerator cg = new CoordinateGenerator();
		
		X = cg.generateX();
		Y = cg.generateY();
		
		if(Y==0 || Y==50)
			
			throw new ExceptieOut("Out");
		
		else if(X==0 || X==100) {
			
			if(Y>=20 && Y<=30)
				
				throw new ExceptieGol("Gol");
			
			else
				
				throw new ExceptieCorner("Corner");
		}
			
	}
}
