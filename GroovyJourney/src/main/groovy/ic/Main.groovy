package ic

import groovy.xml.MarkupBuilder

class Main {
    static void main(String[] args) {
        // Using a simple println statement to print output to the console
        println('Hello World1');
        {
            println "hello world2"
        }
        def myClosure = { String x, int y ->
            println "hey ${x} the value is ${y}"
        }
        myClosure.call("peter", 1)

        def innerClosure = {
            printf("hello3")
        }
        innerClosure()
        innerClosure.call()

        def hello = { String x ->
            printf("hello ${x}")
        }
        hello("world4")
        hello.call("world5")

        Main main = new Main()
        Person person = new Person(name: "lilei", age: 14)
        println person.toString()

        main.cc.delegate = person
        main.cc.call()//不是太懂这行为什么打印了两行"你喂的油条真难吃"
        println person.toString()

        def xml = new MarkupBuilder()

        }
    def cc = {
        name = "hanmeimei"
        age = 26
        eat("油条")//不是太懂这行
        eat "油条"
    }

}