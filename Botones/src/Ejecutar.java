import java.awt.EventQueue;

public class Ejecutar {
	
	
	private boolean boton1 = false;
	private boolean boton2 = false;
	private boolean boton3 = false;
	
	
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	

	}
	
	public boolean getBoton1(){

		return this.boton1;
	}

	public boolean getBoton2(){

		return this.boton2;
	}
	public boolean getBoton3(){

		return this.boton3;
	}

	public void setBoton1(boolean estadoBoton){

		this.boton1 = estadoBoton;
	}

	public void setBoton2(boolean estadoBoton){

		this.boton2 = estadoBoton;
	}
	public void setBoton3(boolean estadoBoton){

		this.boton3 = estadoBoton;
	}
	

	public int evaluarBotones(){


		try {
			
			
			if ((!this.boton1)&&(this.boton2)&&(!this.boton3)){

				//solamente
				//no se hace nada
				return 2010;

			}

			if ((this.boton1)&&(this.boton2)&&(this.boton3)){

				// se completo todos los botones
				return 2111;


			}

			if ((this.boton1)&&(this.boton2)&&(!this.boton3)){

				// todo bien
				//no se hace nada
				return 2110;

			}
			

		throw  new ArithmeticException("Orden incorrecto");

		} catch (ArithmeticException e) {

			//reiniciamos los botones

			this.boton1 = false;
			this.boton2 = false;
			this.boton3 = false;

			return -1;

		}


	}


}