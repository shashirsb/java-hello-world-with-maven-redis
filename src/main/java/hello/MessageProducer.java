package hello;

import redis.clients.jedis.Jedis;

public class MessageProducer {

    public void Producer() { 
        Jedis jedis = new Jedis("34.85.203.217", 6479);

        jedis.rpush("slot1", "0");
        jedis.rpush("slot1", "1");
        jedis.rpush("slot1", "1");
        jedis.rpush("slot1", "1");
        jedis.rpush("slot1", "1");
    }

}
