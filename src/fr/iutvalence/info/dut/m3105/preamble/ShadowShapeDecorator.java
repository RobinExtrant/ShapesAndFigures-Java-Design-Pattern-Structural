package fr.iutvalence.info.dut.m3105.preamble;

public class ShadowShapeDecorator extends Shape
{
	private Shape shape;
	private int shadow1;
	private int shadow2;
	
	public ShadowShapeDecorator(int s1, int s2, Shape s)
	{
		this.shadow1=s1;
		this.shadow2=s2;
		this.shape=s;
	}
	
	@Override
	public String toString() {
		return  shape+", with shadow ("+this.shadow1+","+this.shadow2+")";
	}
	
}
