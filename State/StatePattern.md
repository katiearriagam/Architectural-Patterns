# State Pattern

#### Consists of implementing software like a state machine.

## Problem Scenario
An application or device have a state-dependent interaction. Meaning that it operates through transitions in a way that a <b>state machine</b> would. A classic example is the vending machine example. In this case, once the machine operates on a few different states, among which we can find:

<ol>
  <li>No coin inserted (initial state)</li>
  <li>Coin inserted (requires user action of inserting coin)</li>
  <li>Sold gum (requires user action of turning the crack)</li>
</ol>

## Solution
<ul>
<li>
In OOP, the state pattern proposes to treat states as abstract classes in most cases, where the behavior is specified and later overwritten by the derived classes. At this point, we already have the states the we need with the behavior they implement.
</li>

<li>
Now we need to imitate the behavior of a state machine during run-time. This is achieved by creating a data structure which can handle transitions specifying <b> Current State + Action -> New Current State </b>. Naturally, we recommend a 2D matrix of transitions[current state][action] = new current state;

On a side note: This can also be achieved without the transition matrix by setting up each derived state class to transition to the next state, but this is not advisable as it defeats the low-coupling purpose.
</li>

<li>
Finally, a wrapper class (aka. the state machine) will be created to keep track of transitions as well as the current state (of that machine, of course). In the previous scenario, the vending machine would be such state.
</li>
</ul>

## Proposed implementation
<ol>
  <li>Create wrapper class.</li>
  <li>Create abstract state class.</li>
  <li>Create specific derived state classes and implement their behavior.</li>
  <li>Set up transitions in wrapper class.</li>
  <li>Implement methods to jump between states using such transitions.</li>
</ol>

## Reference
https://sourcemaking.com/design_patterns/state
