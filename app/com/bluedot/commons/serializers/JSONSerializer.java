package com.bluedot.commons.serializers;

import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class JSONSerializer<T>
{
	protected boolean includePrivateFields = false;
	
	public abstract JSONObject objectToJson(T object) throws JSONException;
	
	public JSONArray objectToJson(List<T> list) throws JSONException
	{
		JSONArray array = new JSONArray();
		
		for (Iterator<T> iterator = list.iterator(); iterator.hasNext();)
		{
			T t = iterator.next();
			JSONObject object = objectToJson(t);
			array.put(object);
		}
		return array;
	}
	
	public JSONSerializer<T> includePrivateFields()
	{
		includePrivateFields = true;
		return this;
	}
}
