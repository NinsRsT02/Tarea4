/*
 * Clase que representa una cuenta bancaria 
 * Permite consultar, y modificar el saldo
 */

package entidadFinanciera;



public class Main {

    public static void probarIngresar(CCuenta objetoCuenta, double cantidad, double cantidadEsperada) {
    try {
        objetoCuenta.ingresar(cantidad);
        System.out.println("Ingreso exitoso. Saldo actual: " + objetoCuenta.estado());
    } catch (Exception e) {
        System.out.println("Error al ingresar: " + e.getMessage());
    }
}

    
    public static void probarRetirar(CCuenta objetoCuenta, double cantidad, double cantidadEsperada) {
    try {
        objetoCuenta.retirar(cantidad);
        System.out.println("Retiro exitoso. Saldo actual: " + objetoCuenta.estado());
    } catch (Exception e) {
        System.out.println("Error al retirar: " + e.getMessage());
    }
}

    
    
    
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        
        
    
    }
}
