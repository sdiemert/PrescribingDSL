<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="s32">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n4"/>
        <node id="n7"/>
        <node id="n0"/>
        <node id="n1"/>
        <node id="n31"/>
        <node id="n32"/>
        <node id="n34"/>
        <node id="n37"/>
        <node id="n39"/>
        <node id="n40"/>
        <node id="n42"/>
        <node id="n45"/>
        <node id="n49"/>
        <node id="n50"/>
        <node id="n51"/>
        <node id="n52"/>
        <node id="n54"/>
        <node id="n55"/>
        <node id="n56"/>
        <node id="n57"/>
        <node id="n58"/>
        <node id="n59"/>
        <node id="n60"/>
        <node id="n61"/>
        <node id="n62"/>
        <node id="n63"/>
        <node id="n64"/>
        <node id="n65"/>
        <node id="n66"/>
        <node id="n67"/>
        <node id="n68"/>
        <node id="n69"/>
        <node id="n70"/>
        <node id="n71"/>
        <node id="n72"/>
        <node id="n73"/>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:instant = int:5</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:n = int:2</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:n = int:2</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = string:&quot;aspr&quot;</string>
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
        <edge from="n0" to="n7">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n0" to="n65">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = string:&quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:count = int:2</string>
            </attr>
        </edge>
        <edge from="n1" to="n4">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:order = int:2</string>
            </attr>
        </edge>
        <edge from="n31" to="n31">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n31" to="n31">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n31" to="n32">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n31" to="n31">
            <attr name="label">
                <string>let:medication = string:&quot;aspr&quot;</string>
            </attr>
        </edge>
        <edge from="n31" to="n37">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>let:unit = string:&quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n32" to="n34">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>let:order = int:8</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>let:instant = int:5</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n39" to="n39">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n39" to="n40">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n39" to="n39">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n39" to="n39">
            <attr name="label">
                <string>let:medication = string:&quot;aspr&quot;</string>
            </attr>
        </edge>
        <edge from="n39" to="n45">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n39" to="n52">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:unit = string:&quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:count = int:1</string>
            </attr>
        </edge>
        <edge from="n40" to="n42">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:order = int:5</string>
            </attr>
        </edge>
        <edge from="n42" to="n42">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n42" to="n42">
            <attr name="label">
                <string>let:instant = int:5</string>
            </attr>
        </edge>
        <edge from="n42" to="n42">
            <attr name="label">
                <string>let:n = int:2</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>let:n = int:2</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:order = int:6</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:unit = string:&quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n49" to="n51">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n50" to="n50">
            <attr name="label">
                <string>type:Dosing</string>
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
        <edge from="n51" to="n51">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n51" to="n51">
            <attr name="label">
                <string>let:instant = int:3</string>
            </attr>
        </edge>
        <edge from="n51" to="n51">
            <attr name="label">
                <string>let:n = int:1</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n52" to="n50">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n52" to="n49">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>let:medication = string:&quot;aspr&quot;</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n52" to="n61">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>let:order = int:0</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>let:count = int:2</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>let:unit = string:&quot;WEEK&quot;</string>
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
                <string>let:n = int:0</string>
            </attr>
        </edge>
        <edge from="n55" to="n55">
            <attr name="label">
                <string>let:instant = int:1</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>type:Dosing</string>
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
        <edge from="n57" to="n56">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>let:medication = string:&quot;aspr&quot;</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n57" to="n69">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n57" to="n54">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:unit = string:&quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:order = int:7</string>
            </attr>
        </edge>
        <edge from="n58" to="n60">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:n = int:0</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:instant = int:1</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n61" to="n58">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>let:medication = string:&quot;aspr&quot;</string>
            </attr>
        </edge>
        <edge from="n61" to="n59">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n61" to="n31">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>let:order = int:3</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>let:unit = string:&quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n62" to="n64">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>let:instant = int:3</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>let:n = int:1</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n65" to="n62">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n65" to="n63">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>let:medication = string:&quot;aspr&quot;</string>
            </attr>
        </edge>
        <edge from="n65" to="n73">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>let:unit = string:&quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>let:order = int:1</string>
            </attr>
        </edge>
        <edge from="n66" to="n68">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>let:n = int:1</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>let:instant = int:3</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n69" to="n67">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n69" to="n66">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>let:medication = string:&quot;aspr&quot;</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n69" to="n0">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n70" to="n70">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n70" to="n70">
            <attr name="label">
                <string>let:order = int:4</string>
            </attr>
        </edge>
        <edge from="n70" to="n70">
            <attr name="label">
                <string>let:unit = string:&quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n70" to="n72">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n72" to="n72">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n72" to="n72">
            <attr name="label">
                <string>let:n = int:0</string>
            </attr>
        </edge>
        <edge from="n72" to="n72">
            <attr name="label">
                <string>let:instant = int:1</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>let:medication = string:&quot;aspr&quot;</string>
            </attr>
        </edge>
        <edge from="n73" to="n70">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n73" to="n71">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n73" to="n39">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
    </graph>
</gxl>
