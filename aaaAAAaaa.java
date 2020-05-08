//Q1 to 3 are based on following list:
ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,70,20,90));

//1. Write a statement after which list will be [10,70,40,20,90]
//2. Write a statement after which list will be [10,60,20,90]
//3. Write a statement after which list will be [10,70,20]

//4. Complete the following code that counts the number of positive items in the list "data".

_____ bar = 0;
for(int item ___ data) {
    if(item > ____) {
        bar_____;
    }
}

//5. Complete the following code that returns true if list "info" is sorted in ascending order, false otherwise.

boolean isAsc(ArrayList<Integer> info) {
    if(info == null)
        return false;
    if(info.size() < 2) 
        return true;
    for(int i=0; i < ________; i++) {
        if(info.get(i) ____ info.get(i+1)) {
            return ________;
        }
    }
    return ________;
}

//6. Complete the following code that returns 
//true if any item in list "data" exists more than once,
//false otherwise.

boolean hasDuplicate(ArrayList<Integer> data) {
    if(data==null || data.size()<2) {
        return false;
    }
    for(int i=0; i < data.size(); i++) {
        for(int k=___; k < _______; k++) {
            if(data.get(i) ___ data.get(k)) {
                return ______;
            }
        }
    }
    return _____;
}

//7. Following code tries to remove all negative items in the list.
//Howeever, there is ONE statement missing. Add it.

for(int i=0; i < data.size(); i++) {
    if(data.get(i) < 0) {
        data.remove(i);
        ____________;
    }
}

//8. What is the value of "result" when the 
//following code executes?

ArrayList<Integer> l1 = new ArrayList<Integer>();
ArrayList<Integer> l2 = new ArrayList<Integer>();

l1.add(10);
l1.add(20);

l2.add(10);
l2.add(20);

boolean e1 = (l1==l2);

ArrayList<Integer> l3 = l1;

l3.add(6);

boolean e1 = (l1==l3);

String result = e1+","+e2;

//9. Complete the following code so "result"
//holds the sum of all items of list l.

ArrayList<Integer> l = new ArrayList<Integer>();
ListIterator<Integer> iter = l.ListIterator();

l.add(10);
l.add(70);
l.add(40);

int result = 0;
while(iter.___________) {
    result_________________;
}

//10. Complete the missing statement such that list l
//holds the items 10, 70, 20, 90.

ArrayList<Integer> l = new ArrayList<Integer>();
l.add(10);
l.add(70);
l.add(30);
l.add(90);

________________________________

//11. Assuming one or more occurrences of item 50
// in the list data, write a SINGLE statement that
// replaces its first occurence by 60.

  data._______(________________________);

//12. Write a statement to add an item 20 before 90
// in the list data holding values [10, 70, 90]

//13. Write a statement to remove the first occurrence
//of item 60 fro list data.

 data._______(________________________);

//14. Write a statement to remove the last occurrence
//of item 60 fro list data.

 data._______(________________________);

//15. Write a statement to store the fifth item in list
//data into variable item5

 int item5 = ________________________;

//16. Write a statement to store the last item in list
//data into variable lastVal

 int lastVal = ________________________;

//17. Assuming the list data contains an ODD 
//number of items, write a statement to store the middle
//item in the list data into variable median

int median = ____________________;

//for example, if data = [10,70,20,90,30], median should be 20

//18. Following method is meant to return true if l1 and l2 are identical,
//false otherwise. Complete the missing parts:

boolean identical(ArrayList<Integer> l1, ArrayList<Integer> l2) {
    if(l1 == null || l2 == null)
        return false;
    if(l1.size() != l2.size())
        return false;
    for(int i=0; i < l1.size(); i++) {
        if(l1.get(i) _____ ________) {
            return ______________;
        }
    }
    return ___________;
}

//19. ollowing method is  meant to return true if list l1
//remains unchanged when reversed, false otherwise.
//Complete the missing parts.

boolean sameWhenReversed(ArrayList<Integer> l1) {
    if(l1 == null) {
        return false;
    }
    for(int i=0; i < l1.size(); i++) {
        if(l1.get(i) ___ ________) {
            return __________;
        }
    }
    return ___________;
}

//20. HD

//Add two lines at given position so the output
//is [[10, 30], null, [10, 30]]
//IMPORTANT!!!
//You cannot add l1 to the list again.
ArrayList<ArrayList<Integer>> mega = new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> l1 = new ArrayList<Integer>();
ArrayList<Integer> l2 = null;
ArrayList<Integer> l3 = new ArrayList<Integer>();

mega.add(l1);
mega.add(l2);
l1.add(10);
l1.add(30);
//________________________
//________________________
System.out.println(mega);
//SHOULD DISPLAY:
//[[10, 30], null, [10, 30]]
