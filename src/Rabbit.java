public class Rabbit implements Prey {

//Since Rabbit implements the Prey interface, it must provide an implementation for the flee() method defined in the Prey interface.
             @Override
             public void flee() {
                 System.out.println("The Rabbit is fleeing.");
             }
}
