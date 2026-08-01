# Find Nth Root of M

## Problem Statement

Given two integers **n** and **m**, find the **nth root** of **m**.

If there exists an integer **x** such that:

```
xⁿ = m
```

return **x**.

Otherwise, return **-1**.

---

## Examples

### Example 1

**Input**
```text
n = 3
m = 8
```

**Output**
```text
2
```

**Explanation**

```
2³ = 8
```

---

### Example 2

**Input**
```text
n = 3
m = 9
```

**Output**
```text
-1
```

**Explanation**

```
The 3rd root of 9 is not an integer.
```

---

### Example 3

**Input**
```text
n = 4
m = 16
```

**Output**
```text
2
```

**Explanation**

```
2⁴ = 16
```

---

## Constraints

- `1 ≤ n ≤ 30`
- `1 ≤ m ≤ 10⁹`
