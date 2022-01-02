package Pojomodels.json;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class EntriesTotal {
    @SerializedName("entries")
    List<EntriesValues> entriesValuesList = new ArrayList<>();

    public List<EntriesValues> getEntriesValuesList() {
        return entriesValuesList;
    }

    public void setEntriesValuesList(List<EntriesValues> entriesValuesList) {
        this.entriesValuesList = entriesValuesList;
    }

}
