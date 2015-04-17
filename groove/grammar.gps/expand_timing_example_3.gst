<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="expand_timing_example_3">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n5">
            <attr name="layout">
                <string>592 171 101 64</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>755 179 81 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>910 170 82 64</string>
            </attr>
        </node>
        <node id="n35">
            <attr name="layout">
                <string>664 687 29 32</string>
            </attr>
        </node>
        <node id="n78">
            <attr name="layout">
                <string>345 96 149 80</string>
            </attr>
        </node>
        <node id="n79">
            <attr name="layout">
                <string>423 47 149 80</string>
            </attr>
        </node>
        <node id="n80">
            <attr name="layout">
                <string>413 385 149 80</string>
            </attr>
        </node>
        <node id="n81">
            <attr name="layout">
                <string>505 24 149 80</string>
            </attr>
        </node>
        <node id="n82">
            <attr name="layout">
                <string>325 152 149 80</string>
            </attr>
        </node>
        <node id="n83">
            <attr name="layout">
                <string>314 252 149 80</string>
            </attr>
        </node>
        <node id="n84">
            <attr name="layout">
                <string>546 376 149 80</string>
            </attr>
        </node>
        <node id="n85">
            <attr name="layout">
                <string>466 413 149 80</string>
            </attr>
        </node>
        <node id="n86">
            <attr name="layout">
                <string>355 339 149 80</string>
            </attr>
        </node>
        <node id="n87">
            <attr name="layout">
                <string>632 322 149 80</string>
            </attr>
        </node>
        <node id="n88">
            <attr name="layout">
                <string>306 195 149 80</string>
            </attr>
        </node>
        <node id="n89">
            <attr name="layout">
                <string>335 300 149 80</string>
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
        <edge from="n78" to="n78">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n78" to="n78">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n78" to="n78">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n78" to="n78">
            <attr name="label">
                <string>let:start = int:151200</string>
            </attr>
        </edge>
        <edge from="n78" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n79" to="n79">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n79" to="n79">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n79" to="n79">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n79" to="n79">
            <attr name="label">
                <string>let:start = int:1360800</string>
            </attr>
        </edge>
        <edge from="n79" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n80" to="n80">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n80" to="n80">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n80" to="n80">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n80" to="n80">
            <attr name="label">
                <string>let:start = int:2570400</string>
            </attr>
        </edge>
        <edge from="n80" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n81" to="n81">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n81" to="n81">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n81" to="n81">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n81" to="n81">
            <attr name="label">
                <string>let:start = int:756000</string>
            </attr>
        </edge>
        <edge from="n81" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n82" to="n82">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n82" to="n82">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n82" to="n82">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n82" to="n82">
            <attr name="label">
                <string>let:start = int:1965600</string>
            </attr>
        </edge>
        <edge from="n82" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n83" to="n83">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n83" to="n83">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n83" to="n83">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n83" to="n83">
            <attr name="label">
                <string>let:start = int:3175200</string>
            </attr>
        </edge>
        <edge from="n83" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n84" to="n84">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n84" to="n84">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n84" to="n84">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n84" to="n84">
            <attr name="label">
                <string>let:start = int:122400</string>
            </attr>
        </edge>
        <edge from="n84" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n85" to="n85">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n85" to="n85">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n85" to="n85">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n85" to="n85">
            <attr name="label">
                <string>let:start = int:1332000</string>
            </attr>
        </edge>
        <edge from="n85" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n86" to="n86">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n86" to="n86">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n86" to="n86">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n86" to="n86">
            <attr name="label">
                <string>let:start = int:2541600</string>
            </attr>
        </edge>
        <edge from="n86" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n87" to="n87">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n87" to="n87">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n87" to="n87">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n87" to="n87">
            <attr name="label">
                <string>let:start = int:727200</string>
            </attr>
        </edge>
        <edge from="n87" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n88" to="n88">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n88" to="n88">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n88" to="n88">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n88" to="n88">
            <attr name="label">
                <string>let:start = int:1936800</string>
            </attr>
        </edge>
        <edge from="n88" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n89" to="n89">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n89" to="n89">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n89" to="n89">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n89" to="n89">
            <attr name="label">
                <string>let:start = int:3146400</string>
            </attr>
        </edge>
        <edge from="n89" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
    </graph>
</gxl>
