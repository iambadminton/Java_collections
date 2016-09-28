package learn_collections;

/**
 * Created by a.shipulin on 27.09.16.
 */
import java.util.*;

public class ArrayToList
{
    public static void main(String[] args)
    {
        // Это не даст нам ничего хорошего
        System.out.println(args);

        // Конвертируем args в коллекцию List объектов String
        List<String> argList = Arrays.asList(args);



        // Распечатываем
        System.out.println(argList);

        System.out.println(args.toString());}
}
