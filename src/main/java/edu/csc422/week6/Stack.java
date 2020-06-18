package main.java.edu.csc422.week6;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author Owner
 *
 */

public class Stack {
	ArrayList<Integer> myIntegers;
	int defaultSize=20;
	private int maxSize;


	public Stack() {
    
    myIntegers = new ArrayList<Integer>(defaultSize);
        maxSize=defaultSize;
		System.out.println("MAX IS : "+ maxSize);
		System.out.println("\n------------------------------------------------");
	}
	
	public Stack(int size) {
        myIntegers = new ArrayList<Integer>(size); 
        maxSize=size;
		System.out.println("MAX IS : "+ maxSize);
	}
	

	// throws EmptyStackException - thrown by pop() and peek() when stack is empty.
	public int pop() throws EmptyStackException {	
        if ((myIntegers.size()) == 0 ) {
    		throw new EmptyStackException("The stack is empty.");
    	} else {
    		int topValue=myIntegers.get(0);
        	myIntegers.remove(0);
    		System.out.println("pop size: "+ myIntegers.size());
    		return(topValue);
    	}
	}
	
	  
	//FullStackException - thrown by push when stack is full.
	public boolean push(int item) throws FullStackException {
        if (myIntegers.size() > maxSize-1) {
    		throw new FullStackException("The stack is full.");
    	} else {
     	   	myIntegers.add(item);
    		System.out.println("push size: "+ myIntegers.size());
    		return true;
    	}
	}
	
	//  EmpyStackException - thrown by pop() and peek() when stack is empty.
	public int peek() throws EmptyStackException {	
		if ( myIntegers.size() == 0) {
    		throw new EmptyStackException("The stack is empty.");
		} else {
			return(myIntegers.get(0));
		}
	}
	
	public boolean empty() {
		if (myIntegers.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return (myIntegers.size());
	}

		
	@Override
	public String toString() {	
		return(Arrays.toString(myIntegers.toArray()));
	}


}
