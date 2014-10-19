package MathJava;

// Author: Jim Carlson (c) 1996
// Date: February 26, 1996
// Last revised: March 6, 1996
// Version: 0.11
// Noncommercial use is OK with this notice.  
// Commercial use by permission only.

import java.awt.*;

public class CGraphics {

	double ox, oy, kx, ky; // coordinate system
	double cx1, cy2, cx2, cy1; // (port) rectangle in Cartesian coordinates 
	int sx1, sy2, sx2, sy1;
	int tickHalfWidth = 3;
	int ticks = 10;
	int xMargin = 40, yMargin = 40;
	String copyright = "Copyright (c) 1996 James A. Carlson";
	String http = "http://www.math.utah.edu/java/lib.html";
	
	
	Graphics g;

	CGraphics ( Graphics h ) {
		
		g = h;
		// defaults, so that things cannot be undefined or illegal		
		setScreenRect(  0, 0, 100, 100  );
	    setXRange(-1,1);
	    setYRange(-1,1);		
	}
	
	public void setScreenRect ( int sx1, int sy2, int sx2, int sy1  ) {
	
		this.sx1 = sx1; this.sy2 = sy2;
		this.sx2 = sx2; this.sy1 = sy1;
		
	}

	
	public void setXRange( double a, double b ) {
	
		cx1 = a;
		cx2 = b; 
		
		kx = ( sx2 - sx1 )/( cx2 - cx1 );
		ox = sx1 - kx*cx1;				
	}
	
	public void setYRange( double a, double b ) {
	
		cy2 = b;
		cy1 = a; 
		
		ky = ( sy1 - sy2 )/( cy1 - cy2 );
		oy = sy2 - ky*cy2;				
	}
	
	public void insetScreenRect ( ) {
	
		insetScreenRect( xMargin, yMargin );		
	}
	
	public void insetScreenRect ( int dx, int dy ) {
	
		// unit = pixels
		sx1 = sx1 + dy; sy2 = sy2 + dy; sx2 = sx2 - dx; sy1 = sy1 - dy;
		// g.clipRect( sx1, sy2, sx2, sy1 );  // has no effect! (XXX)
		
	}

	
	public void frameRect (double x1, double y1, double x2, double y2 ) {
	// ??
		drawLine( x1, y1, x2, y1 );  // +x
		drawLine( x2, y1, x2, y2 );  // +y
		drawLine( x1, y2, x2, y2 );  //-x
		drawLine( x1, y2, x1, y1 );  //-y
	}
	
	public void frame() {
	// ??
		frameRect(cx1, cy2, cx2, cy1);
	}
	
		
	public void drawLine( double x1, double y1, double x2, double y2 ) {
	
		g.drawLine( (int)(kx*x1 + ox), (int)(ky*y1 + oy), 
		             (int)(kx*x2 + ox), (int)(ky*y2 + oy)
		           );
		
	}
	
	public void abscissa() {
	
		drawLine( cx1, 0, cx2, 0 );
	}
	
	public void ordinate() {
	
		drawLine( 0, cy1, 0, cy2 );
	}
	
	
	public void drawString( String message, double x, double y, int dx, int dy ) {
	// (x,y) in Cartesian coordinates, (dx, dy) in screen units
		g.drawString( message, (int)(kx*x + ox) + dx, (int)(ky*y + oy) - dy );
		
	}
	
	public void fillRect( double x1, double y2, double x2, double y1 ) {
	// (x1, y2) and (x2, y1) are diagonally opposite corners
		double tmp;
	
		if ( x2 < x1 ) { // swap places
			tmp = x2; x2 = x1; x1 = tmp;
		}
		
		if ( y2 < y1 ) { // swap places
			tmp = y2; y2 = y1; y1 = tmp;
		}
		
		g.fillRect( (int)(kx*x1+ ox ), (int)(ky*y2 + oy), 
		             (int)(kx*(x2 - x1)), (int)(-ky*(y2 - y1) )           );
	}
	
	public void drawRect( double x1, double y2, double x2, double y1 ) {
	// (x1, y2) and (x2, y1) are diagonally opposite corners
		double tmp;
	
		if ( x2 < x1 ) { // swap places
			tmp = x2; x2 = x1; x1 = tmp;
		}
		
		if ( y2 < y1 ) { // swap places
			tmp = y2; y2 = y1; y1 = tmp;
		}
		
		g.drawRect( (int)( kx*x1+ ox ), (int)(ky*y2 + oy), 
		             (int)(kx*(x2 - x1)), (int)(-ky*(y2 - y1) )           );
	}
	
