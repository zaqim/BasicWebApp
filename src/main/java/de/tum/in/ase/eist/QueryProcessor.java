package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        query.replace("%20","");
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else { // TODO extend the programm here
            if(query.contains("what is") && query.contains("plus")){
                String first = query.indexof("is") + 3;
                int firstNum = String.ParseInt(first);
                String second = query.indexof("plus") + 5;
                int secondNum = String.ParseInt(second);
                return firstNum+secondNum;
            }
        }
    }
}
