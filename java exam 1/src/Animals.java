import java.util.ArrayList;
// number 1 iv)
 class Animal {
    String name;


    public Animal(String name) {
        this.name=name;

    }

    public String getName() {
        return name;
 

//

}
    static class Collection {

        ArrayList<Animal>animals= new ArrayList<>();


    public void addAnimal(Animal animal){
         animals.add(animal);
        System.out.println("Animal added: " + animal.getName());

    }


    public void displayanimals(){
        for (Animal animal:animals
             ) {
            System.out.println("NAME: " + animal.getName());

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Collection collection =new Collection();

        Animal animal1=new Animal("cow");
    Animal animal2=new Animal("goat");

        collection.addAnimal(animal1);
        collection.addAnimal(animal2);
        collection.displayanimals();
    }
}}
