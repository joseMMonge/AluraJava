package bytebank;

public class Gerente extends Funcionario {

	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		return super.getSalario()
				+ super.getBonificacion();
	}
	
	public boolean iniciarSesion() {
		if (this.clave == clave) {
			return true;
		}else {
			return false;
		}
	}
}
