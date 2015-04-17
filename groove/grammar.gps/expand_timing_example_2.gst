<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="expand_timing_example_2">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n5">
            <attr name="layout">
                <string>692 226 101 64</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>879 230 81 48</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>498 184 108 48</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>324 242 91 64</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>504 298 108 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>886 339 82 64</string>
            </attr>
        </node>
        <node id="n35">
            <attr name="layout">
                <string>216 731 29 32</string>
            </attr>
        </node>
        <node id="n58">
            <attr name="layout">
                <string>104 206 149 80</string>
            </attr>
        </node>
        <node id="n59">
            <attr name="layout">
                <string>123 140 149 80</string>
            </attr>
        </node>
        <node id="n60">
            <attr name="layout">
                <string>161 79 149 80</string>
            </attr>
        </node>
        <node id="n61">
            <attr name="layout">
                <string>156 391 149 80</string>
            </attr>
        </node>
        <node id="n62">
            <attr name="layout">
                <string>111 337 149 80</string>
            </attr>
        </node>
        <node id="n63">
            <attr name="layout">
                <string>89 285 149 80</string>
            </attr>
        </node>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:frame = string:&quot;HOUR&quot;</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:frequency = int:1</string>
            </attr>
        </edge>
        <edge from="n5" to="n2">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:AtomicPoint</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:value = int:14</string>
            </attr>
        </edge>
        <edge from="n2" to="n3">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>let:value = int:10</string>
            </attr>
        </edge>
        <edge from="n8" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:frame = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:frequency = int:2</string>
            </attr>
        </edge>
        <edge from="n6" to="n8">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n6" to="n7">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:value = int:18</string>
            </attr>
        </edge>
        <edge from="n7" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:amount = int:10</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>type:Plan</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:start = int:86400</string>
            </attr>
        </edge>
        <edge from="n58" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:start = int:1296000</string>
            </attr>
        </edge>
        <edge from="n59" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:start = int:2505600</string>
            </attr>
        </edge>
        <edge from="n60" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>let:start = int:691200</string>
            </attr>
        </edge>
        <edge from="n61" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>let:start = int:1900800</string>
            </attr>
        </edge>
        <edge from="n62" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:start = int:3110400</string>
            </attr>
        </edge>
        <edge from="n63" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
    </graph>
</gxl>
