# 🚨 Problem in Original Code

The original implementation of the file system has several design flaws that make the code difficult to scale and maintain. These problems highlight the need for a better, object-oriented approach — such as the Composite Design Pattern.

---

## ❌ No Common Interface

- `File` and `Directory` do **not share a common interface or superclass**.
- This forces the `Directory` class to use a generic `Object` list:

  ```java
  List<Object> objectList;
- If you later add more types (like shortcuts, symbolic links, etc.), you’ll need to modify `Directory` again to add more instanceof checks.