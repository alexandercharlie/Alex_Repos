/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MathJava;

/**
 *
 * @author Manjeet Kumar
 */
// Author: Jim Carlson (c) 1996
// Date: February 26, 1996
// Last revised: March 6, 1996
// Version: 0.11
// Noncommercial use is OK with this notice.  
// Commercial use by permission only.

import java.awt.*;
//import CGraphics.*;
//import Function.*;
import java.applet.*;

class Graph extends Canvas {

	CubicGraph A;
	CGraphics G; 
	
	double x1 = -1, x2 = 1, y1 = -1, y2 = 1;
	
	int n;
	double f = 1; // rescale by factor of f
	double zoom_factor = Math.sqrt(Math.sqrt(2));
	double[] c;
	
	int nMessages = 7;
	String[] message = new String[ nMessages ];
	
	int w, h; // width and height in Canvas for the graph
	
	int mouseX, mouseY;
	double mouseKx, mouseKy, mouseOx, mouseOy;
	
	Function f1 = new Function(2,.4,-1.2,0); 

	Graph( CubicGraph target, String[] cs ) {
	
		A = target;
		initFunction( cs );
		n = A.n;

	}
	
	
	public void initFunction( String[] cs ) {
			
		c = new double[ cs.length ];
		
		for( int i = 0; i < c.length; i++ )
			c[i] = Double.valueOf(cs[i]).doubleValue();
			
		f1.reset(c[0], c[1], c[2], c[3] );	
	 }
	 
	 public void redraw( String command, TextField[] t ) {
    
    	if("Redraw".equals( command )) {
    		
    		for( int i = 0; i < c.length; i++ )
    			c[i] =  (Double.valueOf(t[i].getText().trim())).doubleValue();
    		
    		f1.reset(c[0], c[1], c[2], c[3] );	
    	}
    	else if("Zoom in".equals( command )) 
    		f = zoom_factor*f;
    	else if("Zoom out".equals( command )) 
    		f = f/zoom_factor;
    	else if("Reset".equals( command )) {
    		f = 1;
    		
    		for( int i = 0; i < c.length; i++ )
    			c[i] =  (Double.valueOf(t[i].getText().trim())).doubleValue();
    		
    		f1.reset(c[0], c[1], c[2], c[3] );	
    	}
    	repaint();
  	} 
	
	public void paint(Graphics g) {
        	 
    	G = new CGraphics( g );
    	
    	w = this.size().width;
    	h = this.size().height;
    	if ( w > h ) w = h;
 
     	G.setScreenRect( 10, 0, w, h );
 		G.insetScreenRect(10,10);
 		G.setXRange(x1/f,x2/f);
 		G.setYRange(y1/f,y2/f);
    	
    	G.abscissa(); 
    	G.xTicks();
    	G.ordinate();
    	G.yTicks();
    	
      	G.drawFunction( f1, x1/f, x2/f, n );
      	
      	Double mx =  new Double((mouseX - ( mouseOx + location().x ))/mouseKx);
    	Double my = new Double((mouseY - ( mouseOy + location().y ))/mouseKy);    	
  
    	message[0] = "Last click at";
    	if ( mx.isNaN() || my.isNaN() ) {
    		message[1] = "x = ";
    		message[2] = "x = ";
    	}
    	else {
    		message[1] = "x = " + mx;
    		message[2] = "y = " + my;
    	}
    	  	
    	message[3] = "";
    	
    	double L = G.arcLength( f1, x1/f, x2/f, n );
    	message[4] = "Arc length: " + L;
    	double dx = x2/f - x1/f;
    	double dy = f1.value(x2/f) - f1.value(x1/f);
    	message[5] = "Rise/Run: " + dy/dx;
    	message[6] = "" + d2s(x1/f) + "  <  x  <  " + d2s(x2/f);
    	
    	
    	int leftMargin = w + 5; // w + 40
    	int lineSpacing = 15;
    	int topMargin =(int)(this.size().height/2 - (nMessages/2)*lineSpacing);
    	for( int i = 0; i < nMessages; i++ ) {
    		g.drawString( message[i], leftMargin, topMargin );
    		topMargin += lineSpacing;
    	}
    	
    		
	}
	
	String d2s( double x ) {
    	
    	double xx = x;
    	int maxDigits = 4;
    	int nDigits = 1;
    	String s = "";
    	String sign = "+";
    	boolean flag = false;
    	
    	if ( x < 0 ) {
    		s += "-";
    		x *= -1;
    		sign = "-";
    	}
    	int n = (int) x;
    	s += n;
    	if ( n != 0 )
    		return s;
    	s += ".";
    	x -= n;
    	x *= 10;	
    	while( n == 0 && nDigits <= maxDigits) { 
	    	n = (int) x;
	    	s += n;
	    	x -= n;
	    	x *= 10;	
	    	nDigits++;
    	}
    	s += Math.round(x);
    	
    	if ( nDigits > maxDigits )
    		return sign + "epsilon";
    	else
    		return s;    	
    }
}

public class CubicGraph extends Applet {

	String copyright = "Copyright (c) 1996 James A. Carlson";
	String http = "http://www.math.utah.edu/java/lib.html";

	int nCoeff = 4;
	int n = 0;
	String[] coeff = new String[ nCoeff ];
	
	Panel coeffbar;
	TextField[] tf = new TextField[ nCoeff ];
		
	Panel controlbar;
	Button redraw, zoom_in, zoom_out, reset;
	
	Graph graph;
		    
    public void init()
    {   
    
    	setLayout( new BorderLayout() );
    	
    	coeff[0] = getParameter("a");
    	coeff[1] = getParameter("b");
    	coeff[2] = getParameter("c");
    	coeff[3] = getParameter("d");
    		
    	n = Integer.valueOf(getParameter("n")).intValue();
    	
    	coeffbar = new Panel();
    	
    	coeffbar.add( new Label("Coefficients:" ) ); 
    	for( int i = 0; i < nCoeff; i++ )
    		coeffbar.add( tf[i] = new TextField(coeff[i], 5 ) );   	
    		
    	controlbar = new Panel();
    	controlbar.add( zoom_in = new Button("Zoom in" ) );
    	controlbar.add( zoom_out = new Button("Zoom out" ) );
    	controlbar.add( redraw = new Button("Redraw" ) );
    	controlbar.add( reset = new Button("Reset" ) );
    	
    	graph = new Graph( this, coeff );
    	
    	add("North", coeffbar);
    	add("Center", graph );
    	add("South", controlbar);
    }
    
    public boolean mouseDown( Event evt, int x, int y ) {
  	
  		graph.mouseX = x; graph.mouseY = y;
  		graph.mouseKx = graph.G.kx; graph.mouseKy = graph.G.ky;
  		graph.mouseOx = graph.G.ox; graph.mouseOy = graph.G.oy;
  		graph.repaint();  		
  		return true;
  	}
      	
  	public boolean action(Event evt, Object arg) {
    
    	if("Reset".equals(arg)) {
	  		for( int i = 0; i < nCoeff; i++ )
    			tf[i].setText(coeff[i]);    	
    	}
    	graph.redraw( (String) arg, tf );
    	return true;
  	}
  	
  	
}
