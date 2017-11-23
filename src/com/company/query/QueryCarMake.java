package com.company.query;

import com.company.Mongo.ConnectionToMongo;
import com.company.Mongo.ConvertingBsonToJava;
import com.company.dataobjects.PersonalDetails;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import java.util.ArrayList;
import java.util.List;

public class QueryCarMake {

    public void searchForCarMake()
    {
        //Connection to Mongodb, database and Collection
        MongoCollection<BasicDBObject> collection = ConnectionToMongo.connection();  //returns collection

        //List to store documents
        List<PersonalDetails> carMakeList = new ArrayList<>();

        //Query
        BasicDBObject query = new BasicDBObject();
        query.put("CarMake", "BMW");

        MongoCursor <BasicDBObject> cursor = collection.find(query).iterator();

        while (cursor.hasNext()) {

            BasicDBObject carInsuranceObject = cursor.next();

            //converting Mongo Object (BSON) to java object
            PersonalDetails personalDetails = ConvertingBsonToJava.convertingObject(carInsuranceObject);

            //PersonalDetails personalDetails1 = ConversionJackson.convertingToJava(carInsuranceObject);

            //ConversionJackson.convertingToJava2(carInsuranceObject);


            carMakeList.add(personalDetails);
            System.out.println(personalDetails);
        }

        System.out.println("");
        System.out.println("There are " + carMakeList.size() + " matching profiles out of " + collection.count());
        System.out.println("");
    }
}