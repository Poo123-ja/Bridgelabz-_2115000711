import java.util.*;
public class VotingSystem{
public static void main(String[]args){
Map<String,Integer>votesMap=new HashMap<>();
Map<String,Integer>sortedVotes=new TreeMap<>();
Map<String,Integer>voteOrder=new LinkedHashMap<>();
castVote(votesMap,voteOrder,"Alice");
castVote(votesMap,voteOrder,"Bob");
castVote(votesMap,voteOrder,"Alice");
castVote(votesMap,voteOrder,"Charlie");
castVote(votesMap,voteOrder,"Bob");
castVote(votesMap,voteOrder,"Alice");
sortedVotes.putAll(votesMap);
System.out.println("Votes Count:");
display(votesMap);
System.out.println("\nVotes in Order of Casting:");
display(voteOrder);
System.out.println("\nSorted Votes:");
display(sortedVotes);
}
static void castVote(Map<String,Integer>votes,Map<String,Integer>order,String candidate){
votes.put(candidate,votes.getOrDefault(candidate,0)+1);
order.put(candidate,votes.get(candidate));
}
static void display(Map<String,Integer>map){
for(String candidate:map.keySet())System.out.println(candidate+" -> "+map.get(candidate));
}
}
