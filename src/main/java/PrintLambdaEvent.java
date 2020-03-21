import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;
// https://www.baeldung.com/aws-lambda-api-gateway
// mvn clean package shade:shade
public class PrintLambdaEvent implements RequestHandler<Map<String,Object>, String> {
    public String handleRequest(Map<String,Object> input, Context context) {
        System.out.println(input.toString());
        return input.toString();
    }
}