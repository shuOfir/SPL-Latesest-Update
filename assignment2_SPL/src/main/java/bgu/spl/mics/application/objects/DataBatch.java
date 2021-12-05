package bgu.spl.mics.application.objects;

/**
 * Passive object representing a data used by a model.
 * Add fields and methods to this class as you see fit (including public methods and constructors).
 */

public class DataBatch {

    enum Type {Text, Image, Tabular};

    private Type type;

    public DataBatch(Type type){
        type=type;
    }

}
