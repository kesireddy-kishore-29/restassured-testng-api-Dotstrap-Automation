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
| 1 | `POST /v1/accounts` | 201 | 336 | `qa-9e567e28-d9a7-4093-8dbf-ec0f97c6552e` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-cbf7b9de-9895-499c-9faf-25fe29127de4` |
| 3 | `GET /v1/accounts/me` | 200 | 37 | `qa-202653ae-3f53-4f1d-a284-f77729c73ac1` |
| 4 | `GET /v1/accounts/me` | 200 | 18 | `qa-d42d22e5-a3b4-4bae-801c-1c25725580df` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-ab4ef6c9-c019-412e-882b-2b44f8d2a0c6` |
| 6 | `GET /v1/accounts/me` | 200 | 11 | `qa-724727c2-6b14-4703-ac7c-8724fd49232a` |
| 7 | `GET /v1/accounts/me` | 200 | 27 | `qa-94c5440a-502c-4b1f-98fb-da2b15511316` |
| 8 | `GET /v1/accounts/me` | 200 | 8 | `qa-f24c675a-38aa-447a-9835-929069cd8521` |
| 9 | `GET /v1/accounts/me` | 200 | 10 | `qa-4ef4654a-bf17-4511-b83d-940fb4261706` |
| 10 | `GET /v1/accounts/me` | 200 | 10 | `qa-9f09c1fb-e3be-4957-af08-8cd6debbc198` |
| 11 | `GET /v1/accounts/me` | 200 | 7 | `qa-0ab32364-71e5-42a2-aef0-85f072b834d8` |
| 12 | `GET /v1/accounts/me` | 200 | 7 | `qa-21061844-9860-464a-9142-54b64aa50bb2` |
| 13 | `GET /v1/accounts/me` | 200 | 6 | `qa-fcb54cf0-be21-452b-807d-cda209c37e4c` |
| 14 | `GET /v1/accounts/me` | 200 | 10 | `qa-b682066e-c3f4-4bf5-b072-7a6c049c327c` |
| 15 | `GET /v1/accounts/me` | 200 | 7 | `qa-e5d3236d-cd6c-41f7-ad3d-9bc96e1a7aa6` |
| 16 | `GET /v1/accounts/me` | 200 | 7 | `qa-048f16e4-4ceb-4eb0-a44d-6d0c361339bf` |
| 17 | `GET /v1/accounts/me` | 200 | 11 | `qa-30d36866-b236-4e22-a555-29ffece3694b` |
| 18 | `GET /v1/accounts/me` | 200 | 6 | `qa-63308621-def1-4c27-8d12-cb638d473395` |
| 19 | `GET /v1/accounts/me` | 200 | 6 | `qa-6a9a8c16-df73-4727-953c-9018ada799c5` |
| 20 | `GET /v1/accounts/me` | 200 | 6 | `qa-aa0948cb-f5bf-4e79-af15-9db89593d4be` |
| 21 | `GET /v1/accounts/me` | 200 | 8 | `qa-8b0c1bd1-39ac-4b28-9c44-0036850f4ddc` |
| 22 | `GET /v1/accounts/me` | 200 | 5 | `qa-3d3f2987-e5e5-4d82-9c14-790a34d1c7c5` |
| 23 | `GET /v1/accounts/me` | 200 | 7 | `qa-d561a4cd-7706-4d4e-92fd-efdf9bc8c1ad` |
| 24 | `GET /v1/accounts/me` | 200 | 5 | `qa-9bed7124-eb29-4ff0-8fe6-91ad594e6ffc` |
| 25 | `GET /v1/accounts/me` | 200 | 22 | `qa-e9c49a47-0de8-4450-b899-5f9e2505b815` |
| 26 | `GET /v1/accounts/me` | 200 | 10 | `qa-8a9e1c0f-5636-44ae-9dc2-6d65e4b3c244` |
| 27 | `GET /v1/accounts/me` | 200 | 9 | `qa-9e282d57-d4b1-4317-926b-04000b5700bf` |
| 28 | `GET /v1/accounts/me` | 200 | 5 | `qa-fdaccfc2-0eb7-47e7-9e87-5dcd9e661698` |
| 29 | `GET /v1/accounts/me` | 200 | 9 | `qa-7526439e-4b8d-4aff-93d8-f5a82203c50c` |
| 30 | `GET /v1/accounts/me` | 200 | 6 | `qa-79068a0e-96a9-400e-99a8-f1f5523786d6` |
| 31 | `GET /v1/accounts/me` | 200 | 8 | `qa-6acd4f5d-a9ee-4d00-9f3a-9f2be6ae538d` |
| 32 | `GET /v1/accounts/me` | 200 | 12 | `qa-050ab71a-b54c-4b15-a87b-99c43edfcb16` |
| 33 | `GET /v1/accounts/me` | 200 | 9 | `qa-9425d063-af53-44d5-8c87-9bb86792bf16` |
| 34 | `GET /v1/accounts/me` | 200 | 5 | `qa-06ecd6e2-ecdc-4710-9925-1dd55241dad3` |
| 35 | `GET /v1/accounts/me` | 200 | 5 | `qa-f6d48729-ef7f-4b10-913a-249f5c437270` |
| 36 | `GET /v1/accounts/me` | 200 | 5 | `qa-90e1d546-9747-4e49-ad40-31829ea3b96a` |
| 37 | `GET /v1/accounts/me` | 200 | 5 | `qa-fe2d6683-e397-4c78-977c-4e96eb9ee614` |
| 38 | `GET /v1/accounts/me` | 200 | 5 | `qa-f03cbd39-b515-47d1-9aeb-0d9c3fb9a26b` |
| 39 | `GET /v1/accounts/me` | 200 | 14 | `qa-a5c68414-e815-4dfe-8e2a-7629e4222a5b` |
| 40 | `GET /v1/accounts/me` | 200 | 11 | `qa-2a973f98-7130-402a-85e4-748115921458` |
| 41 | `GET /v1/accounts/me` | 200 | 9 | `qa-d34fa8a8-3c5d-40bc-9ffb-0f1f2c2188c9` |
| 42 | `GET /v1/accounts/me` | 200 | 3 | `qa-37ba2090-337a-4b6e-804a-b0252ed4bf5a` |
| 43 | `GET /v1/accounts/me` | 200 | 6 | `qa-b15ac7e4-d1bc-4304-afd4-569656c2d5b0` |
| 44 | `GET /v1/accounts/me` | 200 | 3 | `qa-a7492ef7-b7f2-4e11-89a0-129dbe60cdd6` |
| 45 | `GET /v1/accounts/me` | 200 | 7 | `qa-61a1c8f7-cbc6-43f8-a214-4815305e041d` |
| 46 | `GET /v1/accounts/me` | 200 | 5 | `qa-0e4c23d4-3a59-49f6-a070-c766d8980b18` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-cbff07a8-033a-44e0-b761-7c2674e7f29b` |
| 48 | `GET /v1/accounts/me` | 200 | 3 | `qa-eb5e37a1-3b99-4420-b7b5-32709b9beea6` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-e23b27f9-c0a4-40bf-a2d0-0794174fed5b` |
| 50 | `GET /v1/accounts/me` | 200 | 4 | `qa-e12585f2-3711-4060-86a9-73b249154af4` |
| 51 | `GET /v1/accounts/me` | 200 | 4 | `qa-945dd488-46fb-44ee-afd8-5eb06d532171` |
| 52 | `GET /v1/accounts/me` | 200 | 3 | `qa-0fef956f-a3b3-4e3d-bd69-5bb2eb1707ab` |
| 53 | `GET /v1/accounts/me` | 200 | 3 | `qa-bf75cb96-5976-4827-91b4-d64353e97da6` |
| 54 | `GET /v1/accounts/me` | 200 | 3 | `qa-8aff02ea-041d-4d3d-b5a1-d3adea87bc21` |
| 55 | `GET /v1/accounts/me` | 200 | 9 | `qa-dd594bca-7b7a-44bc-9e95-5589776a9310` |
| 56 | `GET /v1/accounts/me` | 200 | 36 | `qa-914d2254-1072-4358-a7dd-c7d5424529d0` |
| 57 | `GET /v1/accounts/me` | 200 | 9 | `qa-ae0e863b-98ba-4bc5-bbf0-8b57f503b3c0` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-931bb825-af0c-4545-8e27-63a3b297fd97` |
| 59 | `GET /v1/accounts/me` | 200 | 6 | `qa-e3b3b25d-5375-408a-a14d-eac425381ae7` |
| 60 | `GET /v1/accounts/me` | 200 | 4 | `qa-1c8a5076-364b-4f02-913c-ffb0a000bd54` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-bd883015-6946-46fa-bc60-128a06f225da` |
| 62 | `GET /v1/accounts/me` | 200 | 8 | `qa-6b041e87-99bc-4ac6-9783-ceb13c3da359` |
| 63 | `GET /v1/accounts/me` | 429 | 5 | `qa-d7d2e779-401c-4fd9-913a-229cdf42e2d1` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-5d93734e-1500-4fd0-84ae-d23d16d0183e` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-b6e4b8d9-d7f2-4762-bd37-4a35be94faa6` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-d6e2f1ca-9a1e-442a-b7d0-aa7be87ba2c8` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-128cfaa6-f438-486b-bcd4-1ffa63502536` |
| 68 | `GET /v1/accounts/me` | 429 | 5 | `qa-de818837-1526-4cd2-94a0-e7ecf4cf2376` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-bcee0150-bc1b-4941-95bf-b5bbb0789ed1` |
| 70 | `GET /v1/accounts/me` | 429 | 5 | `qa-000ea016-d81d-4420-9f07-5956cdc481ca` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-09bb4634-f2d9-45a8-a97b-c62e37d6a7d7` |
| 72 | `GET /v1/accounts/me` | 429 | 5 | `qa-54f7eb9e-2471-4607-9643-19e9fb038088` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-239b712a-ee97-4129-94bd-6604d9c0a156` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-c26ae6b6-5ae9-419d-a00e-13e14e4f2c83` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-c28c9b2f-5758-4a50-b75f-e636faf012d2` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-48011131-1774-4aac-b6ec-53dde3157bee` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-11a5a71b-73ae-4115-82f7-df5076aacc08` |
| 78 | `GET /v1/accounts/me` | 429 | 5 | `qa-2bfe3aea-e412-40d6-962d-def1542225da` |
| 79 | `GET /v1/accounts/me` | 429 | 5 | `qa-057fa38c-76c2-471b-8796-b4266b8d3929` |
| 80 | `GET /v1/accounts/me` | 429 | 5 | `qa-52f623b7-bab6-4f3f-bbd9-96d3cc755c37` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-02df1ce2-86c0-477d-b4ad-52b4a6fb4eb0` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-d95a5424-f0a4-44dc-8c0b-22d1d6bed92e` |
| 83 | `POST /v1/auth/token` | 401 | 3 | `qa-d7f8eb09-cbbc-441e-8375-c46b9e2a738c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e567e28-d9a7-4093-8dbf-ec0f97c6552e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e567e28-d9a7-4093-8dbf-ec0f97c6552e
Content-Type: application/json

