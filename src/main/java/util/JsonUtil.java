package util;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * Created by Mick on 15-5-2017.
 */
public class JsonUtil {
    public static String toJson(Object object) {
        return new Gson().toJson(object);
    }
    public static ResponseTransformer json() {
        return JsonUtil::toJson;
    }
}
