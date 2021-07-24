// some imports are default like java.io & java.util

// public is the default access modifier
class HelloWorld {
    static void main (String[] args){ //there is no need of main class it can run as script without compile
        println"Hello World"

        //Define a typed variable
        int age = 30
        // Print variable type
        print age.getClass()
        // Print variable value
        print age

        //Define a variable with dynamic typing [its called duck typing ](def java.lang.Object)
        def alias = "DevMalva"  // like var?
        // Print variable value
        print alias
        // Print variable type
        print alias.getClass()
    }
}
