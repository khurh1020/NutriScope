
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.results;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

    @SerializedName("ndbId")
    @Expose
    private String ndbId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("suggest")
    @Expose
    private Suggest_ suggest;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Source() {
    }

    /**
     * 
     * @param name
     * @param suggest
     * @param ndbId
     */
    public Source(String ndbId, String name, Suggest_ suggest) {
        super();
        this.ndbId = ndbId;
        this.name = name;
        this.suggest = suggest;
    }

    public String getNdbId() {
        return ndbId;
    }

    public void setNdbId(String ndbId) {
        this.ndbId = ndbId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Suggest_ getSuggest() {
        return suggest;
    }

    public void setSuggest(Suggest_ suggest) {
        this.suggest = suggest;
    }

}
