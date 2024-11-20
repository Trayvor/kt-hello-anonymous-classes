package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val list = mutableListOf<String>()

        val englishGreeting = object : HelloWorldGreeting {
            override fun greet() = "Hello world"
            override fun greetSomeone(someone: String) = "Hello, $someone"
        }

        val frenchGreeting = object: HelloWorldGreeting {
            override fun greet() = "Bonjour tout le monde"
            override fun greetSomeone(someone: String) = "Bonjour, $someone"
        }

        val spanishGreeting = object: HelloWorldGreeting{
            override fun greet() = "Hola mundo"
            override fun greetSomeone(someone: String) = "Hola, $someone"
        }

        list.add(englishGreeting.greet())
        list.add(frenchGreeting.greet())
        list.add(spanishGreeting.greet())

        for (name in names) {
            list.add(englishGreeting.greetSomeone(name))
            list.add(frenchGreeting.greetSomeone(name))
            list.add(spanishGreeting.greetSomeone(name))
        }

        return list
    }
}
