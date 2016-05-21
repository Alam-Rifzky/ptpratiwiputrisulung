package model;

public class ModelPetugas {
    String query;
    
    public String Login(){
        try {
            query = "SELECT * FROM user WHERE username='' AND password=''";
            return "ada";
        } catch (Exception e) {
            return "";
        }
    }
    
    
}
