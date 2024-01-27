#include <bits/stdc++.h>
 
using namespace std;

int main(int argc, char** argv)
{
    int N=0;
    cin >> N;
    vector <int> v;
    int t=N;
    while(N>0){
        v.push_back(N%10);
        N/=10;
    }
    reverse(v.begin(), v.end());
    next_permutation(v.begin(), v.end());
    int res=0;
    for(int i:v){
        res=(res*10)+i;
    }
    if(t<res){
        cout << res;
    }else{
        cout << "-1";
    }
}
