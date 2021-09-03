package bo.edu.ucb.est;
import bo.edu.ucb.est.modelo.Banco;
import bo.edu.ucb.est.modelo.Cliente;
import bo.edu.ucb.est.modelo.Cuenta;
import bo.edu.ucb.est.modelo.Cajero;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Inicializando Datos del Banco" );
        Banco bisa = new Banco("BANCO BISA");
        ///
        Cliente jperez = new Cliente(" Juan Perez", "jperez", "3333");
        Cuenta cta1Jperez = new Cuenta("BOB", "Caja Ahorros", 12000.0);
        jperez.agregarCuenta(cta1Jperez);
        Cuenta cta2Jperez = new Cuenta("USD", "Cuenta Corriente", 100.0);
        jperez.agregarCuenta(cta2Jperez);
        bisa.agregarCliente(jperez);
        ///
        Cliente mgomez = new Cliente("Maria Gomez", "mgomez", "4444");
        Cuenta cta1Mgomez = new Cuenta("BOB", "Caja Ahorros", 0.0);
        mgomez.agregarCuenta(cta1Mgomez);
        bisa.agregarCliente(mgomez);
        ///
        Cliente cgomez = new Cliente("Carlos Gomez", "cgomez", "3333");
        Cuenta cta1Cgomez = new Cuenta("BOB", "Caja Ahorros", 100.0);
        cgomez.agregarCuenta(cta1Cgomez);
        Cuenta cta2Cgomez = new Cuenta("USD", "Cuenta Corriente", 1000.0);
        cgomez.agregarCuenta(cta2Cgomez);
        Cuenta cta3Cgomez = new Cuenta("BOB", "Caja Ahorros", 100000.0);
        cgomez.agregarCuenta(cta3Cgomez);
        bisa.agregarCliente(cgomez);
        //Para el cliente 
        
        String codC;
        String Pin;
        boolean ipconfi=false;
        Scanner input = new Scanner(System.in);
        while( ipconfi == false ){
            System.out.println("Ingresar su Código de Cliente: ");
            codC = input.next();
            System.out.println("Ingresar su PIN de seguridad : ");
            Pin = input.next();
            if((bisa.buscarClientePorCodigo(codC, Pin)) == null){
                System.out.println("PIN O CÓDIGO DE CLIENTE INCORRECTOS");
            }else{
              System.out.println("Bienvenido al BANCO BISA");
              System.out.println("--------------------------");
              Cajero.ConectionAndMenu(bisa.buscarClientePorCodigo(codC, Pin));
              ipconfi=true;
            } 
        }
        
    }
}
