import argparse
import os

parser = argparse.ArgumentParser()
parser.add_argument('-n', dest="value", help='provide number to check the devide by zero error')

args = parser.parse_args()

try:
    out = 10 / int(args.value)
    print(f'output is {out}')
    return 0
except Exception as e:
    print(f"error observed is : {e}")
    return 1
