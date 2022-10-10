#include <bits/stdc++.h>
using namespace std;

int eggDrop(int n, int k)
{
	if (k == 1 || k == 0)
		return k;

	if (n == 1)
		return k;

	int min = INT_MAX, x, res;
	for (x = 1; x <= k; x++)
  {
		res = max( eggDrop(n - 1, x - 1), eggDrop(n, k - x));
		if (res < min)
			min = res;
	}

	return min + 1;
}

int main()
{
  int n; // No of Eggs
  int k; // No of Floors
  cin >> n >> k;
	cout << "Minimum number of trials in worst case with " << n << " eggs and " << k << " floors is " << eggDrop(n, k) << endl;
	return 0;
}

// This code is contributed
// by Kuldeep Soni
