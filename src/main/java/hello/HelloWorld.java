package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        MessageConsumer msgconsumer =new MessageConsumer();
        // msgconsumer.Consumer();
        MessageProducer msgproducer = new MessageProducer();
        msgproducer.Producer();
        System.out.println(greeter.sayHello());
    }
}
