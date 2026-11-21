# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 82 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 460 | `qa-ee82bea8-debd-43ce-b3b1-0556f7550798` |
| 2 | `POST /v1/auth/token` | 200 | 77 | `qa-07201060-0f8e-4d8b-bbd5-84303dd2c9f4` |
| 3 | `GET /v1/accounts/me` | 200 | 57 | `qa-e9547ad0-724c-4c9f-ae01-d2030c86f490` |
| 4 | `GET /v1/accounts/me` | 200 | 21 | `qa-f435f313-4b6d-4563-b18d-63ef299d687b` |
| 5 | `GET /v1/accounts/me` | 200 | 27 | `qa-7588c839-3e87-44c2-ba2f-b812bc24e99d` |
| 6 | `GET /v1/accounts/me` | 200 | 23 | `qa-aca0abfa-0dbb-46e0-b68e-61be15cacdf6` |
| 7 | `GET /v1/accounts/me` | 200 | 16 | `qa-70070865-bcb8-4ed5-9921-a3eefeb7d96f` |
| 8 | `GET /v1/accounts/me` | 200 | 13 | `qa-7e6e27fa-b7de-4454-a5fd-507532ef10e3` |
| 9 | `GET /v1/accounts/me` | 200 | 17 | `qa-5bbf86d0-0a48-4df8-b5b0-b3cbf4c00682` |
| 10 | `GET /v1/accounts/me` | 200 | 24 | `qa-8f797c81-ca14-4651-b197-1b13189097b7` |
| 11 | `GET /v1/accounts/me` | 200 | 11 | `qa-5973bd08-1617-4085-9d15-98120b70ded7` |
| 12 | `GET /v1/accounts/me` | 200 | 10 | `qa-9f35832e-d497-428c-9af1-81175ef65132` |
| 13 | `GET /v1/accounts/me` | 200 | 13 | `qa-23505dc1-92e7-47a7-8429-62c72873c8b6` |
| 14 | `GET /v1/accounts/me` | 200 | 13 | `qa-5422ce57-5fa9-4979-8481-905aeb65fc9b` |
| 15 | `GET /v1/accounts/me` | 200 | 10 | `qa-43431676-10bf-423b-aa83-65687639a58d` |
| 16 | `GET /v1/accounts/me` | 200 | 8 | `qa-6153ac2f-6770-4b99-9836-c7be37cdd656` |
| 17 | `GET /v1/accounts/me` | 200 | 11 | `qa-75b5f9f7-8a39-48df-99c0-8c0271fecb9b` |
| 18 | `GET /v1/accounts/me` | 200 | 14 | `qa-01cd0199-c8b4-41be-b699-4ac0830dd5ac` |
| 19 | `GET /v1/accounts/me` | 200 | 12 | `qa-11333177-37cc-4685-9486-622a9c2f753b` |
| 20 | `GET /v1/accounts/me` | 200 | 8 | `qa-d16c22cb-8cf5-442f-a78f-c47191c90641` |
| 21 | `GET /v1/accounts/me` | 200 | 8 | `qa-f732835d-57e5-4c3d-8c16-a8981178a09b` |
| 22 | `GET /v1/accounts/me` | 200 | 11 | `qa-d5849eb7-0b52-442d-9d4d-a55feb2b2855` |
| 23 | `GET /v1/accounts/me` | 200 | 10 | `qa-68e128cd-cbe7-42ed-b0b0-ca925e0c7895` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-518fcfcd-9fda-49cd-a5da-8772e1810fbd` |
| 25 | `GET /v1/accounts/me` | 200 | 11 | `qa-15cb0995-87ed-4ca1-a400-158a7f0b5a3d` |
| 26 | `GET /v1/accounts/me` | 200 | 8 | `qa-aa1d9eed-8945-4896-b2d3-9893836791de` |
| 27 | `GET /v1/accounts/me` | 200 | 9 | `qa-15043968-b861-4083-9fa9-a40c8bdef843` |
| 28 | `GET /v1/accounts/me` | 200 | 10 | `qa-9f312a1f-fbec-4c3f-ba9a-dec65f7316ac` |
| 29 | `GET /v1/accounts/me` | 200 | 10 | `qa-0eb6a79e-607e-4968-b7a6-590be5d9813a` |
| 30 | `GET /v1/accounts/me` | 200 | 8 | `qa-2429d43d-ffa0-4e2c-bb13-72fc608ca338` |
| 31 | `GET /v1/accounts/me` | 200 | 12 | `qa-ae64276c-c13a-4c0d-9e28-4b9dc4937447` |
| 32 | `GET /v1/accounts/me` | 200 | 17 | `qa-948f86a0-3ccf-4784-b66a-ba3a61b6b802` |
| 33 | `GET /v1/accounts/me` | 200 | 7 | `qa-bb443729-9600-4e46-80ac-e1d08dba3e0a` |
| 34 | `GET /v1/accounts/me` | 200 | 13 | `qa-7b128576-b973-48e1-b9e0-ec25ffc3821f` |
| 35 | `GET /v1/accounts/me` | 200 | 14 | `qa-d015f51c-5417-4e96-a95e-a44bdd94abe0` |
| 36 | `GET /v1/accounts/me` | 200 | 12 | `qa-18c58afb-e9e9-4d60-bc88-f9df917697c1` |
| 37 | `GET /v1/accounts/me` | 200 | 7 | `qa-396feb0d-d3e7-4ccc-9f7d-2ffcd92e3ecf` |
| 38 | `GET /v1/accounts/me` | 200 | 23 | `qa-a37b7a5d-85d4-4548-8618-3533ab02694e` |
| 39 | `GET /v1/accounts/me` | 200 | 16 | `qa-1307a4fb-6049-4176-bec7-7080c7efd873` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-2fc2d647-58be-4b11-a9c3-190018dfb343` |
| 41 | `GET /v1/accounts/me` | 200 | 7 | `qa-2ef4a408-c494-46f6-a12d-49a11fec3cbf` |
| 42 | `GET /v1/accounts/me` | 200 | 12 | `qa-0e983e84-5ede-40d9-9721-506602a38b11` |
| 43 | `GET /v1/accounts/me` | 200 | 12 | `qa-e0e2685e-6024-46e9-ab9f-06cc143c4c53` |
| 44 | `GET /v1/accounts/me` | 200 | 6 | `qa-908d16af-6d2e-4bd2-8d9c-943c2292ee01` |
| 45 | `GET /v1/accounts/me` | 200 | 14 | `qa-a3be9318-066a-42b0-a8cd-cc97f7c95ef5` |
| 46 | `GET /v1/accounts/me` | 200 | 7 | `qa-94584cec-f421-411c-9cc7-58c1b4aa8599` |
| 47 | `GET /v1/accounts/me` | 200 | 7 | `qa-f12a0750-f2c9-482e-8aac-53b1ccb2e6c7` |
| 48 | `GET /v1/accounts/me` | 200 | 9 | `qa-d3ccb234-5300-4911-9938-4c241f547ea1` |
| 49 | `GET /v1/accounts/me` | 200 | 11 | `qa-5460ff03-c460-4cc2-a18e-d6b842193e10` |
| 50 | `GET /v1/accounts/me` | 200 | 15 | `qa-63f88478-af55-4e57-a153-200e0d9e23d7` |
| 51 | `GET /v1/accounts/me` | 200 | 17 | `qa-a3e7cd74-49ea-4d91-810d-c0e2a1c70147` |
| 52 | `GET /v1/accounts/me` | 200 | 9 | `qa-da82af52-d607-4212-a166-12ab720c6c54` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-6fe97813-aea8-4d08-8f01-b1246efd4ce3` |
| 54 | `GET /v1/accounts/me` | 200 | 14 | `qa-47bff6bb-568e-4509-8e02-3f3860252ba1` |
| 55 | `GET /v1/accounts/me` | 200 | 9 | `qa-2d7bef38-6444-4e71-8af9-91163060e93c` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-823bc09f-c14e-48c6-ae95-abe86809453b` |
| 57 | `GET /v1/accounts/me` | 200 | 7 | `qa-f84f94fa-845d-42f8-9fe2-23ce05b54287` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-cb601b6a-2c0c-40f3-8d38-fe0fcf57154c` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-8a6d48b6-870c-4c3b-bafc-97049e66e4a0` |
| 60 | `GET /v1/accounts/me` | 200 | 9 | `qa-da624c8f-ba9e-407d-9867-fb0ebfbde58b` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-71d2cc52-6165-45e8-9ed4-2c0f2385ea30` |
| 62 | `GET /v1/accounts/me` | 200 | 8 | `qa-13020274-9039-42c6-bf73-eee464cbda59` |
| 63 | `GET /v1/accounts/me` | 429 | 8 | `qa-84f74176-a35d-455b-9dc0-d7118064e5e5` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-610cb1a1-fbba-4453-a8dc-b3b048ebb419` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-c83b8f42-c6d4-48b0-9680-2557ce00f0c0` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-ba5c41a6-8afe-4976-86de-0f9250f13deb` |
| 67 | `GET /v1/accounts/me` | 429 | 8 | `qa-cf1e4593-3c71-47d6-9e50-441d77bfea0a` |
| 68 | `GET /v1/accounts/me` | 429 | 6 | `qa-d1562191-ec1a-41b8-9242-11062f8d9be1` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-590d6c4b-76a1-4322-afb8-64c369af97b9` |
| 70 | `GET /v1/accounts/me` | 429 | 5 | `qa-c5bf0af0-cc85-41a4-a65c-84d36cf5ab89` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-aa617653-a679-43b7-bb13-07544ebf7f71` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-c39b43e9-daa5-46b9-9fd5-cb8eac90f712` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-87609c09-d678-40bd-abbd-2dac5d115386` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-2e5b7aef-ed03-4c2c-b927-40404e352b0f` |
| 75 | `GET /v1/accounts/me` | 429 | 6 | `qa-cde3325f-0b01-46ae-b92f-d985c7bd9117` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-75c7e47b-d659-4654-aeab-4d47520a3f63` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-d72beda3-7052-430e-b1fa-dd4327fd719c` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-bc654236-2cd9-4f8d-8ef0-dcc251a1b7dd` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-b1355faf-a285-4e20-8752-05cdce5c3696` |
| 80 | `GET /v1/accounts/me` | 200 | 4 | `qa-7b1fd5b5-6f80-421d-a615-609700bc88dc` |
| 81 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-561ad8eb-6007-49c4-813b-2801f428051b` |
| 82 | `POST /v1/auth/token` | 401 | 4 | `qa-f02ac154-a843-4b99-8df3-0ed4a7ecb4dd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee82bea8-debd-43ce-b3b1-0556f7550798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee82bea8-debd-43ce-b3b1-0556f7550798
Content-Type: application/json

--- request body ---
{"handle":"qa-844bc7528499","displayName":"QA 844bc7528499","password":"****","region":"eu"}

--- response: 201 in 460 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee82bea8-debd-43ce-b3b1-0556f7550798
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
Location: /v1/accounts/qa-844bc7528499
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-07201060-0f8e-4d8b-bbd5-84303dd2c9f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07201060-0f8e-4d8b-bbd5-84303dd2c9f4
Content-Type: application/json

--- request body ---
{"handle":"qa-844bc7528499","password":"****"}

--- response: 200 in 77 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-07201060-0f8e-4d8b-bbd5-84303dd2c9f4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9547ad0-724c-4c9f-ae01-d2030c86f490

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9547ad0-724c-4c9f-ae01-d2030c86f490
Content-Type: application/json

--- response: 200 in 57 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9547ad0-724c-4c9f-ae01-d2030c86f490
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-f435f313-4b6d-4563-b18d-63ef299d687b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f435f313-4b6d-4563-b18d-63ef299d687b
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f435f313-4b6d-4563-b18d-63ef299d687b
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-7588c839-3e87-44c2-ba2f-b812bc24e99d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7588c839-3e87-44c2-ba2f-b812bc24e99d
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7588c839-3e87-44c2-ba2f-b812bc24e99d
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-aca0abfa-0dbb-46e0-b68e-61be15cacdf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aca0abfa-0dbb-46e0-b68e-61be15cacdf6
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-aca0abfa-0dbb-46e0-b68e-61be15cacdf6
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-70070865-bcb8-4ed5-9921-a3eefeb7d96f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70070865-bcb8-4ed5-9921-a3eefeb7d96f
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-70070865-bcb8-4ed5-9921-a3eefeb7d96f
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e6e27fa-b7de-4454-a5fd-507532ef10e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e6e27fa-b7de-4454-a5fd-507532ef10e3
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e6e27fa-b7de-4454-a5fd-507532ef10e3
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-5bbf86d0-0a48-4df8-b5b0-b3cbf4c00682

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bbf86d0-0a48-4df8-b5b0-b3cbf4c00682
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bbf86d0-0a48-4df8-b5b0-b3cbf4c00682
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f797c81-ca14-4651-b197-1b13189097b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f797c81-ca14-4651-b197-1b13189097b7
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f797c81-ca14-4651-b197-1b13189097b7
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-5973bd08-1617-4085-9d15-98120b70ded7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5973bd08-1617-4085-9d15-98120b70ded7
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5973bd08-1617-4085-9d15-98120b70ded7
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f35832e-d497-428c-9af1-81175ef65132

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f35832e-d497-428c-9af1-81175ef65132
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f35832e-d497-428c-9af1-81175ef65132
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-23505dc1-92e7-47a7-8429-62c72873c8b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23505dc1-92e7-47a7-8429-62c72873c8b6
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-23505dc1-92e7-47a7-8429-62c72873c8b6
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-5422ce57-5fa9-4979-8481-905aeb65fc9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5422ce57-5fa9-4979-8481-905aeb65fc9b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5422ce57-5fa9-4979-8481-905aeb65fc9b
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-43431676-10bf-423b-aa83-65687639a58d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43431676-10bf-423b-aa83-65687639a58d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-43431676-10bf-423b-aa83-65687639a58d
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-6153ac2f-6770-4b99-9836-c7be37cdd656

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6153ac2f-6770-4b99-9836-c7be37cdd656
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6153ac2f-6770-4b99-9836-c7be37cdd656
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-75b5f9f7-8a39-48df-99c0-8c0271fecb9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75b5f9f7-8a39-48df-99c0-8c0271fecb9b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-75b5f9f7-8a39-48df-99c0-8c0271fecb9b
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-01cd0199-c8b4-41be-b699-4ac0830dd5ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01cd0199-c8b4-41be-b699-4ac0830dd5ac
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-01cd0199-c8b4-41be-b699-4ac0830dd5ac
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-11333177-37cc-4685-9486-622a9c2f753b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11333177-37cc-4685-9486-622a9c2f753b
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-11333177-37cc-4685-9486-622a9c2f753b
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-d16c22cb-8cf5-442f-a78f-c47191c90641

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d16c22cb-8cf5-442f-a78f-c47191c90641
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d16c22cb-8cf5-442f-a78f-c47191c90641
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-f732835d-57e5-4c3d-8c16-a8981178a09b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f732835d-57e5-4c3d-8c16-a8981178a09b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f732835d-57e5-4c3d-8c16-a8981178a09b
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5849eb7-0b52-442d-9d4d-a55feb2b2855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5849eb7-0b52-442d-9d4d-a55feb2b2855
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5849eb7-0b52-442d-9d4d-a55feb2b2855
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-68e128cd-cbe7-42ed-b0b0-ca925e0c7895

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68e128cd-cbe7-42ed-b0b0-ca925e0c7895
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-68e128cd-cbe7-42ed-b0b0-ca925e0c7895
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-518fcfcd-9fda-49cd-a5da-8772e1810fbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-518fcfcd-9fda-49cd-a5da-8772e1810fbd
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-518fcfcd-9fda-49cd-a5da-8772e1810fbd
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-15cb0995-87ed-4ca1-a400-158a7f0b5a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15cb0995-87ed-4ca1-a400-158a7f0b5a3d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-15cb0995-87ed-4ca1-a400-158a7f0b5a3d
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa1d9eed-8945-4896-b2d3-9893836791de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa1d9eed-8945-4896-b2d3-9893836791de
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa1d9eed-8945-4896-b2d3-9893836791de
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-15043968-b861-4083-9fa9-a40c8bdef843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15043968-b861-4083-9fa9-a40c8bdef843
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-15043968-b861-4083-9fa9-a40c8bdef843
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f312a1f-fbec-4c3f-ba9a-dec65f7316ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f312a1f-fbec-4c3f-ba9a-dec65f7316ac
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f312a1f-fbec-4c3f-ba9a-dec65f7316ac
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-0eb6a79e-607e-4968-b7a6-590be5d9813a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eb6a79e-607e-4968-b7a6-590be5d9813a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-0eb6a79e-607e-4968-b7a6-590be5d9813a
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-2429d43d-ffa0-4e2c-bb13-72fc608ca338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2429d43d-ffa0-4e2c-bb13-72fc608ca338
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2429d43d-ffa0-4e2c-bb13-72fc608ca338
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae64276c-c13a-4c0d-9e28-4b9dc4937447

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae64276c-c13a-4c0d-9e28-4b9dc4937447
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae64276c-c13a-4c0d-9e28-4b9dc4937447
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-948f86a0-3ccf-4784-b66a-ba3a61b6b802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-948f86a0-3ccf-4784-b66a-ba3a61b6b802
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-948f86a0-3ccf-4784-b66a-ba3a61b6b802
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb443729-9600-4e46-80ac-e1d08dba3e0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb443729-9600-4e46-80ac-e1d08dba3e0a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb443729-9600-4e46-80ac-e1d08dba3e0a
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b128576-b973-48e1-b9e0-ec25ffc3821f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b128576-b973-48e1-b9e0-ec25ffc3821f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b128576-b973-48e1-b9e0-ec25ffc3821f
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-d015f51c-5417-4e96-a95e-a44bdd94abe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d015f51c-5417-4e96-a95e-a44bdd94abe0
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d015f51c-5417-4e96-a95e-a44bdd94abe0
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-18c58afb-e9e9-4d60-bc88-f9df917697c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18c58afb-e9e9-4d60-bc88-f9df917697c1
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-18c58afb-e9e9-4d60-bc88-f9df917697c1
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-396feb0d-d3e7-4ccc-9f7d-2ffcd92e3ecf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-396feb0d-d3e7-4ccc-9f7d-2ffcd92e3ecf
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-396feb0d-d3e7-4ccc-9f7d-2ffcd92e3ecf
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-a37b7a5d-85d4-4548-8618-3533ab02694e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a37b7a5d-85d4-4548-8618-3533ab02694e
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a37b7a5d-85d4-4548-8618-3533ab02694e
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-1307a4fb-6049-4176-bec7-7080c7efd873

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1307a4fb-6049-4176-bec7-7080c7efd873
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1307a4fb-6049-4176-bec7-7080c7efd873
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-2fc2d647-58be-4b11-a9c3-190018dfb343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fc2d647-58be-4b11-a9c3-190018dfb343
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fc2d647-58be-4b11-a9c3-190018dfb343
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ef4a408-c494-46f6-a12d-49a11fec3cbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef4a408-c494-46f6-a12d-49a11fec3cbf
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ef4a408-c494-46f6-a12d-49a11fec3cbf
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e983e84-5ede-40d9-9721-506602a38b11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e983e84-5ede-40d9-9721-506602a38b11
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e983e84-5ede-40d9-9721-506602a38b11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0e2685e-6024-46e9-ab9f-06cc143c4c53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0e2685e-6024-46e9-ab9f-06cc143c4c53
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0e2685e-6024-46e9-ab9f-06cc143c4c53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-908d16af-6d2e-4bd2-8d9c-943c2292ee01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-908d16af-6d2e-4bd2-8d9c-943c2292ee01
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-908d16af-6d2e-4bd2-8d9c-943c2292ee01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3be9318-066a-42b0-a8cd-cc97f7c95ef5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3be9318-066a-42b0-a8cd-cc97f7c95ef5
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3be9318-066a-42b0-a8cd-cc97f7c95ef5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-94584cec-f421-411c-9cc7-58c1b4aa8599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94584cec-f421-411c-9cc7-58c1b4aa8599
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-94584cec-f421-411c-9cc7-58c1b4aa8599
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-f12a0750-f2c9-482e-8aac-53b1ccb2e6c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f12a0750-f2c9-482e-8aac-53b1ccb2e6c7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f12a0750-f2c9-482e-8aac-53b1ccb2e6c7
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3ccb234-5300-4911-9938-4c241f547ea1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3ccb234-5300-4911-9938-4c241f547ea1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3ccb234-5300-4911-9938-4c241f547ea1
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-5460ff03-c460-4cc2-a18e-d6b842193e10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5460ff03-c460-4cc2-a18e-d6b842193e10
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5460ff03-c460-4cc2-a18e-d6b842193e10
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-63f88478-af55-4e57-a153-200e0d9e23d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63f88478-af55-4e57-a153-200e0d9e23d7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-63f88478-af55-4e57-a153-200e0d9e23d7
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3e7cd74-49ea-4d91-810d-c0e2a1c70147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3e7cd74-49ea-4d91-810d-c0e2a1c70147
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3e7cd74-49ea-4d91-810d-c0e2a1c70147
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-da82af52-d607-4212-a166-12ab720c6c54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da82af52-d607-4212-a166-12ab720c6c54
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-da82af52-d607-4212-a166-12ab720c6c54
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-6fe97813-aea8-4d08-8f01-b1246efd4ce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fe97813-aea8-4d08-8f01-b1246efd4ce3
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fe97813-aea8-4d08-8f01-b1246efd4ce3
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-47bff6bb-568e-4509-8e02-3f3860252ba1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47bff6bb-568e-4509-8e02-3f3860252ba1
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-47bff6bb-568e-4509-8e02-3f3860252ba1
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d7bef38-6444-4e71-8af9-91163060e93c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d7bef38-6444-4e71-8af9-91163060e93c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d7bef38-6444-4e71-8af9-91163060e93c
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-823bc09f-c14e-48c6-ae95-abe86809453b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-823bc09f-c14e-48c6-ae95-abe86809453b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-823bc09f-c14e-48c6-ae95-abe86809453b
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-f84f94fa-845d-42f8-9fe2-23ce05b54287

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f84f94fa-845d-42f8-9fe2-23ce05b54287
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f84f94fa-845d-42f8-9fe2-23ce05b54287
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb601b6a-2c0c-40f3-8d38-fe0fcf57154c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb601b6a-2c0c-40f3-8d38-fe0fcf57154c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb601b6a-2c0c-40f3-8d38-fe0fcf57154c
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a6d48b6-870c-4c3b-bafc-97049e66e4a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a6d48b6-870c-4c3b-bafc-97049e66e4a0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a6d48b6-870c-4c3b-bafc-97049e66e4a0
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-da624c8f-ba9e-407d-9867-fb0ebfbde58b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da624c8f-ba9e-407d-9867-fb0ebfbde58b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-da624c8f-ba9e-407d-9867-fb0ebfbde58b
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-71d2cc52-6165-45e8-9ed4-2c0f2385ea30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71d2cc52-6165-45e8-9ed4-2c0f2385ea30
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-71d2cc52-6165-45e8-9ed4-2c0f2385ea30
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-13020274-9039-42c6-bf73-eee464cbda59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13020274-9039-42c6-bf73-eee464cbda59
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-13020274-9039-42c6-bf73-eee464cbda59
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-84f74176-a35d-455b-9dc0-d7118064e5e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84f74176-a35d-455b-9dc0-d7118064e5e5
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84f74176-a35d-455b-9dc0-d7118064e5e5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-84f74176-a35d-455b-9dc0-d7118064e5e5"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-610cb1a1-fbba-4453-a8dc-b3b048ebb419

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-610cb1a1-fbba-4453-a8dc-b3b048ebb419
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-610cb1a1-fbba-4453-a8dc-b3b048ebb419
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-610cb1a1-fbba-4453-a8dc-b3b048ebb419"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-c83b8f42-c6d4-48b0-9680-2557ce00f0c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c83b8f42-c6d4-48b0-9680-2557ce00f0c0
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c83b8f42-c6d4-48b0-9680-2557ce00f0c0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c83b8f42-c6d4-48b0-9680-2557ce00f0c0"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba5c41a6-8afe-4976-86de-0f9250f13deb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba5c41a6-8afe-4976-86de-0f9250f13deb
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba5c41a6-8afe-4976-86de-0f9250f13deb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ba5c41a6-8afe-4976-86de-0f9250f13deb"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf1e4593-3c71-47d6-9e50-441d77bfea0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf1e4593-3c71-47d6-9e50-441d77bfea0a
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf1e4593-3c71-47d6-9e50-441d77bfea0a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cf1e4593-3c71-47d6-9e50-441d77bfea0a"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1562191-ec1a-41b8-9242-11062f8d9be1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1562191-ec1a-41b8-9242-11062f8d9be1
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1562191-ec1a-41b8-9242-11062f8d9be1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d1562191-ec1a-41b8-9242-11062f8d9be1"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-590d6c4b-76a1-4322-afb8-64c369af97b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-590d6c4b-76a1-4322-afb8-64c369af97b9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-590d6c4b-76a1-4322-afb8-64c369af97b9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-590d6c4b-76a1-4322-afb8-64c369af97b9"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5bf0af0-cc85-41a4-a65c-84d36cf5ab89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5bf0af0-cc85-41a4-a65c-84d36cf5ab89
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5bf0af0-cc85-41a4-a65c-84d36cf5ab89
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c5bf0af0-cc85-41a4-a65c-84d36cf5ab89"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa617653-a679-43b7-bb13-07544ebf7f71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa617653-a679-43b7-bb13-07544ebf7f71
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa617653-a679-43b7-bb13-07544ebf7f71
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-aa617653-a679-43b7-bb13-07544ebf7f71"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-c39b43e9-daa5-46b9-9fd5-cb8eac90f712

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39b43e9-daa5-46b9-9fd5-cb8eac90f712
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c39b43e9-daa5-46b9-9fd5-cb8eac90f712
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c39b43e9-daa5-46b9-9fd5-cb8eac90f712"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-87609c09-d678-40bd-abbd-2dac5d115386

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87609c09-d678-40bd-abbd-2dac5d115386
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87609c09-d678-40bd-abbd-2dac5d115386
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-87609c09-d678-40bd-abbd-2dac5d115386"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e5b7aef-ed03-4c2c-b927-40404e352b0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e5b7aef-ed03-4c2c-b927-40404e352b0f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e5b7aef-ed03-4c2c-b927-40404e352b0f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2e5b7aef-ed03-4c2c-b927-40404e352b0f"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-cde3325f-0b01-46ae-b92f-d985c7bd9117

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cde3325f-0b01-46ae-b92f-d985c7bd9117
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cde3325f-0b01-46ae-b92f-d985c7bd9117
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cde3325f-0b01-46ae-b92f-d985c7bd9117"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-75c7e47b-d659-4654-aeab-4d47520a3f63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75c7e47b-d659-4654-aeab-4d47520a3f63
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75c7e47b-d659-4654-aeab-4d47520a3f63
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-75c7e47b-d659-4654-aeab-4d47520a3f63"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-d72beda3-7052-430e-b1fa-dd4327fd719c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d72beda3-7052-430e-b1fa-dd4327fd719c
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 16 Nov 2026 09:54:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d72beda3-7052-430e-b1fa-dd4327fd719c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d72beda3-7052-430e-b1fa-dd4327fd719c"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc654236-2cd9-4f8d-8ef0-dcc251a1b7dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc654236-2cd9-4f8d-8ef0-dcc251a1b7dd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc654236-2cd9-4f8d-8ef0-dcc251a1b7dd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bc654236-2cd9-4f8d-8ef0-dcc251a1b7dd"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1355faf-a285-4e20-8752-05cdce5c3696

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1355faf-a285-4e20-8752-05cdce5c3696
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1355faf-a285-4e20-8752-05cdce5c3696
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b1355faf-a285-4e20-8752-05cdce5c3696"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b1fd5b5-6f80-421d-a615-609700bc88dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b1fd5b5-6f80-421d-a615-609700bc88dc
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b1fd5b5-6f80-421d-a615-609700bc88dc
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

{"id":"acc_6d5a1481-7770-4e4f-b9bc-942216dafe2b","handle":"qa-844bc7528499","displayName":"QA 844bc7528499","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250226879Z"}
```

## 81. DELETE /v1/accounts/me

```text
#81 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-561ad8eb-6007-49c4-813b-2801f428051b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-561ad8eb-6007-49c4-813b-2801f428051b
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 16 Nov 2026 09:54:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-561ad8eb-6007-49c4-813b-2801f428051b
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

## 82. POST /v1/auth/token

```text
#82 POST http://localhost:7070/v1/auth/token
correlation: qa-f02ac154-a843-4b99-8df3-0ed4a7ecb4dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f02ac154-a843-4b99-8df3-0ed4a7ecb4dd
Content-Type: application/json

--- request body ---
{"handle":"qa-844bc7528499","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f02ac154-a843-4b99-8df3-0ed4a7ecb4dd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f02ac154-a843-4b99-8df3-0ed4a7ecb4dd"}
```
