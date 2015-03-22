<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="s19">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n4"/>
        <node id="n1"/>
        <node id="n2"/>
        <node id="n0"/>
        <node id="n26"/>
        <node id="n27"/>
        <node id="n29"/>
        <node id="n30"/>
        <node id="n32"/>
        <node id="n34"/>
        <node id="n35"/>
        <node id="n36"/>
        <node id="n39"/>
        <node id="n41"/>
        <node id="n42"/>
        <node id="n43"/>
        <node id="n46"/>
        <node id="n48"/>
        <node id="n49"/>
        <node id="n50"/>
        <node id="n52"/>
        <node id="n54"/>
        <node id="n55"/>
        <node id="n56"/>
        <node id="n57"/>
        <node id="n59"/>
        <node id="n60"/>
        <node id="n61"/>
        <node id="n62"/>
        <node id="n64"/>
        <node id="n65"/>
        <node id="n66"/>
        <node id="n67"/>
        <node id="n69"/>
        <node id="n70"/>
        <node id="n71"/>
        <node id="n73"/>
        <node id="n74"/>
        <node id="n75"/>
        <node id="n76"/>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:order = int:0</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n2">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = string:&quot;asprin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = int:0</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n0" to="n4">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n0" to="n73">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n26" to="n26">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n26" to="n26">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n26" to="n26">
            <attr name="label">
                <string>let:order = int:9</string>
            </attr>
        </edge>
        <edge from="n26" to="n29">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n27" to="n27">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n27" to="n27">
            <attr name="label">
                <string>let:medication = string:&quot;asprin&quot;</string>
            </attr>
        </edge>
        <edge from="n27" to="n26">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n27" to="n27">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n27" to="n30">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n29" to="n29">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n29" to="n29">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n30" to="n30">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n30" to="n30">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n30" to="n30">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n32" to="n34">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n32" to="n27">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>let:medication = string:&quot;asprin&quot;</string>
            </attr>
        </edge>
        <edge from="n32" to="n36">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>let:order = int:8</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n34" to="n35">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n36" to="n36">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n36" to="n36">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n36" to="n36">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n39" to="n39">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n39" to="n41">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n39" to="n32">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n39" to="n39">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n39" to="n39">
            <attr name="label">
                <string>let:medication = string:&quot;asprin&quot;</string>
            </attr>
        </edge>
        <edge from="n39" to="n43">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>let:order = int:7</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n41" to="n42">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n42" to="n42">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n42" to="n42">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n46" to="n50">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n46" to="n48">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n46" to="n39">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>let:medication = string:&quot;asprin&quot;</string>
            </attr>
        </edge>
        <edge from="n48" to="n48">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n48" to="n48">
            <attr name="label">
                <string>let:order = int:6</string>
            </attr>
        </edge>
        <edge from="n48" to="n48">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n48" to="n49">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n50" to="n50">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n50" to="n50">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n50" to="n50">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n52" to="n56">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n52" to="n54">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n52" to="n46">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>let:medication = string:&quot;asprin&quot;</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>let:order = int:5</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n54" to="n55">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n55" to="n55">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n55" to="n55">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n57" to="n61">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n57" to="n59">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n57" to="n52">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>let:medication = string:&quot;asprin&quot;</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:order = int:4</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n59" to="n60">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n62" to="n64">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n62" to="n57">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>let:medication = string:&quot;asprin&quot;</string>
            </attr>
        </edge>
        <edge from="n62" to="n66">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>let:order = int:3</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n64" to="n65">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n67" to="n71">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n67" to="n69">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n67" to="n62">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>let:medication = string:&quot;asprin&quot;</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>let:order = int:2</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n69" to="n70">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n70" to="n70">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n70" to="n70">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n73" to="n76">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>let:medication = string:&quot;asprin&quot;</string>
            </attr>
        </edge>
        <edge from="n73" to="n74">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n73" to="n67">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>let:order = int:1</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n74" to="n75">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n75" to="n75">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n75" to="n75">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n76" to="n76">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n76" to="n76">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n76" to="n76">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
    </graph>
</gxl>
