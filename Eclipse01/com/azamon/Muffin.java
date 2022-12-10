package com.azamon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Muffin {

	public int getMuffin(String s) {
		Map<Character, Integer> muffin = new HashMap<>();

		char[] arr = s.toCharArray();
		int muffinCount = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 'm' || arr[i] == 'u' || arr[i] == 'f' || arr[i] == 'i' || arr[i] == 'n') {

				if (!muffin.containsKey(arr[i])) {
					muffin.put(arr[i], 1);
				} else {
					muffin.put(arr[i], muffin.get(arr[i]) + 1);

				}

			}
		}

		if (muffin.size() == 5) {

			int mostOccVal = 0;

			Set charKey = muffin.keySet();

			Iterator<Character> itr = charKey.iterator();

			while (itr.hasNext()) {
				char key = itr.next();

				if (key != 'f') {
					if (mostOccVal < muffin.get(key))
						mostOccVal = muffin.get(key);

				} else if (mostOccVal < muffin.get(key) / 2)
					mostOccVal = muffin.get(key);

			}
			muffinCount = mostOccVal;

		}

		return muffinCount;
	}

	public static void main(String[] args) {

		Muffin m = new Muffin();

		System.out.println(m.getMuffin("mmuffffinmufinufin"));
	}

}
