#include <iostream>
#include <vector>
using namespace std;
vector<int>vec;
vector<int> allIndex(vector<int>& arr, int idx, int data, int count)
{
  if(idx==arr.size()){vector<int> ar(idx); return ar;} 
  else if(arr[idx]==data) {
    vector<int>ar=allIndex(arr,++idx,data,++count);
    ar[count]=idx;
    return ar;
  }else{
    vector<int>ar=allIndex(arr,++idx,data,count);
    return ar;
  }

}
int main() {
  int n ;
  cin >> n;
  vector<int> arr;
  for (int i = 0; i < n; i++) {
    int d;
    cin >> d;
    arr.push_back(d);
  }
  int data;
  cin >> data;
  vector<int> ans = allIndex(arr, 0, data, 0);
  if (ans.size() == 0) {
    cout << endl;
    return 0;
  }
  for (int ele : ans) cout << ele << endl;

  return 0;
}