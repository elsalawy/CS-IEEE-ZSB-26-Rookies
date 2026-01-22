s = input().strip()
if s.isupper() or (s[0].islower() and s[1:] == s[1:].upper()):
    print(s.swapcase())
else:
    print(s)
