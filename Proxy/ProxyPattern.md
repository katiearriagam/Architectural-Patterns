# Proxy Pattern

#### Consists of providing a placeholder to control access to another element.

## Problem Scenario
An application has an object which takes up a lot of resources. Therefore, we only want to create such instances when we absolutely need them. Or in other cases, we want to control the level of access and communication the user has with the real object. In the vending machine scenario, we want to upgrade the system to offer a proxy to access the vending machine.

## Solution
<ul>
<li>
In terms of architecture, we need to create an interface between the proxy and the real object. Such interface will define the methods that will be implemented by the proxy to call into the real object. In this case, you will notice in the source code that we implemented all but one method (which we left private) from the original class.
</li>

<li>
In the proxy class, we create an instance of the real object and implement the methods to call into there, because this gives us a level of control over the communication the user has with the real object. Thus, the proxy is not only a placeholder but also a protection method.
</li>

<li>
Then in the application, instead of instantiating the real object, we instantiate the proxy.
</li>
</ul>

## Proposed implementation
<ol>
  <li>Create an interface between the proxy and the real object.</li>
  <li>Create the proxy class and implement the methods defined in the interface.</li>
  <li>Instantiate the proxy rather than the real objet in the application.</li>
</ol>

## Reference
https://sourcemaking.com/design_patterns/proxy
