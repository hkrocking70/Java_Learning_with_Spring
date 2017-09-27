import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lowes.beans.Question;
import com.lowes.db.Operations;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operations operations = new Operations();
		Question question = operations.getQuestions("shed_properties");
		//Gson gson = new Gson();
		//String string = gson.toJson(question);
		try (Writer writer = new FileWriter("Output.json")) {
		    Gson gson = new GsonBuilder().create();
		    gson.toJson(question, writer);
		}
		//System.out.println(string);
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
