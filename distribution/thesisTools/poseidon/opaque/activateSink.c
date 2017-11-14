rimeaddr_t sinkAddr2;
sinkAddr2.u8[0] = 1;
sinkAddr2.u8[1] = 0;
if(rimeaddr_cmp(&sinkAddr2, &rimeaddr_node_addr)) {
	runtime_activating_specific = 99;
} else {
	runtime_activating_specific = 22;
}