package org.soasta.framework.ci;

import java.util.ArrayList;
import java.util.HashMap;

public class TestAutomation {

    private static TestAutomation instance;
    private static Boolean dataLoaded = false;
    private static HashMap realmMap;
    private static HashMap parameterMap;
    private static ArrayList realmData;
    private static ArrayList blockData;
    private static ArrayList testData;
    
    private TestAutomation(){}
     
    public static synchronized TestAutomation getInstance(){
        if(instance == null){
            instance = new TestAutomation();
        }
        return instance;
    }

    public static synchronized void loadData(){
        if(!dataLoaded){
        	setDataLoadedStatus(true);
        	//loaddata
        }
    }
    
    private static void setDataLoadedStatus(Boolean status){
    	dataLoaded = status;
    }

    public Boolean getDataLoadedStatus(Boolean status){
    	return dataLoaded;
    }
    
}
