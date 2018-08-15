public static boolean isListPalindrome(ListNode<Integer> l)
	{
		ListNode<Integer> first = l;
		ArrayList<Integer> myList = new ArrayList<Integer>(0);
		
		while (first != null)
		{
			myList.add(first.value);
			first = first.next;
		}
		
		Integer x, y;
		
		int last = myList.size() - 1;
		for (int i = 0; i < myList.size() / 2; i++)
		{
			x = myList.get(i);
			y = myList.get(last);
			if ( !(x.equals(y)) ) {return false;}
			last--;
		}
		
		return true;
	}
