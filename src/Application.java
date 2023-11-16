import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Application {

    private static final String[] MaxRate = null;
    private static final String[] MinRate = null;
    private String appName;
    private String category;
    private String rating;
    private final Map<String, List<Application>> categorized = new HashMap<>();

    public Application (String appName, String category, String rating) {
        this.appName = appName;
        this.category = category;
        this.rating = rating;
    }

    public String getAppName() {return appName;}

    public void setAppName(String appName) {this.appName = appName;}

    public String getCategory() {return category; }

    public void setCategory(String category) {this.category = category; }

    public String getRating() {return rating;}

    public void setRating(String rating) {this.rating = rating;}


    public static Double getAverage(String rating) {    
        ArrayList<String[]> appRating = new ArrayList<>();
        double AveValue = Double.parseDouble(rating);
        if(AveValue == 0) return (double) 0;
        double totalRating = 0;
        for(int i = 0; i < appRating.size(); i++) totalRating += rating.get(i);
        return totalRating / AveValue;
    }
        

    public void HighestApp(String appName) {
        


    }

    public void LowestApp(String Appname) {

    }

    public void calcMinandMaxRate(String[] line){
        for (int i = 0; i < line.length; i++) {
            double currValue = Double.parseDouble(line[i]);
            if(currValue > Double.parseDouble(MaxRate[i])) {
                (MaxRate[i]) = currValue;
            }if(currValue < Double.parseDouble(MinRate[i])) {
                MinRate[i] = currValue;
            }
        }
    }

    public void getDiscRecord (String root){
        root = "NaN";
        List<Application> countError = categorized.get(root);
        int countrecord = countError.get(root);
        countrecord += 1;
        countError.put(root, countrecord);        
        }

    

    public void countLine(String[]){
        Map<String, Integer> countMap = categorized.get();
        int count = countMap.get();
        count +=1;
        countMap.put(count);
        System.out.printf("Number of lines = %s%d\n",count);
        } 





    


    
}
