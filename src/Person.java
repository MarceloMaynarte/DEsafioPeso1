public class Person {

    String nome;
    double peso;

    Person(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    void Eat(Food Food) {
        if (Food != null) {
           this.peso += Food.peso;
        }

    }
    String apresentar(String nome, double peso){
        return "meu nome é " + nome + " e tenho " + peso + " kgs ";}
}


