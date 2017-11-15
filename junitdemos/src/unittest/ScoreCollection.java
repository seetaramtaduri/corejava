package unittest;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
 List<Score> list = new ArrayList<Score>();
 public void add(Score  score){
	 list.add(score);
	 
 }
 public int am(){
	 int t = list.stream().mapToInt(Score::getScore).sum();
	 return t/=list.size();
 }
}
