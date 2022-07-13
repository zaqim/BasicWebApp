package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        query.replace("%20"," ");
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else { // TODO extend the programm here
            if(query.contains("what is") && query.contains("plus")){
                int firstNum=0;
                int secondNum = 0;
                String tokens[] = query.split(" ");
                for(int i = 0;i<query.length(); i++) {
                    if(tokens[i].equals("is")){
                        firstNum = Integer.parseInt(tokens[i+1]);
                    }
                    if(tokens[i].equals("plus")) {
                        secondNum = Integer.parseInt(tokens[i+1]);
                    }
                }
                return String.valueOf(firstNum+secondNum);
            }
            return "null";
        }
    }
}
