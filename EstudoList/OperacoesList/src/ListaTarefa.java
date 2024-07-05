import java.util.ArrayList;
import java.util.List;

import Operacoes.OrdenacaoPessoa;
import Pesquisa.CatalogoLivros;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
 public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
 }
 public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa t : tarefaList) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefasParaRemover.add(t);
        }
    }
    tarefaList.removeAll(tarefasParaRemover);
 } 
 public int obterNumeroTotalTarefas(){
    return tarefaList.size();
 }
 public void obterDescricaoTarefas(){
    System.out.println(tarefaList);
 }
  public static void main(String[] args) {
    //ListaTarefa listaTarefa = new ListaTarefa();

   // System.out.println("O numero total de tarefas : " + listaTarefa.obterNumeroTotalTarefas());

        // listaTarefa.adicionarTarefa("Tarefa 1");
        // listaTarefa.adicionarTarefa("Tarefa 2");
        // System.out.println("O numero total de tarefas : " + listaTarefa.obterNumeroTotalTarefas());
        // listaTarefa.removerTarefa("Tarefa 1");
        // System.out.println("O numero total de tarefas : " + listaTarefa.obterNumeroTotalTarefas());
   CatalogoLivros catLivros = new CatalogoLivros();
   catLivros.adicionarLivros("Livro 1", "Autor 1", 2001);
   catLivros.adicionarLivros("Livro 2", "Autor 2", 2022);
   catLivros.adicionarLivros("Livro 3", "Autor 3", 2003);
   catLivros.adicionarLivros("Livro 4", "Autor 4", 2004);
   catLivros.adicionarLivros("Livro 1", "Autor 5", 2005);
   catLivros.adicionarLivros("Livro 6", "Autor 2", 1994);

//    System.out.println(catLivros.pesquisarPorTitulo("Livro 1"));
//    System.out.println(catLivros.pesquisarPorAutor("Autor 2"));
//    System.out.println(catLivros.pesquisaPorIntervaloAno(1900, 2000));
//--------------------------------------------------------------------
OrdenacaoPessoa ordPessoa = new OrdenacaoPessoa();
ordPessoa.addPessoa("Nome 1", 20, 1.60);
ordPessoa.addPessoa("Nome 2", 21, 1.62);
ordPessoa.addPessoa("Nome 3", 36, 1.63);
ordPessoa.addPessoa("Nome 4", 23, 1.64);
ordPessoa.addPessoa("Nome 1", 16, 1.66);

System.out.println(ordPessoa.ordenandoPorIdade());
System.out.println(ordPessoa.ordenarPorAltura());

    }
}
