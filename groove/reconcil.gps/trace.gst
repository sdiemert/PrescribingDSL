<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="trace">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n1">
            <attr name="layout">
                <string>74 128 80 48</string>
            </attr>
        </node>
        <node id="n0">
            <attr name="layout">
                <string>581 12 141 80</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>234 128 82 48</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>79 232 70 32</string>
            </attr>
        </node>
        <node id="n25">
            <attr name="layout">
                <string>100 336 141 48</string>
            </attr>
        </node>
        <node id="n27">
            <attr name="layout">
                <string>50 440 80 48</string>
            </attr>
        </node>
        <node id="n28">
            <attr name="layout">
                <string>55 544 70 32</string>
            </attr>
        </node>
        <node id="n29">
            <attr name="layout">
                <string>210 440 82 48</string>
            </attr>
        </node>
        <node id="n31">
            <attr name="layout">
                <string>248 224 141 64</string>
            </attr>
        </node>
        <node id="n32">
            <attr name="layout">
                <string>346 336 80 48</string>
            </attr>
        </node>
        <node id="n34">
            <attr name="layout">
                <string>351 440 70 32</string>
            </attr>
        </node>
        <node id="n35">
            <attr name="layout">
                <string>506 336 82 48</string>
            </attr>
        </node>
        <node id="n36">
            <attr name="layout">
                <string>396 120 141 64</string>
            </attr>
        </node>
        <node id="n37">
            <attr name="layout">
                <string>642 232 80 48</string>
            </attr>
        </node>
        <node id="n39">
            <attr name="layout">
                <string>647 336 70 32</string>
            </attr>
        </node>
        <node id="n40">
            <attr name="layout">
                <string>802 232 82 48</string>
            </attr>
        </node>
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
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>flag:trace</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = int:0</string>
            </attr>
        </edge>
        <edge from="n0" to="n36">
            <attr name="label">
                <string>then</string>
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
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
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
        <edge from="n25" to="n25">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n25" to="n25">
            <attr name="label">
                <string>flag:trace</string>
            </attr>
        </edge>
        <edge from="n25" to="n25">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n25" to="n25">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n25" to="n27">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n25" to="n29">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n27" to="n27">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n27" to="n27">
            <attr name="label">
                <string>let:order = int:3</string>
            </attr>
        </edge>
        <edge from="n27" to="n27">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n27" to="n28">
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
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n29" to="n29">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n31" to="n31">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n31" to="n31">
            <attr name="label">
                <string>flag:trace</string>
            </attr>
        </edge>
        <edge from="n31" to="n31">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n31" to="n31">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n31" to="n35">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n31" to="n32">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n31" to="n25">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>let:order = int:2</string>
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
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n36" to="n36">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n36" to="n36">
            <attr name="label">
                <string>flag:trace</string>
            </attr>
        </edge>
        <edge from="n36" to="n36">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n36" to="n36">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n36" to="n40">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n36" to="n31">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n36" to="n37">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>let:order = int:1</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n37" to="n39">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n39" to="n39">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n39" to="n39">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
