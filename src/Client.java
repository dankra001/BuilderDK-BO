import java.util.List;

public class Client {

    public static void main(String[] args){

        Dog dog1 = new Dog.Builder()
                .name("Reksio")
                .type("Owczarek niemiecki")
                .age(4)
                .toys(List.of("Piłka","Kość"))
                .build();

        Dog dog2 = new Dog.Builder()
                .name("Pluto")
                .type("Bloodhound")
                .age(2)
                .build();

        System.out.println(dog1);
        System.out.println(dog2);
    }
}
