import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Calgary", "AB"));
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(true, list.hasCity("Edmonton"));
    }

    @Test
    public void deleteCityTest() {
        list.addCity(new City("Red Deer", "AB"));
        int listSize = list.getCount();
        list.deleteCity("Red Deer");
        assertEquals(listSize-1,list.getCount());
    }

    @Test
    public void countCityTest() {
        assertEquals(2,list.getCount());
    }
}