import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> listaContatos;

    public AgendaTelefonica() {
        listaContatos = new ArrayList<>();
    }

    public void adicionarNovoContato(Contato novoContato) {
        listaContatos.add(novoContato);
        System.out.println("Novo contato adicionado: " + novoContato.obterNome());
    }

    public void removerContato(String nome) {
        Contato contatoRemovido = null;
        for (Contato contato : listaContatos) {
            if (contato.obterNome().equals(nome)) {
                contatoRemovido = contato;
                break;
            }
        }
        if (contatoRemovido != null) {
            listaContatos.remove(contatoRemovido);
            System.out.println("Contato removido: " + nome);
        } else {
            System.out.println("Contato não encontrado: " + nome);
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : listaContatos) {
            if (contato.obterNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }
}
