package Tabela;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        
     
        Class Pessoas = Pessoas.class;
        
        Annotation[] annotations = (Annotation[]) Pessoas.getAnnotations();
        
        for(Annotation annotation : annotations) {
        	if (annotation instanceof TabelaAnotation) {
        		TabelaAnotation tabelaAn = (TabelaAnotation) annotation;
        		System.out.println(" *********************** " );
				System.out.println("Nome da Pessoa: " + tabelaAn.nome());
				System.out.println("idade: " + tabelaAn.idade());
        				
        	}
        }
        
        

    }
}
