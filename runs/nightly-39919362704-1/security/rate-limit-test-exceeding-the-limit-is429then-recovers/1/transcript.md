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
| 1 | `POST /v1/accounts` | 201 | 357 | `qa-a9a7dd1d-72a9-4f3b-932c-627d1f1072cb` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-28cf6aa9-c814-4339-940c-4958030a8287` |
| 3 | `GET /v1/accounts/me` | 200 | 22 | `qa-e7fa631f-12bf-40a0-b478-f1944bf9b1e5` |
| 4 | `GET /v1/accounts/me` | 200 | 11 | `qa-29212044-742d-4456-a8fc-8d547a440e09` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-6cfb3c5d-a6a2-4ef8-a3c9-823c13f74d2b` |
| 6 | `GET /v1/accounts/me` | 200 | 10 | `qa-02c27884-526f-4b7f-b02f-fa1918d8aa17` |
| 7 | `GET /v1/accounts/me` | 200 | 14 | `qa-c762bd33-18e7-41b2-8c65-c16b71092b24` |
| 8 | `GET /v1/accounts/me` | 200 | 13 | `qa-6a9132eb-9e86-4d21-9ffc-9c4580c19dda` |
| 9 | `GET /v1/accounts/me` | 200 | 11 | `qa-fa7acfac-02c0-4423-b100-6bb9430b5949` |
| 10 | `GET /v1/accounts/me` | 200 | 8 | `qa-59756176-59f8-48b2-9a2b-c968995930f7` |
| 11 | `GET /v1/accounts/me` | 200 | 7 | `qa-266dcb3e-2abc-42e7-9de3-dfae9a1b8d0e` |
| 12 | `GET /v1/accounts/me` | 200 | 13 | `qa-c9d4f0a9-d5fd-43ae-a82c-5bd7d04e433e` |
| 13 | `GET /v1/accounts/me` | 200 | 5 | `qa-5aa0f16e-141f-4a16-ae90-4e93e6c48bbf` |
| 14 | `GET /v1/accounts/me` | 200 | 8 | `qa-c40baecb-4c10-4978-b3f4-e9f21226ed7d` |
| 15 | `GET /v1/accounts/me` | 200 | 8 | `qa-02c8facd-12d7-4e5e-8196-d50d38fa2576` |
| 16 | `GET /v1/accounts/me` | 200 | 21 | `qa-e5f353cc-dedd-4218-99ee-0608c00053c7` |
| 17 | `GET /v1/accounts/me` | 200 | 6 | `qa-b9c620cf-0025-4003-a046-cd85be007594` |
| 18 | `GET /v1/accounts/me` | 200 | 5 | `qa-0ec043af-cc16-408c-a040-0f89b440594b` |
| 19 | `GET /v1/accounts/me` | 200 | 5 | `qa-083a3510-78b6-4ef9-9b29-20f3410e535a` |
| 20 | `GET /v1/accounts/me` | 200 | 5 | `qa-d6b0bb4e-b79b-47c6-82ec-a0eeab8f52ce` |
| 21 | `GET /v1/accounts/me` | 200 | 6 | `qa-5f77311f-a049-4841-9d33-6f0bd3599a83` |
| 22 | `GET /v1/accounts/me` | 200 | 5 | `qa-ae3fbf3a-3fc2-4a61-a71b-b8d186c73b95` |
| 23 | `GET /v1/accounts/me` | 200 | 5 | `qa-a4dadc7d-b61c-44ba-be68-2f632f18ceb5` |
| 24 | `GET /v1/accounts/me` | 200 | 5 | `qa-93fd675d-ae04-4c73-a2cf-8e140b2e6b85` |
| 25 | `GET /v1/accounts/me` | 200 | 10 | `qa-44151b61-d0cb-4b44-bd5c-f32030aa3ebd` |
| 26 | `GET /v1/accounts/me` | 200 | 12 | `qa-9cfb9c28-57c6-46c9-a671-50f17a81628c` |
| 27 | `GET /v1/accounts/me` | 200 | 9 | `qa-04893b13-e134-45d0-9227-ac6375803bb2` |
| 28 | `GET /v1/accounts/me` | 200 | 5 | `qa-0972781a-22e5-4d8a-ae5d-6b6347e1289b` |
| 29 | `GET /v1/accounts/me` | 200 | 5 | `qa-68395530-e78a-409c-837e-341b67f7eae4` |
| 30 | `GET /v1/accounts/me` | 200 | 6 | `qa-2f9be248-a8bb-4783-8803-4e0fbd4c9aa4` |
| 31 | `GET /v1/accounts/me` | 200 | 4 | `qa-9d7d78f3-464f-430d-b43c-daca577aa27a` |
| 32 | `GET /v1/accounts/me` | 200 | 4 | `qa-9c8e528b-e02f-4256-afa4-595b991783f8` |
| 33 | `GET /v1/accounts/me` | 200 | 6 | `qa-caaabf91-a2c4-4118-836a-9bd94a1176ce` |
| 34 | `GET /v1/accounts/me` | 200 | 7 | `qa-f8c153b8-0637-486a-ae52-78f66fd2639b` |
| 35 | `GET /v1/accounts/me` | 200 | 4 | `qa-59d47aa2-6b7e-4db0-aefd-003f13fa45a3` |
| 36 | `GET /v1/accounts/me` | 200 | 11 | `qa-ebd7ba85-4dcf-4f83-8b5c-22961cf76f58` |
| 37 | `GET /v1/accounts/me` | 200 | 9 | `qa-d855993c-a167-46c2-b474-72c11ceb5aea` |
| 38 | `GET /v1/accounts/me` | 200 | 8 | `qa-e024c5df-27a7-48d9-8c64-356b01b60b05` |
| 39 | `GET /v1/accounts/me` | 200 | 5 | `qa-b9c938fc-ceb9-4282-9b4b-45905d983004` |
| 40 | `GET /v1/accounts/me` | 200 | 5 | `qa-37039b28-4d2a-4323-b880-24100978eea9` |
| 41 | `GET /v1/accounts/me` | 200 | 17 | `qa-eff62329-638b-4afe-9988-55631f2cfd14` |
| 42 | `GET /v1/accounts/me` | 200 | 5 | `qa-ecfcf95f-ed48-4098-8a53-c96111740d6e` |
| 43 | `GET /v1/accounts/me` | 200 | 19 | `qa-9c0c884b-7ab3-4933-9db2-fcccc8c4e4f5` |
| 44 | `GET /v1/accounts/me` | 200 | 6 | `qa-e8326e42-5a88-4344-94ac-588ec8129858` |
| 45 | `GET /v1/accounts/me` | 200 | 6 | `qa-31191435-d2a3-4b48-acd2-f276c7b8e80f` |
| 46 | `GET /v1/accounts/me` | 200 | 5 | `qa-6afd4a58-bc37-4437-b5f3-2a12a0ebeb81` |
| 47 | `GET /v1/accounts/me` | 200 | 5 | `qa-e0ff1c9a-7bb0-4945-9935-9dafa0e5fd78` |
| 48 | `GET /v1/accounts/me` | 200 | 6 | `qa-2567f613-6a77-4149-a28f-0c3238ad57ae` |
| 49 | `GET /v1/accounts/me` | 200 | 6 | `qa-934c72ce-9cf5-4d57-968b-547fd21a4892` |
| 50 | `GET /v1/accounts/me` | 200 | 6 | `qa-99fe6998-cdd2-4fd0-830d-94cbd21c4945` |
| 51 | `GET /v1/accounts/me` | 200 | 7 | `qa-a9c36fe2-0d1d-43a1-a752-70ca4877e3b4` |
| 52 | `GET /v1/accounts/me` | 200 | 7 | `qa-6eadf9cb-2e63-4438-900b-05d873b927fa` |
| 53 | `GET /v1/accounts/me` | 200 | 14 | `qa-dddde6ee-b640-4d74-bb2a-c7f891e7cfb6` |
| 54 | `GET /v1/accounts/me` | 200 | 21 | `qa-08f6e298-dcca-426b-ac8b-77e668a1ccfc` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-c8ea5095-eee3-45f8-b157-daf005276393` |
| 56 | `GET /v1/accounts/me` | 200 | 10 | `qa-c20d02a4-3de0-47cd-a1a7-b245213430e5` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-8ec644f6-93da-43c0-b267-e179b0e30af0` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-1a45dc86-2a11-48e0-b65b-9794b7a6033f` |
| 59 | `GET /v1/accounts/me` | 200 | 12 | `qa-3eae2cbb-4efc-47df-9ddd-7afe4b51af8f` |
| 60 | `GET /v1/accounts/me` | 200 | 9 | `qa-f2aed25f-a92a-442c-984e-dbce09cdb4e0` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-3fec5b52-0145-444d-8a61-572ab64a6ed5` |
| 62 | `GET /v1/accounts/me` | 200 | 6 | `qa-031fdd12-862e-45b0-a9a5-8b0d9316de29` |
| 63 | `GET /v1/accounts/me` | 429 | 4 | `qa-982a87bc-2fab-46b3-b7dd-38090a3e4802` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-167c5c51-bb81-4180-b147-51a0050bec6b` |
| 65 | `GET /v1/accounts/me` | 429 | 4 | `qa-8d05a1d6-7024-4a0a-a284-89519ce591e9` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-7b5bf8a2-13a8-4bc7-b35f-71ad568673f7` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-cfe6ed57-3c82-407f-9e36-0d3fd42670e8` |
| 68 | `GET /v1/accounts/me` | 429 | 6 | `qa-f56ac187-9126-4fd2-9c43-0ff0110e2a5d` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-cade582b-b5b6-4c5d-bf9c-f8875224599b` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-377335e0-4e7e-4d15-9a97-98aedcc82783` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-26dc4127-3e61-48dc-a476-c98ed2b02623` |
| 72 | `GET /v1/accounts/me` | 429 | 3 | `qa-eb53786e-09b4-492b-ae86-db3b419928bf` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-7ab8cfbb-e18b-4884-b406-60773ef4478e` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-4543c61c-98c8-41d2-91f3-a76cf0a869c1` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-8570ff9d-cb9f-45a7-8c13-ee54f61d618b` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-e77a1470-c46a-41ea-9efe-0cdb350e252a` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-feedf2a3-ac3d-4e3b-b2a3-c2025b05aa81` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-ecc89ca2-4cbe-45ba-ae1a-93ae8a3fc3b1` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-5ed6ed29-60ff-480f-928c-c58193eb86b3` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-9640ac1f-0de0-4082-8001-a2e3a0329d8e` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-d72c5e63-b3fc-466c-bba7-9e15cd02e968` |
| 82 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-52332342-8e54-48f2-a2b2-7f9b776e1b2b` |
| 83 | `POST /v1/auth/token` | 401 | 2 | `qa-c89b8eff-b7af-45a7-8ba2-977dd725f200` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9a7dd1d-72a9-4f3b-932c-627d1f1072cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9a7dd1d-72a9-4f3b-932c-627d1f1072cb
Content-Type: application/json

