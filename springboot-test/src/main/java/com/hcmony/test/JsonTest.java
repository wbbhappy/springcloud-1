package com.hcmony.test;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class JsonTest {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		JSONObject j = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		Map<String, String> map = new HashMap();
		map.put("WSC_COST", "白屏时间");
		map.put("model1", "2");
		map.put("model2", "3");
		map.put("model3", "4");
		map.put("model4", "4");
		jsonArray.add(map);
		Map<String, String> map2 = new HashMap();
		map2.put("DNS_COST", "DNS加载时间");
		map2.put("model1", "2");
		map2.put("model2", "3");
		map2.put("model3", "4");
		map2.put("model4", "4");
		jsonArray.add(map2);

		jsonObject.put("data", jsonArray);
		j.put("data", jsonArray);

		JSONArray jsonArray2 = new JSONArray();

		JSONObject js = new JSONObject();
		js.put("resources", jsonObject);
		js.put("h5Url", "aaaa");

		JSONObject js2 = new JSONObject();
		js2.put("resources", j);
		js2.put("h5Url", "bbbbb");

		jsonArray2.add(js);
		jsonArray2.add(js2);
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("appKey", "aa");
		jsonObject2.put("appName", "asdas");
		jsonObject2.put("dataSource", jsonArray2);

		System.out.println(jsonObject2.toJSONString());
	}
}
