package metodo_default;
import java.util.Arrays;
import java.util.List;

import model.Cliente;

/**
 * Main
 */
public class Main {
public static void main(String[] args) {
    Cliente c1 = new Cliente("Michelle", "123", true);
    Cliente c2 = new Cliente("Artaxerxes", "001", true);

    List<Cliente> clientes = Arrays.asList(c1,c2);

    MostraCliente mc = new MostraCliente();
    clientes.forEach(mc);
    
}
    
}