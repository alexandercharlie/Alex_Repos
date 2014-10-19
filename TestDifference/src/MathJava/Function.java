package MathJava;


//import ScalarFunction;

public class Function extends ScalarFunction {

	double a, b, c, d;
	
	public Function () {
		a = 0; b = 1; c = 0; d = 0;
	}
	
	public Function ( double a, double b, double c, double d ) {
		this.a = a; this.b = b; this.c = c; this.d = d;
	}
	
	public void reset ( double a, double b, double c, double d ) {
		this.a = a; this.b = b; this.c = c; this.d = d;
	}
	
	public double value ( double x ) {
		// return a*x*x*x + b*x*x + c*x + d;
		return d + x*( c + x*( b + a*x ));
	}
}

