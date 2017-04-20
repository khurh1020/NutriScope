
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.results;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodSuggest {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("options")
    @Expose
    private List<Option> options = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FoodSuggest() {
    }

    /**
     * 
     * @param text
     * @param length
     * @param offset
     * @param options
     */
    public FoodSuggest(String text, Integer offset, Integer length, List<Option> options) {
        super();
        this.text = text;
        this.offset = offset;
        this.length = length;
        this.options = options;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

}
