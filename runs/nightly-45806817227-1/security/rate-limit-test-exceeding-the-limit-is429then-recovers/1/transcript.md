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
| 1 | `POST /v1/accounts` | 201 | 297 | `qa-e1565287-c4bf-43fd-b2c0-e48b5c3636cb` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-c212da85-afde-42bb-a8ef-9067a4c0024e` |
| 3 | `GET /v1/accounts/me` | 200 | 59 | `qa-02bc1d83-7bb6-49c4-bb9b-b0e63a0cc2f4` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-2385f385-f666-44f1-a210-f19f57514cc1` |
| 5 | `GET /v1/accounts/me` | 200 | 29 | `qa-fd7230e6-12f4-47c6-a0b0-1af61509fcba` |
| 6 | `GET /v1/accounts/me` | 200 | 11 | `qa-40b85890-c81d-4e1d-ac1e-ac7aab4e9510` |
| 7 | `GET /v1/accounts/me` | 200 | 8 | `qa-bcc3394a-a68b-4910-86db-229d521f2348` |
| 8 | `GET /v1/accounts/me` | 200 | 6 | `qa-5de77cfd-7a97-4d28-b330-e1145c7c3e63` |
| 9 | `GET /v1/accounts/me` | 200 | 6 | `qa-a22fa556-be2d-4e8b-9a8b-b1f6b964df24` |
| 10 | `GET /v1/accounts/me` | 200 | 6 | `qa-230e6992-1764-46a1-927d-d9ac0e4f9d89` |
| 11 | `GET /v1/accounts/me` | 200 | 7 | `qa-d5a4f8e2-3963-45da-a7db-33b0ea18d7dc` |
| 12 | `GET /v1/accounts/me` | 200 | 6 | `qa-a8ab966e-315d-462d-ab8d-28c1f5918294` |
| 13 | `GET /v1/accounts/me` | 200 | 6 | `qa-16d9f593-4321-4362-837d-d64945ad760e` |
| 14 | `GET /v1/accounts/me` | 200 | 6 | `qa-d400b779-5522-457b-946b-e757ccdc22fc` |
| 15 | `GET /v1/accounts/me` | 200 | 7 | `qa-027bb92e-1dd3-4084-bbbd-be381f663164` |
| 16 | `GET /v1/accounts/me` | 200 | 8 | `qa-250142b6-9a23-4817-818f-ce4dc86fa29e` |
| 17 | `GET /v1/accounts/me` | 200 | 6 | `qa-e4945427-30f0-42ea-a105-758e29a0081b` |
| 18 | `GET /v1/accounts/me` | 200 | 6 | `qa-0202b514-f631-43c8-98db-f6b289220119` |
| 19 | `GET /v1/accounts/me` | 200 | 9 | `qa-36df67dd-215d-4e43-ac89-aed998c08b63` |
| 20 | `GET /v1/accounts/me` | 200 | 6 | `qa-bbd46431-724e-4d79-98b9-4b362c617cb0` |
| 21 | `GET /v1/accounts/me` | 200 | 11 | `qa-69dda0ef-b128-4f6b-b8ef-9441c0b9706d` |
| 22 | `GET /v1/accounts/me` | 200 | 13 | `qa-fdf3f498-5910-4f94-acf1-877a13144086` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-2afed0b3-30b9-4fbb-8e86-a2010347c662` |
| 24 | `GET /v1/accounts/me` | 200 | 6 | `qa-2b30f4c7-f172-4117-805e-bd4bff4d63fd` |
| 25 | `GET /v1/accounts/me` | 200 | 7 | `qa-f61219fa-690c-4794-9448-355ec148acd8` |
| 26 | `GET /v1/accounts/me` | 200 | 5 | `qa-787b2a4c-f0a6-4f55-aebd-f9b1f1d48532` |
| 27 | `GET /v1/accounts/me` | 200 | 8 | `qa-3f8c9aa5-df2d-4911-a809-a59d66cc4244` |
| 28 | `GET /v1/accounts/me` | 200 | 8 | `qa-f4ad6903-6f0b-49d4-b1ff-e5aeca8569d3` |
| 29 | `GET /v1/accounts/me` | 200 | 5 | `qa-5526dfc6-201b-4492-ad56-4f8b994a9d23` |
| 30 | `GET /v1/accounts/me` | 200 | 7 | `qa-f76fa570-7233-4344-b1ca-f1228024a464` |
| 31 | `GET /v1/accounts/me` | 200 | 6 | `qa-c2ffa648-2b3c-47c3-a944-a0be30762087` |
| 32 | `GET /v1/accounts/me` | 200 | 8 | `qa-a0093734-ec0b-4feb-8a16-90f8cc6a6e59` |
| 33 | `GET /v1/accounts/me` | 200 | 12 | `qa-17d37bfd-79dd-4ebe-bce0-7666923ade61` |
| 34 | `GET /v1/accounts/me` | 200 | 10 | `qa-3f770c31-4c32-4fa7-a158-87f5d7fb69e9` |
| 35 | `GET /v1/accounts/me` | 200 | 6 | `qa-0772bef6-db00-41b9-a71a-f7e4f1f4e9e0` |
| 36 | `GET /v1/accounts/me` | 200 | 6 | `qa-b5306562-9da4-40f0-bd68-3c10833d4d94` |
| 37 | `GET /v1/accounts/me` | 200 | 7 | `qa-effcbec4-a0e4-454b-9b44-a1b4cfda470b` |
| 38 | `GET /v1/accounts/me` | 200 | 7 | `qa-63a0b214-6bfa-43bf-9f3d-46806d2366c8` |
| 39 | `GET /v1/accounts/me` | 200 | 5 | `qa-8926611b-d1d5-4761-8b73-78f09f995451` |
| 40 | `GET /v1/accounts/me` | 200 | 3 | `qa-88b4c367-7701-4e7b-87ea-ca90c0c5015a` |
| 41 | `GET /v1/accounts/me` | 200 | 5 | `qa-295bcc20-fae8-4944-ad5d-14fe04de6cd5` |
| 42 | `GET /v1/accounts/me` | 200 | 9 | `qa-8ae74785-fcee-44f0-9d91-f6669fa66fc6` |
| 43 | `GET /v1/accounts/me` | 200 | 5 | `qa-ea86329e-3427-4c1a-9530-af12843aac50` |
| 44 | `GET /v1/accounts/me` | 200 | 4 | `qa-c9322bb7-e7e4-4cf6-aa02-70075acdc759` |
| 45 | `GET /v1/accounts/me` | 200 | 5 | `qa-45986b46-f779-4d1a-8462-e54d8fd87926` |
| 46 | `GET /v1/accounts/me` | 200 | 7 | `qa-c99821da-c8a1-4674-8fde-78ef16a05d42` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-c74d323f-9eb8-43b1-bf3e-34b0a11f2dc9` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-30f9f514-b661-4ae8-818f-e2478a34ac50` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-36c50e1b-cea0-4161-9c05-e9c769eec76b` |
| 50 | `GET /v1/accounts/me` | 200 | 5 | `qa-b01059bf-cf50-4d85-bb16-5aa2c5bfcaa4` |
| 51 | `GET /v1/accounts/me` | 200 | 6 | `qa-0bf43446-7d8b-4fc5-86ec-7bdea2f31fdc` |
| 52 | `GET /v1/accounts/me` | 200 | 6 | `qa-54c4f37d-f9ab-44d1-af6f-e0780d4150fd` |
| 53 | `GET /v1/accounts/me` | 200 | 5 | `qa-4b40561a-ab8e-4e28-b96e-2c2ffb9378be` |
| 54 | `GET /v1/accounts/me` | 200 | 4 | `qa-bdacf534-465c-43ab-8885-08563a3bc8dd` |
| 55 | `GET /v1/accounts/me` | 200 | 4 | `qa-0c33de38-3561-46a5-ab76-11e43d6e8bbd` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-9edce767-2c52-4675-b2c4-5f8dcd69ab5e` |
| 57 | `GET /v1/accounts/me` | 200 | 7 | `qa-c51e983e-de61-4c2f-82b1-4e7a26c46ed9` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-5edf24d7-961e-4f14-8863-93171aae0dd5` |
| 59 | `GET /v1/accounts/me` | 200 | 8 | `qa-035b981d-9f8d-484d-9613-2fafb175b89b` |
| 60 | `GET /v1/accounts/me` | 200 | 5 | `qa-9b8182de-de55-4f6c-b529-6a5e4a9770bb` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-f4ea07aa-5dc0-49ad-b7a4-1c78d3e09dcc` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-b8ce5da7-66bc-4599-8c45-037d0caf2d80` |
| 63 | `GET /v1/accounts/me` | 429 | 6 | `qa-5b42dee1-0eb1-4766-ba9a-03e98e0da8f6` |
| 64 | `GET /v1/accounts/me` | 429 | 4 | `qa-16ffe230-48a6-4bac-b65c-0a4e8e2b82e0` |
| 65 | `GET /v1/accounts/me` | 429 | 4 | `qa-d5356247-8f37-4f65-97e4-5fd077ee02c4` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-431bee7a-88ff-4560-a60d-a1a51478bdf6` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-8dded525-2d4a-4dfb-90af-d848d5d418fd` |
| 68 | `GET /v1/accounts/me` | 429 | 3 | `qa-e09ecebe-37ec-4d74-8273-b80fd31a90e0` |
| 69 | `GET /v1/accounts/me` | 429 | 3 | `qa-f733cf3a-5ffb-4efb-a6c4-9207a513a0b3` |
| 70 | `GET /v1/accounts/me` | 429 | 3 | `qa-6f20309e-1202-4b72-a7a9-bef311ed22c4` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-eb7705fe-829b-4814-b036-c4fbe8bbe8e4` |
| 72 | `GET /v1/accounts/me` | 429 | 3 | `qa-e613be38-f18c-47fb-881f-8ba8ceaa1ed3` |
| 73 | `GET /v1/accounts/me` | 429 | 8 | `qa-933584cd-ee8f-4c05-a04d-ac17cafe9c47` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-408598d6-7a43-4d7e-93a2-5331f762a850` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-78fc5fb9-ba13-4f68-93b0-9a71c0259afe` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-2d1e9320-28ca-4859-9a87-9b4aa7273642` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-ad6c0b66-58cd-4439-bd46-4a75eee2a007` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-128cb0b6-69aa-41f6-b662-23bec6a76148` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-f9507265-ef5e-4275-ba89-128ddad3ae9a` |
| 80 | `GET /v1/accounts/me` | 429 | 3 | `qa-0418a79b-bef9-4d59-81c5-d08fe066a6d6` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-0fba9910-9958-41c0-bf0d-0bae4e68f2e1` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-2c821ceb-a733-48ba-9b96-18b324a9a6fe` |
| 83 | `POST /v1/auth/token` | 401 | 4 | `qa-b8b72aa2-795e-4d84-9816-d4a4be8307d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e1565287-c4bf-43fd-b2c0-e48b5c3636cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1565287-c4bf-43fd-b2c0-e48b5c3636cb
Content-Type: application/json

