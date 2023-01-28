package hello;

import hello.Slots;
import redis.clients.jedis.Jedis;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MessageConsumer {

    

    private static final int TIMEOUT = 0;
    public List<Slots> slots = new ArrayList<Slots>();
    public Set<Integer> vaccine = new HashSet<Integer>();

    public void Consumer() {
    

        Jedis jedis = new Jedis("34.85.203.217", 6479);

       

        int count = 0;
        int _slot = 0;

        while (true) {
            System.out.println("Waiting for a message in the queue");
            List<String> messages = jedis.blpop(TIMEOUT, "patient-key");
            //System.out.println("received message with key:" + messages.get(0) + " with value:" + messages.get(1));
            count++;
            Integer vaccine_no = Integer.parseInt(messages.get(1));
            if ((count % 2 != 0) ) {
                vaccine.add(vaccine_no);
                System.out.println("same slots");
            } else {
                slots.add(new Slots(vaccine));
                System.out.println("creating new slots");
            }         
            
        }
 
        // System.out.println("" + slots.stream()
        // .map(Slots::getVaccine)
        // .collect(Collectors.groupingBy(Set::size, Collectors.counting())));
       
          
    }

        
  

}
