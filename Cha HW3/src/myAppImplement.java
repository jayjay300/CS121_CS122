import java.util.LinkedList;





public class myAppImplement {


	public static void main(String args[]){


		LinkedList <myApp> list = new LinkedList<>();


		myApp app = new myApp("game1", 10, 200);

		list.add(app);

		app = new myApp("game2",4, 1);

		list.add(app);

		app = new myApp("game3", 6, 2);

		list.add(app);

		app = new myApp("game4", 7, 82);

		list.add(app);

		app = new myApp("game5", 80, 12);

		list.add(app);

		app = new myApp("game6", 90, 9);

		list.add(app);

		app = new myApp("game7", 1000, 2);

		list.add(app);

		app = new myApp("game8", 2, 200);

		list.add(app);

		app = new myApp("game9", 7, 20);

		list.add(app);

		app = new myApp("game10", 100, 2000);

		list.add(app);


		showName(list,1);
		showAllNames(list);


		System.out.println(addAllValues(list));


		System.out.println("All list");

                showAllValues(list);


                list = insertionsort(list);
		System.out.println("Sorted list");

                showAllValues(list);


	}



        
	public static void showName(LinkedList<myApp> test, int i){

		System.out.println(test.get(i).getName());

	}

	public static void showAllNames(LinkedList<myApp> test){

		for(int i = 0; i <= test.size()-1; i++){

			System.out.println(test.get(i).getName());

		}

	}

	public static int addAllValues(LinkedList<myApp> test){

		int value = 0;

		for(int i = 0; i <= test.size()-1; i++){

			value = value + test.get(i).getValue();

		}

		return value;

	}


	public static void showAllValues(LinkedList<myApp> test){

		for(int i = 0; i <= test.size()-1; i++){

		     System.out.print(test.get(i).getValue() + " ");

		}

		System.out.println();

	}





	public static LinkedList<myApp> insertionsort(LinkedList<myApp> ilist){


		LinkedList <myApp> slist = new LinkedList<>();

		slist.add(ilist.removeFirst());

                int sz = ilist.size();
		System.out.println("size is " + ilist.size());

		for(int i = 0; i < sz; i++){

			myApp item = ilist.removeFirst();
			int j = 0;
			while(j < slist.size() && slist.get(j).getValue() < item.getValue()){

				j++;

			}

			System.out.println("j = " + j + "   size = " + slist.size());


			if (j >= slist.size())
				slist.addLast(item);

			else
				slist.add(j, item);


			System.out.print("Unsorted list: ");

	                showAllValues(ilist);

			System.out.print("Sorted list: ");

        	        showAllValues(slist);

		}

		return slist;

	}








}