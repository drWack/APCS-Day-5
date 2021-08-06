class Main {
  public static void main(String[] args) {
    
    User user1 = new User("aa",11);
    User user2 = new User("aa",11);
    System.out.println(ordering(user1,user2));
  }

  public static boolean isEndy(int n){
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