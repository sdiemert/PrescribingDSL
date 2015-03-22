<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="s19">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0"/>
        <node id="n2"/>
        <node id="n1"/>
        <node id="n4"/>
        <node id="n25"/>
        <node id="n26"/>
        <node id="n28"/>
        <node id="n29"/>
        <node id="n32"/>
        <node id="n33"/>
        <node id="n34"/>
        <node id="n35"/>
        <node id="n38"/>
        <node id="n40"/>
        <node id="n41"/>
        <node id="n42"/>
        <node id="n45"/>
        <node id="n47"/>
        <node id="n48"/>
        <node id="n49"/>
        <node id="n51"/>
        <node id="n53"/>
        <node id="n54"/>
        <node id="n55"/>
        <node id="n57"/>
        <node id="n58"/>
        <node id="n59"/>
        <node id="n60"/>
        <node id="n61"/>
        <node id="n63"/>
        <node id="n64"/>
        <node id="n65"/>
        <node id="n67"/>
        <node id="n68"/>
        <node id="n69"/>
        <node id="n70"/>
        <node id="n71"/>
        <node id="n73"/>
        <node id="n74"/>
        <node id="n75"/>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = string:&quot;aspriin&quot;</string>
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
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
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
        <edge from="n1" to="n2">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
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
        <edge from="n25" to="n25">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n25" to="n25">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n25" to="n26">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n25" to="n25">
            <attr name="label">
                <string>let:medication = string:&quot;aspriin&quot;</string>
            </attr>
        </edge>
        <edge from="n25" to="n29">
            <attr name="label">
                <string>dose</string>
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
        <edge from="n26" to="n28">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n28" to="n28">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n28" to="n28">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n29" to="n29">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n29" to="n29">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n29" to="n29">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>let:order = int:8</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n32" to="n34">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n33" to="n33">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n33" to="n35">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n33" to="n32">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n33" to="n33">
            <attr name="label">
                <string>let:medication = string:&quot;aspriin&quot;</string>
            </attr>
        </edge>
        <edge from="n33" to="n25">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n33" to="n33">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n38" to="n38">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n38" to="n38">
            <attr name="label">
                <string>let:order = int:7</string>
            </attr>
        </edge>
        <edge from="n38" to="n38">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n38" to="n41">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n40" to="n38">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n40" to="n33">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:medication = string:&quot;aspriin&quot;</string>
            </attr>
        </edge>
        <edge from="n40" to="n42">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n42" to="n42">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n42" to="n42">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n42" to="n42">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>let:order = int:6</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n45" to="n48">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n47" to="n49">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n47" to="n45">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n47" to="n40">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>let:medication = string:&quot;aspriin&quot;</string>
            </attr>
        </edge>
        <edge from="n48" to="n48">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n48" to="n48">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n51" to="n51">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n51" to="n51">
            <attr name="label">
                <string>let:order = int:5</string>
            </attr>
        </edge>
        <edge from="n51" to="n51">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n51" to="n54">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n53" to="n53">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n53" to="n53">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n53" to="n51">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n53" to="n47">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n53" to="n53">
            <attr name="label">
                <string>let:medication = string:&quot;aspriin&quot;</string>
            </attr>
        </edge>
        <edge from="n53" to="n55">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n55" to="n55">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n55" to="n55">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n55" to="n55">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>let:order = int:4</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n57" to="n59">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n58" to="n60">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n58" to="n57">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:medication = string:&quot;aspriin&quot;</string>
            </attr>
        </edge>
        <edge from="n58" to="n53">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>let:order = int:3</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n61" to="n64">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n63" to="n65">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n63" to="n61">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n63" to="n58">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:medication = string:&quot;aspriin&quot;</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>let:order = int:2</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n67" to="n69">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n68" to="n70">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n68" to="n67">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>let:medication = string:&quot;aspriin&quot;</string>
            </attr>
        </edge>
        <edge from="n68" to="n63">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n70" to="n70">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n70" to="n70">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n70" to="n70">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>let:order = int:1</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n71" to="n74">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n73" to="n75">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n73" to="n71">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n73" to="n68">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>let:medication = string:&quot;aspriin&quot;</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n75" to="n75">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n75" to="n75">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n75" to="n75">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
