package fr.iutvalence.info.dut.m3105.preamble;

public class BorderShapeDecorator extends Shape
{
	private Shape shape;
	private int border;
	
	public BorderShapeDecorator(int b, Shape s)
	{
		this.shape=s;
		this.border=b;
	}
	
	@Override
	public String toString() {
		return  shape+"with border ("+this.border+")";
	}
	
}
