import java.util.*;
public class polyhedron {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer> map=new HashMap<>();
        map.put("Tetrahedron",4);
        map.put("Cube",6);
        map.put("Octahedron",8);
        map.put("Dodecahedron",12);
        map.put("Icosahedron",20);
        int ans=0;
        while(n-->0){
            String s=sc.next();
            ans+=map.get(s);
        }
        System.out.println(ans);
    }
}
