public class Aluno {
    String nome;
    float av1;
    float av2;

    public static float media(float av1,float av2){
        return (av1 + av2)/2;
    }

    public static String resultado(Aluno aluno){
        if(media(aluno.av1,aluno.av2) >= 7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}
