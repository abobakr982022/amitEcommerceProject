package GeneralMethods;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonDataReaderForRegisteration {
    private static final String file = "src/test/java/DataFiles/RegisterationData.json";

    public static Object[][] getData () throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String,String>> data = objectMapper.readValue(new File(file),List.class);
        Object [][] registerationData = new Object[data.size()][12];
        for (int i = 0 ; i < data.size() ; i++){
            registerationData[i][0] = data.get(i).get("userName");
            registerationData[i][1] = data.get(i).get("Email");
            registerationData[i][2] = data.get(i).get("password");
            registerationData[i][3] = data.get(i).get("confirmPassword");
            registerationData[i][4] = data.get(i).get("firstName");
            registerationData[i][5] = data.get(i).get("lastName");
            registerationData[i][6] = data.get(i).get("phoneNumber");
            registerationData[i][7] = data.get(i).get("country");
            registerationData[i][8] = data.get(i).get("city");
            registerationData[i][9] = data.get(i).get("Address");
            registerationData[i][10] = data.get(i).get("state");
            registerationData[i][11] = data.get(i).get("postalCode");
        }
        return registerationData;
    }
}
