
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.results;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Shards {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("successful")
    @Expose
    private Integer successful;
    @SerializedName("failed")
    @Expose
    private Integer failed;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Shards() {
    }

    /**
     * 
     * @param total
     * @param failed
     * @param successful
     */
    public Shards(Integer total, Integer successful, Integer failed) {
        super();
        this.total = total;
        this.successful = successful;
        this.failed = failed;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSuccessful() {
        return successful;
    }

    public void setSuccessful(Integer successful) {
        this.successful = successful;
    }

    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

}
