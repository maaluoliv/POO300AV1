public class Pessoa {

    public float altura=0, peso=0;
    public String nome;

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void Andar(){
        System.out.println("Você é uma pessoa capaz de andar " + nome );
    }
    public void Correr(){
        System.out.println("Você é uma pssoa capaz de correr " + nome);
    }

    public static void main(String[] args) {

        Pessoa P = new Pessoa();
        P.Andar();
        P.Correr();



    }
}
