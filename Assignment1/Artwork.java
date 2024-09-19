public class Artwork{

private String title;
private int year;
private Artist artist;

public void setTitle(String title){

this.title=title;

public String getTitle(){

return title;

}

public void setYear(int year){

this.year=year;
}

public int getYear(){

return year;

}

public Artwork(){

this.title="title1";
this.year=2024;



}

public Artwork(String title,int year,artist artist){

this.title="title";
this.year=year;
this.artist="artist";



}

public void setArtist(Artist artist){

this.artist=artist;

public Artist getArtist(){

return artist;

}

public void displayInfo(){

System.out.println("Title:" + title);
System.out.println("Year:" + year);
System.out.println("Artist name:" +name);




}



}