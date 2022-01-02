package Pojomodels.json;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class EntriesValues {

    private String id;
    private String description;
    private String name;
    @SerializedName("runs")
    List<RunsValues> runsValuesList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RunsValues> getRunsValuesList() {
        return runsValuesList;
    }

    public void setRunsValuesList(List<RunsValues> runsValuesList) {
        this.runsValuesList = runsValuesList;
    }
}
