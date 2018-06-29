package me.snyde606.flicksmoviesapp.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Config {

    String imageBaseUrl;
    String posterSize;
    String backdropSize;

    public Config(JSONObject object) throws JSONException {
        JSONObject imagesOptions = object.getJSONObject("images");
        imageBaseUrl = imagesOptions.getString("secure_base_url");
        JSONArray posterSizeOptions = imagesOptions.getJSONArray("poster_sizes");
        posterSize = posterSizeOptions.optString(3, "w342");
        JSONArray backdropSizeOptions = imagesOptions.getJSONArray("backdrop_sizes");
        backdropSize = backdropSizeOptions.optString(1, "w700");
    }

    public String getImageBaseUrl() {
        return imageBaseUrl;
    }

    public String getPosterSize() {
        return posterSize;
    }

    public String getImageUrl(String size, String path){
        return String.format("%s%s%s", imageBaseUrl, size, path);
    }

    public String getBackdropSize() {
        return backdropSize;
    }
}
