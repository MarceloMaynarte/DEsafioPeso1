
public class Main {
    public static void main(String[] args) {

        Food c1 = new Food("Arroz", 1.33);
        Food c2 = new Food("feijão", 0.250);
        Food c3 = new Food ("Carne", 0.33);

        Person p1 = new Person("joao", 88.9);
        Person p2 = new Person("bruno", 99.4);
        Person p3 = new Person("marcelo", 83.4);




        System.out.println(p1.apresentar(p1.nome, p1.peso));
        p1.Eat(c1);
        p1.Eat(c2);
        p1.Eat(c3);
        System.out.println(p1.apresentar(p1.nome, p1.peso));


        }


    }
