# Reverse first K of a Queue

**Solved**

**Difficulty:** Easy
**Accuracy:** 81.28%
**Submissions:** 199K+
**Points:** 2

Given an integer `k` and a queue of integers, we need to reverse the order of the first `k` elements of the queue, leaving the other elements in the same relative order.

Only the following standard operations are allowed on the queue:

* `enqueue(x)`: Add an item `x` to the rear of the queue.
* `dequeue()`: Remove an item from the front of the queue.
* `size()`: Returns the number of elements in the queue.
* `front()`: Finds the front item.

## Note

* The above operations represent the general processing.
* In-built functions of the respective languages can be used to solve the problem.
* If the size of the queue is smaller than the given `k`, then return the original queue.

## Examples

### Example 1

```text
Input: q = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 4, 5]
```

**Explanation:** After reversing the first `3` elements from the given queue, the resultant queue will be `[3, 2, 1, 4, 5]`.

### Example 2

```text
Input: q = [4, 3, 2, 1], k = 4
Output: [1, 2, 3, 4]
```

**Explanation:** After reversing the first `4` elements from the given queue, the resultant queue will be `[1, 2, 3, 4]`.

## Constraints

```text
1 ≤ q.size(), q[i], k ≤ 10^5
```
