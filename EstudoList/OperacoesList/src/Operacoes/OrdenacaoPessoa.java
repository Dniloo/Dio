package Operacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class OrdenacaoPessoa {

private List<Pessoa> pessoaList;

public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
}
public void addPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
}
 public List<Pessoa> ordenandoPorIdade(){
    List<Pessoa> pessoaPoridade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPoridade);    
    return pessoaPoridade;
 }
 public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
      return pessoaPorAltura;
 }
}
