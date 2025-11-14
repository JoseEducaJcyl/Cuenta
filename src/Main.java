public class Main {
    public static void main(String[] args) {
        Cuenta cuentaA = new CuentaAhorros(123456789,"titular1",1000.0,"10%");
        Cuenta cuentaC = new CuentaCorriente(987654321,"titular2",-100.0, true);

        System.out.println(cuentaA.toString());
        System.out.println(cuentaC.toString());
    }
}