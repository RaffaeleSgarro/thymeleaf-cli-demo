Thymeleaf demo with command line application. To run, launch demo.App either from
your preferred IDE of with

    .\gradlew run

The code in `demo.App.main` simulates a Camilla print presenter. The template is
in `src/main/resources/templates/bill.html`

Pasted output for evaluation:

```
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>Demo bill</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>
    <h1>2014/23</h1>
    <ol>
        <li><span>Logitech Mouse</span><span>32.5</span></li>
    </ol>
    <ol>
        <li><span>MS Keyboard</span><span>11.99</span></li>
    </ol>
  <div>Grand total is 44.49</div>
  </body>
</html>
```
