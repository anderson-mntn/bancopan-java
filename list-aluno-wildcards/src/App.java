import java.util.ArrayList;

public class App {
    public static void main(String[] args){
       
        Aluno joao = new Aluno("joao", 233);
        Aluno maria = new Aluno("maria", 122);

        ArrayList <Aluno> turma1 = new ArrayList<>();

        turma1.add(joao);
        turma1.add(maria);

       for( Aluno aluno : turma1){
        System.out.println(aluno.toString());
       }

  
    }
    
}
