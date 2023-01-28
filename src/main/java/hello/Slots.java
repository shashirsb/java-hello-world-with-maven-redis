package hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Slots {
            public Slots(Set<Integer> vaccine) {
                this.vaccine = vaccine;
            }
    
            Set<Integer> vaccine;
    
            public Set<Integer> getVaccine() {
                return vaccine;
            }
        }