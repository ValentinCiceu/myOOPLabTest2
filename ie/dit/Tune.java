package ie.dit;
public class Tune{

private int x;
private String title;
private String altTitle;
private String notation;

//setting up the accessor methods
public int getX(){
  return x;
}
//public void setX(int num){

//}

public String getTitle(){
  return title;
}

//public void setTitle(String s){

//}

public String getAltTitle(){
  return altTitle;
}


//public void setAltTitle(String s){

//}

public String getNotaion(){
  return notation;
}

//public void setNotaion(){

//}
public String toString(){
  if( getTitle() == null){
    return getX() + ", " + getTitle();
  }
  else{
    return getX() + ", " + getTitle() + ", " + getAltTitle();
  }
}

}//end of class
