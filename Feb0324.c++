using namespace std;

int main(int argc, char** argv)
{
    int X, Y;
    cin >> X >> Y;
    string s=to_string(X);
    sort(s.begin(), s.end());
    int f=0;
    do{
        if(stoi(s)>Y){
            cout << stoi(s);
            f=1;
            break;
        }
    }while(next_permutation(s.begin(), s.end()));
    if(f==0){
        cout << "-1";
    }
}
