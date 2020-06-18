/**
 * 
 */
package edu.csc422.week6;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author Owner
 *
 */

public class Stack {
	ArrayList<Integer> myIntegers;
	int defaultSize=20;
	private int currentSize;
	private int maxSize;


	public Stack() {
        myIntegers = new ArrayList<Integer>(defaultSize);
        maxSize=defaultSize;
		System.out.println("MAX IS : "+ maxSize);
		System.out.println("---------------------");
        currentSize=0;
	}
	
	public Stack(int size) {
        myIntegers = new ArrayList<Integer>(size); 
        maxSize=size;
		System.out.println("MAX IS : "+ maxSize);
        currentSize=0;
	}
	

	// throws EmptyStackException - thrown by pop() and peek() when stack is empty.
	public int pop() throws EmptyStackException {	
    	// if ((currentSize--) == 1) {               ------>    Logic I had started with to track the array size
        if ((myIntegers.size()) == 1) {

    		throw new EmptyStackException("The stack will be empty.");
    	} else {
    		int topValue=myIntegers.get(0);
        	myIntegers.remove(0);
    		System.out.println("pop size: "+ myIntegers.size());
    		return(topValue);
    	}
	}
	
	  
	//FullStackException - thrown by push when stack is full.
	public boolean push(int item) throws FullStackException {
		System.out.println("currentSize before: "+ currentSize);

    	//  if ((currentSize++) > maxSize-1) {       ------>     Logic I had started with to track the size.
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
		//return thetop item in the list 
		//throw emptystackexception if empty
		if ( myIntegers.size() == 0) {
    		throw new EmptyStackException("The stack is empty.");
		} else {
			return(myIntegers.get(0));
		}
	}
	
	public boolean empty() {
		// TODO Auto-generated constructor stub
		if (myIntegers.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		// TODO Auto-generated constructor stub
		
		// This was logic I had started with to track size,  this was my safeguard to make sure my logic was working.
		// if (currentSize != myIntegers.size()) {           
		//	System.out.println("We have a problem, our sizes dont match, returning ArrayList.size()");
		//}
		return (myIntegers.size());
	}

		
	@Override
	public String toString() {	
		return(Arrays.toString(myIntegers.toArray()));
	}


}
