package com.company;

import com.company.dataobjects.PersonalDetails;
import com.company.filehelpers.CsvReadToList;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReader{

//    @Test
//    public void reading1Line() throws IOException {
//        String splitCharacterBy = ",";
//
//        StringReader oneItem = new StringReader("Name,FirstName,House Number,Street,Town,City,Postcode,Registration,Make,Model,Engine Size\n" +
//                "Harry,Smith,32,Ullet Rd,Aigburth,Liverpool,l17 0EN,,VW,UP,1.6");
//
//        List<PersonalDetails> personalDetails = CsvReadToList.readCsvToArray(splitCharacterBy, oneItem);
//        PersonalDetails personalDetail = personalDetails.get(0);
//
//
//        assertEquals(personalDetail.getFirstName(), "Harry");
//        assertEquals(personalDetail.getSurname(), "Smith");
//
//        assertEquals(personalDetail.getAddress().getHouseNumber(), 32);
//        assertEquals(personalDetail.getAddress().getStreet(), "Ullet Rd");
//        assertEquals(personalDetail.getAddress().getTown(), "Aigburth");
//        assertEquals(personalDetail.getAddress().getCity(), "Liverpool");
//        assertEquals(personalDetail.getAddress().getPostcode(), "l17 0EN");
//
//        assertEquals(personalDetail.getCarDetails().getCarRegistration(), "");
//        assertEquals(personalDetail.getCarDetails().getCarMake(), "VW");
//        assertEquals(personalDetail.getCarDetails().getCarModel(), "UP");
//        assertEquals(personalDetail.getCarDetails().getEngineSize(), 1.6);
//
//    }
//
//    @Test
//    public void reading2Lines() throws IOException {
//        String splitCharacterBy = ",";
//
//        StringReader twoItem = new StringReader("Name,FirstName,House Number,Street,Town,City,Postcode,Registration,Make,Model,Engine Size\n" +
//                "Harry,Smith,32,Ullet Rd,Aigburth,Liverpool,l17 0EN,,VW,UP,1.6\n"
//                + "Mollie,Wilcox,29,Pangbourne,Appleton,Warington,WA4 THY,DG15 UJS,Citroen,,1.2");
//
//        List<PersonalDetails> personalDetails = CsvReadToList.readCsvToArray(splitCharacterBy, twoItem);
//        PersonalDetails personalDetail = personalDetails.get(0);
//
//        //First Line
//        assertEquals(personalDetail.getFirstName(), "Harry");
//        assertEquals(personalDetail.getSurname(), "Smith");
//
//        assertEquals(personalDetail.getAddress().getHouseNumber(), 32);
//        assertEquals(personalDetail.getAddress().getStreet(), "Ullet Rd");
//        assertEquals(personalDetail.getAddress().getTown(), "Aigburth");
//        assertEquals(personalDetail.getAddress().getCity(), "Liverpool");
//        assertEquals(personalDetail.getAddress().getPostcode(), "l17 0EN");
//
//        assertEquals(personalDetail.getCarDetails().getCarRegistration(), "");
//        assertEquals(personalDetail.getCarDetails().getCarMake(), "VW");
//        assertEquals(personalDetail.getCarDetails().getCarModel(), "UP");
//        assertEquals(personalDetail.getCarDetails().getEngineSize(), 1.6);
//
//        //second line
//
//        PersonalDetails personalDetails1 = personalDetails.get(1);
//        assertEquals(personalDetails1.getFirstName(), "Mollie");
//        assertEquals(personalDetails1.getSurname(), "Wilcox");
//
//        assertEquals(personalDetails1.getAddress().getHouseNumber(), 29);
//        assertEquals(personalDetails1.getAddress().getStreet(), "Pangbourne");
//        assertEquals(personalDetails1.getAddress().getTown(), "Appleton");
//        assertEquals(personalDetails1.getAddress().getCity(), "Warington");
//        assertEquals(personalDetails1.getAddress().getPostcode(), "WA4 THY");
//
//        assertEquals(personalDetails1.getCarDetails().getCarRegistration(), "DG15 UJS");
//        assertEquals(personalDetails1.getCarDetails().getCarMake(), "Citroen");
//        assertEquals(personalDetails1.getCarDetails().getCarModel(), "");
//        assertEquals(personalDetails1.getCarDetails().getEngineSize(), 1.2);
//
//    }
}
