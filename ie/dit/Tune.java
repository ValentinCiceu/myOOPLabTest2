package ie.dit;
public class Tune{

private int x;
private String title;
private String altTitle;
private String notation;

public Tune(){
  title = "";
  altTitle ="";
  notation = "";
  //this.notation=notation;
}

//setting up the accessor methods
// public int getX(String l){
//   //take the Tag X:
//   //and remove it (parse it) leaving only the number behind'
//   String temp;
//   if(l.startsWith("X:")){
//     temp = l.substring(2);
//     x = Integer.parseInt(temp);
//   }
//   return x;
// }

public int getX() {

  return x;

}

public void setX(int num){
  x = num;
//return x;
}

public String getTitle() {

  return title;

}


// public String getTitle(String l){
//   String temp="";
//   if(l.startsWith("T:")){
//     temp = l.substring(2);
//   }
//   title = temp;
//   return title;
// }

public void setTitle(String myTit){
  title=myTit;

}


public String getAltTitle() {

   return altTitle;

 }

// public String getAltTitle(String l){
//   String temp="";
//   if(l.startsWith("T:")){
//     temp = l.substring(2);
//   }
//   altTitle = temp;
//   return altTitle;
// }


public void setAltTitle(String myAlt){
altTitle = myAlt;
}

public String getNotaion(String l){
  return notation;
}

public void setNotaion(String myNote){
notation = myNote;
}

public String toString() {

  return x + ", " + title + ", " + altTitle;

}

//the to string funvtion
// public String toString(){
//   if( getAltTitle() == null){
//     return getX() + ", " + getTitle();
//   }
//   else{
//     return getX() + ", " + getTitle() + ", " + getAltTitle();
//   }
// }

}//end of class
