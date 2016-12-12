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

### Getting Started

6. Install `CommentFormatter` from [release](https://github.com/kaedea/comment-formatter/releases) or [IntelliJ Plugin Repository](https://plugins.jetbrains.com/plugin/9337?pr=idea).
6. Select all the lines which you wanna format.
6. Select `Tool - Format comment` or toggle `Ctrl + Cmd + L` to format.
