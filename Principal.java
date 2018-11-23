package listadupla;

public class Principal {

	public static void main(String[] args) {
		
		ListaDupla l = new ListaDupla();

	
		l.inser_inicio(10);
		l.inser_inicio(9);
		l.inser_inicio(2);
		l.inser_inicio(8);
		l.inserir_final(5);
		l.inserindo_ordenado(11);
		l.localizar(10);
		
        String ListaDupla = l.listar();
		System.out.println(l.listar());
	}

}
