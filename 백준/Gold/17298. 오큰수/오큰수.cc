#include <iostream>
#include <stack>
using namespace std;
stack <pair<int, int> > st;
int arr[1000001];
int main() {
     ios::sync_with_stdio(false);
     cin.tie(0);
     cout.tie(0);
     int N;
     cin >> N;
     for (int i = 0; i < N; i++) {
          int data; cin >> data;
          while (true) {
               if (st.empty()) {
                    st.push({ data,i });
                    break;
               }
               else {
                    if (st.top().first >= data) {
                         st.push({ data,i });
                         break;
                    }
                    else {
                         arr[st.top().second] = data;
                         st.pop();
                    }
               }
          }
     }
     while (!st.empty()) {
          arr[st.top().second] = -1;
          st.pop();
     }
     for (int i = 0; i < N; i++) {
          cout << arr[i] << " ";
     }
     return 0;
}