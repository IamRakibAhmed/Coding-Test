#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
 
int main()
{
    int n;
    cin >> n;

    vector<float> v(n);
    for (int i = 0; i < n; i++)
        cin >> v[i];

    sort(v.begin(), v.end());
    int l = 0, r = n - 1, res = 0;
    while (l < r)
    {
        if (v[l] + v[r] <= 3.00)
        {
            l++;
            r--;
            res++;
        }
        else
        {
            r--;
            res++;
        }
    }

    if(l == r) res++;
    cout << res << endl;

    return 0;
}