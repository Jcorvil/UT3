public class Principal {
    public static void main(String[] args){
        System.out.println("Hola mundo");

        Persona fulanito = new Persona();
        fulanito.setName("Fulanito");
        fulanito.setAge(25);
        System.out.println("Su nombre es " + fulanito.getName());
        System.out.println("Su edad es " + fulanito.getAge());
        System.out.println("Es un " + Persona.getSpecies());

        //Crear una instancia (objeto) de Persona: Juanito de 20 años
        Persona juanito = new Persona("Juanito", 20);
        System.out.println("Su nombre es " + juanito.getName());
        System.out.println("Su edad es " + juanito.getAge());
        System.out.println("Es un " + Persona.getSpecies());

        //Crear una instancia (objeto) de Persona: Pepito de 10 años
        Persona pepito = new Persona("Pepito", 10);
        System.out.println("Su nombre es " + pepito.getName());
        System.out.println("Su edad es " + pepito.getAge());
        System.out.println("Es un " + Persona.getSpecies());

        System.out.println("Fin del programa");
    }
}