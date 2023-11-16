import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


public class Main {
    public static final int COL_APP = 0;
    public static final int COL_CAT = 1;
    public static final int COL_RTG = 2;

    public static void main(String[] args) throws IOException{

        if(args.length <= 0) {
            System.err.println("No csv file");
            System.exit(1);
        }

        try (FileReader fr = new FileReader(args[0])) {
            BufferedReader br = new BufferedReader(fr);}
            String line;
            while (null != (line = br.readLine())) {
                String [] columns = line.trim().split(",");
                line = line.toLowerCase();
                 Application application = new Application(columns[COL_APP], 
                 columns[COL_CAT],(columns[COL_RTG]));

                Map<String, List<Application>> categorized = new HashMap<>();
                categorized.put("CATEGORY", new ArrayList<>());
                categorized.put("RATING", new ArrayList<>());
                categorized.put("APPLICATION", new ArrayList<>());
                categorized.put("DISCARDED RECORDS", new ArrayList<>());
                categorized.put("LINES",new ArrayList<>());

            for (String category: categorized.keySet()) {
                List<Application> categories = categorized.get(category);
                System.out.printf("%s (%d)\n", category, categories);
                for (Application application: categories)
                System.out.printf("\t%s\n", application.getAppName());
            }
            
        }

        fr.close();
        br.close();
    }
}

