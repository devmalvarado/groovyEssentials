// some imports are default like java.io & java.util

// public is the default access modifier
class HelloWorld {
    static void main (String[] args){ //there is no need of main class it can run as script without compile
        println"Hello World"

        //Define a typed variable
        int age = 30
        // Print variable type
        println age.getClass()
        // Print variable value
        println age

        //Define a variable with dynamic typing [its called duck typing ](def java.lang.Object)
        def alias = "DevMalva"  // like var?
        // Print variable value
        println alias
        // Print variable type
        println alias.getClass()

        //Create a new Person class and instantiate it
        Person person = new Person();

        //There are automatically created getters & setters for public members of the class
        person.setFirstName("Manuel")
        person.setLastName("Alvarado")
        person.setAge(30)

        //Print the full name and age of the Person instance
        println person.getFullName()
        println person.getAge()


        //Identify if a Person is middle-aged using a conditional
        if(person.getAge() >= 45 && person.getAge() <= 65){
            println person.getFullName() + " is middle-aged"
        } else {
            println person.getFullName() + " is " + person.getAge() + " years old"
        }

        //Define a list of persons
        def persons =[person, new Person(firstName: "John", lastName: "Dow", age:40) ] //Auto constructor key-value

        //Iterate over Person instances in list
        for (Person p : persons){
            println p.getFullName()
        }
    }
}
