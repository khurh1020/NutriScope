
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.results;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Suggest_ {

    @SerializedName("input")
    @Expose
    private String input;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Suggest_() {
    }

    /**
     * 
     * @param input
     */
    public Suggest_(String input) {
        super();
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

}
