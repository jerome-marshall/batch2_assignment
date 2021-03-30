import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    }

//    Activity 1
    public static String replaceCharacters(String str) {
        int length = str.length();
        char[] charStr = str.toCharArray();

        if (length <= 4){
            System.out.println(str);
            return "Enter a valid String";
        }

        for(int i=0; i<4; i++){
            charStr[i] = 'X';
        }

        return new String(charStr);
    }

//    Activity 2
    public static String replaceCharactersWithStringBuilder(String str) {
        StringBuilder builderStr = new StringBuilder();

        if(builderStr.length()<=4) {
            System.out.println(builderStr);
            return "Enter a valid String";
        }
        builderStr.append(str);

        builderStr.replace(0, 4, "XXXX");

        return builderStr.toString();
    }

//    Activity 3
    public static String stringConcat(String[] str) {
        String res = "";

        for (String st: str) {
            if (st.equals(null))
                continue;

            res = res.concat(st);
        }

        return res;
    }

//    Activity 4
    public static String enhancedFor (int[] arr) {
        boolean flag = true;
        String str = "";

        for (int element: arr) {
            if (flag)
                str = str.concat(String.valueOf(element) + " ");
            flag = !flag;
        }

        return str;
    }

    public static String revEnhancedFor (int[] arr) {
        String str = "";

        List<Integer> list  = Arrays.stream( arr ).boxed().collect( Collectors.toList() );
        Collections.reverse(list);

        for(Integer e : list)
            str = str.concat(e.toString() + " ");

        return str;
    }

//  Activity 5
    public static String accessModifiers () {
        return "public > protected > default > private";
    }

//    Activity 6
    public static String checkVowels(char[] ch) throws xException {
        int count =0;
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u') {
                count++;
            }
            else if(ch[i]=='x') {
                xException exp = new xException("Found x at "+ i+1 +" position");
                throw exp;
            }
        }
        return String.valueOf(count);
    }

//    Activity 7
    public static String fileIO() throws IOException {
        List<String> arrData = new ArrayList<String>();
        arrData.add("This");
        arrData.add("is");
        arrData.add("some");
        arrData.add("random");
        arrData.add("text");

        FileWriter writer = new FileWriter("output.txt");
        for(String str: arrData) {
            writer.write(str+" ");
        }
        writer.close();

        return "File created successfully";
    }

//    Activity 8
    public static String thread(){
        return "New Thread: When a new thread is created, it is in the new state. The thread has not yet started to run when thread is in this state. When a thread lies in the new state, it’s code is yet to be run and hasn’t started to execute.\n" +
                "Runnable State: A thread that is ready to run is moved to runnable state. In this state, a thread might actually be running or it might be ready run at any instant of time. It is the responsibility of the thread scheduler to give the thread, time to run.\n" +
                "A multi-threaded program allocates a fixed amount of time to each individual thread. Each and every thread runs for a short while and then pauses and relinquishes the CPU to another thread, so that other threads can get a chance to run. When this happens, all such threads that are ready to run, waiting for the CPU and the currently running thread lies in runnable state.\n" +
                "Blocked/Waiting state:When a thread is temporarily inactive, then it’s in one of the following states:\n" +
                "Blocked\n" +
                "Waiting\n" +
                "For example, when a thread is waiting for I/O to complete, it lies in the blocked state. It’s the responsibility of the thread scheduler to reactivate and schedule a blocked/waiting thread. A thread in this state cannot continue its execution any further until it is moved to runnable state. Any thread in these states does not consume any CPU cycle.\n" +
                "\n" +
                "A thread is in the blocked state when it tries to access a protected section of code that is currently locked by some other thread. When the protected section is unlocked, the schedule picks one of the thread which is blocked for that section and moves it to the runnable state. Whereas, a thread is in the waiting state when it waits for another thread on a condition. When this condition is fulfilled, the scheduler is notified and the waiting thread is moved to runnable state.\n" +
                "\n" +
                "If a currently running thread is moved to blocked/waiting state, another thread in the runnable state is scheduled by the thread scheduler to run. It is the responsibility of thread scheduler to determine which thread to run.\n" +
                "\n" +
                "Timed Waiting: A thread lies in timed waiting state when it calls a method with a time out parameter. A thread lies in this state until the timeout is completed or until a notification is received. For example, when a thread calls sleep or a conditional wait, it is moved to a timed waiting state.\n" +
                "Terminated State: A thread terminates because of either of the following reasons:\n" +
                "Because it exists normally. This happens when the code of thread has entirely executed by the program.\n" +
                "Because there occurred some unusual erroneous event, like segmentation fault or an unhandled exception.\n" +
                "A thread that lies in a terminated state does no longer consumes any cycles of CPU.";
    }

