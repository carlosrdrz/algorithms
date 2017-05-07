# 1.1 Solutions

## Exercise 16

```
exr1(1) = 11
exr1(3) = 3 + exr(1) + 3 = 3113
exr1(2) = 22
exr1(4) = exr(1) + 4 + exr(2) + 4 = 114224
exr1(6) = exr1(3) + 6 + exr1(4) + 6 = 311361142246
```

## Exercise 17

Infinite recursive loop

## Exercise 18

```
mystery(2, 25) = mystery(4, 12) + 2
mystery(4, 12) = mystery(8, 6) = mystery(16, 3) = mystery(32, 1) + 16
mystery(32, 1) = mystery(64, 0) + 32 = 32
mystery(4, 12) = 48
mystery(2, 25) = 50

mystery(3, 11) = mystery(6, 5) + 3 = mystery(12, 2) + 9 = mystery(24, 1) + 9 = mystery(48, 0) + 33 = 33
```

It's multiplying "a" with "b".
The principle behind this is that counting 10 6 times is the same thing than counting 20 3 times.
When the second number (6 and 3 in the example above) is odd and you are using integers, it gets
rounded down, so you need to adjust for it by counting "a" again.

I'm guessing the second part of the exercise is the same thing but with exponents.

```
mystery(2, 25) = mystery(4, 12) * 2 = mystery(16, 6) * 2 = mystery(256, 3) * 2 = mystery(65536, 1) * 256 * 2
  = mystery(4294967296, 0) * 65536 * 256 * 2 = 65536 * 256 * 2 = 33554432 = 2**25
```

Yup!

## Exercise 19

Well that would depend on the actual processor, I guess?

## Exercise 21

Buh! Boring!
