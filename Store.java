//Luke Bradaric
import java.util.*;
import java.io.*;
public class Store{
    private ArrayList <Item> myStore = new ArrayList <Item>();

    public Store(String fName){
        loadFile(fName);
    }

    public Store(){
        this("file50.txt");
    }

    private void loadFile(String inFileName){
        int id,inv;
        try{
            Scanner inFile = new Scanner(new File(inFileName));
            while(inFile.hasNext()){
                id = inFile.nextInt();
                inv = inFile.nextInt();
                myStore.add(new Item(id, inv));
            }
        }catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
    }

    public void displayStore(){
        for(int i = 0; i < myStore.size() - 2; i++){
            System.out.println(i + "    " + myStore.get(i).myId + "    " + myStore.get(i).myInv);
        }
    }

    public void testSearch(){
        int idToFind;
        int invReturn;
        int index;
        Scanner in = new Scanner(System.in);

        System.out.println("Testing search algorithm\n");
        do{
            System.out.println();
            System.out.print("Enter Id value to search for (-1 to quit) ---> ");
            idToFind = in.nextInt();
            //index = bsearch(new Item(idToFind, 0));
            //recursive version call
            index = bsearch (new Item(idToFind, 0), 0, myStore.size()-1);
            System.out.print("Id # " + idToFind);
            if (index == -1){
                System.out.println("     No such part in stock");
            }else{
                System.out.println("     Inventory = " + myStore.get(index).getInv());
            }
        } while (idToFind >= 0);
    }

    private int bsearch(Item idToSearch){
        int low = 0;
        int high = myStore.size() - 1;
        int mid;
        while (low <= high){
            mid = (low + high) / 2;
            if (myStore.get(mid).equals(idToSearch)){
                return mid;
            }
            else if (myStore.get(mid).compareTo(idToSearch) > 0){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;// did not find idToSearch
    }

    private int bsearch(Item idToSearch, int first, int last){
        int mid;

        if (last < first){
            return -1;
        }
        else{
            mid = (first + last) / 2;
            if (idToSearch.equals(myStore.get(mid))){
                return mid;
            }
            else if (idToSearch.compareTo(myStore.get(mid)) <= 0){
                return bsearch(idToSearch, first, mid - 1);
            }
            else{
                return bsearch(idToSearch, mid + 1, last);
            }
        }
    }

    public String toString(){
        return "what";
    }  

    public void Sort(){
        int steps = 0;
        for (int outer = 0; outer < myStore.size() - 1; outer++){
            for (int inner = 0; inner < myStore.size()-outer-1; inner++){
                steps += 3;//count one compare and 2 gets
                if (myStore.get(inner).myId - (myStore.get(inner + 1).myId) > 0){
                    steps += 4;//count 2 gets and 2 sets
                    //swap list[inner] & list[inner+1]
                    Item temp = myStore.get(inner);
                    myStore.set(inner,new Item(myStore.get(inner + 1).myId, myStore.get(inner + 1).myInv));
                    myStore.set(inner + 1,temp);
                }
            }
        }
    }    //to get recursive sort going

    private void merge(ArrayList <Item> a, int first, int mid, int last){
        int aPtr = first;
        int bPtr = mid + 1;
        int cPtr = first;
        int total = last - first + 1;
        int loop;
        boolean doneA = false;
        boolean doneB = false;
        ArrayList <Item> c = new ArrayList <Item>(a);

        for (loop = 1; loop <= total; loop++){
            if (doneA){
                c.set(cPtr, a.get(bPtr));
                bPtr++;
            } else if (doneB){
                c.set(cPtr, a.get(aPtr));
                aPtr++;
            } else if (a.get(aPtr).compareTo(a.get(bPtr)) < 0){
                // ok to compare, valid data in each sublist
                c.set(cPtr, a.get(aPtr));
                aPtr++;
            } else {
                c.set(cPtr, a.get(bPtr));
                bPtr++;
            }
            cPtr++;
            if (aPtr > mid){
                doneA = true;
            }
            if (bPtr > last){
                doneB = true;
            }
        }

        for (loop = first; loop <= last; loop++){
            a.set(loop,c.get(loop));
        }
    }

    public void mergeSort(ArrayList <Item> a, int first, int last){
        int mid;
        int temp;

        if (first == last){		// empty case, only 1 value, do nothing

        }else{
            if (first + 1 == last){
                // list of 2 values, swap if necessary
                if (a.get(first).compareTo(a.get(last)) > 0){
                    swap(a, first, last);
                }
            } else {
                // general case
                mid = (first + last) / 2;
                mergeSort(a, first, mid);
                mergeSort(a, mid + 1, last);
                merge(a, first, mid, last);

            }
        }
    }

    private void swap(ArrayList <Item> list, int a, int b){
        Item c = list.get(a);
        list.set(a, list.get(b));
        list.set(b, c);
    }
}
