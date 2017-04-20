package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch;

import edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.request.SearchRequest;
import edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch.results.SearchResults;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Kenneth Hurh on 4/20/2017.
 */

public interface ESService {
    @POST("ndb2/_search?pretty")
    Call<SearchResults> foodResults(@Body SearchRequest request);
}
