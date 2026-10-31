# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 355 | `qa-3d4572e6-f1f8-40ed-89b7-56047c5d749f` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-4600f232-1f27-4006-bcf9-4ee997f0c2c2` |
| 3 | `GET /v1/accounts/me` | 200 | 27 | `qa-75d672aa-93a8-432b-87d8-3ede264c7ca2` |
| 4 | `GET /v1/accounts/me` | 200 | 32 | `qa-6104ec17-8733-48f2-8ca4-fcae83a9582e` |
| 5 | `GET /v1/accounts/me` | 200 | 15 | `qa-b4e36b86-62c4-4888-a63f-f355f8c2bf94` |
| 6 | `GET /v1/accounts/me` | 200 | 15 | `qa-a61bc0cb-28b6-4cd8-a2ae-6e6892ff4a69` |
| 7 | `GET /v1/accounts/me` | 200 | 14 | `qa-0fb42045-4b9f-4f51-b5d0-abb46989707a` |
| 8 | `GET /v1/accounts/me` | 200 | 7 | `qa-19052fa1-f90f-4a66-a314-7e7b282f5000` |
| 9 | `GET /v1/accounts/me` | 200 | 13 | `qa-963b0f67-6925-497b-b070-4f3c783bf5fa` |
| 10 | `GET /v1/accounts/me` | 200 | 16 | `qa-8ae03c0b-4a60-4473-a467-cb9648678189` |
| 11 | `GET /v1/accounts/me` | 200 | 11 | `qa-410a6be0-0de7-4246-9de5-7f409a28533d` |
| 12 | `GET /v1/accounts/me` | 200 | 14 | `qa-73664b43-ab9c-4a7c-95b0-8a97ac97d208` |
| 13 | `GET /v1/accounts/me` | 200 | 8 | `qa-14b60604-7d32-4c6c-9fa1-0bb1231d910a` |
| 14 | `GET /v1/accounts/me` | 200 | 6 | `qa-add363ea-ddae-4b3a-9f41-821a07192451` |
| 15 | `GET /v1/accounts/me` | 200 | 7 | `qa-7296c011-e0c1-4894-9c8e-229aa8a9b0d9` |
| 16 | `GET /v1/accounts/me` | 200 | 7 | `qa-2e9536f0-998e-4530-9038-a9bea8119460` |
| 17 | `GET /v1/accounts/me` | 200 | 5 | `qa-08e70070-e63b-4f0d-8883-af4eeaac20ba` |
| 18 | `GET /v1/accounts/me` | 200 | 6 | `qa-7ee1cf3c-7bd4-40da-ae55-2b607998d422` |
| 19 | `GET /v1/accounts/me` | 200 | 10 | `qa-0de99a43-d8f9-4b53-80f4-2fe166768ed2` |
| 20 | `GET /v1/accounts/me` | 200 | 7 | `qa-f61da953-88a5-496b-a244-5383072f9aab` |
| 21 | `GET /v1/accounts/me` | 200 | 12 | `qa-1b98ffc4-308f-44ec-b68b-3a1057ada49c` |
| 22 | `GET /v1/accounts/me` | 200 | 6 | `qa-6b03e05a-55d3-4f92-aac1-f912389adffe` |
| 23 | `GET /v1/accounts/me` | 200 | 10 | `qa-b57c54e3-e818-49a5-b29e-a5f369aa1fce` |
| 24 | `GET /v1/accounts/me` | 200 | 34 | `qa-1efc51c4-9789-427c-861d-504d4b5cf570` |
| 25 | `GET /v1/accounts/me` | 200 | 17 | `qa-38d231f9-477f-42e9-a88b-2f12ad2d97e1` |
| 26 | `GET /v1/accounts/me` | 200 | 11 | `qa-bfc91e90-ddce-4cdc-b02f-fd03198342af` |
| 27 | `GET /v1/accounts/me` | 200 | 10 | `qa-b36a6c0b-e8a7-450e-b0a6-382b50e89475` |
| 28 | `GET /v1/accounts/me` | 200 | 21 | `qa-982832a4-f9f4-43ea-bad5-5ee2d5e9b963` |
| 29 | `GET /v1/accounts/me` | 200 | 16 | `qa-80b80808-d392-444a-b89e-a8048a6c4998` |
| 30 | `GET /v1/accounts/me` | 200 | 11 | `qa-2cb473e2-d1fd-4fc9-ae3a-3cfc81623830` |
| 31 | `GET /v1/accounts/me` | 200 | 9 | `qa-3be3fdd5-e2ca-4f43-9a9d-b37a173efbe6` |
| 32 | `GET /v1/accounts/me` | 200 | 11 | `qa-2b5dce45-e90c-4365-8f2f-ae25843f2c93` |
| 33 | `GET /v1/accounts/me` | 200 | 8 | `qa-6b67fba8-af49-41c5-a05b-8a5ea9fa9af4` |
| 34 | `GET /v1/accounts/me` | 200 | 7 | `qa-1161fe63-8580-4373-be5f-f3a287663e18` |
| 35 | `GET /v1/accounts/me` | 200 | 5 | `qa-7c9032d0-3c97-4d5e-ae1a-2db9a9fd42c1` |
| 36 | `GET /v1/accounts/me` | 200 | 11 | `qa-6409ed42-d85e-4392-b917-0e6d89605b05` |
| 37 | `GET /v1/accounts/me` | 200 | 5 | `qa-33fbd322-3458-476d-8a1e-62107892a81d` |
| 38 | `GET /v1/accounts/me` | 200 | 10 | `qa-ef7cc746-5af6-4c1c-bca2-966bb580196b` |
| 39 | `GET /v1/accounts/me` | 200 | 5 | `qa-5b6ba1c9-1fe7-4f7a-95ab-327f1e011539` |
| 40 | `GET /v1/accounts/me` | 200 | 11 | `qa-5b042d66-8fb4-4e8f-bb8a-c8c195473196` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-229fcac6-47cf-4495-bb14-67b9e6999d03` |
| 42 | `GET /v1/accounts/me` | 200 | 5 | `qa-ba3e2c4f-8ee4-48ee-b35c-a046a24891b8` |
| 43 | `GET /v1/accounts/me` | 200 | 6 | `qa-5f52ed63-b122-42a3-9114-5fd107198a71` |
| 44 | `GET /v1/accounts/me` | 200 | 7 | `qa-382d6cdd-d8ee-4221-9aa9-5ec4000d2eef` |
| 45 | `GET /v1/accounts/me` | 200 | 5 | `qa-74664793-f1e2-4b32-952e-e31880b3d31a` |
| 46 | `GET /v1/accounts/me` | 200 | 17 | `qa-377a9615-c341-465f-8b4a-27dccf7f741f` |
| 47 | `GET /v1/accounts/me` | 200 | 5 | `qa-e4489d94-9eef-4c1d-b6b4-4507423f5702` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-50554182-c7c8-4000-a3f6-5dd80f9069d1` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-87dd23c3-671b-49fa-9e90-1eb012fe51db` |
| 50 | `GET /v1/accounts/me` | 200 | 6 | `qa-f3cc542d-4d90-4b54-9fbe-5c8fed6ba215` |
| 51 | `GET /v1/accounts/me` | 200 | 7 | `qa-864ee9b3-e55b-462e-917f-08143d154426` |
| 52 | `GET /v1/accounts/me` | 200 | 6 | `qa-104330e6-5ba3-4508-9a61-3da6b87cb820` |
| 53 | `GET /v1/accounts/me` | 200 | 5 | `qa-b34db9a9-49f5-4c7b-afc2-979348ab0662` |
| 54 | `GET /v1/accounts/me` | 200 | 8 | `qa-a176e90d-c2cc-4009-b456-c1982dcaa764` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-7dc778bf-d365-488b-b83f-6b0f00c30038` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-66a4c435-374c-4f09-9bff-16b530b18968` |
| 57 | `GET /v1/accounts/me` | 200 | 5 | `qa-5576b716-1492-413d-9408-3f85581f5505` |
| 58 | `GET /v1/accounts/me` | 200 | 5 | `qa-2816cada-62b5-4c21-8700-04b6558a6a4c` |
| 59 | `GET /v1/accounts/me` | 200 | 6 | `qa-f1c780aa-c30a-4a8b-82e5-702bab178ebb` |
| 60 | `GET /v1/accounts/me` | 200 | 7 | `qa-8b877c75-e47f-45d8-8877-70b0823a3b5d` |
| 61 | `GET /v1/accounts/me` | 200 | 6 | `qa-dcae58f1-a4a6-4962-922e-43d70b2750fd` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-194475c7-d11e-4a3d-9322-7e12a168af52` |
| 63 | `GET /v1/accounts/me` | 429 | 6 | `qa-8da46a6c-bc2d-44ec-bbdd-9f993e28959a` |
| 64 | `GET /v1/accounts/me` | 429 | 4 | `qa-10644574-5ba3-4dd4-9fb6-3cce558c1109` |
| 65 | `GET /v1/accounts/me` | 429 | 3 | `qa-9326988d-6b07-4640-aad6-2fc363ea87b4` |
| 66 | `GET /v1/accounts/me` | 429 | 3 | `qa-9c64eeb5-a6ef-4f35-bd47-f62d4d458b75` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-8c9a1f27-bd25-4f13-8941-2bcb05335df2` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-7c10be7c-5dfa-418b-a2a9-7e3b311cb4fc` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-31319e7b-5454-4170-b117-6aeaf7a6a1a0` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-75388bbd-a432-403f-b75e-24258b52e8e8` |
| 71 | `GET /v1/accounts/me` | 429 | 3 | `qa-63ea696c-6611-4629-a3a8-457332fbccbf` |
| 72 | `GET /v1/accounts/me` | 429 | 3 | `qa-58515d79-e209-4be4-adf6-708cb9b6f44b` |
| 73 | `GET /v1/accounts/me` | 429 | 3 | `qa-6678c91f-b16f-4dde-8430-8fce77fd12af` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-04f878a3-af23-4a2d-bc3c-13a2ec32f3fe` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-82d56f12-fe46-47e0-9556-382ed15552a3` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-84853a3c-f532-41d7-9819-7a9b23e4199f` |
| 77 | `GET /v1/accounts/me` | 429 | 10 | `qa-f42dafb7-2999-47bd-8a30-12effd8b2389` |
| 78 | `GET /v1/accounts/me` | 429 | 15 | `qa-98439bca-6d8f-49cf-b8c1-eb8a8a0666e5` |
| 79 | `GET /v1/accounts/me` | 429 | 9 | `qa-c3d0a12c-30ad-46e2-918b-65e67eaaae14` |
| 80 | `GET /v1/accounts/me` | 429 | 5 | `qa-2fc6199c-3e24-4908-998c-6a97d4e73e98` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-bce2e7de-2335-4fdf-b673-a9b2d4fff863` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-13830f5a-3e7b-49fb-b072-726475689072` |
| 83 | `POST /v1/auth/token` | 401 | 5 | `qa-ef7e10dc-4e97-4db0-aad9-12db8099e7e3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3d4572e6-f1f8-40ed-89b7-56047c5d749f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d4572e6-f1f8-40ed-89b7-56047c5d749f
Content-Type: application/json

