import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before() {
        bear = new Bear("Baloo", 25, 95.62, 'F');
    }

    @Test
    public void hasName() {
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight() {
        assertEquals(95.62, bear.getWeight(), 0.0);
    }

    @Test
    public void readyToHibernateIfGreaterThan80() {
        assertEquals(true, bear.readyToHibernate());

    }

    @Test
    public void notReadyToHibernateIfLessThan80() {
        Bear thinBear = new Bear("Baloo", 25, 65.44, 'F');
        assertEquals(false, thinBear.readyToHibernate());
    }
// We're just testing if the Bear has a gender so we simply return the gender in the Bear class.
    @Test
    public void hasGender() {
        assertEquals('F', bear.getGender());
    }
}
