public class GFG_Intersection_Point_Of_LL {
    int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node pt1 = head1;
         Node pt2 = head2;
         
         int ct1 = 0 , ct2 = 0;
         while(pt1 != null){
             ct1++;
             pt1 = pt1.next;
         }
         while(pt2 != null){
             ct2++;
             pt2 = pt2.next;
         }
         pt1 = head1;
         pt2 = head2;
         
         int dif = Math.abs(ct1 - ct2);
         if(ct1 > ct2){
             for(int i = 0 ; i < dif ; i++){
                 pt1 = pt1.next;
             }
         }else if(ct2 > ct1){
             for(int i = 0 ; i < dif ; i++){
                 pt2 = pt2.next;
             }
         }
         while(pt1 != pt2){
             pt1 = pt1.next;
             pt2 = pt2.next;
         }
         if(pt1 == null) return -1;
         
         return pt1.data;
         
	}
}
