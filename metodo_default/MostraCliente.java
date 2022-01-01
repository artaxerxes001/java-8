package metodo_default;

import java.util.function.Consumer;

import model.Cliente;

public class MostraCliente implements Consumer <Cliente> {

    @Override
    public void accept(Cliente c) {
      System.out.println(c.getNome());
        
    }
    
}
