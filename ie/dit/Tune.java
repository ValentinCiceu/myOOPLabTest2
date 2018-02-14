package ie.dit;
public class Tune{

private int x;
private String title;
private String altTitle;
private String notation;

public Tune(int x , String title , String altTitle){
  this.x = x;
  this.title = title;
  this.altTitle = altTitle;
  //this.notation=notation;
}

//setting up the accessor methods
public int getX(String l){
  //take the Tag X:
  //and remove it (parse it) leaving only the number behind'
  String temp;
  if(l.startsWith("X:")){
    temp = l.substring(2);
    x = Integer.parseInt(temp);
  }
  return x;
}
//public void setX(int num){

//}

public String getTitle(String l){
  String temp="";
  if(l.startsWith("T:")){
    temp = l.substring(2);
  }
  title = temp;
  return title;
}

//public void setTitle(String s){

//}

public String getAltTitle(String l){
  String temp="";
  if(l.startsWith("T:")){
    temp = l.substring(2);
  }
  altTitle = temp;
  return altTitle;
}


//public void setAltTitle(String s){

//}

public String getNotaion(String l){
  return notation;
}

//public void setNotaion(){

//}
// public String toString(){
//   if( getTitle() == null){
//     return getX() + ", " + getTitle();
//   }
//   else{
//     return getX() + ", " + getTitle() + ", " + getAltTitle();
//   }
// }

}//end of class
