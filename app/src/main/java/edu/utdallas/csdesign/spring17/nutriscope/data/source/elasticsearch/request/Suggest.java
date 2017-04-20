
package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Suggest {

    @SerializedName("food-suggest")
    @Expose
    private FoodSuggest foodSuggest;

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
    public Suggest(FoodSuggest foodSuggest) {
        super();
        this.foodSuggest = foodSuggest;
    }

    public FoodSuggest getFoodSuggest() {
        return foodSuggest;
    }

    public void setFoodSuggest(FoodSuggest foodSuggest) {
        this.foodSuggest = foodSuggest;
    }

}
