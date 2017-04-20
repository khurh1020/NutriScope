
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodSuggest {

    @SerializedName("prefix")
    @Expose
    private String prefix;
    @SerializedName("completion")
    @Expose
    private Completion completion;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FoodSuggest() {
    }

    /**
     * 
     * @param prefix
     * @param completion
     */
    public FoodSuggest(String prefix, Completion completion) {
        super();
        this.prefix = prefix;
        this.completion = completion;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Completion getCompletion() {
        return completion;
    }

    public void setCompletion(Completion completion) {
        this.completion = completion;
    }

}
