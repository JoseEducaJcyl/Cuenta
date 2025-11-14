public class Cuenta {
    protected int numeroCuenta;
    protected String titular;
    protected double saldo;

    public Cuenta(int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
}
