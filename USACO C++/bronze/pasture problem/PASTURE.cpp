#include <iostream>
#include <string>
#include <sstream>
#include <vector>
#include <array>
#include <bits/stdc++.h>

using namespace std;

int main() {
    freopen("square.in", "r", stdin);
    freopen("square.out", "w", stdout);

    int r1x1;
    int r1y1;
    int r1x2;
    int r1y2;

    int r2x1;
    int r2y1;
    int r2x2;
    int r2y2;

    cin >> r1x1;
    cin >> r1y1;
    cin >> r1x2;
    cin >> r1y2;

    cin >> r2x1;
    cin >> r2y1;
    cin >> r2x2;
    cin >> r2y2;

    int lowx = min(r1x1, r2x1);
    int highx = max(r1x2, r2x2);

    int lowy = min(r1y1, r2y1);
    int highy = max(r1y2, r2y2);

    cout << max((highy - lowy), (highx - lowx)) * max((highy - lowy), (highx - lowx));
    
    return 0;
}