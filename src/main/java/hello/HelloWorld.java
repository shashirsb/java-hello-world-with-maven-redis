package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        MessageProducer msgproducer = new MessageProducer();
        msgproducer.Producer();
        MessageConsumer msgconsumer =new MessageConsumer();
        msgconsumer.Consumer();
        
        System.out.println(greeter.sayHello());
    }
}
