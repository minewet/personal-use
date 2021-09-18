import java.io.*;
import java.util.*;
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        ArrayList<String> ans= new ArrayList<String>();
        String tmp="";
        
        if(s.length()==1 || s.charAt(0)==s.charAt(1))
        	ans.add("");
        else tmp+=s.charAt(0);
        
        for(int i=1; i<s.length()-1; i++) {
        	if(s.charAt(i)!=s.charAt(i-1) && s.charAt(i)!=s.charAt(i+1))
        		tmp+=s.charAt(i);
        	else if(!tmp.equals("")) {	
        		ans.add(new String(tmp));
        		tmp="-";
        	}
        }
        
        if(s.length()==1 || s.charAt(s.length()-2)==s.charAt(s.length()-1))
        	ans.add("");
        else {
        	tmp+=s.charAt(s.length()-1);
        	ans.add(tmp);
        }
        
        

        for(int i=0; i<ans.size(); i++) {
        	System.out.println(ans.get(i));
        }
        
       
        
    }
}
