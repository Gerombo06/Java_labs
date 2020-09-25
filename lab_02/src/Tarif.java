public class Tarif {
    String name;
    int cost_per_month = 0;
    int inet_pack_mb = 0;
    int call_pack_min = 0;
    int cost_inet_per_mb = 0;
    int cost_call_per_min = 0;
    boolean inet_infinity = false;
    boolean call_infinity = false;

    public Tarif(String name, int cost_per_month, int inet_pack_mb, int call_pack_min, int cost_inet_per_mb, int cost_call_per_min, boolean inet_infinity, boolean call_infinity) {
        this.name = name;
        this.cost_per_month = cost_per_month;
        this.inet_pack_mb = inet_pack_mb;
        this.call_pack_min = call_pack_min;
        this.cost_inet_per_mb = cost_inet_per_mb;
        this.cost_call_per_min = cost_call_per_min;
        this.inet_infinity = inet_infinity;
        this.call_infinity = call_infinity;
    }
}
