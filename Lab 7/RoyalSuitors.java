/**
 * CSSSKL 143
 *
 * RoyalSuitors
 *
 * @author Abhi Purohit
 */

public class RoyalSuitors {
    public static int findPlaceToStand(int numSuitors) {
        LinkedQueue queue = new LinkedQueue();

        for(int i = 1; i < numSuitors; i++) {
            queue.offer(1);
        }
        while(queue.size() > 1) {
            queue.offer(queue.poll());
            queue.offer(queue.poll());

            queue.poll();
        }
        return (int) queue.poll();
    }

    public static int findPlaceToStandWithStack(int numSuitors) {
       LinkedStack forward = new LinkedStack();
       LinkedStack backward = new LinkedStack();

       for(int i = numSuitors; i >= 1; i--) {
           forward.push(i);
       }

       int count = 0;

       while(forward.size() + backward.size() > 1) {
           if(forward.isEmpty()) {
               while(!backward.isEmpty()) {
                   forward.push(backward.pop());
               }
           }
           count++;

           if(count == 3) {
               forward.pop();
               count = 0;
           } else {
               backward.push(forward.pop());
           }
       }
       if(!forward.isEmpty()) {
           return (int) forward.pop();
       } else {
           return (int) backward.pop();
       }
    }
}
