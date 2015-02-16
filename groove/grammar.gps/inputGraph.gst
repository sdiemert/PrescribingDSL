<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>253 8 141 64</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>124 128 88 112</string>
            </attr>
        </node>
        <node id="n12">
            <attr name="layout">
                <string>50 296 78 64</string>
            </attr>
        </node>
        <node id="n18">
            <attr name="layout">
                <string>208 296 78 64</string>
            </attr>
        </node>
        <node id="n19">
            <attr name="layout">
                <string>448 128 47 32</string>
            </attr>
        </node>
        <node id="n20">
            <attr name="layout">
                <string>346 216 82 80</string>
            </attr>
        </node>
        <node id="n21">
            <attr name="layout">
                <string>508 216 90 80</string>
            </attr>
        </node>
        <edge from="n0" to="n19">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = &quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = &quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:count = 0</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:order = 0</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = 2</string>
            </attr>
        </edge>
        <edge from="n1" to="n18">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = &quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n12">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:duration = 3</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>let:instant = 12</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>let:n = 0</string>
            </attr>
        </edge>
        <edge from="n18" to="n18">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n18" to="n18">
            <attr name="label">
                <string>let:instant = 18</string>
            </attr>
        </edge>
        <edge from="n18" to="n18">
            <attr name="label">
                <string>let:n = 1</string>
            </attr>
        </edge>
        <edge from="n19" to="n19">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n19" to="n20">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n19" to="n21">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
            <attr name="label">
                <string>let:n = 0</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
            <attr name="label">
                <string>let:amount = 81</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n21" to="n21">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n21" to="n21">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n21" to="n21">
            <attr name="label">
                <string>let:amount = 162</string>
            </attr>
        </edge>
        <edge from="n21" to="n21">
            <attr name="label">
                <string>let:n = 1</string>
            </attr>
        </edge>
    </graph>
</gxl>
