package heroes;

/**
 * @author Evgeny Borisov
 */
public interface Father {
   default void talkToChildren(){
       System.out.println("come to me.");
   }
}
