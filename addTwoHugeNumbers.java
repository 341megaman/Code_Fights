
	public static ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b)
	{
		ListNode<Integer> first;
		ListNode<Integer> listToReturn = new ListNode<Integer>(null);
		String mys = "";
		String mys2 = "";
		String listString = "";
		String stringToUseForNode = "";
		Integer temp;
		BigInteger num1, num2, total;
		int len = 0;
		first = a;
		int lengthOfFinalNumber = 0, lastIndex = 0;
		int countToFour = 0;
		
		while (first != null)
		{

			temp = first.value;
			mys2 = temp.toString();
			
			len = 4 - mys2.length();
			for (int i = 0; i < len; i++)
			{
				mys2 = "0" + mys2;
			}
			
			mys = mys + mys2;
			first = first.next;
		}
		
		//https://stackoverflow.com/questions/13935167/java-lang-numberformatexception-for-input-string
		
		num1 = new BigInteger(mys);
		mys="";
		mys2="";
		
		first = b;
		
		while (first != null)
		{
			temp = first.value;
			mys2 = temp.toString();
			
			len = 4 - mys2.length();
			for (int i = 0; i < len; i++)
			{
				mys2 = "0" + mys2;
			}
			
			mys = mys + mys2;
			first = first.next;
		}
		
		num2 = new BigInteger(mys);	
		total = num1.add(num2);
    
		listString = total.toString();
		lengthOfFinalNumber = listString.length();
    
		lastIndex = lengthOfFinalNumber - 1;
		
		first = listToReturn;
		for (int i = lastIndex; i >= 0; i--)
		{
			stringToUseForNode = listString.charAt(i) + stringToUseForNode;
			countToFour++;
			if (countToFour == 4)
			{			
				first.value = Integer.parseInt(stringToUseForNode);
				ListNode<Integer> listToReturn2 = new ListNode<Integer>(null);
				
				listToReturn2.next = first;
				first = listToReturn2;
				stringToUseForNode="";
				countToFour = 0;
			}
			if (i == 0)
			{
				if ( stringToUseForNode.length() > 0 )
				{
					first.value = Integer.parseInt(stringToUseForNode);
					ListNode<Integer> listToReturn2 = new ListNode<Integer>(null);
				
					listToReturn2.next = first;
					first = listToReturn2;
				}
			}								
		}
		
		first = first.next;
		return first;

	}
	
