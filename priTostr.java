import java.util.PriorityQueue;

public class priTostr
{
    public static void main(String[] args)
    {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.add("Cricket");
        pQueue.add("Chess");
        pQueue.add("Video-Game");
        pQueue.add("Carrom");
        System.out.println("Priority Queue: " + pQueue);
        StringBuilder sb = new StringBuilder();
        while (!pQueue.isEmpty())
        {
            sb.append(pQueue.poll() + " ");
        }
        System.out.println("String Representation of the Priority Queue: " + sb);
    }
}