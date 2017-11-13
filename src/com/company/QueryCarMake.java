package com.company;

import com.mongodb.*;

import java.util.ArrayList;
import java.util.List;

public class QueryCarMake {

    public void searchForCarMake()
    {
        ConvertingBsonToJava convert = new ConvertingBsonToJava();

        MongoClient mongo = new MongoClient("localhost", 27017); //creating a Mongo Client

        //get the connections
        DB db = mongo.getDB("Car_Insurance_Details"); //name of database
        DBCollection collection = db.getCollection("Personal_Details"); //name of table

        //Create List to hold objects
        List<PersonalDetails> carInsuranceList = new ArrayList<>();

        //Specific Query
        BasicDBObject query = new BasicDBObject();
        query.put("CarMake", "BMW");

        DBCursor cursor = collection.find(query);

        while (cursor.hasNext()) {


            BasicDBObject carInsuranceObject = (BasicDBObject) cursor.next();

            //converting Mongo Object (BSON) to java object
            PersonalDetails personalDetails = convert.convertingObject(carInsuranceObject);

            carInsuranceList.add(personalDetails);
            System.out.println(personalDetails);
        }

        System.out.println(collection.count());
    }
}