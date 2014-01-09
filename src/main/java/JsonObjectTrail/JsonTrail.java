package JsonObjectTrail;

import org.json.JSONObject;

public class JsonTrail {

    public static void main (String[] args) {
        JSONObject test = new JSONObject();
        System.out.println(test);
        test.put("main", new JSONObject());
        System.out.println(test);
        JSONObject addToMain = test.getJSONObject("main");
        addToMain.put("key", "hello World");
        System.out.println(test.getString("key"));

    }
}
