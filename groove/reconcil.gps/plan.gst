<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="plan">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n5">
            <attr name="layout">
                <string>304 43 180 48</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>283 159 80 32</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>287 253 70 32</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>51 157 80 32</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>52 261 70 32</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>147 148 90 48</string>
            </attr>
        </node>
        <node id="n0">
            <attr name="layout">
                <string>51 42 180 48</string>
            </attr>
        </node>
        <node id="n9">
            <attr name="layout">
                <string>382 151 90 48</string>
            </attr>
        </node>
        <node id="n32">
            <attr name="layout">
                <string>1049 166 80 32</string>
            </attr>
        </node>
        <node id="n34">
            <attr name="layout">
                <string>1056 48 180 48</string>
            </attr>
        </node>
        <node id="n35">
            <attr name="layout">
                <string>1051 259 70 32</string>
            </attr>
        </node>
        <node id="n36">
            <attr name="layout">
                <string>1145 158 90 48</string>
            </attr>
        </node>
        <node id="n38">
            <attr name="layout">
                <string>798 159 80 32</string>
            </attr>
        </node>
        <node id="n39">
            <attr name="layout">
                <string>810 44 180 48</string>
            </attr>
        </node>
        <node id="n41">
            <attr name="layout">
                <string>804 245 70 32</string>
            </attr>
        </node>
        <node id="n42">
            <attr name="layout">
                <string>908 151 90 48</string>
            </attr>
        </node>
        <node id="n43">
            <attr name="layout">
                <string>545 163 80 32</string>
            </attr>
        </node>
        <node id="n44">
            <attr name="layout">
                <string>561 44 180 48</string>
            </attr>
        </node>
        <node id="n46">
            <attr name="layout">
                <string>544 257 70 32</string>
            </attr>
        </node>
        <node id="n47">
            <attr name="layout">
                <string>657 157 90 48</string>
            </attr>
        </node>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:medication = string:&quot;azithromycin&quot;</string>
            </attr>
        </edge>
        <edge from="n5" to="n44">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n5" to="n9">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n5" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n6" to="n7">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
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
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:amount = int:500</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = string:&quot;azithromycin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n5">
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
        <edge from="n9" to="n9">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:amount = int:250</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n32" to="n32">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n32" to="n35">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>let:medication = string:&quot;azithromycin&quot;</string>
            </attr>
        </edge>
        <edge from="n34" to="n32">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n34" to="n36">
            <attr name="label">
                <string>dose</string>
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
                <string>let:amount = int:250</string>
            </attr>
        </edge>
        <edge from="n36" to="n36">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n38" to="n38">
            <attr name="label">
                <string>type:Timing</string>
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
        <edge from="n39" to="n39">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n39" to="n39">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n39" to="n39">
            <attr name="label">
                <string>let:medication = string:&quot;azithromycin&quot;</string>
            </attr>
        </edge>
        <edge from="n39" to="n38">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n39" to="n34">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n39" to="n42">
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
                <string>let:amount = int:250</string>
            </attr>
        </edge>
        <edge from="n42" to="n42">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n43" to="n46">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>let:medication = string:&quot;azithromycin&quot;</string>
            </attr>
        </edge>
        <edge from="n44" to="n47">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n44" to="n39">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n44" to="n43">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>let:amount = int:250</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
