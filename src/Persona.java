class Persona {
    private String name;
    private Integer age;
    static String species = "Humano";

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Persona.species = species;
    }

    Persona(){

    }

    Persona (String name, Integer age){
        this.name = name;
        this.age = age;
    }

    String getName (){
        return name;
    }
    void setName (String name) {
        this.name = name;
    }
    Integer getAge (){
        return age;
    }
    void setAge (Integer age){
        this.age = age;
    }
}