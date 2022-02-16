package cuentas;
public class Main {
	
	/**
	 * @author Miguel
	 * @since 16/2/2022
	 * @version 1.0
	 * @param args
	 */

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(miCuenta, 0);
    }

	private static void operativa_cuenta(CCuenta miCuenta, float cantidad) {
		try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
