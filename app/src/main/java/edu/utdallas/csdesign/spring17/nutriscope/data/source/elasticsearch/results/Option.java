
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.results;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Option {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("_index")
    @Expose
    private String index;
    @SerializedName("_type")
    @Expose
    private String type;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("_score")
    @Expose
    private Integer score;
    @SerializedName("_source")
    @Expose
    private Source source;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Option() {
    }

    /**
     * 
     * @param id
     * @param index
     * @param text
     * @param source
     * @param score
     * @param type
     */
    public Option(String text, String index, String type, String id, Integer score, Source source) {
        super();
        this.text = text;
        this.index = index;
        this.type = type;
        this.id = id;
        this.score = score;
        this.source = source;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

}
