package datastructure;

class Link {
	public String name; // data item (key)
	public int numStocks; // data item
	public Link next; // next link in list
	public Link prev; // previous link in list

	public Link(String name, int numStocks) // constructor
	{
		this.name = name; // initialize data
		 this.numStocks = numStocks; // (‘next’ is automatically
	} // set to null)


	public void displayLink() // display ourself
	{
		System.out.print("{" + name + ", " + numStocks + "} ");
	}
}

public class LinkList {
	private Link head; // ref to head link on list
	private int size; // size of list
	
	public LinkList() // constructor
	{
		head = new Link(null, 0); // no items on list yet
		head.prev = head.next = head;
		size = 0;
	}

	public boolean isEmpty() // true if list is empty
	{
		return (size == 0);
	}

	// insert node in sorted order in list  3 4 6 7
	public void insert(String name, int numStocks) { // make new link
		Link newLink = new Link(name, numStocks);
		
		if(this.isEmpty()){
			head.next = newLink;
			head.prev = newLink;
			newLink.next = head;
			newLink.prev = head;
		} else if(size == 1) {
			if(newLink.name.compareToIgnoreCase(head.name) < 0) {
				newLink.next = head;
			} else if(newLink.name.compareToIgnoreCase(head.name) > 0) {
				head.next = newLink;
			}
		} else {
			boolean spotFound = false;
			Link current = head;
			while(current != null && !spotFound){ 
				if(current.name.compareToIgnoreCase(name) > 0) { // add if current node is greater than new node
					newLink.next = current;
					current.next = newLink;
					spotFound = true;
					size++;
				} else {
					current = current.next; // M N O P
				}
			}
			
			
			
			
			/*while(current != null && !spotFound){
				if(current != null && next == null) { // implies current node is last node
					if(newLink.name.compareToIgnoreCase(current.name) > 0) { // new name is greater than current name
						current.next = newLink;
						spotFound = true;
						size++;
					} else if() {
						
					}
				}
			}*/
			
		}
	}

	public void delete(String name) // delete node
	{ // (assumes list not empty)
		if(this.isEmpty()){
			
		}
		Link temp = head; // save reference to link
		head = head.next; // delete it: head-->old next
		size--;
	}

	public void displayList() {
		System.out.print("List (head-->last): ");
		Link current = head; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	
	public int size(){
		return size;
	}
} // end class LinkList