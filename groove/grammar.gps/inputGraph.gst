<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>507 262 141 64</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>168 209 88 112</string>
            </attr>
        </node>
        <node id="n10">
            <attr name="layout">
                <string>22 80 78 64</string>
            </attr>
        </node>
        <node id="n18">
            <attr name="layout">
                <string>390 22 78 64</string>
            </attr>
        </node>
        <node id="n19">
            <attr name="layout">
                <string>247 350 83 32</string>
            </attr>
        </node>
        <node id="n20">
            <attr name="layout">
                <string>110 501 82 80</string>
            </attr>
        </node>
        <node id="n21">
            <attr name="layout">
                <string>231 524 82 80</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>416 119 78 64</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>372 498 82 80</string>
            </attr>
        </node>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = &quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = &quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n19">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:count = 0</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:duration = 5</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = 3</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:order = 0</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = &quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n18">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n1" to="n10">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n1" to="n2">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>let:instant = 10</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
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
                <string>type:FixedDosing</string>
            </attr>
        </edge>
        <edge from="n19" to="n21">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n19" to="n20">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n19" to="n3">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
            <attr name="label">
                <string>let:amount = 81</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
            <attr name="label">
                <string>let:n = 0</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
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
                <string>let:amount = 71</string>
            </attr>
        </edge>
        <edge from="n21" to="n21">
            <attr name="label">
                <string>let:n = 1</string>
            </attr>
        </edge>
        <edge from="n21" to="n21">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:instant = 22</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:n = 2</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:amount = 61</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:n = 2</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
