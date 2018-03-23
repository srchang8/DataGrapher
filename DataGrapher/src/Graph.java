import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.List;

import javax.swing.JPanel;

public class Graph extends JPanel{
	
	GraphSettings settings = new GraphSettings();
	
	public void drawYaxis(Graphics2D graphic) {
	
		int distanceBetweenYValues = 0;
		System.out.println(settings.graphHeight / settings.numberYDivisions);
		
		int yCounter = settings.padding;
		int yAxisLabelValue = 100;
		
		for (int i=0; i <= settings.numberYDivisions; i++) {
			
			//draw long y lines
			graphic.setColor(settings.gridColor);
			graphic.drawLine(settings.padding, yCounter, settings.graphWidth, yCounter);
			
			//draw short y lines
			graphic.setColor(Color.BLACK);
			graphic.drawLine(settings.padding, yCounter, settings.padding, yCounter);
			
			//label y values on the graph with cpu percentage string
			String yAxisValuesString = Integer.toString(yAxisLabelValue);
			graphic.drawString(yAxisValuesString + "%", settings.padding - 35, yCounter + 5);
			yAxisLabelValue = yAxisLabelValue - 10;
			
			yCounter = yCounter + distanceBetweenYValues;
			
		}
	}

}
