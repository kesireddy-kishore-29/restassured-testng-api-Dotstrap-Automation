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
| 1 | `POST /v1/accounts` | 201 | 359 | `qa-0d8fbef1-8057-46e6-9773-964283d0b3f6` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-99640935-dc32-474f-aab4-bded444c0c94` |
| 3 | `GET /v1/accounts/me` | 200 | 27 | `qa-51967582-824a-41a0-ae02-c9f4249f4d67` |
| 4 | `GET /v1/accounts/me` | 200 | 12 | `qa-de93b1b4-44dc-4baa-83fd-48c664b8c7fa` |
| 5 | `GET /v1/accounts/me` | 200 | 16 | `qa-4c9eb510-7245-49ab-8321-2918416eff4a` |
| 6 | `GET /v1/accounts/me` | 200 | 12 | `qa-6056de45-ab5c-4425-a5c5-6ad6fb5af40e` |
| 7 | `GET /v1/accounts/me` | 200 | 13 | `qa-76bb1bd5-4a23-4cea-aced-c9673420644e` |
| 8 | `GET /v1/accounts/me` | 200 | 13 | `qa-3425287c-5f46-4e1d-a6f1-b69e54af6b86` |
| 9 | `GET /v1/accounts/me` | 200 | 21 | `qa-55e0805a-95fd-43d0-b36c-64a5c0795e60` |
| 10 | `GET /v1/accounts/me` | 200 | 15 | `qa-c8f6a532-6a5d-4d4e-b3a3-d62103bf5a2c` |
| 11 | `GET /v1/accounts/me` | 200 | 7 | `qa-203a6902-b3d0-4266-998d-ef350bdee0e9` |
| 12 | `GET /v1/accounts/me` | 200 | 7 | `qa-cdfe5ca7-4f8d-4fc5-8a22-4687ae050a11` |
| 13 | `GET /v1/accounts/me` | 200 | 11 | `qa-9316f30c-1296-4c5b-b672-46380dbe7920` |
| 14 | `GET /v1/accounts/me` | 200 | 11 | `qa-ca6bbfbf-ec57-4d65-85c5-178e3caeb84b` |
| 15 | `GET /v1/accounts/me` | 200 | 12 | `qa-534ce291-9928-4108-b00f-a042a715530a` |
| 16 | `GET /v1/accounts/me` | 200 | 11 | `qa-f0d68c79-8327-44f9-a170-8bd3ba620bb1` |
| 17 | `GET /v1/accounts/me` | 200 | 12 | `qa-a1dc108f-62d5-42da-a496-a4ca45209077` |
| 18 | `GET /v1/accounts/me` | 200 | 9 | `qa-b55dc994-ae1e-4220-8be7-b8f4ab48523a` |
| 19 | `GET /v1/accounts/me` | 200 | 5 | `qa-cd2c1197-4fbb-4bcd-bef5-4535cd1725b9` |
| 20 | `GET /v1/accounts/me` | 200 | 8 | `qa-d027c966-ef8a-4303-bd52-eb15cdb00344` |
| 21 | `GET /v1/accounts/me` | 200 | 7 | `qa-18a4f616-947b-44c6-9ca8-38a72531c108` |
| 22 | `GET /v1/accounts/me` | 200 | 5 | `qa-5c25d588-de1e-4a11-b3c5-61c47c2c70db` |
| 23 | `GET /v1/accounts/me` | 200 | 7 | `qa-8b11cb12-04d5-4bb7-a3fb-494d37d3432d` |
| 24 | `GET /v1/accounts/me` | 200 | 9 | `qa-fe993e99-9bd8-40df-b5e0-17c8f2b314f6` |
| 25 | `GET /v1/accounts/me` | 200 | 13 | `qa-5aea7194-98e5-4084-a707-e07078b1426e` |
| 26 | `GET /v1/accounts/me` | 200 | 7 | `qa-68810ce1-43e9-4522-ad8b-e9846fd38d2b` |
| 27 | `GET /v1/accounts/me` | 200 | 4 | `qa-d2fc418a-2979-4fe8-a3d5-e7a406593d88` |
| 28 | `GET /v1/accounts/me` | 200 | 8 | `qa-657245ab-d9fb-4b3e-bd5e-6aec6b1be006` |
| 29 | `GET /v1/accounts/me` | 200 | 7 | `qa-2d5c929d-7547-4959-bff9-517604975b21` |
| 30 | `GET /v1/accounts/me` | 200 | 9 | `qa-694e80d4-5f29-4801-85cd-7ff54342895f` |
| 31 | `GET /v1/accounts/me` | 200 | 5 | `qa-1c9bee0d-753b-48c5-9a59-d1e13daa1962` |
| 32 | `GET /v1/accounts/me` | 200 | 5 | `qa-73e3d530-9707-474e-a450-a98d1b1a5191` |
| 33 | `GET /v1/accounts/me` | 200 | 5 | `qa-fe33f732-d93e-4e76-969a-660ac4dd2c35` |
| 34 | `GET /v1/accounts/me` | 200 | 5 | `qa-40d3b4e8-9db6-4d39-b171-4a5f33735794` |
| 35 | `GET /v1/accounts/me` | 200 | 6 | `qa-129b4258-eab7-44cb-ae79-8182bfe787a9` |
| 36 | `GET /v1/accounts/me` | 200 | 4 | `qa-8c5737fe-2608-4f6e-aed9-a139bf4cb077` |
| 37 | `GET /v1/accounts/me` | 200 | 10 | `qa-1b0c74eb-77b2-4814-86cb-f987c31550c7` |
| 38 | `GET /v1/accounts/me` | 200 | 8 | `qa-2ea3d384-94bd-4b86-977d-f13eb7d9e8ea` |
| 39 | `GET /v1/accounts/me` | 200 | 5 | `qa-2ff88a00-6b93-4b67-955d-102eecba1ba4` |
| 40 | `GET /v1/accounts/me` | 200 | 14 | `qa-d5010499-47cd-48ed-91ae-d86a887a9839` |
| 41 | `GET /v1/accounts/me` | 200 | 5 | `qa-5c42352b-2906-49c4-8819-0e3b91c30a4d` |
| 42 | `GET /v1/accounts/me` | 200 | 6 | `qa-6520359f-48d6-451c-85dc-2296c3e4ad5c` |
| 43 | `GET /v1/accounts/me` | 200 | 4 | `qa-26681384-0427-4d46-9a84-d9b763456cdd` |
| 44 | `GET /v1/accounts/me` | 200 | 4 | `qa-d4db35c6-fb1a-47a1-ae7b-aede584732a5` |
| 45 | `GET /v1/accounts/me` | 200 | 4 | `qa-b097ab49-c448-412a-a887-8b66d8741dba` |
| 46 | `GET /v1/accounts/me` | 200 | 4 | `qa-206bc991-5093-44ab-ab77-e4fc82b01aca` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-bcbb5bc1-7389-46b8-a0e3-d8f969008ef6` |
| 48 | `GET /v1/accounts/me` | 200 | 4 | `qa-5be34b9e-4883-4547-a097-04b53a938fc8` |
| 49 | `GET /v1/accounts/me` | 200 | 4 | `qa-56d30316-ad20-4e6c-932c-d52d59a2e16a` |
| 50 | `GET /v1/accounts/me` | 200 | 4 | `qa-5636b37d-034c-422a-a54a-1d03ada748c7` |
| 51 | `GET /v1/accounts/me` | 200 | 3 | `qa-cddf2b70-32d4-4a02-9e2c-8b2fc53c3763` |
| 52 | `GET /v1/accounts/me` | 200 | 4 | `qa-ff9b337c-148d-4801-8093-11767ad211b7` |
| 53 | `GET /v1/accounts/me` | 200 | 4 | `qa-d6ed4d19-950b-42dd-84eb-cc4f0ff8cdc4` |
| 54 | `GET /v1/accounts/me` | 200 | 4 | `qa-d8feefbe-4a08-4a10-9a4b-bb6a355fe080` |
| 55 | `GET /v1/accounts/me` | 200 | 13 | `qa-8b340108-b3f3-45a5-ad8d-137dcb7b4659` |
| 56 | `GET /v1/accounts/me` | 200 | 7 | `qa-f5df7152-949f-4eec-85c6-88b11a994aba` |
| 57 | `GET /v1/accounts/me` | 200 | 8 | `qa-ad5d2da7-ac86-4e00-a451-71f2d75feb21` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-d679534a-f269-47bb-a2e3-88b00c7d1581` |
| 59 | `GET /v1/accounts/me` | 200 | 4 | `qa-0187d8e8-c72d-467d-8e3f-fe30c963e15c` |
| 60 | `GET /v1/accounts/me` | 200 | 5 | `qa-1f6a5a7e-2fd9-46d7-85fb-217fc11230f0` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-7cbf8bd1-6131-4475-b52d-619549a954dc` |
| 62 | `GET /v1/accounts/me` | 200 | 8 | `qa-105f7fc3-0cc8-454f-9d6c-a86999af1511` |
| 63 | `GET /v1/accounts/me` | 429 | 8 | `qa-f1bf2b2b-6806-4f42-91b3-543dab9fb2a2` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-09ffdd49-b90a-4800-bdc2-afa93e2962db` |
| 65 | `GET /v1/accounts/me` | 429 | 4 | `qa-8256f1ef-f5f6-48f7-b583-9e357220d8ac` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-0f47ca43-36d1-491c-8bc8-dadbc955b40b` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-3f12fec3-ff2a-4796-860f-488a4d97aaa0` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-c00e4222-6bef-43b8-a8c0-b90f4adf0dfd` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-8e2da1c3-1cb3-4a2c-84f5-c18714b369c5` |
| 70 | `GET /v1/accounts/me` | 429 | 3 | `qa-edd42673-64cf-486f-bc6b-4165450c7dc9` |
| 71 | `GET /v1/accounts/me` | 429 | 5 | `qa-d31076f9-007f-46df-bf90-919a04451d71` |
| 72 | `GET /v1/accounts/me` | 429 | 3 | `qa-bf88a39d-8a8b-42ff-80a1-f3a7aa19a091` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-093c6275-7bfe-40c2-9e16-c71b95dddc08` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-656f0795-6891-486e-8860-f8f0024e091b` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-d4870679-6628-4faf-a1fa-853a0c432168` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-dae85a45-706b-4fc2-8f01-3426fece4e46` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-34b5ea8c-1abd-4519-8502-c8aeb40befe7` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-e9d3eac8-7e85-43fb-aeda-7fc5c8d950bd` |
| 79 | `GET /v1/accounts/me` | 429 | 3 | `qa-667bb89a-d219-4c0d-8cff-f8607f0ca71b` |
| 80 | `GET /v1/accounts/me` | 429 | 3 | `qa-35c39ef2-67c5-4011-98d8-74c2dad2bd5c` |
| 81 | `GET /v1/accounts/me` | 200 | 3 | `qa-a7760fc5-1da7-4fbd-a5bd-f6b6bf324905` |
| 82 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-bac1e1b2-8d02-4dd3-bdff-4a4c09a3cdaa` |
| 83 | `POST /v1/auth/token` | 401 | 3 | `qa-2e7585eb-2a56-4d94-9d8d-22f0d9c2eb15` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d8fbef1-8057-46e6-9773-964283d0b3f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d8fbef1-8057-46e6-9773-964283d0b3f6
Content-Type: application/json

