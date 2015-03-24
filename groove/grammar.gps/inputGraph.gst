<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>228 8 141 80</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>120 144 88 128</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>50 328 70 64</string>
            </attr>
        </node>
        <node id="n20">
            <attr name="layout">
                <string>200 328 78 64</string>
            </attr>
        </node>
        <node id="n21">
            <attr name="layout">
                <string>288 144 90 80</string>
            </attr>
        </node>
        <node id="n22">
            <attr name="layout">
                <string>458 144 90 80</string>
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
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = 0</string>
            </attr>
        </edge>
        <edge from="n0" to="n22">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n0" to="n21">
            <attr name="label">
                <string>dosing</string>
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
                <string>let:duration = 4</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = 2</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:offset = 0</string>
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
        <edge from="n1" to="n20">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n1" to="n8">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>let:instant = 8</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>let:n = 0</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
            <attr name="label">
                <string>let:instant = 20</string>
            </attr>
        </edge>
        <edge from="n20" to="n20">
            <attr name="label">
                <string>let:n = 1</string>
            </attr>
        </edge>
        <edge from="n21" to="n21">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n21" to="n21">
            <attr name="label">
                <string>let:amount = 100</string>
            </attr>
        </edge>
        <edge from="n21" to="n21">
            <attr name="label">
                <string>let:n = 0</string>
            </attr>
        </edge>
        <edge from="n21" to="n21">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n22" to="n22">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n22" to="n22">
            <attr name="label">
                <string>let:amount = 200</string>
            </attr>
        </edge>
        <edge from="n22" to="n22">
            <attr name="label">
                <string>let:n = 1</string>
            </attr>
        </edge>
        <edge from="n22" to="n22">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
