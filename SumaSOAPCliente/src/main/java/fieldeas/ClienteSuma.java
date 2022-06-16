package fieldeas;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;


public class ClienteSuma {

	public static void main(String[] args) {
		SumaServicioService locator = new SumaServicioServiceLocator();
		
		try {
			SumaServicio sumServicio = locator.getSumaServicio();
			
			int i;
			i = sumServicio.suma(83, 232);
			System.out.println(i);
		} catch (RemoteException e) {
			System.out.println("Fallo Excepcion Remota");
		} catch (ServiceException e) {
			System.out.println("Fallo Servicio");
		}

	}

}
