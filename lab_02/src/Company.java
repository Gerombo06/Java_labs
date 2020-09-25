import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    String name;
    ArrayList<Client> clients;
    ArrayList<Tarif> Tarif_list;

    public static void main(String[] args) {
        Company company = new Company();
        company.Tarif_list = new ArrayList<Tarif>();
        Tarif tarif_temp = new Tarif("Hit",250,10240,0,0,0,false,true);
        company.Tarif_list.add(tarif_temp);
        tarif_temp = new Tarif("Fast and Furious2",400,15360,500,0,3,false,false);
        company.Tarif_list.add(tarif_temp);
        tarif_temp = new Tarif("Freedom of communication",0,0,60,10,1,false,false);
        company.Tarif_list.add(tarif_temp);

        company.Search(0,300,0,0);
    }

    public int ClientCount()
    {
        return clients.size();
    }

    public void SortTarif()
    {
        //Tarif_list.sort(comparator);
        Collections.sort(Tarif_list,new Comparator<Tarif>(){
            @Override
            public int compare(Tarif o1, Tarif o2) {
                return o1.cost_per_month - o2.cost_per_month;
            }
        });
        for (int i=0; i<Tarif_list.size(); i++)
        {
            System.out.println(Tarif_list.get(i).name);

        }
    }

    public void Search(int cost_min, int cost_max,int inet_pack_mb_min,int call_pack_mb_min)
    {
        for (int i=0; i<Tarif_list.size(); i++)
        {
            if (Tarif_list.get(i).cost_per_month >= cost_min && Tarif_list.get(i).cost_per_month <= cost_max)
            {
                if (Tarif_list.get(i).inet_pack_mb >= inet_pack_mb_min && Tarif_list.get(i).call_pack_min >= call_pack_mb_min)
                {
                    System.out.println(Tarif_list.get(i).name);
                }
            }


        }
    }


}



