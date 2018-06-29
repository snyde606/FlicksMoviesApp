package me.snyde606.flicksmoviesapp.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Movie {

    private String title;
    private String overview;
    private String posterPath;
    private String backdropPath;

    public Movie(JSONObject object) throws JSONException {
        this.title = object.getString("title");
        this.overview = object.getString("overview");
        this.posterPath = object.getString("poster_path");
        this.backdropPath = object.getString("backdrop_path");
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

}
