package JsonObjectTrial;

import org.json.JSONObject;

import java.lang.reflect.Array;

import com.google.common.collect.Lists;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTrial {

    public static void main(String[] args) {
        JSONObject jsonObjectMain = new JSONObject();
        System.out.println(jsonObjectMain);
        jsonObjectMain.put("main", "main");
        System.out.println(jsonObjectMain);
        List<Map<String, String>> tester = JsonTrial.trialList();
        System.out.println(tester);
        JSONObject test = new JSONObject();
        System.out.println(test);
        test.put("main", new JSONObject());
        System.out.println(test);

    }

    private static List<Map<String, String>> trialList() {

        List<Map<String, String>> emptyList = Lists.newArrayList();
        Map<String, String> trialMap = new HashMap<String, String>();

        trialMap.put("one", "One");
        trialMap.put("two", "Two");
        trialMap.put("three", "Three");

        emptyList.add(trialMap);

        return emptyList;
    }
}
