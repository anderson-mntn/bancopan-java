import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, String> aluno1 = new HashMap<>();

        aluno1.put("nome","matheus");
        aluno1.put("idade","26");
        aluno1.put("media","10");
        aluno1.put("turma","4ia");
        
        System.out.println(aluno1);
        System.out.println(aluno1.keySet());
        System.out.println(aluno1.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        Map<String, String>aluno2 = new HashMap<>();

        aluno2.put("nome","Daniela");
        aluno2.put("idade","19");
        aluno2.put("media","7");
        aluno2.put("turma","3b");

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        System.out.println(listaAlunos);
        System.out.println(aluno1.containsKey("media"));


    }
}
