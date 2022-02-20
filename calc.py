#!/usr/bin/env python3
"""created:02-20-2022 14:49:58, author:seraph★1001100, project:Calculator"""

import sys


def add():
    print('-- Addition Operation --')
    while True:
        n1 = input('Enter 1st number:\n> ')
        n2 = input('Enter 1st number:\n> ')
        if not n1.isdigit() or not n2.isdigit():
            print(f"Input Error! Either '{n1}' or '{n2}' was invalid input.\n")
            continue
        else:
            break
    n1, n2 = int(n1), int(n2)
    print(f"{n1} + {n2} = {n1 + n2}")


def sub():
    print('-- Subtraction Operation --')
    while True:
        n1 = input('Enter 1st number:\n> ')
        n2 = input('Enter 1st number:\n> ')
        if not n1.isdigit() or not n2.isdigit():
            print(f"Error. Either '{n1}' or '{n2}' was invalid input")
            continue
        else:
            break
    n1, n2 = int(n1), int(n2)
    print(f"{n1} - {n2} = {n1 - n2}")


while True:
    print("This script perform only (a)ddition and (s)ubtraction.")
    while True:
        selection = input("Enter (a)ddition, (s)ubtraction or (q)uit:\n> ")
        if selection not in 'asq':
            print("Invalid input! Enter either 'a', 's' or 'q'.")
            continue
        elif selection == 'q':
            print('Goodbye!')
            sys.exit()
        else:
            break
    if selection == 'a':
        add()
    elif selection == 's':
        sub()
