import argparse
import os

parser = argparse.ArgumentParser()
parser.add_argument('-n', dest="value", help='provide number to check the devide by zero error')

args = parser.parse_args()
os.environ['CHECK_ENV'] = "PASS"
try:
    out = 10 / int(args.value)
    print(f'output is {out}')
except Exception as e:
    print(f"error observed is : {e}")
    os.environ['CHECK_ENV'] = "FAIL"
