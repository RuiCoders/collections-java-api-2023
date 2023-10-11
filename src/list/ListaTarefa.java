package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	// atributo
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();

		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);

	}

	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}

	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);

	}

	public static void main(String[] args) {
		    // Criando uma instância da classe ListaTarefa
		    ListaTarefa listaTarefa = new ListaTarefa();

		    // Adicionando tarefas à lista
		    listaTarefa.adicionarTarefa("Comprar Páo");
		    listaTarefa.adicionarTarefa("Pagar Boleto");
		    listaTarefa.adicionarTarefa("Fazer exercícios");

		    // Exibindo o número total de tarefas na lista
		    System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

}
}