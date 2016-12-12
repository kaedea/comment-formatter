### Comment Formatter
```java
    //  +---------------------------------------------+
    //  | public static final FiledA mFiledA; // xxx  |
    //  | private static final FiledB mFiledB; // xxx |
    //  | public FiledC mFiledC; // xxx               |
    //  | protected final FiledD mFiledD; // xxx      |
    //  | FiledE mFiledE; // xxx                      |
    //  |                     |                       |
    //  |                     v                       |
    //  | public static final FiledA mFiledA;  // xxx |
    //  | private static final FiledB mFiledB; // xxx |
    //  | public FiledC mFiledC;               // xxx |
    //  | protected final FiledD mFiledD;      // xxx |
    //  | FiledE mFiledE;                      // xxx |
    //  +---------------------------------------------+
```

Comment Formatter is an intellij plugin that formats comments as above.