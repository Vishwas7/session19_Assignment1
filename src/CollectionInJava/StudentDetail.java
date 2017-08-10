package CollectionInJava;
/**
 * In here importing class, which are belong from java.util.package;
 */
import java.util.HashSet;
import java.util.Iterator;
/**
 * 
 * @author Vishwas
 * In here created a class StudentDetail to store detail of 
 * students by using HashSet;
 * HashSet class is used to create a collection that uses
 * a hash table for storage;
 *
 */
public class StudentDetail {

	public static void main(String[] args) {
		HashSet<Student> objStd= new HashSet<Student>();
		System.out.println("Display of students detail\n");
		 /**
		  * Creating Students details 
		  * and adding Students to HashSet 
		  * 
		  */
		Student one= new Student("Vishwas",37,"Botany");
		Student second= new Student("Raju",30,"Geology");
		Student third= new Student("Amit",4,"Zoology");
		objStd.add(one); 
		objStd.add(second);  
		objStd.add(third);
		/**
		 * In here using iterator
		 * and than using while loop for checking the value
		 * and call hasNext() which will returns true if there are 
		 * more elements. Otherwise, returns false.
		 */
		Iterator iterator=objStd.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
