package com.villota.http_verbs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;

public class Task {

    private ObjectId _id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("done")
    private boolean done;

    public Task() {
    }

    public Task(ObjectId _id, String title, String description, boolean done) {
        this._id = _id;
        this.title = title;
        this.description = description;
        this.done = done;
    }

    public ObjectId get_id() {
        return _id;
    }

    public Task set_id(ObjectId _id) {
        this._id = _id;
        return this;
    }

    public String get_title() {
        return title;
    }

    public Task set_title(String title) {
        this.title = title;
        return this;
    }

    public String get_description() {
        return description;
    }

    public Task set_description(String description) {
        this.description = description;
        return this;
    }

    public boolean is_done() {
        return done;
    }

    public Task set_done(boolean done) {
        this.done = done;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Task{");
        sb.append("_id=").append(_id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", done=").append(done);
        sb.append('}');
        return sb.toString();
    }
}
