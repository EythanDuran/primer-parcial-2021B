package edu.uaslp.examen;

import java.awt.print.Book;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class BookCollectionManager {
    public String name;
    public List<Book>collections;
    private List<BookCollection> collection;


public BookCollection createCollection(String name){
    collections=new BookCollection();
   collections.name=name;
   collection.add(collections);
    return collections;
}

public BookCollection getCollectionByName(String name){
    List<BookCollection>::iterator it =collection.begin();
}
for(int i=0;i<collection.size();i++) {
      if(collection[i].name){
}
}

public void deleteCollectionByName(String name){

}

public void addBookToCollection(String collectionName, Book book){

}

public List<String> getCollectionNames(){

}


}
