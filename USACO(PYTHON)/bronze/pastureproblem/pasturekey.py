import sys

def main():
    sys.stdin = open("square.in", "r")
    sys.stdout = open("square.out", "w")

    rect1 = list(map(int, input().split()))
    rect2 = list(map(int, input().split()))

    left = min(rect1[0], rect2[0])
    right = max(rect1[2], rect2[2])

    bottom = min(rect1[1], rect2[1])
    top = max(rect1[3], rect2[3])

    width = right - left
    height = top - bottom

    area = max(width, height) ** 2

    print(area)

if __name__ == "__main__":
    main()