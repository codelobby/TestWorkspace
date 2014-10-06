package JsonObjectTrial;

import com.google.common.collect.Lists;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTrial {

    public static void main(String[] args) {

        List<String> strings = Lists.newArrayList();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("json1", "json2");
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("json3", "json4");

        JSONArray jsonArray = new JSONArray();
        jsonArray.put(jsonObject);
        jsonArray.put(jsonObject2);

        System.out.println(jsonArray);

        /*JSONObject jsonObjectMain = new JSONObject();
        System.out.println(jsonObjectMain);
        jsonObjectMain.put("main", "main");
        System.out.println(jsonObjectMain);
        List<Map<String, String>> tester = JsonTrial.trialList();
        System.out.println(tester);
        JSONObject test = new JSONObject();
        System.out.println(test);
        test.put("main", new JSONObject());
        System.out.println(test);*/

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
