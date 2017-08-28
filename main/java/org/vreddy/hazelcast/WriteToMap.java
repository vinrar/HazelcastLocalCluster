package org.vreddy.hazelcast;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Set;

/**
 * Created by z002rgw on 8/27/17.
 */
public class WriteToMap {
    public static void main(String[] args) {
        HazelcastInstance instance = Hazelcast.newHazelcastInstance();
        Set<String> set = instance.getSet("set1");
        for(int i = 0; i < 10; i++){
            set.add("Tokyo" + i);
        }
        System.out.println("Wrote to map");
    }
}
