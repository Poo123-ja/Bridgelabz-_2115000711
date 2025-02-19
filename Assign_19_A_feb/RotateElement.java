import java.util.*;
public class RotateElement {
public static List<Integer> rotateList(List<Integer> list, int position) {
int size = list.size();
position = position % size;
if (position < 0) position += size;
List<Integer> rotatedPart = list.subList(position, size);//from position to end.
List<Integer> remainingPart = list.subList(0, position); //from start to position.
List<Integer> ans= new ArrayList<>(rotatedPart);
ans.addAll(remainingPart);
return ans;
}
public static void main(String[] args) {
List<Integer> inputList = Arrays.asList(10, 20, 30, 40, 50);
int rotateBy = 2;
List<Integer> rotatedList = rotateList(inputList, rotateBy);
System.out.println(rotatedList);
}
}
