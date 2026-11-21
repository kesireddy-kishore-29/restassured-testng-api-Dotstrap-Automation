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
| 1 | `POST /v1/accounts` | 201 | 432 | `qa-95ec1e1f-5a6b-407e-8d00-ac03b1d9f8b6` |
| 2 | `POST /v1/auth/token` | 200 | 68 | `qa-db52a98e-8584-4b30-88ab-913a22efb709` |
| 3 | `GET /v1/accounts/me` | 200 | 61 | `qa-8d4253e8-4cd5-4036-bf7a-226dfec96efd` |
| 4 | `GET /v1/accounts/me` | 200 | 23 | `qa-df4c2b8a-1874-4df6-84e8-3fab49d57d86` |
| 5 | `GET /v1/accounts/me` | 200 | 24 | `qa-fdba0ca0-4e17-416d-9c6b-46e9f92b9127` |
| 6 | `GET /v1/accounts/me` | 200 | 19 | `qa-03df3af3-58cf-4992-b33a-56d3ace24615` |
| 7 | `GET /v1/accounts/me` | 200 | 14 | `qa-206b3bdb-bdf3-42dc-82f1-1b885c5f2a95` |
| 8 | `GET /v1/accounts/me` | 200 | 20 | `qa-8c461796-b90d-4915-a0de-09a031bf04c0` |
| 9 | `GET /v1/accounts/me` | 200 | 12 | `qa-a5e0027d-8f5c-435b-b337-e8c1d3c3b8e3` |
| 10 | `GET /v1/accounts/me` | 200 | 8 | `qa-5604a4fb-9396-4da2-a95a-fbd966167fe0` |
| 11 | `GET /v1/accounts/me` | 200 | 8 | `qa-d99f31eb-77e9-44dc-8abd-817ad8cf5f64` |
| 12 | `GET /v1/accounts/me` | 200 | 7 | `qa-8bbe1edc-8dba-4f58-85a5-fbe0e853d1ef` |
| 13 | `GET /v1/accounts/me` | 200 | 14 | `qa-811e1f12-3424-4041-ad4d-39db479c00c0` |
| 14 | `GET /v1/accounts/me` | 200 | 10 | `qa-e5466105-86ae-46f2-bb3f-0da66c74c017` |
| 15 | `GET /v1/accounts/me` | 200 | 11 | `qa-6b6c3c7e-c3eb-4f19-bd48-9c95f6617c20` |
| 16 | `GET /v1/accounts/me` | 200 | 12 | `qa-0f3f7b29-a50b-41ed-9f16-0a3f738ebeae` |
| 17 | `GET /v1/accounts/me` | 200 | 12 | `qa-3e2c9559-7f11-4fd0-baad-cfb24923fd04` |
| 18 | `GET /v1/accounts/me` | 200 | 15 | `qa-492d9aaa-2f5c-45b7-b9d0-8fe43eb55243` |
| 19 | `GET /v1/accounts/me` | 200 | 13 | `qa-532eaef0-1b41-49f9-a301-232c7d6e38dc` |
| 20 | `GET /v1/accounts/me` | 200 | 12 | `qa-f02859d1-c3d9-4c02-9ae0-be89a18522ba` |
| 21 | `GET /v1/accounts/me` | 200 | 15 | `qa-9496d678-b79b-46b0-b6be-31d61f8c8a76` |
| 22 | `GET /v1/accounts/me` | 200 | 11 | `qa-a213e4bc-ad55-40ed-8d45-9e3c017cb480` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-af2049aa-c2bc-4bbe-8e31-0898a4d560db` |
| 24 | `GET /v1/accounts/me` | 200 | 9 | `qa-0ebebb17-0062-46c7-a1fe-026301528f82` |
| 25 | `GET /v1/accounts/me` | 200 | 11 | `qa-4a6c8fba-2afc-45f0-b491-87603eb77a52` |
| 26 | `GET /v1/accounts/me` | 200 | 6 | `qa-6a1409fb-8f6f-4899-a511-f9b10820851c` |
| 27 | `GET /v1/accounts/me` | 200 | 12 | `qa-b178c007-610a-42a7-b67a-3696ee869478` |
| 28 | `GET /v1/accounts/me` | 200 | 10 | `qa-9ed68f84-94d0-400a-9225-7303c3e7040b` |
| 29 | `GET /v1/accounts/me` | 200 | 8 | `qa-0a050ad5-9a97-4aed-906d-0a8a7610bea2` |
| 30 | `GET /v1/accounts/me` | 200 | 12 | `qa-d054548d-0dd6-45cc-8c02-f55b520d1ba6` |
| 31 | `GET /v1/accounts/me` | 200 | 12 | `qa-362498d2-306b-41fe-871c-470709e771cb` |
| 32 | `GET /v1/accounts/me` | 200 | 18 | `qa-7d264c0a-0b35-4b6b-8955-e524cf9c170f` |
| 33 | `GET /v1/accounts/me` | 200 | 18 | `qa-c72ee457-49d4-4754-adbe-b479baafc0b7` |
| 34 | `GET /v1/accounts/me` | 200 | 17 | `qa-4d340f48-770c-4317-9cff-40aab1a2a13c` |
| 35 | `GET /v1/accounts/me` | 200 | 13 | `qa-012a22f4-522a-4a3c-a74d-81ef8ff3167d` |
| 36 | `GET /v1/accounts/me` | 200 | 9 | `qa-01ee5912-e0e7-47fa-9d9f-a13d6a8eb001` |
| 37 | `GET /v1/accounts/me` | 200 | 5 | `qa-6df28206-27f0-4fa1-b3b1-e9550fd2ea5d` |
| 38 | `GET /v1/accounts/me` | 200 | 6 | `qa-4be7e9a8-5e7e-4913-aa3a-9412683267df` |
| 39 | `GET /v1/accounts/me` | 200 | 7 | `qa-671bb9c9-f9ab-491a-9517-bf72e2345b76` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-2aedd73c-3ddf-487b-ba5c-10103effc449` |
| 41 | `GET /v1/accounts/me` | 200 | 9 | `qa-cbd833c5-1446-48ae-a029-1243b5d7d2a8` |
| 42 | `GET /v1/accounts/me` | 200 | 5 | `qa-f8356f46-4457-4aac-b8ea-635c0631c1ab` |
| 43 | `GET /v1/accounts/me` | 200 | 6 | `qa-054bf64f-9f6c-4620-a6ec-fef97a222d2d` |
| 44 | `GET /v1/accounts/me` | 200 | 7 | `qa-6c6063d9-d270-473f-81f8-8f734c8cf367` |
| 45 | `GET /v1/accounts/me` | 200 | 7 | `qa-5a961d3c-85b7-48a5-8e85-82f0ee12ece7` |
| 46 | `GET /v1/accounts/me` | 200 | 10 | `qa-d788c799-3a13-4488-b6dd-031cc65ca900` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-d393a264-30b9-41b9-93c8-d6b417026240` |
| 48 | `GET /v1/accounts/me` | 200 | 18 | `qa-a25438b8-56bd-4ad7-bd58-57e43e77e759` |
| 49 | `GET /v1/accounts/me` | 200 | 11 | `qa-3181f6cf-3ebd-4ece-a93b-5d36a6f1267a` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-f451d042-7147-4989-affe-cbe882928088` |
| 51 | `GET /v1/accounts/me` | 200 | 10 | `qa-577eca88-8d5d-4e69-aa46-25bae51e76eb` |
| 52 | `GET /v1/accounts/me` | 200 | 8 | `qa-2375b154-a4c8-415f-a994-b4b147a038f0` |
| 53 | `GET /v1/accounts/me` | 200 | 10 | `qa-04aabeed-a745-4c4d-93d4-ea501844bc95` |
| 54 | `GET /v1/accounts/me` | 200 | 7 | `qa-02319eaf-af11-4644-a2cf-21bc584578da` |
| 55 | `GET /v1/accounts/me` | 200 | 6 | `qa-ddc7caea-1b6b-484d-984d-e249a7cf9cb4` |
| 56 | `GET /v1/accounts/me` | 200 | 8 | `qa-31c9ba42-ef45-4a40-b1fe-3c55bbb8df0a` |
| 57 | `GET /v1/accounts/me` | 200 | 7 | `qa-6b53143e-4e27-46f4-a36b-1c2f9150d3c9` |
| 58 | `GET /v1/accounts/me` | 200 | 5 | `qa-d4c7e000-7d24-4ca2-9ab2-5ec2691598c3` |
| 59 | `GET /v1/accounts/me` | 200 | 6 | `qa-d0ba39f6-5c0b-4986-b8d2-c81d62bc6b41` |
| 60 | `GET /v1/accounts/me` | 200 | 7 | `qa-745b3c7a-0ed8-4a8a-a915-48592fc0a72c` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-848f6657-ce68-4812-933a-64763b0c6320` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-53c012d9-0275-4af8-a0b3-25a2b7497b6f` |
| 63 | `GET /v1/accounts/me` | 429 | 6 | `qa-a3745a1c-28e4-42ea-88d4-e2ef7ac85601` |
| 64 | `GET /v1/accounts/me` | 429 | 7 | `qa-19114743-6ff6-44b3-a53a-48f53a4f23a1` |
| 65 | `GET /v1/accounts/me` | 429 | 6 | `qa-a46f41b2-f99c-48b7-b546-80c194db17e4` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-b2bd165b-ad98-470f-8df2-a10cee89bceb` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-6b0cd846-ccbc-4453-a589-65b719f44caa` |
| 68 | `GET /v1/accounts/me` | 429 | 5 | `qa-38dc66df-6bd8-4f16-969d-7dddbfce212a` |
| 69 | `GET /v1/accounts/me` | 429 | 5 | `qa-2a9d0deb-b2ae-4d13-90e4-1d63787f742d` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-d532fa52-b245-4860-844b-9c7a2e2f4a8a` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-0ac31e3d-57d5-4a65-a6c9-1d913d1ad0c6` |
| 72 | `GET /v1/accounts/me` | 429 | 5 | `qa-7c36988e-1690-44a1-bd88-d6042c6099eb` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-2eadaefa-70af-4c82-ab30-dc3ae74651d7` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-86406dc6-7a77-4534-ab3a-263f74ba3a2c` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-375be061-a5e3-48a3-b281-9211c03d708e` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-302fb05f-3acb-482f-9dab-3dbeadbff0b0` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-51e57450-b320-4796-ba54-6788f69dae5a` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-b8c0d5bb-45ed-4d54-be6a-f1a92bc660fd` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-7e68bacd-d660-401e-8d8d-554e7ad272fa` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-f1cb2ed4-de83-4fb5-9389-ab72b8ddb2de` |
| 81 | `GET /v1/accounts/me` | 200 | 5 | `qa-618ca62a-221d-41d6-8647-1315914f8a30` |
| 82 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0ad6d07b-b370-418d-8dd9-f18d6648b1e4` |
| 83 | `POST /v1/auth/token` | 401 | 3 | `qa-fa81b6dc-d6ba-4e0c-9c42-224dee32451e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-95ec1e1f-5a6b-407e-8d00-ac03b1d9f8b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95ec1e1f-5a6b-407e-8d00-ac03b1d9f8b6
Content-Type: application/json

