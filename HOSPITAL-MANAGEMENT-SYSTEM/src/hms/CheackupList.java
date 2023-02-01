package hms;


class CNode {
	CheckUp cu;
	CNode next,pre;
	
	public CNode(CheckUp cu) {
		next = pre = null;
		this.cu = cu;
	}
}
public class  CheackupList {

	CNode head, tail;
	
	public  CheackupList() {
		head = null;
		tail = null;
	}
	
	public void Enqueue(CheckUp cu) {
		CNode node = new CNode(cu);
		if(head == null || tail ==null) {
			head = node;
			tail = node;
		}else if(head.cu.getPriority()<cu.getPriority()) {
			head.next = node;
			node.pre = head;
			head = node;
		}else if(tail.cu.getPriority()>=cu.getPriority()) {
			tail.pre= node;
			node.next=tail;
			tail=node;
		}else {
			CNode temp = tail;
			while(temp!=null) {
				if(temp.cu.getPriority()>=cu.getPriority()) {
					break;
				}
				temp = temp.next;
			}
			node.next=temp;
			node.pre=temp.pre;
			temp.pre.next= node;
			temp.pre=node;
		}
	}
	public CheckUp dequeue() {
		if(head==null) {
			return null;
		}
		CNode CheckUp=head;
		head=head.next;
		return CheckUp.cu;
	}
	public int size() {
		CNode temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			temp=temp.pre;
		}
		return count;
	}
	
	public void addRecomendation (int index, String rec) {
		CNode temp = head;
		int i = 0;
		while(temp!= null) {
			if(index==i) {
				temp.cu.setRecomendation(rec);
				break;
			}
			i++;
			temp = temp.pre;
		}
	}
	public Patient getPatient(int index) {
		CNode temp = head;
		int i = 0;
		while(temp!=null) {
			if(index==i) {
				break;
			}
			i++;
			temp= temp.pre;
			
		}
		return temp.cu.getPatient();
	}
	public void print() {
		CNode temp=head;
		while(temp!=null) {
			System.out.println(temp.cu.getPriority()+"   "+temp.cu.getRecomendation());
			temp=temp.pre;
		}
	}

}