--- request body ---
{"handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","password":"****","region":"eu"}

--- response: 201 in 359 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d8fbef1-8057-46e6-9773-964283d0b3f6
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
Location: /v1/accounts/qa-64d5e751d368
X-Served-Region: eu
Content-Length: 181

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-99640935-dc32-474f-aab4-bded444c0c94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99640935-dc32-474f-aab4-bded444c0c94
Content-Type: application/json

--- request body ---
{"handle":"qa-64d5e751d368","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-99640935-dc32-474f-aab4-bded444c0c94
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-51967582-824a-41a0-ae02-c9f4249f4d67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51967582-824a-41a0-ae02-c9f4249f4d67
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-51967582-824a-41a0-ae02-c9f4249f4d67
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-de93b1b4-44dc-4baa-83fd-48c664b8c7fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de93b1b4-44dc-4baa-83fd-48c664b8c7fa
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-de93b1b4-44dc-4baa-83fd-48c664b8c7fa
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c9eb510-7245-49ab-8321-2918416eff4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c9eb510-7245-49ab-8321-2918416eff4a
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c9eb510-7245-49ab-8321-2918416eff4a
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-6056de45-ab5c-4425-a5c5-6ad6fb5af40e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6056de45-ab5c-4425-a5c5-6ad6fb5af40e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6056de45-ab5c-4425-a5c5-6ad6fb5af40e
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-76bb1bd5-4a23-4cea-aced-c9673420644e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76bb1bd5-4a23-4cea-aced-c9673420644e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-76bb1bd5-4a23-4cea-aced-c9673420644e
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-3425287c-5f46-4e1d-a6f1-b69e54af6b86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3425287c-5f46-4e1d-a6f1-b69e54af6b86
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-3425287c-5f46-4e1d-a6f1-b69e54af6b86
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-55e0805a-95fd-43d0-b36c-64a5c0795e60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55e0805a-95fd-43d0-b36c-64a5c0795e60
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-55e0805a-95fd-43d0-b36c-64a5c0795e60
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8f6a532-6a5d-4d4e-b3a3-d62103bf5a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8f6a532-6a5d-4d4e-b3a3-d62103bf5a2c
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8f6a532-6a5d-4d4e-b3a3-d62103bf5a2c
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-203a6902-b3d0-4266-998d-ef350bdee0e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-203a6902-b3d0-4266-998d-ef350bdee0e9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-203a6902-b3d0-4266-998d-ef350bdee0e9
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-cdfe5ca7-4f8d-4fc5-8a22-4687ae050a11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdfe5ca7-4f8d-4fc5-8a22-4687ae050a11
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdfe5ca7-4f8d-4fc5-8a22-4687ae050a11
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-9316f30c-1296-4c5b-b672-46380dbe7920

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9316f30c-1296-4c5b-b672-46380dbe7920
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9316f30c-1296-4c5b-b672-46380dbe7920
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-ca6bbfbf-ec57-4d65-85c5-178e3caeb84b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca6bbfbf-ec57-4d65-85c5-178e3caeb84b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca6bbfbf-ec57-4d65-85c5-178e3caeb84b
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-534ce291-9928-4108-b00f-a042a715530a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-534ce291-9928-4108-b00f-a042a715530a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-534ce291-9928-4108-b00f-a042a715530a
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0d68c79-8327-44f9-a170-8bd3ba620bb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0d68c79-8327-44f9-a170-8bd3ba620bb1
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0d68c79-8327-44f9-a170-8bd3ba620bb1
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1dc108f-62d5-42da-a496-a4ca45209077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1dc108f-62d5-42da-a496-a4ca45209077
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1dc108f-62d5-42da-a496-a4ca45209077
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-b55dc994-ae1e-4220-8be7-b8f4ab48523a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b55dc994-ae1e-4220-8be7-b8f4ab48523a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b55dc994-ae1e-4220-8be7-b8f4ab48523a
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd2c1197-4fbb-4bcd-bef5-4535cd1725b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd2c1197-4fbb-4bcd-bef5-4535cd1725b9
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd2c1197-4fbb-4bcd-bef5-4535cd1725b9
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-d027c966-ef8a-4303-bd52-eb15cdb00344

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d027c966-ef8a-4303-bd52-eb15cdb00344
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d027c966-ef8a-4303-bd52-eb15cdb00344
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-18a4f616-947b-44c6-9ca8-38a72531c108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18a4f616-947b-44c6-9ca8-38a72531c108
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-18a4f616-947b-44c6-9ca8-38a72531c108
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c25d588-de1e-4a11-b3c5-61c47c2c70db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c25d588-de1e-4a11-b3c5-61c47c2c70db
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c25d588-de1e-4a11-b3c5-61c47c2c70db
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b11cb12-04d5-4bb7-a3fb-494d37d3432d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b11cb12-04d5-4bb7-a3fb-494d37d3432d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b11cb12-04d5-4bb7-a3fb-494d37d3432d
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe993e99-9bd8-40df-b5e0-17c8f2b314f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe993e99-9bd8-40df-b5e0-17c8f2b314f6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe993e99-9bd8-40df-b5e0-17c8f2b314f6
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-5aea7194-98e5-4084-a707-e07078b1426e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aea7194-98e5-4084-a707-e07078b1426e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-5aea7194-98e5-4084-a707-e07078b1426e
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-68810ce1-43e9-4522-ad8b-e9846fd38d2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68810ce1-43e9-4522-ad8b-e9846fd38d2b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-68810ce1-43e9-4522-ad8b-e9846fd38d2b
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2fc418a-2979-4fe8-a3d5-e7a406593d88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2fc418a-2979-4fe8-a3d5-e7a406593d88
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2fc418a-2979-4fe8-a3d5-e7a406593d88
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-657245ab-d9fb-4b3e-bd5e-6aec6b1be006

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-657245ab-d9fb-4b3e-bd5e-6aec6b1be006
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-657245ab-d9fb-4b3e-bd5e-6aec6b1be006
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d5c929d-7547-4959-bff9-517604975b21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d5c929d-7547-4959-bff9-517604975b21
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d5c929d-7547-4959-bff9-517604975b21
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-694e80d4-5f29-4801-85cd-7ff54342895f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-694e80d4-5f29-4801-85cd-7ff54342895f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-694e80d4-5f29-4801-85cd-7ff54342895f
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c9bee0d-753b-48c5-9a59-d1e13daa1962

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c9bee0d-753b-48c5-9a59-d1e13daa1962
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c9bee0d-753b-48c5-9a59-d1e13daa1962
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-73e3d530-9707-474e-a450-a98d1b1a5191

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73e3d530-9707-474e-a450-a98d1b1a5191
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-73e3d530-9707-474e-a450-a98d1b1a5191
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe33f732-d93e-4e76-969a-660ac4dd2c35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe33f732-d93e-4e76-969a-660ac4dd2c35
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe33f732-d93e-4e76-969a-660ac4dd2c35
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-40d3b4e8-9db6-4d39-b171-4a5f33735794

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40d3b4e8-9db6-4d39-b171-4a5f33735794
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-40d3b4e8-9db6-4d39-b171-4a5f33735794
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-129b4258-eab7-44cb-ae79-8182bfe787a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-129b4258-eab7-44cb-ae79-8182bfe787a9
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-129b4258-eab7-44cb-ae79-8182bfe787a9
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c5737fe-2608-4f6e-aed9-a139bf4cb077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c5737fe-2608-4f6e-aed9-a139bf4cb077
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c5737fe-2608-4f6e-aed9-a139bf4cb077
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b0c74eb-77b2-4814-86cb-f987c31550c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b0c74eb-77b2-4814-86cb-f987c31550c7
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b0c74eb-77b2-4814-86cb-f987c31550c7
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ea3d384-94bd-4b86-977d-f13eb7d9e8ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ea3d384-94bd-4b86-977d-f13eb7d9e8ea
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ea3d384-94bd-4b86-977d-f13eb7d9e8ea
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ff88a00-6b93-4b67-955d-102eecba1ba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ff88a00-6b93-4b67-955d-102eecba1ba4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ff88a00-6b93-4b67-955d-102eecba1ba4
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5010499-47cd-48ed-91ae-d86a887a9839

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5010499-47cd-48ed-91ae-d86a887a9839
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5010499-47cd-48ed-91ae-d86a887a9839
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c42352b-2906-49c4-8819-0e3b91c30a4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c42352b-2906-49c4-8819-0e3b91c30a4d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c42352b-2906-49c4-8819-0e3b91c30a4d
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-6520359f-48d6-451c-85dc-2296c3e4ad5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6520359f-48d6-451c-85dc-2296c3e4ad5c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-6520359f-48d6-451c-85dc-2296c3e4ad5c
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-26681384-0427-4d46-9a84-d9b763456cdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26681384-0427-4d46-9a84-d9b763456cdd
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-26681384-0427-4d46-9a84-d9b763456cdd
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4db35c6-fb1a-47a1-ae7b-aede584732a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4db35c6-fb1a-47a1-ae7b-aede584732a5
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4db35c6-fb1a-47a1-ae7b-aede584732a5
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-b097ab49-c448-412a-a887-8b66d8741dba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b097ab49-c448-412a-a887-8b66d8741dba
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b097ab49-c448-412a-a887-8b66d8741dba
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-206bc991-5093-44ab-ab77-e4fc82b01aca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-206bc991-5093-44ab-ab77-e4fc82b01aca
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-206bc991-5093-44ab-ab77-e4fc82b01aca
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-bcbb5bc1-7389-46b8-a0e3-d8f969008ef6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcbb5bc1-7389-46b8-a0e3-d8f969008ef6
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcbb5bc1-7389-46b8-a0e3-d8f969008ef6
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-5be34b9e-4883-4547-a097-04b53a938fc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5be34b9e-4883-4547-a097-04b53a938fc8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5be34b9e-4883-4547-a097-04b53a938fc8
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-56d30316-ad20-4e6c-932c-d52d59a2e16a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56d30316-ad20-4e6c-932c-d52d59a2e16a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-56d30316-ad20-4e6c-932c-d52d59a2e16a
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-5636b37d-034c-422a-a54a-1d03ada748c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5636b37d-034c-422a-a54a-1d03ada748c7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5636b37d-034c-422a-a54a-1d03ada748c7
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-cddf2b70-32d4-4a02-9e2c-8b2fc53c3763

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cddf2b70-32d4-4a02-9e2c-8b2fc53c3763
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-cddf2b70-32d4-4a02-9e2c-8b2fc53c3763
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff9b337c-148d-4801-8093-11767ad211b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff9b337c-148d-4801-8093-11767ad211b7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff9b337c-148d-4801-8093-11767ad211b7
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6ed4d19-950b-42dd-84eb-cc4f0ff8cdc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6ed4d19-950b-42dd-84eb-cc4f0ff8cdc4
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6ed4d19-950b-42dd-84eb-cc4f0ff8cdc4
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8feefbe-4a08-4a10-9a4b-bb6a355fe080

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8feefbe-4a08-4a10-9a4b-bb6a355fe080
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8feefbe-4a08-4a10-9a4b-bb6a355fe080
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b340108-b3f3-45a5-ad8d-137dcb7b4659

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b340108-b3f3-45a5-ad8d-137dcb7b4659
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b340108-b3f3-45a5-ad8d-137dcb7b4659
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5df7152-949f-4eec-85c6-88b11a994aba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5df7152-949f-4eec-85c6-88b11a994aba
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5df7152-949f-4eec-85c6-88b11a994aba
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad5d2da7-ac86-4e00-a451-71f2d75feb21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad5d2da7-ac86-4e00-a451-71f2d75feb21
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad5d2da7-ac86-4e00-a451-71f2d75feb21
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-d679534a-f269-47bb-a2e3-88b00c7d1581

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d679534a-f269-47bb-a2e3-88b00c7d1581
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d679534a-f269-47bb-a2e3-88b00c7d1581
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-0187d8e8-c72d-467d-8e3f-fe30c963e15c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0187d8e8-c72d-467d-8e3f-fe30c963e15c
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0187d8e8-c72d-467d-8e3f-fe30c963e15c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f6a5a7e-2fd9-46d7-85fb-217fc11230f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f6a5a7e-2fd9-46d7-85fb-217fc11230f0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f6a5a7e-2fd9-46d7-85fb-217fc11230f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-7cbf8bd1-6131-4475-b52d-619549a954dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cbf8bd1-6131-4475-b52d-619549a954dc
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cbf8bd1-6131-4475-b52d-619549a954dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-105f7fc3-0cc8-454f-9d6c-a86999af1511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-105f7fc3-0cc8-454f-9d6c-a86999af1511
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-105f7fc3-0cc8-454f-9d6c-a86999af1511
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1bf2b2b-6806-4f42-91b3-543dab9fb2a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1bf2b2b-6806-4f42-91b3-543dab9fb2a2
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1bf2b2b-6806-4f42-91b3-543dab9fb2a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
Retry-After: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f1bf2b2b-6806-4f42-91b3-543dab9fb2a2"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-09ffdd49-b90a-4800-bdc2-afa93e2962db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09ffdd49-b90a-4800-bdc2-afa93e2962db
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09ffdd49-b90a-4800-bdc2-afa93e2962db
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-09ffdd49-b90a-4800-bdc2-afa93e2962db"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-8256f1ef-f5f6-48f7-b583-9e357220d8ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8256f1ef-f5f6-48f7-b583-9e357220d8ac
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8256f1ef-f5f6-48f7-b583-9e357220d8ac
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8256f1ef-f5f6-48f7-b583-9e357220d8ac"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f47ca43-36d1-491c-8bc8-dadbc955b40b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f47ca43-36d1-491c-8bc8-dadbc955b40b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f47ca43-36d1-491c-8bc8-dadbc955b40b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0f47ca43-36d1-491c-8bc8-dadbc955b40b"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f12fec3-ff2a-4796-860f-488a4d97aaa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f12fec3-ff2a-4796-860f-488a4d97aaa0
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f12fec3-ff2a-4796-860f-488a4d97aaa0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3f12fec3-ff2a-4796-860f-488a4d97aaa0"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-c00e4222-6bef-43b8-a8c0-b90f4adf0dfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c00e4222-6bef-43b8-a8c0-b90f4adf0dfd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c00e4222-6bef-43b8-a8c0-b90f4adf0dfd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c00e4222-6bef-43b8-a8c0-b90f4adf0dfd"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e2da1c3-1cb3-4a2c-84f5-c18714b369c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e2da1c3-1cb3-4a2c-84f5-c18714b369c5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e2da1c3-1cb3-4a2c-84f5-c18714b369c5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8e2da1c3-1cb3-4a2c-84f5-c18714b369c5"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-edd42673-64cf-486f-bc6b-4165450c7dc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edd42673-64cf-486f-bc6b-4165450c7dc9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-edd42673-64cf-486f-bc6b-4165450c7dc9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-edd42673-64cf-486f-bc6b-4165450c7dc9"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-d31076f9-007f-46df-bf90-919a04451d71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d31076f9-007f-46df-bf90-919a04451d71
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d31076f9-007f-46df-bf90-919a04451d71
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d31076f9-007f-46df-bf90-919a04451d71"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf88a39d-8a8b-42ff-80a1-f3a7aa19a091

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf88a39d-8a8b-42ff-80a1-f3a7aa19a091
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf88a39d-8a8b-42ff-80a1-f3a7aa19a091
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bf88a39d-8a8b-42ff-80a1-f3a7aa19a091"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-093c6275-7bfe-40c2-9e16-c71b95dddc08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-093c6275-7bfe-40c2-9e16-c71b95dddc08
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-093c6275-7bfe-40c2-9e16-c71b95dddc08
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-093c6275-7bfe-40c2-9e16-c71b95dddc08"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-656f0795-6891-486e-8860-f8f0024e091b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-656f0795-6891-486e-8860-f8f0024e091b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-656f0795-6891-486e-8860-f8f0024e091b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-656f0795-6891-486e-8860-f8f0024e091b"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4870679-6628-4faf-a1fa-853a0c432168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4870679-6628-4faf-a1fa-853a0c432168
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4870679-6628-4faf-a1fa-853a0c432168
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d4870679-6628-4faf-a1fa-853a0c432168"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-dae85a45-706b-4fc2-8f01-3426fece4e46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dae85a45-706b-4fc2-8f01-3426fece4e46
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dae85a45-706b-4fc2-8f01-3426fece4e46
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dae85a45-706b-4fc2-8f01-3426fece4e46"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-34b5ea8c-1abd-4519-8502-c8aeb40befe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34b5ea8c-1abd-4519-8502-c8aeb40befe7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34b5ea8c-1abd-4519-8502-c8aeb40befe7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-34b5ea8c-1abd-4519-8502-c8aeb40befe7"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9d3eac8-7e85-43fb-aeda-7fc5c8d950bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9d3eac8-7e85-43fb-aeda-7fc5c8d950bd
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9d3eac8-7e85-43fb-aeda-7fc5c8d950bd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e9d3eac8-7e85-43fb-aeda-7fc5c8d950bd"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-667bb89a-d219-4c0d-8cff-f8607f0ca71b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-667bb89a-d219-4c0d-8cff-f8607f0ca71b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-667bb89a-d219-4c0d-8cff-f8607f0ca71b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-667bb89a-d219-4c0d-8cff-f8607f0ca71b"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-35c39ef2-67c5-4011-98d8-74c2dad2bd5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c39ef2-67c5-4011-98d8-74c2dad2bd5c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35c39ef2-67c5-4011-98d8-74c2dad2bd5c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-35c39ef2-67c5-4011-98d8-74c2dad2bd5c"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7760fc5-1da7-4fbd-a5bd-f6b6bf324905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7760fc5-1da7-4fbd-a5bd-f6b6bf324905
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7760fc5-1da7-4fbd-a5bd-f6b6bf324905
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

{"id":"acc_475bd920-34ca-40bf-9490-41a7b8dbe8de","handle":"qa-64d5e751d368","displayName":"QA 64d5e751d368","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.105885949Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bac1e1b2-8d02-4dd3-bdff-4a4c09a3cdaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bac1e1b2-8d02-4dd3-bdff-4a4c09a3cdaa
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 18 Nov 2026 10:19:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bac1e1b2-8d02-4dd3-bdff-4a4c09a3cdaa
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
correlation: qa-2e7585eb-2a56-4d94-9d8d-22f0d9c2eb15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e7585eb-2a56-4d94-9d8d-22f0d9c2eb15
Content-Type: application/json

--- request body ---
{"handle":"qa-64d5e751d368","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e7585eb-2a56-4d94-9d8d-22f0d9c2eb15
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e7585eb-2a56-4d94-9d8d-22f0d9c2eb15"}
```
