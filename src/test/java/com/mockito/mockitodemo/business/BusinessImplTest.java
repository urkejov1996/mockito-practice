package com.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessImplTest {


    @Test
    public void findTheGreatestFromAllData_Basic() {

        assertEquals(25, new BusinessImpl(new DataServiceStub()).findTheGreatestFromAllData());

    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}
