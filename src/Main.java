// Clase Main con el metodo main para ejecutar el codigo
public class Main {
    public static void main(String[] args) {
        // Se crea dos objetos, uno de la clase CuentaAhorros y otro de la clase CuentaCorriente
        Cuenta cuentaA = new CuentaAhorros(123456789,"titular1",1000.0,"10%");
        Cuenta cuentaC = new CuentaCorriente(987654321,"titular2",-100.0, true);

        //Se muestra los datos
        System.out.println(cuentaA.toString());
        System.out.println(cuentaC.toString());
    }
}