--- request body ---
{"handle":"qa-814879db264f","displayName":"QA 814879db264f","password":"****","region":"eu"}

--- response: 201 in 297 ms ---
Date: Thu, 26 Nov 2026 11:02:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1565287-c4bf-43fd-b2c0-e48b5c3636cb
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
Location: /v1/accounts/qa-814879db264f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c212da85-afde-42bb-a8ef-9067a4c0024e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c212da85-afde-42bb-a8ef-9067a4c0024e
Content-Type: application/json

--- request body ---
{"handle":"qa-814879db264f","password":"****"}

--- response: 200 in 55 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-c212da85-afde-42bb-a8ef-9067a4c0024e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_056d16bc-950a-4290-b941-83e2f57732fb"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-02bc1d83-7bb6-49c4-bb9b-b0e63a0cc2f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02bc1d83-7bb6-49c4-bb9b-b0e63a0cc2f4
Content-Type: application/json

--- response: 200 in 59 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-02bc1d83-7bb6-49c4-bb9b-b0e63a0cc2f4
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-2385f385-f666-44f1-a210-f19f57514cc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2385f385-f666-44f1-a210-f19f57514cc1
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-2385f385-f666-44f1-a210-f19f57514cc1
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd7230e6-12f4-47c6-a0b0-1af61509fcba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd7230e6-12f4-47c6-a0b0-1af61509fcba
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd7230e6-12f4-47c6-a0b0-1af61509fcba
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-40b85890-c81d-4e1d-ac1e-ac7aab4e9510

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40b85890-c81d-4e1d-ac1e-ac7aab4e9510
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-40b85890-c81d-4e1d-ac1e-ac7aab4e9510
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-bcc3394a-a68b-4910-86db-229d521f2348

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcc3394a-a68b-4910-86db-229d521f2348
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcc3394a-a68b-4910-86db-229d521f2348
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-5de77cfd-7a97-4d28-b330-e1145c7c3e63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5de77cfd-7a97-4d28-b330-e1145c7c3e63
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-5de77cfd-7a97-4d28-b330-e1145c7c3e63
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-a22fa556-be2d-4e8b-9a8b-b1f6b964df24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a22fa556-be2d-4e8b-9a8b-b1f6b964df24
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-a22fa556-be2d-4e8b-9a8b-b1f6b964df24
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-230e6992-1764-46a1-927d-d9ac0e4f9d89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-230e6992-1764-46a1-927d-d9ac0e4f9d89
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-230e6992-1764-46a1-927d-d9ac0e4f9d89
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5a4f8e2-3963-45da-a7db-33b0ea18d7dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5a4f8e2-3963-45da-a7db-33b0ea18d7dc
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5a4f8e2-3963-45da-a7db-33b0ea18d7dc
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8ab966e-315d-462d-ab8d-28c1f5918294

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8ab966e-315d-462d-ab8d-28c1f5918294
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8ab966e-315d-462d-ab8d-28c1f5918294
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-16d9f593-4321-4362-837d-d64945ad760e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16d9f593-4321-4362-837d-d64945ad760e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-16d9f593-4321-4362-837d-d64945ad760e
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-d400b779-5522-457b-946b-e757ccdc22fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d400b779-5522-457b-946b-e757ccdc22fc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-d400b779-5522-457b-946b-e757ccdc22fc
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-027bb92e-1dd3-4084-bbbd-be381f663164

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-027bb92e-1dd3-4084-bbbd-be381f663164
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-027bb92e-1dd3-4084-bbbd-be381f663164
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-250142b6-9a23-4817-818f-ce4dc86fa29e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-250142b6-9a23-4817-818f-ce4dc86fa29e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-250142b6-9a23-4817-818f-ce4dc86fa29e
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4945427-30f0-42ea-a105-758e29a0081b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4945427-30f0-42ea-a105-758e29a0081b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4945427-30f0-42ea-a105-758e29a0081b
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-0202b514-f631-43c8-98db-f6b289220119

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0202b514-f631-43c8-98db-f6b289220119
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-0202b514-f631-43c8-98db-f6b289220119
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-36df67dd-215d-4e43-ac89-aed998c08b63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36df67dd-215d-4e43-ac89-aed998c08b63
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-36df67dd-215d-4e43-ac89-aed998c08b63
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-bbd46431-724e-4d79-98b9-4b362c617cb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbd46431-724e-4d79-98b9-4b362c617cb0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbd46431-724e-4d79-98b9-4b362c617cb0
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-69dda0ef-b128-4f6b-b8ef-9441c0b9706d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69dda0ef-b128-4f6b-b8ef-9441c0b9706d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-69dda0ef-b128-4f6b-b8ef-9441c0b9706d
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-fdf3f498-5910-4f94-acf1-877a13144086

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdf3f498-5910-4f94-acf1-877a13144086
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdf3f498-5910-4f94-acf1-877a13144086
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-2afed0b3-30b9-4fbb-8e86-a2010347c662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2afed0b3-30b9-4fbb-8e86-a2010347c662
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-2afed0b3-30b9-4fbb-8e86-a2010347c662
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b30f4c7-f172-4117-805e-bd4bff4d63fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b30f4c7-f172-4117-805e-bd4bff4d63fd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b30f4c7-f172-4117-805e-bd4bff4d63fd
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-f61219fa-690c-4794-9448-355ec148acd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f61219fa-690c-4794-9448-355ec148acd8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-f61219fa-690c-4794-9448-355ec148acd8
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-787b2a4c-f0a6-4f55-aebd-f9b1f1d48532

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-787b2a4c-f0a6-4f55-aebd-f9b1f1d48532
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-787b2a4c-f0a6-4f55-aebd-f9b1f1d48532
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f8c9aa5-df2d-4911-a809-a59d66cc4244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f8c9aa5-df2d-4911-a809-a59d66cc4244
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f8c9aa5-df2d-4911-a809-a59d66cc4244
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4ad6903-6f0b-49d4-b1ff-e5aeca8569d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4ad6903-6f0b-49d4-b1ff-e5aeca8569d3
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4ad6903-6f0b-49d4-b1ff-e5aeca8569d3
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-5526dfc6-201b-4492-ad56-4f8b994a9d23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5526dfc6-201b-4492-ad56-4f8b994a9d23
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-5526dfc6-201b-4492-ad56-4f8b994a9d23
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-f76fa570-7233-4344-b1ca-f1228024a464

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f76fa570-7233-4344-b1ca-f1228024a464
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-f76fa570-7233-4344-b1ca-f1228024a464
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-c2ffa648-2b3c-47c3-a944-a0be30762087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2ffa648-2b3c-47c3-a944-a0be30762087
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2ffa648-2b3c-47c3-a944-a0be30762087
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0093734-ec0b-4feb-8a16-90f8cc6a6e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0093734-ec0b-4feb-8a16-90f8cc6a6e59
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0093734-ec0b-4feb-8a16-90f8cc6a6e59
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-17d37bfd-79dd-4ebe-bce0-7666923ade61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17d37bfd-79dd-4ebe-bce0-7666923ade61
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-17d37bfd-79dd-4ebe-bce0-7666923ade61
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f770c31-4c32-4fa7-a158-87f5d7fb69e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f770c31-4c32-4fa7-a158-87f5d7fb69e9
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f770c31-4c32-4fa7-a158-87f5d7fb69e9
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-0772bef6-db00-41b9-a71a-f7e4f1f4e9e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0772bef6-db00-41b9-a71a-f7e4f1f4e9e0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-0772bef6-db00-41b9-a71a-f7e4f1f4e9e0
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5306562-9da4-40f0-bd68-3c10833d4d94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5306562-9da4-40f0-bd68-3c10833d4d94
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5306562-9da4-40f0-bd68-3c10833d4d94
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-effcbec4-a0e4-454b-9b44-a1b4cfda470b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-effcbec4-a0e4-454b-9b44-a1b4cfda470b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-effcbec4-a0e4-454b-9b44-a1b4cfda470b
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-63a0b214-6bfa-43bf-9f3d-46806d2366c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63a0b214-6bfa-43bf-9f3d-46806d2366c8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-63a0b214-6bfa-43bf-9f3d-46806d2366c8
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-8926611b-d1d5-4761-8b73-78f09f995451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8926611b-d1d5-4761-8b73-78f09f995451
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-8926611b-d1d5-4761-8b73-78f09f995451
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-88b4c367-7701-4e7b-87ea-ca90c0c5015a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88b4c367-7701-4e7b-87ea-ca90c0c5015a
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-88b4c367-7701-4e7b-87ea-ca90c0c5015a
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-295bcc20-fae8-4944-ad5d-14fe04de6cd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-295bcc20-fae8-4944-ad5d-14fe04de6cd5
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-295bcc20-fae8-4944-ad5d-14fe04de6cd5
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ae74785-fcee-44f0-9d91-f6669fa66fc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ae74785-fcee-44f0-9d91-f6669fa66fc6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ae74785-fcee-44f0-9d91-f6669fa66fc6
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea86329e-3427-4c1a-9530-af12843aac50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea86329e-3427-4c1a-9530-af12843aac50
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea86329e-3427-4c1a-9530-af12843aac50
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9322bb7-e7e4-4cf6-aa02-70075acdc759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9322bb7-e7e4-4cf6-aa02-70075acdc759
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9322bb7-e7e4-4cf6-aa02-70075acdc759
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-45986b46-f779-4d1a-8462-e54d8fd87926

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45986b46-f779-4d1a-8462-e54d8fd87926
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-45986b46-f779-4d1a-8462-e54d8fd87926
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-c99821da-c8a1-4674-8fde-78ef16a05d42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c99821da-c8a1-4674-8fde-78ef16a05d42
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c99821da-c8a1-4674-8fde-78ef16a05d42
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-c74d323f-9eb8-43b1-bf3e-34b0a11f2dc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c74d323f-9eb8-43b1-bf3e-34b0a11f2dc9
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c74d323f-9eb8-43b1-bf3e-34b0a11f2dc9
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-30f9f514-b661-4ae8-818f-e2478a34ac50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30f9f514-b661-4ae8-818f-e2478a34ac50
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-30f9f514-b661-4ae8-818f-e2478a34ac50
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-36c50e1b-cea0-4161-9c05-e9c769eec76b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36c50e1b-cea0-4161-9c05-e9c769eec76b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-36c50e1b-cea0-4161-9c05-e9c769eec76b
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-b01059bf-cf50-4d85-bb16-5aa2c5bfcaa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b01059bf-cf50-4d85-bb16-5aa2c5bfcaa4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-b01059bf-cf50-4d85-bb16-5aa2c5bfcaa4
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-0bf43446-7d8b-4fc5-86ec-7bdea2f31fdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bf43446-7d8b-4fc5-86ec-7bdea2f31fdc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bf43446-7d8b-4fc5-86ec-7bdea2f31fdc
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-54c4f37d-f9ab-44d1-af6f-e0780d4150fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54c4f37d-f9ab-44d1-af6f-e0780d4150fd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-54c4f37d-f9ab-44d1-af6f-e0780d4150fd
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b40561a-ab8e-4e28-b96e-2c2ffb9378be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b40561a-ab8e-4e28-b96e-2c2ffb9378be
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b40561a-ab8e-4e28-b96e-2c2ffb9378be
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-bdacf534-465c-43ab-8885-08563a3bc8dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdacf534-465c-43ab-8885-08563a3bc8dd
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdacf534-465c-43ab-8885-08563a3bc8dd
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c33de38-3561-46a5-ab76-11e43d6e8bbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c33de38-3561-46a5-ab76-11e43d6e8bbd
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c33de38-3561-46a5-ab76-11e43d6e8bbd
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-9edce767-2c52-4675-b2c4-5f8dcd69ab5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9edce767-2c52-4675-b2c4-5f8dcd69ab5e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-9edce767-2c52-4675-b2c4-5f8dcd69ab5e
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-c51e983e-de61-4c2f-82b1-4e7a26c46ed9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c51e983e-de61-4c2f-82b1-4e7a26c46ed9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c51e983e-de61-4c2f-82b1-4e7a26c46ed9
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-5edf24d7-961e-4f14-8863-93171aae0dd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5edf24d7-961e-4f14-8863-93171aae0dd5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-5edf24d7-961e-4f14-8863-93171aae0dd5
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-035b981d-9f8d-484d-9613-2fafb175b89b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-035b981d-9f8d-484d-9613-2fafb175b89b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-035b981d-9f8d-484d-9613-2fafb175b89b
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b8182de-de55-4f6c-b529-6a5e4a9770bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b8182de-de55-4f6c-b529-6a5e4a9770bb
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b8182de-de55-4f6c-b529-6a5e4a9770bb
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4ea07aa-5dc0-49ad-b7a4-1c78d3e09dcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4ea07aa-5dc0-49ad-b7a4-1c78d3e09dcc
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4ea07aa-5dc0-49ad-b7a4-1c78d3e09dcc
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8ce5da7-66bc-4599-8c45-037d0caf2d80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8ce5da7-66bc-4599-8c45-037d0caf2d80
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8ce5da7-66bc-4599-8c45-037d0caf2d80
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b42dee1-0eb1-4766-ba9a-03e98e0da8f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b42dee1-0eb1-4766-ba9a-03e98e0da8f6
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b42dee1-0eb1-4766-ba9a-03e98e0da8f6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5b42dee1-0eb1-4766-ba9a-03e98e0da8f6"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-16ffe230-48a6-4bac-b65c-0a4e8e2b82e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16ffe230-48a6-4bac-b65c-0a4e8e2b82e0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16ffe230-48a6-4bac-b65c-0a4e8e2b82e0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-16ffe230-48a6-4bac-b65c-0a4e8e2b82e0"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5356247-8f37-4f65-97e4-5fd077ee02c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5356247-8f37-4f65-97e4-5fd077ee02c4
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5356247-8f37-4f65-97e4-5fd077ee02c4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d5356247-8f37-4f65-97e4-5fd077ee02c4"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-431bee7a-88ff-4560-a60d-a1a51478bdf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-431bee7a-88ff-4560-a60d-a1a51478bdf6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-431bee7a-88ff-4560-a60d-a1a51478bdf6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-431bee7a-88ff-4560-a60d-a1a51478bdf6"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-8dded525-2d4a-4dfb-90af-d848d5d418fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dded525-2d4a-4dfb-90af-d848d5d418fd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8dded525-2d4a-4dfb-90af-d848d5d418fd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8dded525-2d4a-4dfb-90af-d848d5d418fd"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-e09ecebe-37ec-4d74-8273-b80fd31a90e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e09ecebe-37ec-4d74-8273-b80fd31a90e0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e09ecebe-37ec-4d74-8273-b80fd31a90e0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e09ecebe-37ec-4d74-8273-b80fd31a90e0"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-f733cf3a-5ffb-4efb-a6c4-9207a513a0b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f733cf3a-5ffb-4efb-a6c4-9207a513a0b3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f733cf3a-5ffb-4efb-a6c4-9207a513a0b3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f733cf3a-5ffb-4efb-a6c4-9207a513a0b3"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f20309e-1202-4b72-a7a9-bef311ed22c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f20309e-1202-4b72-a7a9-bef311ed22c4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f20309e-1202-4b72-a7a9-bef311ed22c4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6f20309e-1202-4b72-a7a9-bef311ed22c4"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb7705fe-829b-4814-b036-c4fbe8bbe8e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb7705fe-829b-4814-b036-c4fbe8bbe8e4
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb7705fe-829b-4814-b036-c4fbe8bbe8e4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eb7705fe-829b-4814-b036-c4fbe8bbe8e4"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-e613be38-f18c-47fb-881f-8ba8ceaa1ed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e613be38-f18c-47fb-881f-8ba8ceaa1ed3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e613be38-f18c-47fb-881f-8ba8ceaa1ed3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e613be38-f18c-47fb-881f-8ba8ceaa1ed3"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-933584cd-ee8f-4c05-a04d-ac17cafe9c47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-933584cd-ee8f-4c05-a04d-ac17cafe9c47
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-933584cd-ee8f-4c05-a04d-ac17cafe9c47
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-933584cd-ee8f-4c05-a04d-ac17cafe9c47"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-408598d6-7a43-4d7e-93a2-5331f762a850

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-408598d6-7a43-4d7e-93a2-5331f762a850
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-408598d6-7a43-4d7e-93a2-5331f762a850
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-408598d6-7a43-4d7e-93a2-5331f762a850"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-78fc5fb9-ba13-4f68-93b0-9a71c0259afe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78fc5fb9-ba13-4f68-93b0-9a71c0259afe
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78fc5fb9-ba13-4f68-93b0-9a71c0259afe
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-78fc5fb9-ba13-4f68-93b0-9a71c0259afe"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d1e9320-28ca-4859-9a87-9b4aa7273642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d1e9320-28ca-4859-9a87-9b4aa7273642
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d1e9320-28ca-4859-9a87-9b4aa7273642
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2d1e9320-28ca-4859-9a87-9b4aa7273642"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad6c0b66-58cd-4439-bd46-4a75eee2a007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad6c0b66-58cd-4439-bd46-4a75eee2a007
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad6c0b66-58cd-4439-bd46-4a75eee2a007
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ad6c0b66-58cd-4439-bd46-4a75eee2a007"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-128cb0b6-69aa-41f6-b662-23bec6a76148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-128cb0b6-69aa-41f6-b662-23bec6a76148
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-128cb0b6-69aa-41f6-b662-23bec6a76148
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-128cb0b6-69aa-41f6-b662-23bec6a76148"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9507265-ef5e-4275-ba89-128ddad3ae9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9507265-ef5e-4275-ba89-128ddad3ae9a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9507265-ef5e-4275-ba89-128ddad3ae9a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f9507265-ef5e-4275-ba89-128ddad3ae9a"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-0418a79b-bef9-4d59-81c5-d08fe066a6d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0418a79b-bef9-4d59-81c5-d08fe066a6d6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0418a79b-bef9-4d59-81c5-d08fe066a6d6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0418a79b-bef9-4d59-81c5-d08fe066a6d6"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-0fba9910-9958-41c0-bf0d-0bae4e68f2e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fba9910-9958-41c0-bf0d-0bae4e68f2e1
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fba9910-9958-41c0-bf0d-0bae4e68f2e1
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

{"id":"acc_056d16bc-950a-4290-b941-83e2f57732fb","handle":"qa-814879db264f","displayName":"QA 814879db264f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.045856029Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c821ceb-a733-48ba-9b96-18b324a9a6fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c821ceb-a733-48ba-9b96-18b324a9a6fe
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c821ceb-a733-48ba-9b96-18b324a9a6fe
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
correlation: qa-b8b72aa2-795e-4d84-9816-d4a4be8307d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8b72aa2-795e-4d84-9816-d4a4be8307d5
Content-Type: application/json

--- request body ---
{"handle":"qa-814879db264f","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8b72aa2-795e-4d84-9816-d4a4be8307d5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8b72aa2-795e-4d84-9816-d4a4be8307d5"}
```
