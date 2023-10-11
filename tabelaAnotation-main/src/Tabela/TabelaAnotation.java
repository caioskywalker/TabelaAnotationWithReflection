package Tabela;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface TabelaAnotation {

    public String nome();
    public int idade();
    

}
