package edu.uaslp.examen;

import java.util.*;

public class BookCollectionManager {
    //public List<Book>collections;
    private List<BookCollection> collection=new ArrayList<>();


public BookCollection createCollection(String name){
    BookCollection bookCollection=new BookCollection(name);
   collection.add(bookCollection);
    return bookCollection;
}

public BookCollection getCollectionByName(String name){
    Iterator<BookCollection> it = collection.iterator();
    while (it.hasNext()) {
        BookCollection bookCollection = it.next();
        if(bookCollection.getName().equals(name))
            return bookCollection;
    }
    return null;
}

public void deleteCollectionByName(String name) {
    for (BookCollection bookCollection : collection) {
        if (bookCollection.getName().equals(name))
            collection.remove(bookCollection);
    }
}
public void addBookToCollection(String collectionName, Book book){
        BookCollection bookCollection=getCollectionByName(collectionName);
        if(bookCollection==null)
            bookCollection=createCollection(collectionName);
        bookCollection.addBook(book);
}

public List<String> getCollectionNames(){
    List<String>names=new ArrayList<>();
    for(BookCollection bookCollection:collection)
        names.add(bookCollection.getName());
   return names;
}


}
