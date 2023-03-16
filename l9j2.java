class l9j2
{
    public static void main(String[] args) {
        try {
            int arr[] = new int[10];
            arr[34] = 78;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}