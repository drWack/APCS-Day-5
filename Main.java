import java.util.*; //maps, arrlists
class Main {
  public static void main(String[] args) {
   HiddenWord mywords = new HiddenWord("JAVA");
   
   System.out.println(HiddenWord.getHint("JVOA"));

   
   
  }

  public static boolean isEndy(int n)
  {
    if((n >= 0) && (n <= 10)){
      return true;
    }
    if((n>= 90)&& (n<=100)){
      return true;
    }

  return false;
  }
  
  
public static int[] copyEndy(int[] startArr, int size){
    int[] myArray = new int[size];

    int myArrayPos =0;
    for(int i : startArr){
      if(isEndy(i)){
        myArray[myArrayPos] = i;
        myArrayPos++;
      }
      if(myArrayPos >= size){
        return myArray;
      }
    }
    return myArray;
  }

public static int ordering(User a, User b){
    //string1.compareTo(string2)
    if((a.getName()).compareTo(b.getName())  <  0){
      return -1;
    }
    else if(a.getName().compareTo(b.getName())  >  0){
      return 1;
    }
    int diff = a.getId() - b.getId();
    if(diff < 0){
      return -1;
    }
    if(diff >0){
      return 1;
    }
    return 0;
  }
  
public static boolean scores100(int[] scores){
    for(int i=0; i <scores.length-1;i++){
      if(scores[i]== scores[i+1] && scores[i]==100){
        return true;
      }
    }
    return false;

  }
  
  public static int arraySum(int[] arr){
    int sum =0;
    for(int i=0; i < arr.length; i++){
      sum = sum + arr[i];
    }
    return sum;

  }

  public static int[] rowSums(int[][] arr2D){
    int numRows = arr2D.length;


    int[] returnArray = new int[numRows];
    for(int i =0; i < numRows; i++){
      
      int sum =0;
      for(int j=0;j<arr2D[i].length; j++){
        sum = sum + arr2D[i][j];
      }
      returnArray[i]=sum;
    }
  return returnArray;
  }
  public static boolean isDiverse(int[][] arr2D){
    int[] sums = rowSums(arr2D);
    Map<Integer,Boolean> myMap = new HashMap<Integer,Boolean>();
    for(int i : sums){
      if(myMap.containsKey(i)){
        return false;
      }else{
        myMap.put(i,true);
      }
    }
  return true;

  }
}
class HiddenWord{
  private static String word;

  public HiddenWord(String _word){
    word = _word.toUpperCase();
  }
  public static String getHint(String guess){
  /// "a" + "b" ==== "ab" concatonation
  String resultString ="";
      for(int i=0;i<guess.length();i++){
          if(word.charAt(i)==guess.charAt(i)){
            resultString = resultString + guess.charAt(i);
          }else 
          if(word.contains(guess.subSequence(i,i+1))){
            resultString = resultString + "+";
          }
          else{
            resultString = resultString + "*";
          }
      }
  return resultString;
  }
  public int getLength(){
    return word.length();
  }
}

class SparseArray{
  private int numRows;
  private int numCols;

  private List<SparseArrayEntry> entries;
  public static SparseArray(){
    entries = new ArrayList<SparseArrayEntries>();
  }
  public int getNumRows(){
    return numRows;
  }
  public int getNumCols(){
    return numCols;
  }
  public int getValueAt(int r, int c){

    for(SparseArrayEntry SAE : entries){
      if(SAE.getRow() ==r && SAE.getCol()==c){
        return SAE.getValue();
      }
    }
    return 0;
  }
  public void removeCol(int c){

      for(int i=0; i <entries.length(); i++;){
        if(SAE.getCol()==c){
          entries.remove(i);
        }else if(SAE.getCol >c){
          SparseArrayEntry current = entries.at(i);
          SparseArrayEntry s = new SparseArrayEntry(
            current.getRow(), //new Sparse array entry, at r, c-1, value v
            current.getCol()-1,
            current.getValue()
            )

          entries.add(s);
          entries.remove(i);
        }
    numCols--;
      }
  }

}

class SparseArrayEntry{
  private int r;
  private int c;
  private int v;

  public SparseArrayEntry(int _r, int _c, int _v){
    r = _r;
    c = _c;
    v = _v;
  }
  public int getRow(){
    return r;
  }
  public int getCol(){
    return c;
  }
  public int getValue(){
    return value;
  }

}

class User{
  private String name;
  private int id;

  public User(String _name,int _id){
    name = _name;
    id = _id;
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }

}