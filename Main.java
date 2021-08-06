class Main {
  public static void main(String[] args) {
    int[][] myArr = {{1,3,2,7,3},
                     {10,10,4,6,2},
                     {5,3,5,9,6},
                     {7,6,4,2,1}};

  
  int[] sums = rowSums(myArr);

  for(int i: sums){
    System.out.println(i);
  }
   
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