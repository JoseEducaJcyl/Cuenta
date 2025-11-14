// Clase CuentaAhorros con el atributo interes
public class CuentaAhorros extends Cuenta {
    private String interes;

    // Constructor que hereda los atributos de Cuenta
    public CuentaAhorros(int numeroCuenta, String titular, double saldo, String interes) {
        super(numeroCuenta, titular, saldo);
         this.interes = interes;
    }

    // Metodo sobreescrito toString para mostrar la informacion
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