--- request body ---
{"handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","password":"****","region":"eu"}

--- response: 201 in 355 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d4572e6-f1f8-40ed-89b7-56047c5d749f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-5c6f533379e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4600f232-1f27-4006-bcf9-4ee997f0c2c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4600f232-1f27-4006-bcf9-4ee997f0c2c2
Content-Type: application/json

--- request body ---
{"handle":"qa-5c6f533379e7","password":"****"}

--- response: 200 in 46 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-4600f232-1f27-4006-bcf9-4ee997f0c2c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc7192b3-291c-4397-ad37-9195180804f2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-75d672aa-93a8-432b-87d8-3ede264c7ca2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75d672aa-93a8-432b-87d8-3ede264c7ca2
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-75d672aa-93a8-432b-87d8-3ede264c7ca2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-6104ec17-8733-48f2-8ca4-fcae83a9582e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6104ec17-8733-48f2-8ca4-fcae83a9582e
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-6104ec17-8733-48f2-8ca4-fcae83a9582e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4e36b86-62c4-4888-a63f-f355f8c2bf94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4e36b86-62c4-4888-a63f-f355f8c2bf94
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4e36b86-62c4-4888-a63f-f355f8c2bf94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-a61bc0cb-28b6-4cd8-a2ae-6e6892ff4a69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a61bc0cb-28b6-4cd8-a2ae-6e6892ff4a69
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-a61bc0cb-28b6-4cd8-a2ae-6e6892ff4a69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-0fb42045-4b9f-4f51-b5d0-abb46989707a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fb42045-4b9f-4f51-b5d0-abb46989707a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fb42045-4b9f-4f51-b5d0-abb46989707a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-19052fa1-f90f-4a66-a314-7e7b282f5000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19052fa1-f90f-4a66-a314-7e7b282f5000
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-19052fa1-f90f-4a66-a314-7e7b282f5000
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-963b0f67-6925-497b-b070-4f3c783bf5fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-963b0f67-6925-497b-b070-4f3c783bf5fa
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-963b0f67-6925-497b-b070-4f3c783bf5fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ae03c0b-4a60-4473-a467-cb9648678189

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ae03c0b-4a60-4473-a467-cb9648678189
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ae03c0b-4a60-4473-a467-cb9648678189
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-410a6be0-0de7-4246-9de5-7f409a28533d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-410a6be0-0de7-4246-9de5-7f409a28533d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-410a6be0-0de7-4246-9de5-7f409a28533d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-73664b43-ab9c-4a7c-95b0-8a97ac97d208

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73664b43-ab9c-4a7c-95b0-8a97ac97d208
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-73664b43-ab9c-4a7c-95b0-8a97ac97d208
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-14b60604-7d32-4c6c-9fa1-0bb1231d910a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14b60604-7d32-4c6c-9fa1-0bb1231d910a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-14b60604-7d32-4c6c-9fa1-0bb1231d910a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-add363ea-ddae-4b3a-9f41-821a07192451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-add363ea-ddae-4b3a-9f41-821a07192451
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-add363ea-ddae-4b3a-9f41-821a07192451
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-7296c011-e0c1-4894-9c8e-229aa8a9b0d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7296c011-e0c1-4894-9c8e-229aa8a9b0d9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7296c011-e0c1-4894-9c8e-229aa8a9b0d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e9536f0-998e-4530-9038-a9bea8119460

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e9536f0-998e-4530-9038-a9bea8119460
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e9536f0-998e-4530-9038-a9bea8119460
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-08e70070-e63b-4f0d-8883-af4eeaac20ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08e70070-e63b-4f0d-8883-af4eeaac20ba
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-08e70070-e63b-4f0d-8883-af4eeaac20ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ee1cf3c-7bd4-40da-ae55-2b607998d422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ee1cf3c-7bd4-40da-ae55-2b607998d422
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ee1cf3c-7bd4-40da-ae55-2b607998d422
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-0de99a43-d8f9-4b53-80f4-2fe166768ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0de99a43-d8f9-4b53-80f4-2fe166768ed2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0de99a43-d8f9-4b53-80f4-2fe166768ed2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-f61da953-88a5-496b-a244-5383072f9aab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f61da953-88a5-496b-a244-5383072f9aab
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f61da953-88a5-496b-a244-5383072f9aab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b98ffc4-308f-44ec-b68b-3a1057ada49c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b98ffc4-308f-44ec-b68b-3a1057ada49c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b98ffc4-308f-44ec-b68b-3a1057ada49c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b03e05a-55d3-4f92-aac1-f912389adffe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b03e05a-55d3-4f92-aac1-f912389adffe
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b03e05a-55d3-4f92-aac1-f912389adffe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-b57c54e3-e818-49a5-b29e-a5f369aa1fce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b57c54e3-e818-49a5-b29e-a5f369aa1fce
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b57c54e3-e818-49a5-b29e-a5f369aa1fce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-1efc51c4-9789-427c-861d-504d4b5cf570

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1efc51c4-9789-427c-861d-504d4b5cf570
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-1efc51c4-9789-427c-861d-504d4b5cf570
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-38d231f9-477f-42e9-a88b-2f12ad2d97e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38d231f9-477f-42e9-a88b-2f12ad2d97e1
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-38d231f9-477f-42e9-a88b-2f12ad2d97e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-bfc91e90-ddce-4cdc-b02f-fd03198342af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfc91e90-ddce-4cdc-b02f-fd03198342af
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfc91e90-ddce-4cdc-b02f-fd03198342af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-b36a6c0b-e8a7-450e-b0a6-382b50e89475

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b36a6c0b-e8a7-450e-b0a6-382b50e89475
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b36a6c0b-e8a7-450e-b0a6-382b50e89475
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-982832a4-f9f4-43ea-bad5-5ee2d5e9b963

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-982832a4-f9f4-43ea-bad5-5ee2d5e9b963
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-982832a4-f9f4-43ea-bad5-5ee2d5e9b963
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-80b80808-d392-444a-b89e-a8048a6c4998

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b80808-d392-444a-b89e-a8048a6c4998
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-80b80808-d392-444a-b89e-a8048a6c4998
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-2cb473e2-d1fd-4fc9-ae3a-3cfc81623830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cb473e2-d1fd-4fc9-ae3a-3cfc81623830
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cb473e2-d1fd-4fc9-ae3a-3cfc81623830
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-3be3fdd5-e2ca-4f43-9a9d-b37a173efbe6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3be3fdd5-e2ca-4f43-9a9d-b37a173efbe6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3be3fdd5-e2ca-4f43-9a9d-b37a173efbe6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b5dce45-e90c-4365-8f2f-ae25843f2c93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b5dce45-e90c-4365-8f2f-ae25843f2c93
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b5dce45-e90c-4365-8f2f-ae25843f2c93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b67fba8-af49-41c5-a05b-8a5ea9fa9af4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b67fba8-af49-41c5-a05b-8a5ea9fa9af4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b67fba8-af49-41c5-a05b-8a5ea9fa9af4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-1161fe63-8580-4373-be5f-f3a287663e18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1161fe63-8580-4373-be5f-f3a287663e18
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-1161fe63-8580-4373-be5f-f3a287663e18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c9032d0-3c97-4d5e-ae1a-2db9a9fd42c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c9032d0-3c97-4d5e-ae1a-2db9a9fd42c1
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c9032d0-3c97-4d5e-ae1a-2db9a9fd42c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-6409ed42-d85e-4392-b917-0e6d89605b05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6409ed42-d85e-4392-b917-0e6d89605b05
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6409ed42-d85e-4392-b917-0e6d89605b05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-33fbd322-3458-476d-8a1e-62107892a81d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33fbd322-3458-476d-8a1e-62107892a81d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-33fbd322-3458-476d-8a1e-62107892a81d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef7cc746-5af6-4c1c-bca2-966bb580196b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef7cc746-5af6-4c1c-bca2-966bb580196b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef7cc746-5af6-4c1c-bca2-966bb580196b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b6ba1c9-1fe7-4f7a-95ab-327f1e011539

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b6ba1c9-1fe7-4f7a-95ab-327f1e011539
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b6ba1c9-1fe7-4f7a-95ab-327f1e011539
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b042d66-8fb4-4e8f-bb8a-c8c195473196

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b042d66-8fb4-4e8f-bb8a-c8c195473196
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b042d66-8fb4-4e8f-bb8a-c8c195473196
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-229fcac6-47cf-4495-bb14-67b9e6999d03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-229fcac6-47cf-4495-bb14-67b9e6999d03
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-229fcac6-47cf-4495-bb14-67b9e6999d03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba3e2c4f-8ee4-48ee-b35c-a046a24891b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba3e2c4f-8ee4-48ee-b35c-a046a24891b8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba3e2c4f-8ee4-48ee-b35c-a046a24891b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f52ed63-b122-42a3-9114-5fd107198a71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f52ed63-b122-42a3-9114-5fd107198a71
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f52ed63-b122-42a3-9114-5fd107198a71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-382d6cdd-d8ee-4221-9aa9-5ec4000d2eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-382d6cdd-d8ee-4221-9aa9-5ec4000d2eef
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-382d6cdd-d8ee-4221-9aa9-5ec4000d2eef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-74664793-f1e2-4b32-952e-e31880b3d31a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74664793-f1e2-4b32-952e-e31880b3d31a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-74664793-f1e2-4b32-952e-e31880b3d31a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-377a9615-c341-465f-8b4a-27dccf7f741f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-377a9615-c341-465f-8b4a-27dccf7f741f
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-377a9615-c341-465f-8b4a-27dccf7f741f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4489d94-9eef-4c1d-b6b4-4507423f5702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4489d94-9eef-4c1d-b6b4-4507423f5702
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4489d94-9eef-4c1d-b6b4-4507423f5702
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-50554182-c7c8-4000-a3f6-5dd80f9069d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50554182-c7c8-4000-a3f6-5dd80f9069d1
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-50554182-c7c8-4000-a3f6-5dd80f9069d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-87dd23c3-671b-49fa-9e90-1eb012fe51db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87dd23c3-671b-49fa-9e90-1eb012fe51db
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-87dd23c3-671b-49fa-9e90-1eb012fe51db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3cc542d-4d90-4b54-9fbe-5c8fed6ba215

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3cc542d-4d90-4b54-9fbe-5c8fed6ba215
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3cc542d-4d90-4b54-9fbe-5c8fed6ba215
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-864ee9b3-e55b-462e-917f-08143d154426

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-864ee9b3-e55b-462e-917f-08143d154426
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-864ee9b3-e55b-462e-917f-08143d154426
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-104330e6-5ba3-4508-9a61-3da6b87cb820

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-104330e6-5ba3-4508-9a61-3da6b87cb820
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-104330e6-5ba3-4508-9a61-3da6b87cb820
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-b34db9a9-49f5-4c7b-afc2-979348ab0662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b34db9a9-49f5-4c7b-afc2-979348ab0662
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b34db9a9-49f5-4c7b-afc2-979348ab0662
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-a176e90d-c2cc-4009-b456-c1982dcaa764

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a176e90d-c2cc-4009-b456-c1982dcaa764
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a176e90d-c2cc-4009-b456-c1982dcaa764
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-7dc778bf-d365-488b-b83f-6b0f00c30038

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dc778bf-d365-488b-b83f-6b0f00c30038
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dc778bf-d365-488b-b83f-6b0f00c30038
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-66a4c435-374c-4f09-9bff-16b530b18968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66a4c435-374c-4f09-9bff-16b530b18968
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-66a4c435-374c-4f09-9bff-16b530b18968
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-5576b716-1492-413d-9408-3f85581f5505

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5576b716-1492-413d-9408-3f85581f5505
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5576b716-1492-413d-9408-3f85581f5505
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-2816cada-62b5-4c21-8700-04b6558a6a4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2816cada-62b5-4c21-8700-04b6558a6a4c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2816cada-62b5-4c21-8700-04b6558a6a4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1c780aa-c30a-4a8b-82e5-702bab178ebb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1c780aa-c30a-4a8b-82e5-702bab178ebb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1c780aa-c30a-4a8b-82e5-702bab178ebb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b877c75-e47f-45d8-8877-70b0823a3b5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b877c75-e47f-45d8-8877-70b0823a3b5d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b877c75-e47f-45d8-8877-70b0823a3b5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-dcae58f1-a4a6-4962-922e-43d70b2750fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcae58f1-a4a6-4962-922e-43d70b2750fd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcae58f1-a4a6-4962-922e-43d70b2750fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-194475c7-d11e-4a3d-9322-7e12a168af52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-194475c7-d11e-4a3d-9322-7e12a168af52
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-194475c7-d11e-4a3d-9322-7e12a168af52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-8da46a6c-bc2d-44ec-bbdd-9f993e28959a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8da46a6c-bc2d-44ec-bbdd-9f993e28959a
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8da46a6c-bc2d-44ec-bbdd-9f993e28959a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8da46a6c-bc2d-44ec-bbdd-9f993e28959a"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-10644574-5ba3-4dd4-9fb6-3cce558c1109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10644574-5ba3-4dd4-9fb6-3cce558c1109
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10644574-5ba3-4dd4-9fb6-3cce558c1109
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-10644574-5ba3-4dd4-9fb6-3cce558c1109"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-9326988d-6b07-4640-aad6-2fc363ea87b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9326988d-6b07-4640-aad6-2fc363ea87b4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9326988d-6b07-4640-aad6-2fc363ea87b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9326988d-6b07-4640-aad6-2fc363ea87b4"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c64eeb5-a6ef-4f35-bd47-f62d4d458b75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c64eeb5-a6ef-4f35-bd47-f62d4d458b75
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c64eeb5-a6ef-4f35-bd47-f62d4d458b75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9c64eeb5-a6ef-4f35-bd47-f62d4d458b75"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c9a1f27-bd25-4f13-8941-2bcb05335df2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c9a1f27-bd25-4f13-8941-2bcb05335df2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c9a1f27-bd25-4f13-8941-2bcb05335df2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8c9a1f27-bd25-4f13-8941-2bcb05335df2"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c10be7c-5dfa-418b-a2a9-7e3b311cb4fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c10be7c-5dfa-418b-a2a9-7e3b311cb4fc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c10be7c-5dfa-418b-a2a9-7e3b311cb4fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7c10be7c-5dfa-418b-a2a9-7e3b311cb4fc"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-31319e7b-5454-4170-b117-6aeaf7a6a1a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31319e7b-5454-4170-b117-6aeaf7a6a1a0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31319e7b-5454-4170-b117-6aeaf7a6a1a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-31319e7b-5454-4170-b117-6aeaf7a6a1a0"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-75388bbd-a432-403f-b75e-24258b52e8e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75388bbd-a432-403f-b75e-24258b52e8e8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75388bbd-a432-403f-b75e-24258b52e8e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-75388bbd-a432-403f-b75e-24258b52e8e8"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-63ea696c-6611-4629-a3a8-457332fbccbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63ea696c-6611-4629-a3a8-457332fbccbf
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63ea696c-6611-4629-a3a8-457332fbccbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-63ea696c-6611-4629-a3a8-457332fbccbf"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-58515d79-e209-4be4-adf6-708cb9b6f44b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58515d79-e209-4be4-adf6-708cb9b6f44b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58515d79-e209-4be4-adf6-708cb9b6f44b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-58515d79-e209-4be4-adf6-708cb9b6f44b"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-6678c91f-b16f-4dde-8430-8fce77fd12af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6678c91f-b16f-4dde-8430-8fce77fd12af
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6678c91f-b16f-4dde-8430-8fce77fd12af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6678c91f-b16f-4dde-8430-8fce77fd12af"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-04f878a3-af23-4a2d-bc3c-13a2ec32f3fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04f878a3-af23-4a2d-bc3c-13a2ec32f3fe
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04f878a3-af23-4a2d-bc3c-13a2ec32f3fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-04f878a3-af23-4a2d-bc3c-13a2ec32f3fe"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-82d56f12-fe46-47e0-9556-382ed15552a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82d56f12-fe46-47e0-9556-382ed15552a3
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82d56f12-fe46-47e0-9556-382ed15552a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-82d56f12-fe46-47e0-9556-382ed15552a3"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-84853a3c-f532-41d7-9819-7a9b23e4199f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84853a3c-f532-41d7-9819-7a9b23e4199f
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84853a3c-f532-41d7-9819-7a9b23e4199f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-84853a3c-f532-41d7-9819-7a9b23e4199f"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-f42dafb7-2999-47bd-8a30-12effd8b2389

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f42dafb7-2999-47bd-8a30-12effd8b2389
Content-Type: application/json

