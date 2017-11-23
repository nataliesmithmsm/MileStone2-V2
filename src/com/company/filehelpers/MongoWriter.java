package com.company.filehelpers;
import com.company.Mongo.ConnectionToMongo;
import com.company.dataobjects.PersonalDetails;
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import jdk.nashorn.internal.ir.debug.JSONWriter;

import java.util.List;

public class MongoWriter {

    public void insertDocumentToMongo(List<PersonalDetails> profileList)  {  //ArrayList profileList, PersonalDetails person1

        //Connection to Mongodb, database and Collection
        MongoCollection<BasicDBObject> collection = ConnectionToMongo.connection();  //returns collection

        for (PersonalDetails profile : profileList)  {

            BasicDBObject profileDBObject = new BasicDBObject();

            profileDBObject.put("FirstName", profile.getFirstName());
            profileDBObject.put("Surname", profile.getSurname());

            profileDBObject.put("HouseNumber", profile.getAddress().getHouseNumber());
            profileDBObject.put("Street", profile.getAddress().getStreet());
            profileDBObject.put("Town", profile.getAddress().getTown());
            profileDBObject.put("City", profile.getAddress().getCity());
            profileDBObject.put("PostCode", profile.getAddress().getPostcode());

            profileDBObject.put("CarRegistration", profile.getCarDetails().getCarRegistration());
            profileDBObject.put("CarMake", profile.getCarDetails().getCarMake());
            profileDBObject.put("CarModel", profile.getCarDetails().getCarModel());
            profileDBObject.put("EngineSize", profile.getCarDetails().getEngineSize());

            //inserting object into Mongodb table
            collection.insertOne(profileDBObject);
        }

    }

}



