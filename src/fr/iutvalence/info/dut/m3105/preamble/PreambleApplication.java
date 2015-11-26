package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Shape rectangle = new Rectangle(5,8);
		rectangle.draw(new Position(2,7));
		
		Shape circle = new Circle(3);
		circle.draw(new Position(0,1));
		
		Shape circleWithBorderAndShadow = new BorderShapeDecorator(2, new ShadowShapeDecorator(90,3, new Circle(7)));
		circleWithBorderAndShadow.draw(new Position(5,3));
	}

}