//    Activity 9
    public static String collections(){
        return "Set, List and Map are three important interfaces of Java collection framework and Difference between Set, List, and Map in Java is one of the most frequently asked Java Collection interview question.\n" +
                " Sometimes this question is asked as When to use List, Set and Map in Java. Clearly, the interviewer is looking to know that whether you are familiar with fundamentals of Java collection framework or not. \n" +
                "In order to decide when to use List, Set or Map, you need to know what are these interfaces and what functionality they provide.\n" +
                " List in Java provides ordered and indexed collection which may contain duplicates. \n" +
                "\n" +
                "The Set interface provides an unordered collection of unique objects,\n" +
                " i.e. Set doesn't allow duplicates, while Map provides a data structure based on key-value pair and hashing. \n" +
                "\n" +
                "All three List, Set, and Map are interfaces in Java and there are many concrete implementations of them are available in Collection API.\n" +
                " ArrayList and LinkedList are two most popular used List implementation while LinkedHashSet, TreeSet, and HashSet are frequently used Set implementation. \n" +
                "\n" +
                "we will see the difference between Map, Set, and List in Java and learn when to use List, Set or Map.\n" +
                "\n" +
                "Set vs List vs Map in Java\n" +
                "As I said Set, List and Map are interfaces, which defines core contract e.g. a Set contract says that it can not contain duplicates.\n" +
                " Based on our knowledge of List, Set and Map let's compare them on different metrics.\n" +
                "\n" +
                "Duplicate Objects\n" +
                "The main difference between List and Set interface in Java is that List allows duplicates while Set doesn't allow duplicates. All implementation of Set honor this contract. \n" +
                "\n" +
                "While a Map holds two objects per Entry \n" +
                "e.g. a key and a value and It may contain duplicate values but keys are always unique. See here for more difference between List and Set data structure in Java. \n" +
                "\n" +
                "Order\n" +
                "Another key difference between List and Set is that List is an ordered collection, List's contract maintains insertion order or element. Set is an unordered collection, you get no guarantee on which order element will be stored. \n" +
                "\n" +
                "Though some of the Set implementation e.g. LinkedHashSet maintains order. Also SortedSet and SortedMap e.g. TreeSet and TreeMap maintain a sorting order, imposed by using Comparator or Comparable.\n" +
                "\n" +
                "Difference between List, Set and Map in Java\n" +
                "\n" +
                "\n" +
                "Null elements\n" +
                "The list allows null elements and you can have many null objects in a List because it also allowed duplicates. Set just allow one null element as there is no duplicate permitted while in Map you can have null values and at most one null key. \n" +
                "\n" +
                "Worth noting is that Hashtable doesn't allow null key or values but HashMap allows null values and one null key.  This is also the main difference between these two popular implementations of Map interface, aka HashMap vs Hashtable. \n" +
                "\n" +
                "Useful implementations\n" +
                "Most popular implementations of List interface in Java are ArrayList, LinkedList, and Vector class. ArrayList is more general purpose and provides random access with index, while LinkedList is more suitable for frequently adding and removing elements from List.\n" +
                "\n" +
                "Vector is synchronized counterpart of ArrayList. On the other hand, most popular implementations of the Set interface are HashSet, LinkedHashSet, and TreeSet. First one is general purpose Set which is backed by HashMap, see how HashSet works internally in Java for more details.\n" +
                "\n" +
                "It also doesn't provide any ordering guarantee but LinkedHashSet does provide ordering along with uniqueness offered by the Set interface.\n" +
                "\n" +
                "Third implementation TreeSet is also an implementation of SortedSet interface, hence it keeps elements in a sorted order specified by compare() or compareTo() method.\n" +
                "\n" +
                "Now the last one, most popular implementation of Map interface is HashMap, LinkedHashMap, Hashtable, and TreeMap.\n" +
                "\n" +
                "First one is the non-synchronized general purpose Map implementation while Hashtable is its synchronized counterpart, both doesn' provide any ordering guarantee which comes from LinkedHashMap. Just like TreeSet, TreeMap is also a sorted data structure and keeps keys in sorted order (see Java Fundamentals: Collections)\n" +
                "\n" +
                "When to use List, Set and Map in Java\n" +
                "Based upon our understanding of the difference between Set, List and Map we can now decide when to use List, Set or Map in Java.\n" +
                "\n" +
                "1) If you need to access elements frequently by using the index than List is a way to go. Its implementation e.g. ArrayList provides faster access if you know index.\n" +
                "\n" +
                "2) If you want to store elements and want them to maintain an order on which they are inserted into a collection then go for List again, as List is an ordered collection and maintain insertion order.\n" +
                "\n" +
                "3) If you want to create a collection of unique elements and don't want any duplicate than choosing any Set implementation e.g. HashSet, LinkedHashSet or TreeSet. \n" +
                "\n" +
                "All Set implementation follow there general contract e.g. uniqueness but also add addition feature e.g. TreeSet is a SortedSet and elements stored on TreeSet can be sorted by using Comparator or Comparable in Java. LinkedHashSet also maintains insertion order.\n" +
                "\n" +
                "4) If you store data in form of key and value than Map is the way to go. You can choose from Hashtable, HashMap, TreeMap based upon your subsequent need. In order to choose between first two see the difference between HashSet and HashMap in Java.";
    }
}

//   Activity 10 is at src/Activity 10.txt

class xException extends Exception {
    xException(String msg){
        super(msg);
    }
}
