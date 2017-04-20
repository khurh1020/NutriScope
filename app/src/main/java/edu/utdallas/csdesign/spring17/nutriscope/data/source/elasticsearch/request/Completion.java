
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Completion {

    @SerializedName("field")
    @Expose
    private String field;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Completion() {
    }

    /**
     * 
     * @param field
     */
    public Completion(String field) {
        super();
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

}
