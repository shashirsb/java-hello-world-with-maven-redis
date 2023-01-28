package hello;

import redis.clients.jedis.Jedis;

public class MessageProducer {

    public void Producer() { 
        Jedis jedis = new Jedis("34.85.203.217", 6479);

        jedis.rpush("patient-key", "0");
        jedis.rpush("patient-key", "1");
        jedis.rpush("patient-key", "1");
        jedis.rpush("patient-key", "1");
        jedis.rpush("patient-key", "1");
        System.out.println("producing completed");
    }

}
