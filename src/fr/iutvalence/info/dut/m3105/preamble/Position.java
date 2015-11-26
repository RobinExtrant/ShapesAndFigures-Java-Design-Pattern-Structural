package fr.iutvalence.info.dut.m3105.preamble;


public class Position 
{
	public int x;
	public int y;
	
	public Position(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return  "(" + x + "," + y +")";
	}
	
	
}
