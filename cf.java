class cf {
	public static void main(String[] arg) {
		System.out.println("test");
		List<String> records = readFile("input.txt");
		Sysqtem.out.println(records[0]);
	}

	private List<String> readFile(String filename) {
		List<String> records = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				records.add(line);
			}
			reader.close();
			return records;
		} catch (Exception e) {
			System.err.format("Exception occurred trying to read '%s'.", filename);
			e.printStackTrace();
			return null;
		}
}

