package fieldeas;


import javax.jws.*;

@WebService
public class SumaServicio {
	@WebMethod
	public int suma(int a, int b) {
		return a+b;	
	}

}
