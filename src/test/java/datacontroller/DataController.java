package datacontroller;

import lombok.Data;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

@Data
public class DataController {
  JSONParser parser;
  JSONArray obj;

  public DataController(String pathToJSON) throws IOException, ParseException {
    this.parser = new JSONParser();
    Object obj = this.parser.parse(new FileReader(pathToJSON));
    this.obj = (JSONArray) obj;
  }

  public String getFirstName(int objIndex) {
    JSONObject obj = (JSONObject) this.obj.get(objIndex);
    return (String) obj.get("firstname");
  }

  public String getLastName(int objIndex) {
    JSONObject obj = (JSONObject) this.obj.get(objIndex);
    return (String) obj.get("lastname");
  }
}
