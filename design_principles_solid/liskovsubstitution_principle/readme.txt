This code is intended to show examples of violation of liskov substitution principle, also related to different approach about how to implement equals in java.

Information are posted in this blog:
http://tonyxzt.blogspot.com/2007/01/liskov-substitution-principle-in-java.html

I suggest you to run junit tests one package at time, starting from the first (com.tonyx.lab.liskov.exerc1, then ...exerc2 and so on) and inspecting the code where test fails, and read the comments.

In this way you can discover the issues about lsp violation and how they are fixed in the following package (sometimes introducing further issues that are addressed in the next package, and so on).

In the last package, com.tonyx.lab.exerc6, is shown that 
all test passes concerning  mixed type comparison, and respect of equals contract.

I used intellij integrated junit test features to execute test and everything works fine about tests expected to pass ant tests expected to fail. I suggest you to do the same with any Ide, so you can focus quickly on code and on test, and not take too much time trying to sove via ant script.

(note: I also tried to use junit via ant script, but for some reason, the result is that there are some false failure of tests, probably related to anonymous classes and reflection.  I didn't take care too much about that, until now. It's jus a warning if it happens also to you in case you try to use your own ant script)

Tonino
