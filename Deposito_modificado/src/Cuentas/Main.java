/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Cuentas;


/**
 *
 * @author Alba Ruiz Guillén
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta Cuenta1;
        double saldoActual;

        Cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        operativa_cuenta(Cuenta1, 200);
    }

    /**
     * Método para realizar ingresos y retirada de dinero en la cuenta
     * @param Cuenta1 Objeto correspondiente a la clase CCuenta
     * @param cantidad Cantidad de dinero que se quiere ingresar o retirar
     */
    public static void operativa_cuenta(CCuenta Cuenta1, float cantidad) {
        try {
            Cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            Cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
