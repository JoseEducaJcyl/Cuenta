// Clase CuentaCorriente con el atributo sobregiro
public class CuentaCorriente extends Cuenta{
    private boolean sobregiro;

    // Constructor que hereda los atributos de Cuenta
    public CuentaCorriente(int numeroCuenta, String titular, double saldo, boolean sobregiro) {
        super(numeroCuenta, titular, saldo);
        this.sobregiro = sobregiro;
    }

    // Metodo sobreescrito toString para mostrar la informacion
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
