
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.results;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchResults {

    @SerializedName("took")
    @Expose
    private Integer took;
    @SerializedName("timed_out")
    @Expose
    private Boolean timedOut;
    @SerializedName("_shards")
    @Expose
    private Shards shards;
    @SerializedName("hits")
    @Expose
    private Hits hits;
    @SerializedName("suggest")
    @Expose
    private Suggest suggest;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchResults() {
    }

    /**
     * 
     * @param hits
     * @param shards
     * @param timedOut
     * @param took
     * @param suggest
     */
    public SearchResults(Integer took, Boolean timedOut, Shards shards, Hits hits, Suggest suggest) {
        super();
        this.took = took;
        this.timedOut = timedOut;
        this.shards = shards;
        this.hits = hits;
        this.suggest = suggest;
    }

    public Integer getTook() {
        return took;
    }

    public void setTook(Integer took) {
        this.took = took;
    }

    public Boolean getTimedOut() {
        return timedOut;
    }

    public void setTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
    }

    public Shards getShards() {
        return shards;
    }

    public void setShards(Shards shards) {
        this.shards = shards;
    }

    public Hits getHits() {
        return hits;
    }

    public void setHits(Hits hits) {
        this.hits = hits;
    }

    public Suggest getSuggest() {
        return suggest;
    }

    public void setSuggest(Suggest suggest) {
        this.suggest = suggest;
    }

}