--- request body ---
{"handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","password":"****","region":"eu"}

--- response: 201 in 357 ms ---
Date: Fri, 23 Oct 2026 07:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9a7dd1d-72a9-4f3b-932c-627d1f1072cb
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
Location: /v1/accounts/qa-d1b978ed8b2e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-28cf6aa9-c814-4339-940c-4958030a8287

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28cf6aa9-c814-4339-940c-4958030a8287
Content-Type: application/json

--- request body ---
{"handle":"qa-d1b978ed8b2e","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-28cf6aa9-c814-4339-940c-4958030a8287
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7fa631f-12bf-40a0-b478-f1944bf9b1e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7fa631f-12bf-40a0-b478-f1944bf9b1e5
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7fa631f-12bf-40a0-b478-f1944bf9b1e5
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-29212044-742d-4456-a8fc-8d547a440e09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29212044-742d-4456-a8fc-8d547a440e09
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-29212044-742d-4456-a8fc-8d547a440e09
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-6cfb3c5d-a6a2-4ef8-a3c9-823c13f74d2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cfb3c5d-a6a2-4ef8-a3c9-823c13f74d2b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cfb3c5d-a6a2-4ef8-a3c9-823c13f74d2b
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-02c27884-526f-4b7f-b02f-fa1918d8aa17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02c27884-526f-4b7f-b02f-fa1918d8aa17
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-02c27884-526f-4b7f-b02f-fa1918d8aa17
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-c762bd33-18e7-41b2-8c65-c16b71092b24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c762bd33-18e7-41b2-8c65-c16b71092b24
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-c762bd33-18e7-41b2-8c65-c16b71092b24
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a9132eb-9e86-4d21-9ffc-9c4580c19dda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a9132eb-9e86-4d21-9ffc-9c4580c19dda
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a9132eb-9e86-4d21-9ffc-9c4580c19dda
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa7acfac-02c0-4423-b100-6bb9430b5949

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa7acfac-02c0-4423-b100-6bb9430b5949
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa7acfac-02c0-4423-b100-6bb9430b5949
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-59756176-59f8-48b2-9a2b-c968995930f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59756176-59f8-48b2-9a2b-c968995930f7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-59756176-59f8-48b2-9a2b-c968995930f7
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-266dcb3e-2abc-42e7-9de3-dfae9a1b8d0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-266dcb3e-2abc-42e7-9de3-dfae9a1b8d0e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-266dcb3e-2abc-42e7-9de3-dfae9a1b8d0e
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9d4f0a9-d5fd-43ae-a82c-5bd7d04e433e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9d4f0a9-d5fd-43ae-a82c-5bd7d04e433e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9d4f0a9-d5fd-43ae-a82c-5bd7d04e433e
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-5aa0f16e-141f-4a16-ae90-4e93e6c48bbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aa0f16e-141f-4a16-ae90-4e93e6c48bbf
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-5aa0f16e-141f-4a16-ae90-4e93e6c48bbf
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-c40baecb-4c10-4978-b3f4-e9f21226ed7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c40baecb-4c10-4978-b3f4-e9f21226ed7d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-c40baecb-4c10-4978-b3f4-e9f21226ed7d
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-02c8facd-12d7-4e5e-8196-d50d38fa2576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02c8facd-12d7-4e5e-8196-d50d38fa2576
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-02c8facd-12d7-4e5e-8196-d50d38fa2576
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5f353cc-dedd-4218-99ee-0608c00053c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5f353cc-dedd-4218-99ee-0608c00053c7
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5f353cc-dedd-4218-99ee-0608c00053c7
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9c620cf-0025-4003-a046-cd85be007594

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9c620cf-0025-4003-a046-cd85be007594
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9c620cf-0025-4003-a046-cd85be007594
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ec043af-cc16-408c-a040-0f89b440594b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ec043af-cc16-408c-a040-0f89b440594b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ec043af-cc16-408c-a040-0f89b440594b
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-083a3510-78b6-4ef9-9b29-20f3410e535a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-083a3510-78b6-4ef9-9b29-20f3410e535a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-083a3510-78b6-4ef9-9b29-20f3410e535a
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6b0bb4e-b79b-47c6-82ec-a0eeab8f52ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6b0bb4e-b79b-47c6-82ec-a0eeab8f52ce
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6b0bb4e-b79b-47c6-82ec-a0eeab8f52ce
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f77311f-a049-4841-9d33-6f0bd3599a83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f77311f-a049-4841-9d33-6f0bd3599a83
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f77311f-a049-4841-9d33-6f0bd3599a83
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae3fbf3a-3fc2-4a61-a71b-b8d186c73b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae3fbf3a-3fc2-4a61-a71b-b8d186c73b95
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae3fbf3a-3fc2-4a61-a71b-b8d186c73b95
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-a4dadc7d-b61c-44ba-be68-2f632f18ceb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4dadc7d-b61c-44ba-be68-2f632f18ceb5
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4dadc7d-b61c-44ba-be68-2f632f18ceb5
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-93fd675d-ae04-4c73-a2cf-8e140b2e6b85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93fd675d-ae04-4c73-a2cf-8e140b2e6b85
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-93fd675d-ae04-4c73-a2cf-8e140b2e6b85
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-44151b61-d0cb-4b44-bd5c-f32030aa3ebd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44151b61-d0cb-4b44-bd5c-f32030aa3ebd
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-44151b61-d0cb-4b44-bd5c-f32030aa3ebd
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-9cfb9c28-57c6-46c9-a671-50f17a81628c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cfb9c28-57c6-46c9-a671-50f17a81628c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cfb9c28-57c6-46c9-a671-50f17a81628c
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-04893b13-e134-45d0-9227-ac6375803bb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04893b13-e134-45d0-9227-ac6375803bb2
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-04893b13-e134-45d0-9227-ac6375803bb2
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-0972781a-22e5-4d8a-ae5d-6b6347e1289b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0972781a-22e5-4d8a-ae5d-6b6347e1289b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0972781a-22e5-4d8a-ae5d-6b6347e1289b
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-68395530-e78a-409c-837e-341b67f7eae4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68395530-e78a-409c-837e-341b67f7eae4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-68395530-e78a-409c-837e-341b67f7eae4
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f9be248-a8bb-4783-8803-4e0fbd4c9aa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f9be248-a8bb-4783-8803-4e0fbd4c9aa4
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f9be248-a8bb-4783-8803-4e0fbd4c9aa4
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d7d78f3-464f-430d-b43c-daca577aa27a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d7d78f3-464f-430d-b43c-daca577aa27a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d7d78f3-464f-430d-b43c-daca577aa27a
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c8e528b-e02f-4256-afa4-595b991783f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c8e528b-e02f-4256-afa4-595b991783f8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c8e528b-e02f-4256-afa4-595b991783f8
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-caaabf91-a2c4-4118-836a-9bd94a1176ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caaabf91-a2c4-4118-836a-9bd94a1176ce
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-caaabf91-a2c4-4118-836a-9bd94a1176ce
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8c153b8-0637-486a-ae52-78f66fd2639b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8c153b8-0637-486a-ae52-78f66fd2639b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8c153b8-0637-486a-ae52-78f66fd2639b
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-59d47aa2-6b7e-4db0-aefd-003f13fa45a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59d47aa2-6b7e-4db0-aefd-003f13fa45a3
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-59d47aa2-6b7e-4db0-aefd-003f13fa45a3
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-ebd7ba85-4dcf-4f83-8b5c-22961cf76f58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebd7ba85-4dcf-4f83-8b5c-22961cf76f58
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebd7ba85-4dcf-4f83-8b5c-22961cf76f58
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-d855993c-a167-46c2-b474-72c11ceb5aea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d855993c-a167-46c2-b474-72c11ceb5aea
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-d855993c-a167-46c2-b474-72c11ceb5aea
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-e024c5df-27a7-48d9-8c64-356b01b60b05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e024c5df-27a7-48d9-8c64-356b01b60b05
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-e024c5df-27a7-48d9-8c64-356b01b60b05
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9c938fc-ceb9-4282-9b4b-45905d983004

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9c938fc-ceb9-4282-9b4b-45905d983004
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9c938fc-ceb9-4282-9b4b-45905d983004
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-37039b28-4d2a-4323-b880-24100978eea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37039b28-4d2a-4323-b880-24100978eea9
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-37039b28-4d2a-4323-b880-24100978eea9
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-eff62329-638b-4afe-9988-55631f2cfd14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eff62329-638b-4afe-9988-55631f2cfd14
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-eff62329-638b-4afe-9988-55631f2cfd14
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecfcf95f-ed48-4098-8a53-c96111740d6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecfcf95f-ed48-4098-8a53-c96111740d6e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecfcf95f-ed48-4098-8a53-c96111740d6e
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c0c884b-7ab3-4933-9db2-fcccc8c4e4f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c0c884b-7ab3-4933-9db2-fcccc8c4e4f5
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c0c884b-7ab3-4933-9db2-fcccc8c4e4f5
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8326e42-5a88-4344-94ac-588ec8129858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8326e42-5a88-4344-94ac-588ec8129858
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8326e42-5a88-4344-94ac-588ec8129858
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-31191435-d2a3-4b48-acd2-f276c7b8e80f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31191435-d2a3-4b48-acd2-f276c7b8e80f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-31191435-d2a3-4b48-acd2-f276c7b8e80f
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-6afd4a58-bc37-4437-b5f3-2a12a0ebeb81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6afd4a58-bc37-4437-b5f3-2a12a0ebeb81
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6afd4a58-bc37-4437-b5f3-2a12a0ebeb81
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0ff1c9a-7bb0-4945-9935-9dafa0e5fd78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0ff1c9a-7bb0-4945-9935-9dafa0e5fd78
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0ff1c9a-7bb0-4945-9935-9dafa0e5fd78
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-2567f613-6a77-4149-a28f-0c3238ad57ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2567f613-6a77-4149-a28f-0c3238ad57ae
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2567f613-6a77-4149-a28f-0c3238ad57ae
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-934c72ce-9cf5-4d57-968b-547fd21a4892

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-934c72ce-9cf5-4d57-968b-547fd21a4892
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-934c72ce-9cf5-4d57-968b-547fd21a4892
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-99fe6998-cdd2-4fd0-830d-94cbd21c4945

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99fe6998-cdd2-4fd0-830d-94cbd21c4945
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-99fe6998-cdd2-4fd0-830d-94cbd21c4945
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9c36fe2-0d1d-43a1-a752-70ca4877e3b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9c36fe2-0d1d-43a1-a752-70ca4877e3b4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9c36fe2-0d1d-43a1-a752-70ca4877e3b4
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-6eadf9cb-2e63-4438-900b-05d873b927fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eadf9cb-2e63-4438-900b-05d873b927fa
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eadf9cb-2e63-4438-900b-05d873b927fa
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-dddde6ee-b640-4d74-bb2a-c7f891e7cfb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dddde6ee-b640-4d74-bb2a-c7f891e7cfb6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-dddde6ee-b640-4d74-bb2a-c7f891e7cfb6
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-08f6e298-dcca-426b-ac8b-77e668a1ccfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08f6e298-dcca-426b-ac8b-77e668a1ccfc
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-08f6e298-dcca-426b-ac8b-77e668a1ccfc
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8ea5095-eee3-45f8-b157-daf005276393

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8ea5095-eee3-45f8-b157-daf005276393
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8ea5095-eee3-45f8-b157-daf005276393
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-c20d02a4-3de0-47cd-a1a7-b245213430e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c20d02a4-3de0-47cd-a1a7-b245213430e5
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c20d02a4-3de0-47cd-a1a7-b245213430e5
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ec644f6-93da-43c0-b267-e179b0e30af0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ec644f6-93da-43c0-b267-e179b0e30af0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ec644f6-93da-43c0-b267-e179b0e30af0
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a45dc86-2a11-48e0-b65b-9794b7a6033f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a45dc86-2a11-48e0-b65b-9794b7a6033f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a45dc86-2a11-48e0-b65b-9794b7a6033f
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-3eae2cbb-4efc-47df-9ddd-7afe4b51af8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eae2cbb-4efc-47df-9ddd-7afe4b51af8f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3eae2cbb-4efc-47df-9ddd-7afe4b51af8f
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-f2aed25f-a92a-442c-984e-dbce09cdb4e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2aed25f-a92a-442c-984e-dbce09cdb4e0
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2aed25f-a92a-442c-984e-dbce09cdb4e0
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-3fec5b52-0145-444d-8a61-572ab64a6ed5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fec5b52-0145-444d-8a61-572ab64a6ed5
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fec5b52-0145-444d-8a61-572ab64a6ed5
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-031fdd12-862e-45b0-a9a5-8b0d9316de29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-031fdd12-862e-45b0-a9a5-8b0d9316de29
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-031fdd12-862e-45b0-a9a5-8b0d9316de29
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-982a87bc-2fab-46b3-b7dd-38090a3e4802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-982a87bc-2fab-46b3-b7dd-38090a3e4802
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-982a87bc-2fab-46b3-b7dd-38090a3e4802
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-982a87bc-2fab-46b3-b7dd-38090a3e4802"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-167c5c51-bb81-4180-b147-51a0050bec6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-167c5c51-bb81-4180-b147-51a0050bec6b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-167c5c51-bb81-4180-b147-51a0050bec6b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-167c5c51-bb81-4180-b147-51a0050bec6b"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d05a1d6-7024-4a0a-a284-89519ce591e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d05a1d6-7024-4a0a-a284-89519ce591e9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d05a1d6-7024-4a0a-a284-89519ce591e9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8d05a1d6-7024-4a0a-a284-89519ce591e9"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b5bf8a2-13a8-4bc7-b35f-71ad568673f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b5bf8a2-13a8-4bc7-b35f-71ad568673f7
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b5bf8a2-13a8-4bc7-b35f-71ad568673f7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7b5bf8a2-13a8-4bc7-b35f-71ad568673f7"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-cfe6ed57-3c82-407f-9e36-0d3fd42670e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfe6ed57-3c82-407f-9e36-0d3fd42670e8
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfe6ed57-3c82-407f-9e36-0d3fd42670e8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cfe6ed57-3c82-407f-9e36-0d3fd42670e8"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-f56ac187-9126-4fd2-9c43-0ff0110e2a5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f56ac187-9126-4fd2-9c43-0ff0110e2a5d
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f56ac187-9126-4fd2-9c43-0ff0110e2a5d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f56ac187-9126-4fd2-9c43-0ff0110e2a5d"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-cade582b-b5b6-4c5d-bf9c-f8875224599b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cade582b-b5b6-4c5d-bf9c-f8875224599b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cade582b-b5b6-4c5d-bf9c-f8875224599b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cade582b-b5b6-4c5d-bf9c-f8875224599b"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-377335e0-4e7e-4d15-9a97-98aedcc82783

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-377335e0-4e7e-4d15-9a97-98aedcc82783
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-377335e0-4e7e-4d15-9a97-98aedcc82783
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-377335e0-4e7e-4d15-9a97-98aedcc82783"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-26dc4127-3e61-48dc-a476-c98ed2b02623

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26dc4127-3e61-48dc-a476-c98ed2b02623
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26dc4127-3e61-48dc-a476-c98ed2b02623
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-26dc4127-3e61-48dc-a476-c98ed2b02623"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb53786e-09b4-492b-ae86-db3b419928bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb53786e-09b4-492b-ae86-db3b419928bf
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb53786e-09b4-492b-ae86-db3b419928bf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eb53786e-09b4-492b-ae86-db3b419928bf"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ab8cfbb-e18b-4884-b406-60773ef4478e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ab8cfbb-e18b-4884-b406-60773ef4478e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ab8cfbb-e18b-4884-b406-60773ef4478e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7ab8cfbb-e18b-4884-b406-60773ef4478e"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-4543c61c-98c8-41d2-91f3-a76cf0a869c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4543c61c-98c8-41d2-91f3-a76cf0a869c1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4543c61c-98c8-41d2-91f3-a76cf0a869c1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4543c61c-98c8-41d2-91f3-a76cf0a869c1"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-8570ff9d-cb9f-45a7-8c13-ee54f61d618b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8570ff9d-cb9f-45a7-8c13-ee54f61d618b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8570ff9d-cb9f-45a7-8c13-ee54f61d618b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8570ff9d-cb9f-45a7-8c13-ee54f61d618b"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-e77a1470-c46a-41ea-9efe-0cdb350e252a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e77a1470-c46a-41ea-9efe-0cdb350e252a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e77a1470-c46a-41ea-9efe-0cdb350e252a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e77a1470-c46a-41ea-9efe-0cdb350e252a"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-feedf2a3-ac3d-4e3b-b2a3-c2025b05aa81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feedf2a3-ac3d-4e3b-b2a3-c2025b05aa81
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-feedf2a3-ac3d-4e3b-b2a3-c2025b05aa81
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-feedf2a3-ac3d-4e3b-b2a3-c2025b05aa81"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecc89ca2-4cbe-45ba-ae1a-93ae8a3fc3b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecc89ca2-4cbe-45ba-ae1a-93ae8a3fc3b1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ecc89ca2-4cbe-45ba-ae1a-93ae8a3fc3b1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ecc89ca2-4cbe-45ba-ae1a-93ae8a3fc3b1"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-5ed6ed29-60ff-480f-928c-c58193eb86b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ed6ed29-60ff-480f-928c-c58193eb86b3
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ed6ed29-60ff-480f-928c-c58193eb86b3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5ed6ed29-60ff-480f-928c-c58193eb86b3"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-9640ac1f-0de0-4082-8001-a2e3a0329d8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9640ac1f-0de0-4082-8001-a2e3a0329d8e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9640ac1f-0de0-4082-8001-a2e3a0329d8e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9640ac1f-0de0-4082-8001-a2e3a0329d8e"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-d72c5e63-b3fc-466c-bba7-9e15cd02e968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d72c5e63-b3fc-466c-bba7-9e15cd02e968
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d72c5e63-b3fc-466c-bba7-9e15cd02e968
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

{"id":"acc_242c526b-84dc-4aaa-8b17-5cefd9cb58d1","handle":"qa-d1b978ed8b2e","displayName":"QA d1b978ed8b2e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:40.956812896Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-52332342-8e54-48f2-a2b2-7f9b776e1b2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52332342-8e54-48f2-a2b2-7f9b776e1b2b
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Fri, 23 Oct 2026 07:41:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-52332342-8e54-48f2-a2b2-7f9b776e1b2b
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
correlation: qa-c89b8eff-b7af-45a7-8ba2-977dd725f200

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c89b8eff-b7af-45a7-8ba2-977dd725f200
Content-Type: application/json

--- request body ---
{"handle":"qa-d1b978ed8b2e","password":"****"}

--- response: 401 in 2 ms ---
Date: Fri, 23 Oct 2026 07:41:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c89b8eff-b7af-45a7-8ba2-977dd725f200
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c89b8eff-b7af-45a7-8ba2-977dd725f200"}
```
