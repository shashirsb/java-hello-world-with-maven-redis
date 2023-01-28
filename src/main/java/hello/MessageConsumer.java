package hello;

import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MessageConsumer {

    private static final int TIMEOUT = 0;

    class Slots {
        public Slots(Set<String> vaccine) {
            this.vaccine = vaccine;
        }
        Set<String> vaccine;
        public Set<String> getVaccine()
        {
            return vaccine;
        }
    }

    public void Consumer() {
        Jedis jedis = new Jedis("34.85.203.217", 6479);

        List<Slots> slots = new ArrayList<Slots>();
        Set<String> vaccine = new HashSet<String>();

        int count =0;

        while(true){
            System.out.println("Waiting for a message in the queue");
            List<String> messages = jedis.blpop(TIMEOUT, "mq-key");
            System.out.println("received message with key:" + messages.get(0) + " with value:" + messages.get(1));
            count++;
        //    if (count % 6){

        //    }
        }
        
        

    }
}
