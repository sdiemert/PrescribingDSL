<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="first_3_after">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n5">
            <attr name="layout">
                <string>1221 310 101 64</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>1056 294 81 48</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>965 211 108 48</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>738 277 91 64</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>964 365 108 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>1049 399 82 64</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>346 280 97 64</string>
            </attr>
        </node>
        <node id="n0">
            <attr name="layout">
                <string>114 272 149 112</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>546 281 108 48</string>
            </attr>
        </node>
        <node id="n180">
            <attr name="layout">
                <string>923 743 32 32</string>
            </attr>
        </node>
        <node id="n181">
            <attr name="layout">
                <string>512 90 149 112</string>
            </attr>
        </node>
        <node id="n182">
            <attr name="layout">
                <string>309 85 149 112</string>
            </attr>
        </node>
        <node id="n183">
            <attr name="layout">
                <string>465 411 149 96</string>
            </attr>
        </node>
        <node id="n184">
            <attr name="layout">
                <string>120 123 149 96</string>
            </attr>
        </node>
        <node id="n185">
            <attr name="layout">
                <string>206 420 149 96</string>
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
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frame = string:&quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = int:1</string>
            </attr>
        </edge>
        <edge from="n1" to="n4">
            <attr name="label">
                <string>point</string>
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
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = int:0</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:start = int:0</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:value = int:1</string>
            </attr>
        </edge>
        <edge from="n4" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n180" to="n180">
            <attr name="label">
                <string>type:Plan</string>
            </attr>
        </edge>
        <edge from="n181" to="n181">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n181" to="n181">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n181" to="n181">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n181" to="n181">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n181" to="n181">
            <attr name="label">
                <string>let:repeats = int:0</string>
            </attr>
        </edge>
        <edge from="n181" to="n181">
            <attr name="label">
                <string>let:start = int:1209600</string>
            </attr>
        </edge>
        <edge from="n181" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n182" to="n182">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n182" to="n182">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n182" to="n182">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n182" to="n182">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n182" to="n182">
            <attr name="label">
                <string>let:repeats = int:0</string>
            </attr>
        </edge>
        <edge from="n182" to="n182">
            <attr name="label">
                <string>let:start = int:2419200</string>
            </attr>
        </edge>
        <edge from="n182" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n183" to="n183">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n183" to="n183">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n183" to="n183">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n183" to="n183">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n183" to="n183">
            <attr name="label">
                <string>let:start = int:604800</string>
            </attr>
        </edge>
        <edge from="n183" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n184" to="n184">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n184" to="n184">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n184" to="n184">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n184" to="n184">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n184" to="n184">
            <attr name="label">
                <string>let:start = int:1814400</string>
            </attr>
        </edge>
        <edge from="n184" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n185" to="n185">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n185" to="n185">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n185" to="n185">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n185" to="n185">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n185" to="n185">
            <attr name="label">
                <string>let:start = int:3024000</string>
            </attr>
        </edge>
        <edge from="n185" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
    </graph>
</gxl>
