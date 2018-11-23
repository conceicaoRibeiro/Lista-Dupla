package listadupla;

public class ListaDupla {
	
	No cabeca_lista;
	
	public void inser_inicio(int n){
		
		No novo_no = new No(n);
		if(cabeca_lista == null){
			novo_no.proximo = cabeca_lista;
			cabeca_lista = novo_no;			
		}else{
			novo_no.proximo = cabeca_lista;
			cabeca_lista.anterior = novo_no;
			cabeca_lista = novo_no;
		}
	}
	
	public void inserir_final(int n){
		No aux;
		No novo_no = new No(n);
		
		if(cabeca_lista == null){
			cabeca_lista = novo_no;
		}else{
			aux = cabeca_lista;
			while(aux.proximo != null){
				aux =aux.proximo;
			}
			aux.proximo = novo_no;
			novo_no.anterior = aux;
		}
	}
	
   public void inserindo_ordenado (int n) {
		
		No aux = cabeca_lista;
		
		No novo_no = new No(n);
		
		if(aux == null) {      //lista vazia
			
			cabeca_lista = novo_no;
		}else 
			
			while (aux.conteudo < n && aux.proximo != null) {
				aux = aux.proximo;
			}
			
			if (aux.conteudo < n) {  //Está no último elemento
				aux.proximo = novo_no;
				novo_no.anterior = aux;
			}
			
			if(aux.conteudo > n) {
				
				if (aux.anterior == null) { //deverá ser o primeiro elemento
					aux.anterior = novo_no;
					novo_no.proximo = aux;
					cabeca_lista = novo_no;
				}else {
					novo_no.proximo = aux; // inserir no meio
					novo_no.anterior = aux.anterior;
					aux.anterior.proximo = novo_no;
					aux.anterior = novo_no;
							
					 }
			}
	}
	
		public No localizar(int n){
			No aux;
			aux = cabeca_lista;
			while(aux != null && aux.conteudo != n){
				aux = aux.proximo;
			}
			return aux;
		}
		
		public String listar(){
			No aux;
			aux = cabeca_lista;
			String lista = " ";
			while (aux != null) {
			lista += " " + aux.conteudo + " ";
			aux = aux.proximo;
			}
			return lista;
		}
}
