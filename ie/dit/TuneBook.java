package ie.dit;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;


public class TuneBook{
  //an ArrayList of tune objects
ArrayList<Tune> tunes = new ArrayList<Tune>();
private String nameOfFile;

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
      tunes.add(new Tune(l,l,l,l));
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
}

}//end of TuneBook class
