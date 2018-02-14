package ie.dit;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;


public class TuneBook{
  //an ArrayList of tune objects
ArrayList<Tune> tunes = new ArrayList<Tune>();
private String nameOfFile;
public int myX;
public String mytitle;
public String myaltTitle;
TuneBook(String nameOfFile){
this.nameOfFile = nameOfFile;
loadFile();
}

public void loadFile(){
  //to populate the data to the ArrayList
  BufferedReader mySongs = null;
  try{
    mySongs = new BufferedReader(new FileReader(nameOfFile));
    //use the accessor methods!
    String l;
    int counter=0;
    while ((l=mySongs.readLine())!=null) {
      //System.out.println(l);
      //tunes.add(l);
      //int x = tunes.x.getX(l);
      //tunes.add(new Tune(1 , "hey" ,"hey" ,"hey" ));
      int num = getX2(l);
      String songTitle = getTitle2(l);
      String songAltTitle = getAltTitle2(l);
      tunes.add(new Tune(num,songTitle,l));
    }
  }//end of try
  catch(IOException e){
    e.printStackTrace();
  }finally{
    if((mySongs !=null)){
      try {
        mySongs.close();
      }catch(Exception e){
        e.printStackTrace();
      }
    }
  }
}// end of function
public int getX2(String l){
  //take the Tag X:
  //and remove it (parse it) leaving only the number behind'
  int x;
  String temp;
  if(l.startsWith("X:")){
    temp = l.substring(2);
    myX = Integer.parseInt(temp);
  }
  return myX;
}//end of function


public String getTitle2(String l){
  String temp="";
  if(l.startsWith("T:")){
    temp = l.substring(2);
  }
  mytitle = temp;
  return mytitle;
}

public String getAltTitle2(String l){
  String temp="";
  if(l.startsWith("T:")){
    temp = l.substring(2);
  }
  myaltTitle = temp;
  return myaltTitle;
}

}//end of TuneBook class
