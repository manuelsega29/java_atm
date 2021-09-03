
// ME HACE LAS UNCIONES DE DPOSITAR, RETIRAR Y MOSTRAR SALDO

package bo.edu.ucb.est.modelo;


public class Cuenta {
    private String moneda;
    private String tipo;
    private double saldo;

    public Cuenta(String moneda, String tipo, double saldoInicial) {
        this.moneda = moneda;
        this.tipo = tipo;
        this.saldo = saldoInicial;
    }
    
   public double MostrarSaldo(){
        return saldo;
    } 
    
    public boolean retirar(double monto) {
        boolean resultado = false;
        if (monto > 0 && monto <= saldo) { // verifica que no sea negativo, cero o exceda su saldo
            saldo = saldo - monto;
            resultado = true; // si he podido retirar
        }
        return resultado;
    }
    
    public boolean depositar(double monto) {
        boolean resultado = false;
        if (monto > 0 ) { // verifica que no sea negativo, cero o exceda su saldo
            saldo = saldo + monto;
            resultado = true; // si he podido retirar
        }
        return resultado;
    }
            
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
