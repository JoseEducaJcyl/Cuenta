public class CuentaCorriente extends Cuenta{
    private boolean sobregiro;

    public CuentaCorriente(int numeroCuenta, String titular, double saldo, boolean sobregiro) {
        super(numeroCuenta, titular, saldo);
        this.sobregiro = sobregiro;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "sobregiro=" + sobregiro +
                ", numeroCuenta=" + numeroCuenta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
