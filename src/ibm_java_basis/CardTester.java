package ibm_java_basis;

/**
 * Created by a.shipulin on 30.09.16.
 */
public class CardTester
{
    public static void main(String[] args)
    {
        Card card ;

        card = new Card() ;
        System.out.println(card) ;
        System.out.println("unknown WAS EXPECTED") ;

        card = new Card("Jane") ;
        System.out.println(card) ;
        System.out.println("Jane WAS EXPECTED") ;
    }
}
