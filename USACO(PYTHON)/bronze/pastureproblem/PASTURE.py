import math
import sys
def main():
    sys.stdin = open("square.in", "r")
    sys.stdout = open("square.out", "w")

    rect1 = list(map(int, input().split()))
    rect2 = list(map(int, input().split()))

    lowx = min(rect1[0], rect2[0])
    highx = max(rect1[2], rect2[2])

    lowy = min(rect1[1], rect2[1])
    highy = max(rect1[3], rect2[3])

    print(max((highy - lowy), (highx - lowx)) ** 2)


if __name__ == "__main__":
    main()

    #python3 PASTURE.py