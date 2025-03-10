/*
 * Clase que representa una cuenta bancaria 
 * Permite consultar, y modificar el saldo
 * @author Victor 
 * @version 1.0
 * @since 2025
 */

package entidadFinanciera;


public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Nombre de la persona titular, cuenta, su saldo de la cuenta bancaria
     * y el tipo de interes que tiene
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
public static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    public double estado(){
        return this.getSaldo();
    }
   /**
     * Ingresa una cantidad en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
public void ingresar(double cantidad) throws Exception {
    if (cantidad < 0) {
        throw new Exception(ERRORCANTIDADNEGATIVA);
    }
        setSaldo(getSaldo() + cantidad);
}

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    
    
    
}


    
   