import java.io.*; 
import java.util.*;

public class ReadFile {
    String[] students; 
    int[] days; 
    public ReadFile(String fname) throws FileNotFoundException { 
        students = new String[25]; 
        days = new int[25]; 
        File f = new File(fname); 
        Scanner input = new Scanner(f); 
        int index=0; 
        while(input.hasNextLine()){
            String line=input.nextLine(); 
            int space=line.indexOf(" ");
            students[index]=line.substring(0, space); 
            days[index]=Integer.parseInt(line.substring(space+1)); 
            index++; 
        }
        input.close(); 
    }

    public String youngest() {
        int max=days[0];
        int maxIndex=0; 
        for (int i=0; i<days.length; i++) {
            max=days[i]; 
            maxIndex=i; 
        }
        return students[maxIndex]; 
    }

    public static void main(String[] args) {
        try {
        ReadFile r = new ReadFile("names.txt"); 
        } catch (FileNotFoundException e) {
            
        }

    }
}