--- response: 429 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f42dafb7-2999-47bd-8a30-12effd8b2389
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f42dafb7-2999-47bd-8a30-12effd8b2389"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-98439bca-6d8f-49cf-b8c1-eb8a8a0666e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98439bca-6d8f-49cf-b8c1-eb8a8a0666e5
Content-Type: application/json

--- response: 429 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98439bca-6d8f-49cf-b8c1-eb8a8a0666e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-98439bca-6d8f-49cf-b8c1-eb8a8a0666e5"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3d0a12c-30ad-46e2-918b-65e67eaaae14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3d0a12c-30ad-46e2-918b-65e67eaaae14
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3d0a12c-30ad-46e2-918b-65e67eaaae14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c3d0a12c-30ad-46e2-918b-65e67eaaae14"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-2fc6199c-3e24-4908-998c-6a97d4e73e98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fc6199c-3e24-4908-998c-6a97d4e73e98
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fc6199c-3e24-4908-998c-6a97d4e73e98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2fc6199c-3e24-4908-998c-6a97d4e73e98"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-bce2e7de-2335-4fdf-b673-a9b2d4fff863

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bce2e7de-2335-4fdf-b673-a9b2d4fff863
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bce2e7de-2335-4fdf-b673-a9b2d4fff863
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc7192b3-291c-4397-ad37-9195180804f2","handle":"qa-5c6f533379e7","displayName":"QA 5c6f533379e7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.365735433Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-13830f5a-3e7b-49fb-b072-726475689072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13830f5a-3e7b-49fb-b072-726475689072
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-13830f5a-3e7b-49fb-b072-726475689072
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-ef7e10dc-4e97-4db0-aad9-12db8099e7e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef7e10dc-4e97-4db0-aad9-12db8099e7e3
Content-Type: application/json

--- request body ---
{"handle":"qa-5c6f533379e7","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef7e10dc-4e97-4db0-aad9-12db8099e7e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef7e10dc-4e97-4db0-aad9-12db8099e7e3"}
```