	// translate window to Cartesian coordinates
	public double cx( int x ) {
	
		return kx*x+ ox;
		
	} 
	
	// translate window to Cartesian coordinates
	public double cy( int y ) {
	
		return ky*y + oy;
		
	} 
	
	// translate Cartesian to window coordinates
	public int wx( double x ) {
	
		return (int)((x - ox)/kx);
		
	} 
	
	// translate Cartesian to window coordinates
	public double wy( double y ) {
	
		return (int)((y - oy)/ky);
		
	} 
	
	public void xTicks( 	double y, double x1, double x2, 
							double spacing ) {

		double kk = tickHalfWidth/ky;
		double x = x1;
		if ( x2 > x && spacing > 0) {
			while ( x <= x2 ) {
				this.drawLine( x, y - kk, x, y + kk );
				x += spacing;
			}
		}
	}
	
	public void xTicks( int n ) {
	
		xTicks( 0, cx1, cx2, (cx2 - cx1)/n );
	}
	
	public void xTicks() {
		xTicks( ticks );
	}
	
	public void yTicks( double x, double y1, double y2, double spacing ) {
	
		double kk = tickHalfWidth/kx;
		double y = y1;
		
		if ( y2 > y ) {
			while ( y <= y2 && spacing > 0 ) {
				this.drawLine( x - kk, y, x + kk, y );
				y += spacing;
			}
		}
	}
	
	public void yTicks( int n ) {
	
		yTicks( 0, cy1, cy2, (cy2 - cy1)/n );
	}
	
	public void yTicks() {
		yTicks( ticks );
	}
	
	public void tickFrame (double x1, double y2, double x2, double y1, int nx, int ny ) {

		xTicks( y1, x1, x2, (x2 - x1)/nx); // top
		xTicks( y2, x1, x2, (x2 - x1)/nx ); // bottom
		yTicks( x1, y1, y2, (y2 - y1)/ny ); // left
		yTicks( x2, y1, y2, (y2 - y1)/ny ); // right
	}
	
	public void tickFrame ( int nx, int ny ) {

		tickFrame ( cx1, cy2, cx2, cy1, nx, ny );
	}
	
	public void tickFrame ()  {

		tickFrame ( ticks, ticks );
	}
	
		public void drawFunction( ScalarFunction f, double a, double b, int n ) {
	
	 	double x = a;
	 	double h = (b - a)/n;
    	double y = f.value(x);
    	
    	for (int i = 0; i < n; i++ ) {
    		double xx = x + h;
    		double yy = f.value(xx);
    		this.drawLine( x, y, xx, yy );
    		x = xx;
    		y = yy;
    	}
    }
    
    public void drawFunction2( ScalarFunction f, double a, double b, int n, Color c1, Color c2 ) {
	
	 	double x = a;
	 	double h = (b - a)/n;
    	double y = f.value(x);
    	
    	for (int i = 0; i < n; i++ ) {
    		double xx = x + h;
    		double yy = f.value(xx);
    		if ( i % 2 == 0 )
    			g.setColor(c1);
    		else
    			g.setColor(c2);
    		this.fillRect( x, 0, x+h, (y + yy)/2);
    		x = xx;
    		y = yy;
    	}
    	g.setColor(Color.black);
    }
    
     public double arcLength( ScalarFunction f, double a, double b, int n ) {
	
	 	double x = a;
	 	double h = (b - a)/n;
    	double y = f.value(x);
    	double L = 0;
    	
    	for (int i = 0; i < n; i++ ) {
    		double xx = x + h;
    		double yy = f.value(xx);
    		double dx = xx - x;
    		double dy = yy - y;
    		L += Math.sqrt( dx*dx + dy*dy );
    		x = xx;
    		y = yy;
    	}
    	return L;
    }
    
    public double area( ScalarFunction f, double a, double b, int n ) {
	
	 	double x = a;
	 	double h = (b - a)/n;
    	double y = f.value(x);
    	double A = 0;
    	
    	for (int i = 0; i < n; i++ ) {
    		double xx = x + h;
    		double yy = f.value(xx);
    		A += (y + yy)*h/2;
    		x = xx;
    		y = yy;
    	}
    	return A;
    }
	
}

