# KeyStream - Agent

The agent application runs on a computer. It enables remote users to send
HTTP requests which will result in mouse clicks, mouse movement, mouse wheel
or keystroke simulation.

## Mouse Click

Simuates a click on the `LEFT`, `MIDDLE`, `RIGHT` buttons of a mouse.

HTTP POST - /mouse

Body:

```js
{
    "type": "MouseClick",
    "button": "LEFT"
}
```

## Mouse Movement

Simulates moving of the mouse. The given X, Y coordinates will be added on to
the current mouse position accordingly.

HTTP POST - /mouse

Body:

```js
{
    "type": "MouseMove",
    "x": 100,
    "y": 0
}
```

## Mouse Wheel

Simulates moving the wheel of a mouse. The `wheelAmount` specifies how much the
wheel should be turned.

HTTP POST - /mouse

Body:

```js
{
    "type": "MouseWheel",
    "wheelAmount": 100
}
```

## KeyStrokes

Not implemented yet....
