package fr.iutvalence.info.dut.m3105.preamble;

public class SolidFillShapeDecorator extends Shape
{
	private Shape shape;
	private String solidFill;
	
	public SolidFillShapeDecorator(String solidFill, Shape s)
	{
		this.solidFill=solidFill;
		this.shape=s;
	}

	@Override
	public String toString() {
		return  shape+"with solidFill ("+this.solidFill+")";
	}
	
}
