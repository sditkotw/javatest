package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2017年12月27日 下午2:52:04 
 * @version 1.0 
 * @parameter   
 */
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

public class Test {

    public static void main(String[] args) 
        throws Exception {
        try {
            try {
                throw new Sneeze();
            } 
            catch ( Annoyance a ) {
            	
                System.out.println("Caught Annoyance is "+a);
                throw a;
            }
        } 
        catch ( Sneeze s ) {
            System.out.println("Caught Sneeze");
            return ;
        }
        finally {
            System.out.println("Hello World!");
        }
    }
}
