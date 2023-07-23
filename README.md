# Assignment2

## MyArrayList

### Method `int size()`
- Returns the current size of the `MyArrayList`.

### Method `void add(T item)`
- Adds an item to the end of the `MyArrayList`.
- If the array is not large enough to accommodate the new element, a new array with double the size of the original array is created. Elements from the original array are copied over. Then the new element is added to the end of the array, and the size variable is incremented.

### Method `void add(T item, int index)`
- Adds an element at the specified index in the `MyArrayList`.
- Shifts elements to the right by 1 to make space for the new element.

### Method `boolean remove(T item)`
- Removes the FIRST occurrence of the specified element from the `MyArrayList`.
- If the element is found and removed, the method returns true. If the element is not found in the array, it returns false.

### Method `T remove(int index)`
- Removes and returns the element at the specified index from the `MyArrayList`.
- If the index is out of bounds, it throws an exception.
- Shifts all elements to the left of the specified index by 1 after removal.
- Decrements the size of the `MyArrayList`.

### Method `void clear()`
- Clears the `MyArrayList`, removing all elements.

### Method `T get(int index)`
- Returns the element at the specified index in the `MyArrayList`.

### Method `int indexOf(Object o)`
- Searches for the FIRST occurrence of the specified element in the `MyArrayList` and returns the index at which it's found.
- If the element is not found in the array, it returns -1.

### Method `int lastIndexOf(Object o)`
- Searches for the LAST occurrence of the specified element in the `MyArrayList` and returns the index at which it's found.
- If the element is not found in the array, it returns -1.

### Method `void sort()`
- Sorts the `MyArrayList` in ascending order.

## MyLinkedList

### Method `int size()`
- Returns the current size of the `MyLinkedList`.

### Method `void add(E element)`
- Adds an element to the end of the `MyLinkedList`.

### Method `void add(int index, E element)`
- Adds an element at the specified index in the `MyLinkedList`.
- Shifts elements to the right by 1 to make space for the new element.

### Method `boolean remove(Object o)`
- Removes the FIRST occurrence of the specified element from the `MyLinkedList`.
- Returns true if the element was removed, false otherwise.

### Method `E remove(int index)`
- Removes and returns the element at the specified index from the `MyLinkedList`.
- If the index is out of bounds, it throws an exception.
- Shifts all elements to the left of the specified index by 1 after removal.
- Decrements the size of the `MyLinkedList`.

### Method `void clear()`
- Clears the `MyLinkedList`, removing all elements.

### Method `E get(int index)`
- Returns the element at the specified index in the `MyLinkedList`.

### Method `int indexOf(Object o)`
- Searches for the FIRST occurrence of the specified element in the `MyLinkedList` and returns the index at which it's found.
- If the element is not found in the list, it returns -1.

### Method `int lastIndexOf(Object o)`
- Searches for the LAST occurrence of the specified element in the `MyLinkedList` and returns the index at which it's found.
- If the element is not found in the list, it returns -1.

### Method `void sort()`
- Sorts the `MyLinkedList` using the bubble sort algorithm.
