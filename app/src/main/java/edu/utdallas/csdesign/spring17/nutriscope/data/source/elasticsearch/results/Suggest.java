
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.results;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Suggest {

    @SerializedName("food-suggest")
    @Expose
    private List<FoodSuggest> foodSuggest = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Suggest() {
    }

    /**
     * 
     * @param foodSuggest
     */
    public Suggest(List<FoodSuggest> foodSuggest) {
        super();
        this.foodSuggest = foodSuggest;
    }

    public List<FoodSuggest> getFoodSuggest() {
        return foodSuggest;
    }

    public void setFoodSuggest(List<FoodSuggest> foodSuggest) {
        this.foodSuggest = foodSuggest;
    }

}