--- request body ---
{"handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","password":"****","region":"eu"}

--- response: 201 in 336 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e567e28-d9a7-4093-8dbf-ec0f97c6552e
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
Location: /v1/accounts/qa-7547508e5f6b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cbf7b9de-9895-499c-9faf-25fe29127de4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbf7b9de-9895-499c-9faf-25fe29127de4
Content-Type: application/json

--- request body ---
{"handle":"qa-7547508e5f6b","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbf7b9de-9895-499c-9faf-25fe29127de4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-202653ae-3f53-4f1d-a284-f77729c73ac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-202653ae-3f53-4f1d-a284-f77729c73ac1
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-202653ae-3f53-4f1d-a284-f77729c73ac1
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-d42d22e5-a3b4-4bae-801c-1c25725580df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d42d22e5-a3b4-4bae-801c-1c25725580df
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d42d22e5-a3b4-4bae-801c-1c25725580df
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab4ef6c9-c019-412e-882b-2b44f8d2a0c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab4ef6c9-c019-412e-882b-2b44f8d2a0c6
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab4ef6c9-c019-412e-882b-2b44f8d2a0c6
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-724727c2-6b14-4703-ac7c-8724fd49232a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-724727c2-6b14-4703-ac7c-8724fd49232a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-724727c2-6b14-4703-ac7c-8724fd49232a
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-94c5440a-502c-4b1f-98fb-da2b15511316

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94c5440a-502c-4b1f-98fb-da2b15511316
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-94c5440a-502c-4b1f-98fb-da2b15511316
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-f24c675a-38aa-447a-9835-929069cd8521

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f24c675a-38aa-447a-9835-929069cd8521
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f24c675a-38aa-447a-9835-929069cd8521
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-4ef4654a-bf17-4511-b83d-940fb4261706

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ef4654a-bf17-4511-b83d-940fb4261706
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ef4654a-bf17-4511-b83d-940fb4261706
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f09c1fb-e3be-4957-af08-8cd6debbc198

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f09c1fb-e3be-4957-af08-8cd6debbc198
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f09c1fb-e3be-4957-af08-8cd6debbc198
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ab32364-71e5-42a2-aef0-85f072b834d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ab32364-71e5-42a2-aef0-85f072b834d8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ab32364-71e5-42a2-aef0-85f072b834d8
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-21061844-9860-464a-9142-54b64aa50bb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21061844-9860-464a-9142-54b64aa50bb2
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-21061844-9860-464a-9142-54b64aa50bb2
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-fcb54cf0-be21-452b-807d-cda209c37e4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcb54cf0-be21-452b-807d-cda209c37e4c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcb54cf0-be21-452b-807d-cda209c37e4c
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-b682066e-c3f4-4bf5-b072-7a6c049c327c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b682066e-c3f4-4bf5-b072-7a6c049c327c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b682066e-c3f4-4bf5-b072-7a6c049c327c
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5d3236d-cd6c-41f7-ad3d-9bc96e1a7aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5d3236d-cd6c-41f7-ad3d-9bc96e1a7aa6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5d3236d-cd6c-41f7-ad3d-9bc96e1a7aa6
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-048f16e4-4ceb-4eb0-a44d-6d0c361339bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-048f16e4-4ceb-4eb0-a44d-6d0c361339bf
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-048f16e4-4ceb-4eb0-a44d-6d0c361339bf
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-30d36866-b236-4e22-a555-29ffece3694b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30d36866-b236-4e22-a555-29ffece3694b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-30d36866-b236-4e22-a555-29ffece3694b
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-63308621-def1-4c27-8d12-cb638d473395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63308621-def1-4c27-8d12-cb638d473395
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-63308621-def1-4c27-8d12-cb638d473395
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a9a8c16-df73-4727-953c-9018ada799c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a9a8c16-df73-4727-953c-9018ada799c5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a9a8c16-df73-4727-953c-9018ada799c5
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa0948cb-f5bf-4e79-af15-9db89593d4be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa0948cb-f5bf-4e79-af15-9db89593d4be
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa0948cb-f5bf-4e79-af15-9db89593d4be
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b0c1bd1-39ac-4b28-9c44-0036850f4ddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b0c1bd1-39ac-4b28-9c44-0036850f4ddc
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b0c1bd1-39ac-4b28-9c44-0036850f4ddc
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d3f2987-e5e5-4d82-9c14-790a34d1c7c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d3f2987-e5e5-4d82-9c14-790a34d1c7c5
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d3f2987-e5e5-4d82-9c14-790a34d1c7c5
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-d561a4cd-7706-4d4e-92fd-efdf9bc8c1ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d561a4cd-7706-4d4e-92fd-efdf9bc8c1ad
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d561a4cd-7706-4d4e-92fd-efdf9bc8c1ad
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-9bed7124-eb29-4ff0-8fe6-91ad594e6ffc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bed7124-eb29-4ff0-8fe6-91ad594e6ffc
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bed7124-eb29-4ff0-8fe6-91ad594e6ffc
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9c49a47-0de8-4450-b899-5f9e2505b815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9c49a47-0de8-4450-b899-5f9e2505b815
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9c49a47-0de8-4450-b899-5f9e2505b815
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a9e1c0f-5636-44ae-9dc2-6d65e4b3c244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a9e1c0f-5636-44ae-9dc2-6d65e4b3c244
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a9e1c0f-5636-44ae-9dc2-6d65e4b3c244
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e282d57-d4b1-4317-926b-04000b5700bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e282d57-d4b1-4317-926b-04000b5700bf
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e282d57-d4b1-4317-926b-04000b5700bf
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-fdaccfc2-0eb7-47e7-9e87-5dcd9e661698

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdaccfc2-0eb7-47e7-9e87-5dcd9e661698
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdaccfc2-0eb7-47e7-9e87-5dcd9e661698
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-7526439e-4b8d-4aff-93d8-f5a82203c50c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7526439e-4b8d-4aff-93d8-f5a82203c50c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7526439e-4b8d-4aff-93d8-f5a82203c50c
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-79068a0e-96a9-400e-99a8-f1f5523786d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79068a0e-96a9-400e-99a8-f1f5523786d6
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-79068a0e-96a9-400e-99a8-f1f5523786d6
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-6acd4f5d-a9ee-4d00-9f3a-9f2be6ae538d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6acd4f5d-a9ee-4d00-9f3a-9f2be6ae538d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-6acd4f5d-a9ee-4d00-9f3a-9f2be6ae538d
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-050ab71a-b54c-4b15-a87b-99c43edfcb16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-050ab71a-b54c-4b15-a87b-99c43edfcb16
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-050ab71a-b54c-4b15-a87b-99c43edfcb16
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-9425d063-af53-44d5-8c87-9bb86792bf16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9425d063-af53-44d5-8c87-9bb86792bf16
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9425d063-af53-44d5-8c87-9bb86792bf16
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-06ecd6e2-ecdc-4710-9925-1dd55241dad3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06ecd6e2-ecdc-4710-9925-1dd55241dad3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-06ecd6e2-ecdc-4710-9925-1dd55241dad3
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6d48729-ef7f-4b10-913a-249f5c437270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6d48729-ef7f-4b10-913a-249f5c437270
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6d48729-ef7f-4b10-913a-249f5c437270
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-90e1d546-9747-4e49-ad40-31829ea3b96a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90e1d546-9747-4e49-ad40-31829ea3b96a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-90e1d546-9747-4e49-ad40-31829ea3b96a
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe2d6683-e397-4c78-977c-4e96eb9ee614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe2d6683-e397-4c78-977c-4e96eb9ee614
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe2d6683-e397-4c78-977c-4e96eb9ee614
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-f03cbd39-b515-47d1-9aeb-0d9c3fb9a26b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f03cbd39-b515-47d1-9aeb-0d9c3fb9a26b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f03cbd39-b515-47d1-9aeb-0d9c3fb9a26b
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-a5c68414-e815-4dfe-8e2a-7629e4222a5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5c68414-e815-4dfe-8e2a-7629e4222a5b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5c68414-e815-4dfe-8e2a-7629e4222a5b
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a973f98-7130-402a-85e4-748115921458

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a973f98-7130-402a-85e4-748115921458
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a973f98-7130-402a-85e4-748115921458
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-d34fa8a8-3c5d-40bc-9ffb-0f1f2c2188c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d34fa8a8-3c5d-40bc-9ffb-0f1f2c2188c9
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d34fa8a8-3c5d-40bc-9ffb-0f1f2c2188c9
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-37ba2090-337a-4b6e-804a-b0252ed4bf5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37ba2090-337a-4b6e-804a-b0252ed4bf5a
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-37ba2090-337a-4b6e-804a-b0252ed4bf5a
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-b15ac7e4-d1bc-4304-afd4-569656c2d5b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b15ac7e4-d1bc-4304-afd4-569656c2d5b0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-b15ac7e4-d1bc-4304-afd4-569656c2d5b0
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7492ef7-b7f2-4e11-89a0-129dbe60cdd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7492ef7-b7f2-4e11-89a0-129dbe60cdd6
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7492ef7-b7f2-4e11-89a0-129dbe60cdd6
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-61a1c8f7-cbc6-43f8-a214-4815305e041d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61a1c8f7-cbc6-43f8-a214-4815305e041d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-61a1c8f7-cbc6-43f8-a214-4815305e041d
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e4c23d4-3a59-49f6-a070-c766d8980b18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e4c23d4-3a59-49f6-a070-c766d8980b18
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e4c23d4-3a59-49f6-a070-c766d8980b18
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-cbff07a8-033a-44e0-b761-7c2674e7f29b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbff07a8-033a-44e0-b761-7c2674e7f29b
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbff07a8-033a-44e0-b761-7c2674e7f29b
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb5e37a1-3b99-4420-b7b5-32709b9beea6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb5e37a1-3b99-4420-b7b5-32709b9beea6
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb5e37a1-3b99-4420-b7b5-32709b9beea6
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-e23b27f9-c0a4-40bf-a2d0-0794174fed5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e23b27f9-c0a4-40bf-a2d0-0794174fed5b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-e23b27f9-c0a4-40bf-a2d0-0794174fed5b
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-e12585f2-3711-4060-86a9-73b249154af4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e12585f2-3711-4060-86a9-73b249154af4
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-e12585f2-3711-4060-86a9-73b249154af4
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-945dd488-46fb-44ee-afd8-5eb06d532171

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-945dd488-46fb-44ee-afd8-5eb06d532171
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-945dd488-46fb-44ee-afd8-5eb06d532171
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-0fef956f-a3b3-4e3d-bd69-5bb2eb1707ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fef956f-a3b3-4e3d-bd69-5bb2eb1707ab
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fef956f-a3b3-4e3d-bd69-5bb2eb1707ab
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf75cb96-5976-4827-91b4-d64353e97da6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf75cb96-5976-4827-91b4-d64353e97da6
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf75cb96-5976-4827-91b4-d64353e97da6
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-8aff02ea-041d-4d3d-b5a1-d3adea87bc21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aff02ea-041d-4d3d-b5a1-d3adea87bc21
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8aff02ea-041d-4d3d-b5a1-d3adea87bc21
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd594bca-7b7a-44bc-9e95-5589776a9310

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd594bca-7b7a-44bc-9e95-5589776a9310
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd594bca-7b7a-44bc-9e95-5589776a9310
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-914d2254-1072-4358-a7dd-c7d5424529d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-914d2254-1072-4358-a7dd-c7d5424529d0
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-914d2254-1072-4358-a7dd-c7d5424529d0
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae0e863b-98ba-4bc5-bbf0-8b57f503b3c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae0e863b-98ba-4bc5-bbf0-8b57f503b3c0
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae0e863b-98ba-4bc5-bbf0-8b57f503b3c0
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-931bb825-af0c-4545-8e27-63a3b297fd97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-931bb825-af0c-4545-8e27-63a3b297fd97
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-931bb825-af0c-4545-8e27-63a3b297fd97
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3b3b25d-5375-408a-a14d-eac425381ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b3b25d-5375-408a-a14d-eac425381ae7
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3b3b25d-5375-408a-a14d-eac425381ae7
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c8a5076-364b-4f02-913c-ffb0a000bd54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c8a5076-364b-4f02-913c-ffb0a000bd54
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c8a5076-364b-4f02-913c-ffb0a000bd54
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd883015-6946-46fa-bc60-128a06f225da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd883015-6946-46fa-bc60-128a06f225da
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd883015-6946-46fa-bc60-128a06f225da
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b041e87-99bc-4ac6-9783-ceb13c3da359

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b041e87-99bc-4ac6-9783-ceb13c3da359
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b041e87-99bc-4ac6-9783-ceb13c3da359
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7d2e779-401c-4fd9-913a-229cdf42e2d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7d2e779-401c-4fd9-913a-229cdf42e2d1
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7d2e779-401c-4fd9-913a-229cdf42e2d1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d7d2e779-401c-4fd9-913a-229cdf42e2d1"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d93734e-1500-4fd0-84ae-d23d16d0183e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d93734e-1500-4fd0-84ae-d23d16d0183e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d93734e-1500-4fd0-84ae-d23d16d0183e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5d93734e-1500-4fd0-84ae-d23d16d0183e"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-b6e4b8d9-d7f2-4762-bd37-4a35be94faa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6e4b8d9-d7f2-4762-bd37-4a35be94faa6
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6e4b8d9-d7f2-4762-bd37-4a35be94faa6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b6e4b8d9-d7f2-4762-bd37-4a35be94faa6"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6e2f1ca-9a1e-442a-b7d0-aa7be87ba2c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6e2f1ca-9a1e-442a-b7d0-aa7be87ba2c8
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6e2f1ca-9a1e-442a-b7d0-aa7be87ba2c8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d6e2f1ca-9a1e-442a-b7d0-aa7be87ba2c8"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-128cfaa6-f438-486b-bcd4-1ffa63502536

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-128cfaa6-f438-486b-bcd4-1ffa63502536
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-128cfaa6-f438-486b-bcd4-1ffa63502536
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-128cfaa6-f438-486b-bcd4-1ffa63502536"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-de818837-1526-4cd2-94a0-e7ecf4cf2376

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de818837-1526-4cd2-94a0-e7ecf4cf2376
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de818837-1526-4cd2-94a0-e7ecf4cf2376
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-de818837-1526-4cd2-94a0-e7ecf4cf2376"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-bcee0150-bc1b-4941-95bf-b5bbb0789ed1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcee0150-bc1b-4941-95bf-b5bbb0789ed1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcee0150-bc1b-4941-95bf-b5bbb0789ed1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bcee0150-bc1b-4941-95bf-b5bbb0789ed1"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-000ea016-d81d-4420-9f07-5956cdc481ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-000ea016-d81d-4420-9f07-5956cdc481ca
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-000ea016-d81d-4420-9f07-5956cdc481ca
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-000ea016-d81d-4420-9f07-5956cdc481ca"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-09bb4634-f2d9-45a8-a97b-c62e37d6a7d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09bb4634-f2d9-45a8-a97b-c62e37d6a7d7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09bb4634-f2d9-45a8-a97b-c62e37d6a7d7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-09bb4634-f2d9-45a8-a97b-c62e37d6a7d7"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-54f7eb9e-2471-4607-9643-19e9fb038088

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54f7eb9e-2471-4607-9643-19e9fb038088
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54f7eb9e-2471-4607-9643-19e9fb038088
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-54f7eb9e-2471-4607-9643-19e9fb038088"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-239b712a-ee97-4129-94bd-6604d9c0a156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-239b712a-ee97-4129-94bd-6604d9c0a156
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-239b712a-ee97-4129-94bd-6604d9c0a156
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-239b712a-ee97-4129-94bd-6604d9c0a156"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-c26ae6b6-5ae9-419d-a00e-13e14e4f2c83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c26ae6b6-5ae9-419d-a00e-13e14e4f2c83
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c26ae6b6-5ae9-419d-a00e-13e14e4f2c83
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c26ae6b6-5ae9-419d-a00e-13e14e4f2c83"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-c28c9b2f-5758-4a50-b75f-e636faf012d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c28c9b2f-5758-4a50-b75f-e636faf012d2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c28c9b2f-5758-4a50-b75f-e636faf012d2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c28c9b2f-5758-4a50-b75f-e636faf012d2"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-48011131-1774-4aac-b6ec-53dde3157bee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48011131-1774-4aac-b6ec-53dde3157bee
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48011131-1774-4aac-b6ec-53dde3157bee
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-48011131-1774-4aac-b6ec-53dde3157bee"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-11a5a71b-73ae-4115-82f7-df5076aacc08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11a5a71b-73ae-4115-82f7-df5076aacc08
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11a5a71b-73ae-4115-82f7-df5076aacc08
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-11a5a71b-73ae-4115-82f7-df5076aacc08"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bfe3aea-e412-40d6-962d-def1542225da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bfe3aea-e412-40d6-962d-def1542225da
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bfe3aea-e412-40d6-962d-def1542225da
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2bfe3aea-e412-40d6-962d-def1542225da"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-057fa38c-76c2-471b-8796-b4266b8d3929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-057fa38c-76c2-471b-8796-b4266b8d3929
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-057fa38c-76c2-471b-8796-b4266b8d3929
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-057fa38c-76c2-471b-8796-b4266b8d3929"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-52f623b7-bab6-4f3f-bbd9-96d3cc755c37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52f623b7-bab6-4f3f-bbd9-96d3cc755c37
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52f623b7-bab6-4f3f-bbd9-96d3cc755c37
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-52f623b7-bab6-4f3f-bbd9-96d3cc755c37"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-02df1ce2-86c0-477d-b4ad-52b4a6fb4eb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02df1ce2-86c0-477d-b4ad-52b4a6fb4eb0
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-02df1ce2-86c0-477d-b4ad-52b4a6fb4eb0
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

{"id":"acc_d9bf079b-e4cf-469a-b6c0-7491d0c6a667","handle":"qa-7547508e5f6b","displayName":"QA 7547508e5f6b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.864796568Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d95a5424-f0a4-44dc-8c0b-22d1d6bed92e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d95a5424-f0a4-44dc-8c0b-22d1d6bed92e
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d95a5424-f0a4-44dc-8c0b-22d1d6bed92e
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
correlation: qa-d7f8eb09-cbbc-441e-8375-c46b9e2a738c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7f8eb09-cbbc-441e-8375-c46b9e2a738c
Content-Type: application/json

--- request body ---
{"handle":"qa-7547508e5f6b","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7f8eb09-cbbc-441e-8375-c46b9e2a738c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d7f8eb09-cbbc-441e-8375-c46b9e2a738c"}
```
