
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchRequest {

    @SerializedName("suggest")
    @Expose
    private Suggest suggest;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchRequest() {
    }

    /**
     * 
     * @param suggest
     */
    public SearchRequest(Suggest suggest) {
        super();
        this.suggest = suggest;
    }

    public Suggest getSuggest() {
        return suggest;
    }

    public void setSuggest(Suggest suggest) {
        this.suggest = suggest;
    }

}
