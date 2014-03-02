##RoundImageView

RoundImageView repaint the ImageView, add two border for image.

+ At the outermost  of the image, we can add the two borders
+ We can set different thickness to borders
+ We can set different color to borders

There are 6 attributes for image round border
	
	border_thickness —— this can setting inside border and outside border thickness
	border_inside_thickness —— this is attribute for inside border
	border_outside_thickness —— this is attribute for outside border
	
	border_color —— this can setting inside/outside border color
	border_inside_color —— this is attribute for inside border
	border_outside_color —— this is attribute for outside border

> Single attribute has higher priority, if you use `border_inside_thickness` for image inside border attribute, the attribute `border_thickness` will be covered.

if you want to change the border color by java code, you must  update the view at the end. For example:

```java
	int r = (int) (Math.random() * 255);
	int g = (int) (Math.random() * 255);
	int b = (int) (Math.random() * 255);
	img.setBorderColor(Color.argb(255, r, g, b));
	img.invalidate(); //
```