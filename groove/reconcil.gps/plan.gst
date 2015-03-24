<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="plan">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n1">
            <attr name="layout">
                <string>377 220 80 64</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>307 340 78 48</string>
            </attr>
        </node>
        <node id="n0">
            <attr name="layout">
                <string>284 81 141 64</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>260 222 90 64</string>
            </attr>
        </node>
        <node id="n34">
            <attr name="layout">
                <string>987 182 141 64</string>
            </attr>
        </node>
        <node id="n35">
            <attr name="layout">
                <string>1012 34 80 64</string>
            </attr>
        </node>
        <node id="n37">
            <attr name="layout">
                <string>819 50 78 48</string>
            </attr>
        </node>
        <node id="n38">
            <attr name="layout">
                <string>1134 40 90 64</string>
            </attr>
        </node>
        <node id="n40">
            <attr name="layout">
                <string>1176 428 141 64</string>
            </attr>
        </node>
        <node id="n41">
            <attr name="layout">
                <string>1240 554 80 64</string>
            </attr>
        </node>
        <node id="n43">
            <attr name="layout">
                <string>1169 658 78 48</string>
            </attr>
        </node>
        <node id="n44">
            <attr name="layout">
                <string>1113 554 90 64</string>
            </attr>
        </node>
        <node id="n46">
            <attr name="layout">
                <string>743 239 141 64</string>
            </attr>
        </node>
        <node id="n47">
            <attr name="layout">
                <string>822 353 80 64</string>
            </attr>
        </node>
        <node id="n49">
            <attr name="layout">
                <string>768 459 78 48</string>
            </attr>
        </node>
        <node id="n50">
            <attr name="layout">
                <string>699 351 90 64</string>
            </attr>
        </node>
        <node id="n54">
            <attr name="layout">
                <string>129 258 70 48</string>
            </attr>
        </node>
        <node id="n55">
            <attr name="layout">
                <string>17 132 90 64</string>
            </attr>
        </node>
        <node id="n56">
            <attr name="layout">
                <string>147 131 80 64</string>
            </attr>
        </node>
        <node id="n57">
            <attr name="layout">
                <string>54 21 141 64</string>
            </attr>
        </node>
        <node id="n58">
            <attr name="layout">
                <string>495 384 70 48</string>
            </attr>
        </node>
        <node id="n59">
            <attr name="layout">
                <string>479 258 90 64</string>
            </attr>
        </node>
        <node id="n60">
            <attr name="layout">
                <string>603 274 80 64</string>
            </attr>
        </node>
        <node id="n61">
            <attr name="layout">
                <string>517 157 141 64</string>
            </attr>
        </node>
        <node id="n62">
            <attr name="layout">
                <string>930 549 70 48</string>
            </attr>
        </node>
        <node id="n63">
            <attr name="layout">
                <string>890 436 90 64</string>
            </attr>
        </node>
        <node id="n64">
            <attr name="layout">
                <string>1019 446 80 64</string>
            </attr>
        </node>
        <node id="n65">
            <attr name="layout">
                <string>961 334 141 64</string>
            </attr>
        </node>
        <node id="n66">
            <attr name="layout">
                <string>1368 56 70 48</string>
            </attr>
        </node>
        <node id="n67">
            <attr name="layout">
                <string>1215 166 90 64</string>
            </attr>
        </node>
        <node id="n68">
            <attr name="layout">
                <string>1376 178 80 64</string>
            </attr>
        </node>
        <node id="n69">
            <attr name="layout">
                <string>1162 287 141 64</string>
            </attr>
        </node>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:order = int:1</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n3">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:instant = int:20</string>
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
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n5">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n0" to="n61">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:amount = int:200</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
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
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n34" to="n38">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n34" to="n35">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>let:order = int:7</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n35" to="n37">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>let:instant = int:20</string>
            </attr>
        </edge>
        <edge from="n38" to="n38">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n38" to="n38">
            <attr name="label">
                <string>let:amount = int:200</string>
            </attr>
        </edge>
        <edge from="n38" to="n38">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
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
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n40" to="n69">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n40" to="n44">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n40" to="n41">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>let:order = int:5</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n41" to="n43">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:instant = int:20</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>let:amount = int:200</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n46" to="n50">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n46" to="n47">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n46" to="n65">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>let:order = int:3</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n47" to="n49">
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
                <string>let:instant = int:20</string>
            </attr>
        </edge>
        <edge from="n50" to="n50">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n50" to="n50">
            <attr name="label">
                <string>let:amount = int:200</string>
            </attr>
        </edge>
        <edge from="n50" to="n50">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
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
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n55" to="n55">
            <attr name="label">
                <string>let:amount = int:100</string>
            </attr>
        </edge>
        <edge from="n55" to="n55">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>let:order = int:0</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n56" to="n54">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n57" to="n55">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n57" to="n0">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n57" to="n56">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:amount = int:100</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:order = int:2</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n60" to="n58">
            <attr name="label">
                <string>instant</string>
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
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n61" to="n60">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n61" to="n46">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n61" to="n59">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:amount = int:100</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>let:order = int:4</string>
            </attr>
        </edge>
        <edge from="n64" to="n64">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n64" to="n62">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n65" to="n40">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n65" to="n64">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n65" to="n63">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>let:amount = int:100</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>let:order = int:6</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n68" to="n66">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n69" to="n67">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n69" to="n68">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n69" to="n34">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
    </graph>
</gxl>
