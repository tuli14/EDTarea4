/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuentas;


/**
 *
 * @author Alba Ruiz Guillén
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }

    /** Constructor con parámetros con todas las propiedades de la clase cuenta
     * 
     * @param nom Nombre del cliente de la cuenta
     * @param cue Número de la cuenta del cliente
     * @param sal Saldo actual de la cuenta
     * @param tipo Tipo de interés a aplicar a la cuenta
     */
     
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

        
    /** Método que devuelve el saldo actual de la cuenta
     *
     * @return Saldo actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /** Método que realiza ingresos en la cuenta
     *
     * @param cantidad Dinero que se quiere ingresar en la cuenta
     * @throws Exception Sirve para controlar que no se introduzcan cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /** Método que retira dinero de la cuenta
     *
     * @param cantidad Dinero que se quiere retirar de la cuenta
     * @throws Exception Sirve para controlar que no se retiran cantidades negativas o 0
     * @throws Exception Sirve para controlar que no se retiran cantidades superiores al saldo disponible
     * 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /** Método que devuelve el nombre del titular de la cuenta
     *
     * @return nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /** Método para cambiar el nombre del titular de la cuenta
     *
     * @param nombre Nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Método que devuelve el tipo de interés de la cuenta
     *
     * @return tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** Método que cambia el tippo de interés de la cuenta
     *
     * @param tipoInterés Tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /** Método que devuelve el número de cuenta
     *
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Método para cambiar el número de cuenta
     * 
     * @param cuenta Número de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Método que devuelve el saldo disponible en la cuenta
     * 
     * @return saldo disponible en la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /** Método para cambiar el saldo disponible en la cuenta
     * 
     * @param saldo Saldo disponible en la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
