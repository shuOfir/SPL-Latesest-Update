package bgu.spl.mics.application.objects;

/**
 * Passive object representing a Deep Learning model.
 * Add all the fields described in the assignment as private fields.
 * Add fields and methods to this class as you see fit (including public methods and constructors).
 */
public class Model {
    enum statusList {PreTrained, Training, Trained, Tested};
    enum resultsList {Good, Bad, None};

    private String name;
    private Student student;
    private Data data;
    private statusList status;
    private resultsList result;
    public Model(){
        //TODO
        //we assume we can put a basic data argument inside the empty constructor
    }

    public void setStatus(statusList s){
        //TODO
    }
    public statusList getStatus(){return status;}

    public void setResult(resultsList result){
        //TODO
    }

    public resultsList getResult(){return result;}


}
