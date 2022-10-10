package com.cedaniel200.automatizacion.model;

import java.util.HashMap;
import java.util.Map;

public class ActorS {

    private String id;
    private String name;
    private String description;
    public ActorS(String name) {
        this.name = name;
    }
    public String toString() {
        return getNameOsrPronoun();
    }

    private String getNameOsrPronoun() {
        return (preferredPronoun != null) ? preferredPronoun : name;
    }

    private String preferredPronoun;

    public static ActorS named(String name) {
        return new ActorS(name);
    }
    private Map<String, Object> notepad = new HashMap<>();
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getNameOrPronoun() {
        return (preferredPronoun != null) ? preferredPronoun : name;
    }
    public void remember(String key, Object value) {
        notepad.put(key, value);
    }

    public <T> T recall(String key) {
        return (T) notepad.get(key);
    }

    public ActorS currentActor(){
        return new ActorS(this.name);
    }



}
