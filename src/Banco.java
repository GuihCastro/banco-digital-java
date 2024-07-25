import java.util.List;

public class Banco {
    private String nome;
    private int codigo;
    protected List<Conta> contas;
    protected List<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