--- request body ---
{"handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","password":"****","region":"eu"}

--- response: 201 in 432 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-95ec1e1f-5a6b-407e-8d00-ac03b1d9f8b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-9049877c9ccd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-db52a98e-8584-4b30-88ab-913a22efb709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db52a98e-8584-4b30-88ab-913a22efb709
Content-Type: application/json

--- request body ---
{"handle":"qa-9049877c9ccd","password":"****"}

--- response: 200 in 68 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-db52a98e-8584-4b30-88ab-913a22efb709
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d4253e8-4cd5-4036-bf7a-226dfec96efd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d4253e8-4cd5-4036-bf7a-226dfec96efd
Content-Type: application/json

--- response: 200 in 61 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d4253e8-4cd5-4036-bf7a-226dfec96efd
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-df4c2b8a-1874-4df6-84e8-3fab49d57d86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df4c2b8a-1874-4df6-84e8-3fab49d57d86
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-df4c2b8a-1874-4df6-84e8-3fab49d57d86
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-fdba0ca0-4e17-416d-9c6b-46e9f92b9127

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdba0ca0-4e17-416d-9c6b-46e9f92b9127
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdba0ca0-4e17-416d-9c6b-46e9f92b9127
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-03df3af3-58cf-4992-b33a-56d3ace24615

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03df3af3-58cf-4992-b33a-56d3ace24615
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-03df3af3-58cf-4992-b33a-56d3ace24615
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-206b3bdb-bdf3-42dc-82f1-1b885c5f2a95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-206b3bdb-bdf3-42dc-82f1-1b885c5f2a95
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-206b3bdb-bdf3-42dc-82f1-1b885c5f2a95
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c461796-b90d-4915-a0de-09a031bf04c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c461796-b90d-4915-a0de-09a031bf04c0
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c461796-b90d-4915-a0de-09a031bf04c0
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-a5e0027d-8f5c-435b-b337-e8c1d3c3b8e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5e0027d-8f5c-435b-b337-e8c1d3c3b8e3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5e0027d-8f5c-435b-b337-e8c1d3c3b8e3
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-5604a4fb-9396-4da2-a95a-fbd966167fe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5604a4fb-9396-4da2-a95a-fbd966167fe0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5604a4fb-9396-4da2-a95a-fbd966167fe0
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-d99f31eb-77e9-44dc-8abd-817ad8cf5f64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d99f31eb-77e9-44dc-8abd-817ad8cf5f64
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d99f31eb-77e9-44dc-8abd-817ad8cf5f64
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-8bbe1edc-8dba-4f58-85a5-fbe0e853d1ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bbe1edc-8dba-4f58-85a5-fbe0e853d1ef
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bbe1edc-8dba-4f58-85a5-fbe0e853d1ef
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-811e1f12-3424-4041-ad4d-39db479c00c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-811e1f12-3424-4041-ad4d-39db479c00c0
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-811e1f12-3424-4041-ad4d-39db479c00c0
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5466105-86ae-46f2-bb3f-0da66c74c017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5466105-86ae-46f2-bb3f-0da66c74c017
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5466105-86ae-46f2-bb3f-0da66c74c017
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b6c3c7e-c3eb-4f19-bd48-9c95f6617c20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b6c3c7e-c3eb-4f19-bd48-9c95f6617c20
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b6c3c7e-c3eb-4f19-bd48-9c95f6617c20
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f3f7b29-a50b-41ed-9f16-0a3f738ebeae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f3f7b29-a50b-41ed-9f16-0a3f738ebeae
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f3f7b29-a50b-41ed-9f16-0a3f738ebeae
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e2c9559-7f11-4fd0-baad-cfb24923fd04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e2c9559-7f11-4fd0-baad-cfb24923fd04
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e2c9559-7f11-4fd0-baad-cfb24923fd04
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-492d9aaa-2f5c-45b7-b9d0-8fe43eb55243

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-492d9aaa-2f5c-45b7-b9d0-8fe43eb55243
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-492d9aaa-2f5c-45b7-b9d0-8fe43eb55243
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-532eaef0-1b41-49f9-a301-232c7d6e38dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-532eaef0-1b41-49f9-a301-232c7d6e38dc
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-532eaef0-1b41-49f9-a301-232c7d6e38dc
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-f02859d1-c3d9-4c02-9ae0-be89a18522ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f02859d1-c3d9-4c02-9ae0-be89a18522ba
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f02859d1-c3d9-4c02-9ae0-be89a18522ba
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-9496d678-b79b-46b0-b6be-31d61f8c8a76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9496d678-b79b-46b0-b6be-31d61f8c8a76
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9496d678-b79b-46b0-b6be-31d61f8c8a76
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-a213e4bc-ad55-40ed-8d45-9e3c017cb480

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a213e4bc-ad55-40ed-8d45-9e3c017cb480
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a213e4bc-ad55-40ed-8d45-9e3c017cb480
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-af2049aa-c2bc-4bbe-8e31-0898a4d560db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af2049aa-c2bc-4bbe-8e31-0898a4d560db
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-af2049aa-c2bc-4bbe-8e31-0898a4d560db
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ebebb17-0062-46c7-a1fe-026301528f82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ebebb17-0062-46c7-a1fe-026301528f82
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ebebb17-0062-46c7-a1fe-026301528f82
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-4a6c8fba-2afc-45f0-b491-87603eb77a52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a6c8fba-2afc-45f0-b491-87603eb77a52
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a6c8fba-2afc-45f0-b491-87603eb77a52
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a1409fb-8f6f-4899-a511-f9b10820851c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a1409fb-8f6f-4899-a511-f9b10820851c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a1409fb-8f6f-4899-a511-f9b10820851c
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-b178c007-610a-42a7-b67a-3696ee869478

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b178c007-610a-42a7-b67a-3696ee869478
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b178c007-610a-42a7-b67a-3696ee869478
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ed68f84-94d0-400a-9225-7303c3e7040b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ed68f84-94d0-400a-9225-7303c3e7040b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ed68f84-94d0-400a-9225-7303c3e7040b
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a050ad5-9a97-4aed-906d-0a8a7610bea2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a050ad5-9a97-4aed-906d-0a8a7610bea2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a050ad5-9a97-4aed-906d-0a8a7610bea2
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-d054548d-0dd6-45cc-8c02-f55b520d1ba6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d054548d-0dd6-45cc-8c02-f55b520d1ba6
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d054548d-0dd6-45cc-8c02-f55b520d1ba6
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-362498d2-306b-41fe-871c-470709e771cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-362498d2-306b-41fe-871c-470709e771cb
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-362498d2-306b-41fe-871c-470709e771cb
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d264c0a-0b35-4b6b-8955-e524cf9c170f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d264c0a-0b35-4b6b-8955-e524cf9c170f
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d264c0a-0b35-4b6b-8955-e524cf9c170f
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-c72ee457-49d4-4754-adbe-b479baafc0b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c72ee457-49d4-4754-adbe-b479baafc0b7
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-c72ee457-49d4-4754-adbe-b479baafc0b7
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d340f48-770c-4317-9cff-40aab1a2a13c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d340f48-770c-4317-9cff-40aab1a2a13c
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d340f48-770c-4317-9cff-40aab1a2a13c
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-012a22f4-522a-4a3c-a74d-81ef8ff3167d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-012a22f4-522a-4a3c-a74d-81ef8ff3167d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-012a22f4-522a-4a3c-a74d-81ef8ff3167d
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-01ee5912-e0e7-47fa-9d9f-a13d6a8eb001

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01ee5912-e0e7-47fa-9d9f-a13d6a8eb001
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-01ee5912-e0e7-47fa-9d9f-a13d6a8eb001
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-6df28206-27f0-4fa1-b3b1-e9550fd2ea5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6df28206-27f0-4fa1-b3b1-e9550fd2ea5d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6df28206-27f0-4fa1-b3b1-e9550fd2ea5d
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-4be7e9a8-5e7e-4913-aa3a-9412683267df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4be7e9a8-5e7e-4913-aa3a-9412683267df
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4be7e9a8-5e7e-4913-aa3a-9412683267df
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-671bb9c9-f9ab-491a-9517-bf72e2345b76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-671bb9c9-f9ab-491a-9517-bf72e2345b76
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-671bb9c9-f9ab-491a-9517-bf72e2345b76
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-2aedd73c-3ddf-487b-ba5c-10103effc449

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aedd73c-3ddf-487b-ba5c-10103effc449
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aedd73c-3ddf-487b-ba5c-10103effc449
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-cbd833c5-1446-48ae-a029-1243b5d7d2a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbd833c5-1446-48ae-a029-1243b5d7d2a8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbd833c5-1446-48ae-a029-1243b5d7d2a8
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8356f46-4457-4aac-b8ea-635c0631c1ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8356f46-4457-4aac-b8ea-635c0631c1ab
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8356f46-4457-4aac-b8ea-635c0631c1ab
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-054bf64f-9f6c-4620-a6ec-fef97a222d2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-054bf64f-9f6c-4620-a6ec-fef97a222d2d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-054bf64f-9f6c-4620-a6ec-fef97a222d2d
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c6063d9-d270-473f-81f8-8f734c8cf367

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c6063d9-d270-473f-81f8-8f734c8cf367
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c6063d9-d270-473f-81f8-8f734c8cf367
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a961d3c-85b7-48a5-8e85-82f0ee12ece7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a961d3c-85b7-48a5-8e85-82f0ee12ece7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a961d3c-85b7-48a5-8e85-82f0ee12ece7
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-d788c799-3a13-4488-b6dd-031cc65ca900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d788c799-3a13-4488-b6dd-031cc65ca900
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d788c799-3a13-4488-b6dd-031cc65ca900
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-d393a264-30b9-41b9-93c8-d6b417026240

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d393a264-30b9-41b9-93c8-d6b417026240
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d393a264-30b9-41b9-93c8-d6b417026240
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-a25438b8-56bd-4ad7-bd58-57e43e77e759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a25438b8-56bd-4ad7-bd58-57e43e77e759
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a25438b8-56bd-4ad7-bd58-57e43e77e759
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-3181f6cf-3ebd-4ece-a93b-5d36a6f1267a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3181f6cf-3ebd-4ece-a93b-5d36a6f1267a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3181f6cf-3ebd-4ece-a93b-5d36a6f1267a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-f451d042-7147-4989-affe-cbe882928088

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f451d042-7147-4989-affe-cbe882928088
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f451d042-7147-4989-affe-cbe882928088
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-577eca88-8d5d-4e69-aa46-25bae51e76eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-577eca88-8d5d-4e69-aa46-25bae51e76eb
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-577eca88-8d5d-4e69-aa46-25bae51e76eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-2375b154-a4c8-415f-a994-b4b147a038f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2375b154-a4c8-415f-a994-b4b147a038f0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2375b154-a4c8-415f-a994-b4b147a038f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-04aabeed-a745-4c4d-93d4-ea501844bc95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04aabeed-a745-4c4d-93d4-ea501844bc95
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-04aabeed-a745-4c4d-93d4-ea501844bc95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-02319eaf-af11-4644-a2cf-21bc584578da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02319eaf-af11-4644-a2cf-21bc584578da
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-02319eaf-af11-4644-a2cf-21bc584578da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-ddc7caea-1b6b-484d-984d-e249a7cf9cb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddc7caea-1b6b-484d-984d-e249a7cf9cb4
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddc7caea-1b6b-484d-984d-e249a7cf9cb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-31c9ba42-ef45-4a40-b1fe-3c55bbb8df0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31c9ba42-ef45-4a40-b1fe-3c55bbb8df0a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-31c9ba42-ef45-4a40-b1fe-3c55bbb8df0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b53143e-4e27-46f4-a36b-1c2f9150d3c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b53143e-4e27-46f4-a36b-1c2f9150d3c9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b53143e-4e27-46f4-a36b-1c2f9150d3c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4c7e000-7d24-4ca2-9ab2-5ec2691598c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4c7e000-7d24-4ca2-9ab2-5ec2691598c3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4c7e000-7d24-4ca2-9ab2-5ec2691598c3
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0ba39f6-5c0b-4986-b8d2-c81d62bc6b41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0ba39f6-5c0b-4986-b8d2-c81d62bc6b41
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0ba39f6-5c0b-4986-b8d2-c81d62bc6b41
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-745b3c7a-0ed8-4a8a-a915-48592fc0a72c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-745b3c7a-0ed8-4a8a-a915-48592fc0a72c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-745b3c7a-0ed8-4a8a-a915-48592fc0a72c
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-848f6657-ce68-4812-933a-64763b0c6320

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-848f6657-ce68-4812-933a-64763b0c6320
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-848f6657-ce68-4812-933a-64763b0c6320
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-53c012d9-0275-4af8-a0b3-25a2b7497b6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53c012d9-0275-4af8-a0b3-25a2b7497b6f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-53c012d9-0275-4af8-a0b3-25a2b7497b6f
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3745a1c-28e4-42ea-88d4-e2ef7ac85601

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3745a1c-28e4-42ea-88d4-e2ef7ac85601
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3745a1c-28e4-42ea-88d4-e2ef7ac85601
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a3745a1c-28e4-42ea-88d4-e2ef7ac85601"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-19114743-6ff6-44b3-a53a-48f53a4f23a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19114743-6ff6-44b3-a53a-48f53a4f23a1
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19114743-6ff6-44b3-a53a-48f53a4f23a1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-19114743-6ff6-44b3-a53a-48f53a4f23a1"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-a46f41b2-f99c-48b7-b546-80c194db17e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a46f41b2-f99c-48b7-b546-80c194db17e4
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a46f41b2-f99c-48b7-b546-80c194db17e4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a46f41b2-f99c-48b7-b546-80c194db17e4"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2bd165b-ad98-470f-8df2-a10cee89bceb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2bd165b-ad98-470f-8df2-a10cee89bceb
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2bd165b-ad98-470f-8df2-a10cee89bceb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b2bd165b-ad98-470f-8df2-a10cee89bceb"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b0cd846-ccbc-4453-a589-65b719f44caa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b0cd846-ccbc-4453-a589-65b719f44caa
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b0cd846-ccbc-4453-a589-65b719f44caa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6b0cd846-ccbc-4453-a589-65b719f44caa"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-38dc66df-6bd8-4f16-969d-7dddbfce212a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38dc66df-6bd8-4f16-969d-7dddbfce212a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38dc66df-6bd8-4f16-969d-7dddbfce212a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-38dc66df-6bd8-4f16-969d-7dddbfce212a"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a9d0deb-b2ae-4d13-90e4-1d63787f742d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a9d0deb-b2ae-4d13-90e4-1d63787f742d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a9d0deb-b2ae-4d13-90e4-1d63787f742d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2a9d0deb-b2ae-4d13-90e4-1d63787f742d"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-d532fa52-b245-4860-844b-9c7a2e2f4a8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d532fa52-b245-4860-844b-9c7a2e2f4a8a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d532fa52-b245-4860-844b-9c7a2e2f4a8a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d532fa52-b245-4860-844b-9c7a2e2f4a8a"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ac31e3d-57d5-4a65-a6c9-1d913d1ad0c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ac31e3d-57d5-4a65-a6c9-1d913d1ad0c6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ac31e3d-57d5-4a65-a6c9-1d913d1ad0c6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0ac31e3d-57d5-4a65-a6c9-1d913d1ad0c6"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c36988e-1690-44a1-bd88-d6042c6099eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c36988e-1690-44a1-bd88-d6042c6099eb
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c36988e-1690-44a1-bd88-d6042c6099eb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7c36988e-1690-44a1-bd88-d6042c6099eb"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-2eadaefa-70af-4c82-ab30-dc3ae74651d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eadaefa-70af-4c82-ab30-dc3ae74651d7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2eadaefa-70af-4c82-ab30-dc3ae74651d7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2eadaefa-70af-4c82-ab30-dc3ae74651d7"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-86406dc6-7a77-4534-ab3a-263f74ba3a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86406dc6-7a77-4534-ab3a-263f74ba3a2c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86406dc6-7a77-4534-ab3a-263f74ba3a2c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-86406dc6-7a77-4534-ab3a-263f74ba3a2c"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-375be061-a5e3-48a3-b281-9211c03d708e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-375be061-a5e3-48a3-b281-9211c03d708e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-375be061-a5e3-48a3-b281-9211c03d708e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-375be061-a5e3-48a3-b281-9211c03d708e"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-302fb05f-3acb-482f-9dab-3dbeadbff0b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-302fb05f-3acb-482f-9dab-3dbeadbff0b0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-302fb05f-3acb-482f-9dab-3dbeadbff0b0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-302fb05f-3acb-482f-9dab-3dbeadbff0b0"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-51e57450-b320-4796-ba54-6788f69dae5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51e57450-b320-4796-ba54-6788f69dae5a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51e57450-b320-4796-ba54-6788f69dae5a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-51e57450-b320-4796-ba54-6788f69dae5a"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8c0d5bb-45ed-4d54-be6a-f1a92bc660fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8c0d5bb-45ed-4d54-be6a-f1a92bc660fd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8c0d5bb-45ed-4d54-be6a-f1a92bc660fd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b8c0d5bb-45ed-4d54-be6a-f1a92bc660fd"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e68bacd-d660-401e-8d8d-554e7ad272fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e68bacd-d660-401e-8d8d-554e7ad272fa
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e68bacd-d660-401e-8d8d-554e7ad272fa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7e68bacd-d660-401e-8d8d-554e7ad272fa"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1cb2ed4-de83-4fb5-9389-ab72b8ddb2de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1cb2ed4-de83-4fb5-9389-ab72b8ddb2de
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1cb2ed4-de83-4fb5-9389-ab72b8ddb2de
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f1cb2ed4-de83-4fb5-9389-ab72b8ddb2de"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-618ca62a-221d-41d6-8647-1315914f8a30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-618ca62a-221d-41d6-8647-1315914f8a30
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-618ca62a-221d-41d6-8647-1315914f8a30
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

{"id":"acc_b1c52120-8306-4ab9-9202-abd17cca5dad","handle":"qa-9049877c9ccd","displayName":"QA 9049877c9ccd","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322122053Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ad6d07b-b370-418d-8dd9-f18d6648b1e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ad6d07b-b370-418d-8dd9-f18d6648b1e4
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ad6d07b-b370-418d-8dd9-f18d6648b1e4
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
correlation: qa-fa81b6dc-d6ba-4e0c-9c42-224dee32451e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa81b6dc-d6ba-4e0c-9c42-224dee32451e
Content-Type: application/json

--- request body ---
{"handle":"qa-9049877c9ccd","password":"****"}

--- response: 401 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa81b6dc-d6ba-4e0c-9c42-224dee32451e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa81b6dc-d6ba-4e0c-9c42-224dee32451e"}
```
