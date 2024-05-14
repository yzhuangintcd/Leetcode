int findJudge(int n, int** trust, int trustSize, int* trustColSize) {
    int trustCount[n+1];
    int trustedByCount[n+1];

    for (int i = 0; i <= n; i++){
        trustCount[i] = 0;
        trustedByCount[i] = 0;
    }

    for (int i = 0; i < trustSize; i++){
        int a = trust[i][0];
        int b = trust[i][1];
        trustCount[a]++;
        trustedByCount[b]++;
    }

    for (int i = 1; i <= n; i++){
        if (trustCount[i] == 0 && trustedByCount[i] == n - 1){
            return i;
        }
    }

    return -1;
}