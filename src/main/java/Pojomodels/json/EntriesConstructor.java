package Pojomodels.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class EntriesConstructor {

    //написать конструктор моделей для json

    public static void main(String[] args) {

        EntriesConstructor entriesConstructor = new EntriesConstructor();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(entriesConstructor.getEntriesModel()));
    }

    public EntriesTotal getEntriesModel() {

        RunsValues runsValues = new RunsValues();
        runsValues.setBlocked_count(0);
        runsValues.setCompleted_on(null);
        runsValues.setConfig("Firefox, Ubuntu 12");

        List<RunsValues> runsValuesList = new ArrayList<>();
        runsValuesList.add(runsValues);

        EntriesValues entriesValues = new EntriesValues();
        entriesValues.setId("3933d74b-4282-4c1f-be62-a641ab427063");
        entriesValues.setDescription("some description");
        entriesValues.setName("File Formats");
        entriesValues.setRunsValuesList(runsValuesList);

        List<EntriesValues> entriesValuesList = new ArrayList<>();
        entriesValuesList.add(entriesValues);

        EntriesTotal entriesTotal = new EntriesTotal();
        entriesTotal.setEntriesValuesList(entriesValuesList);

        return entriesTotal;
    }
}
