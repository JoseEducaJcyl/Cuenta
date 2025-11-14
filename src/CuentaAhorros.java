public class CuentaAhorros extends Cuenta {
    private String interes;

    public CuentaAhorros(int numeroCuenta, String titular, double saldo, String interes) {
        super(numeroCuenta, titular, saldo);
         this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" +
                "interes=" + interes +
                ", numeroCuenta=" + numeroCuenta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
