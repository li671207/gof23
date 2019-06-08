# gof23
<pre>
<b>• 创建型模式：用来创建对象</b><br/>
– 单例模式<br/>
    • 保证一个类只有一个实例，并且提供一个访问该实例的全局访问点。<br/>
– 工厂模式<br/>
• 简单工厂模式<br/>
    – 用来生产同一等级结构中的任意产品。（对于增加新的产品，需要修改已有代码）<br/>
• 工厂方法模式<br/>
    – 用来生产同一等级结构中的固定产品。（支持增加任意产品）<br/>
• 抽象工厂模式<br/>
    – 用来生产不同产品族的全部产品。（对于增加新的产品，无能为力；支持增加产品族）<br/>
– 建造者模式<br/>
    • 分离了对象子组件的单独构造(由Builder来负责)和装配(由Director负责)。 从而可以构造出复杂的对象。<br/>
– 原型模式<br/>
    • 通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式<br/>
</pre>


<pre>
<b>• 结构型模式：是从程序的结构上实现松耦合，从而可以扩大整体的类结构，用来解决更大的问题。</b>
– 分类：
    • 适配器模式、代理模式、桥接模式、装饰模式、组合模式、外观模式、享元模式
</pre>
<table>
    <tr>
        <td>代理模式</td>
        <td>为真实对象提供一个代理，从而控制对真实对象的访问</td>
    </tr>
    <tr>
        <td>适配模式</td>
        <td>使原本由于接口不兼容不能一起工作的类可以一起工作</td>
    </tr>
    <tr>
        <td>桥接模式</td>
        <td>处理多层继承结构，处理多维度变化的场景，将各个维度设计成独立的继
承结构，使各个维度可以独立的扩展在抽象层建立关联。</td>
    </tr>
    <tr>
        <td>组合模式</td>
        <td>将对象组合成树状结构以表示”部分和整体”层次结构，使得客户可以统一
的调用叶子对象和容器对象</td>
    </tr>
    <tr>
        <td>装饰模式</td>
        <td>动态地给一个对象添加额外的功能，比继承灵活</td>
    </tr>
    <tr>
        <td>外观模式</td>
        <td>为子系统提供统一的调用接口，使得子系统更加容易使用</td>
    </tr>
    <tr>
        <td>享元模式</td>
        <td>运用共享技术有效的实现管理大量细粒度对象，节省内存，提高效率</td>
    </tr>
</table>

<pre>
<b>• 行为型模式：关注系统中对象之间的交互，研究系统在运行时对象之间的相互通信和协作，进一步明确对象职责。</b>
– 分类：责任链模式、解释器模式、模板方法模式、命令模式、迭代器模式、中介者模式、备忘录模式、观察者模式、
状态模式、策略模式、访问者模式
</pre>
<table>
    <tr>
        <td>职责链模式</td>
        <td>避免请求发送者和接收者耦合，让多个对象都有可能接收请求，将这些对象连成一条链，并且沿着这条链传递请求，直到有对象处理为止</td>
    </tr>
    <tr>
        <td>命令模式</td>
        <td>将一个请求封装为一个对象，从而使得请求调用者和请求接收者解耦</td>
    </tr>
    <tr>
        <td>解释器模式</td>
        <td>描述如何为语言定义一个文法，如何解析</td>
    </tr>
    <tr>
        <td>迭代器模式</td>
        <td>提供了一种方法来访问聚合对象</td>
    </tr>
    <tr>
        <td>中介者模式</td>
        <td>通过一个中介对象来封装一系列的对象交互，使得各对象不需要相互引用</td>
    </tr>
    <tr>
        <td>备忘录模式</td>
        <td>捕获一个对象的内部状态，并保存之；需要时，可以恢复到保存的状态</td>
    </tr>
    <tr>
        <td>观察者模式</td>
        <td>当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新</td>
    </tr>
    <tr>
        <td>状态模式</td>
        <td>允许一个对象在其内部状态改变时改变它的行为</td>
    </tr>
    <tr>
        <td>策略模式</td>
        <td>定义一系列算法，并将每个算法封装在一个类中</td>
    </tr>
    <tr>
        <td>模板方法</td>
        <td>定义一个操作的算法骨架，将某些易变的步骤延迟到子类中实现</td>
    </tr>
    <tr>
        <td>访问者模式</td>
        <td>表示一个作用于某对象结构中的各元素的操作，它使得用户可以在不改变各元素的类的前提下定义作用于这些元素的新操作</td>
    </tr>
</table>
</pre>