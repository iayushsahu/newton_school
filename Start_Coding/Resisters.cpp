#include <bits/stdc++.h>  // header file includes every Standard library
using namespace std;
int main() {
    // Your code here
    int resistors;
    cin >> resistors;
    float finalResistance = 0;
    for (int i = 0; i < resistors; i++) {
        float resistance;
        cin >> resistance;
        finalResistance += (1 / resistance);
    }
    int ans = (1 / finalResistance);
    cout << ans;
    return 0;
}