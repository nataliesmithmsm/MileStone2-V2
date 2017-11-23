package com.company.Mongo;

import com.company.dataobjects.Address;
import com.company.dataobjects.CarDetails;
import com.company.dataobjects.PersonalDetails;
import com.mongodb.BasicDBObject;

public class ConvertingBsonToJava {

    public static PersonalDetails convertingObject(BasicDBObject carInsuranceObject)
    {

        //Reading in Strings from mongo Collection
        String firstname = carInsuranceObject.getString("FirstName");
        String surname = carInsuranceObject.getString("Surname");
        String houseNumber = carInsuranceObject.getString("HouseNumber");
        String street = carInsuranceObject.getString("Street");
        String town = carInsuranceObject.getString("Town");
        String city = carInsuranceObject.getString("City");
        String postcode = carInsuranceObject.getString("PostCode");
        String carRegistration = carInsuranceObject.getString("CarRegistration");
        String carMake = carInsuranceObject.getString("CarMake");
        String carModel = carInsuranceObject.getString("CarModel");
        double engineSize = carInsuranceObject.getDouble("EngineSize");

        //Storing Strings to a java object
        PersonalDetails person = new PersonalDetails();
        person.setFirstName(firstname);
        person.setSurname(surname);

        Address address = new Address();
        address.setHouseNumber(Integer.parseInt(houseNumber));
        address.setStreet(street);
        address.setTown(town);
        address.setCity(city);
        address.setPostcode(postcode);
        person.setAddress(address);

        CarDetails carDetails = new CarDetails();
        carDetails.setCarRegistration(carRegistration);
        carDetails.setCarModel(carModel);
        carDetails.setCarMake(carMake);
        carDetails.setEngineSize(engineSize);
        person.setCarDetails(carDetails);

        return person;

    }
}
