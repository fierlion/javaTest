package construct1;

public class Construct1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.data = 3;
        list.next = new ListNode();
        list.next.data = 7;
        list.next.next = new ListNode();
        list.next.next.data = 5;
        System.out.println(list.data + " " + list.next.data + " " + 
                list.next.next.data);
    }
    
}
