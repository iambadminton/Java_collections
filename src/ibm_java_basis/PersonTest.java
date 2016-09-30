package ibm_java_basis;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a.shipulin on 30.09.16.
 */
public class PersonTest {
    @Test
    public void getAge() throws Exception {
        Person person = new Person(new String("Иванов"), 36, 190, 95, new String("blue"), new String("male"));
        assertEquals(36, person.getAge());

    }

}